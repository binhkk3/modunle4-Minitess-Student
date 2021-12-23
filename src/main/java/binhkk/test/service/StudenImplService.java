package binhkk.test.service;

import binhkk.test.model.Student;
import binhkk.test.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StudenImplService implements IStudentService {
    @Autowired
    private IStudentRepository iStudentRepository;

    @Override
    public Iterable<Student> findAll() {
        return iStudentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return iStudentRepository.findById(id);
    }

    @Override
    public void save(Student student) {
        iStudentRepository.save(student);
    }

    @Override
    public void remove(Long id) {
        iStudentRepository.deleteById(id);
    }
}
