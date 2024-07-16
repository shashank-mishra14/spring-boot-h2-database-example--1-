package com.students.repository;

import org.springframework.data.repository.CrudRepository;
import com.students.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}