package binhkk.test.repository;

import binhkk.test.model.Classz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository <Classz,Long> {
}
