package binhkk.test.controller;

import binhkk.test.model.Classz;
import binhkk.test.model.Student;
import binhkk.test.service.ClassImplService;
import binhkk.test.service.IClassService;
import binhkk.test.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/index")

public class StudentController {
    @Autowired
    private IClassService classService;
    @Autowired
    private IStudentService studentService;

    @ModelAttribute("classz")
    public Iterable<Classz> classz() {
        return classService.findAll();
    }

    @GetMapping("")
    public String showlist(Model model) {
        Iterable<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "/showlist";
    }
    @GetMapping("/edit/{id}")
    public String showEdit(@PathVariable Long id, Model model){
        Optional<Student> student = studentService.findById(id);
        model.addAttribute("students",student.get());
        return "/index/edit";
    }
    @PostMapping("/edit")
    public String saveEditProduct(Student student,Long  classId){
        Optional<Student> studentOptional = studentService.findById(classId);
        student.setClassz(studentOptional.get());
        studentService.save(student);
        return "redirect:/index";
    }


}
