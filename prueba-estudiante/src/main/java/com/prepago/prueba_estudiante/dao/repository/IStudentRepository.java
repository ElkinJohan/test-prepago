package com.prepago.prueba_estudiante.dao.repository;

import com.prepago.prueba_estudiante.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity, Integer> {
}
