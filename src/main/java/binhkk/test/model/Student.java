package binhkk.test.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  name;
    private int age;
    private int score;
    @ManyToOne
    @JoinColumn(name = "classId")
    private Classz Classz;

    public binhkk.test.model.Classz getClassz() {
        return Classz;
    }

    public void setClassz(Student classz) {
        Classz = classz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Classz getLassz() {
        return Classz;
    }

    public void setaLassz(Classz aClass) {
        this.Classz = Classz;
    }

    public Student() {
    }

    public Student(Long id, String name, int age, int score, Classz classz) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.Classz = classz;
    }
}
