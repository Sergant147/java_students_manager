package com.serugle.sergey.studentmanager.repository;

import com.serugle.sergey.studentmanager.model.Student;

import java.util.ArrayList;
import java.util.Optional;

public interface IStudentsRepository {
    void add(Student student);

    void edit(long id, Student student);

    ArrayList<Student> findAll();

    Student find(long id);

    void delete(long id);

    Optional<Student> getById(long id);
}