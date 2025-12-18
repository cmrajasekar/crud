package com.jdbc.crud.repository;

import com.jdbc.crud.model.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<student, Integer > {
}
