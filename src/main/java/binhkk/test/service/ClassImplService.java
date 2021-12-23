package binhkk.test.service;

import binhkk.test.model.Classz;
import binhkk.test.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ClassImplService implements IClassService{
    @Autowired
    private ClassRepository classRepository;
    @Override
    public Iterable<Classz> findAll() {
        return classRepository.findAll();
    }

    @Override
    public Optional<Classz> findById(Long id) {
        return classRepository.findById(id);
    }

    @Override
    public void save(Classz aClass) {
classRepository.save(aClass);
    }

    @Override
    public void remove(Long id) {
classRepository.deleteById(id);
    }
}
