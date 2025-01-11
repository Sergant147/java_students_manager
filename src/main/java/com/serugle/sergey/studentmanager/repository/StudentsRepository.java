package com.serugle.sergey.studentmanager.repository;

import com.serugle.sergey.studentmanager.model.Student;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class StudentsRepository implements IStudentsRepository {
    private ArrayList<Student> students;
    private long id;

    public StudentsRepository() {
        students = new ArrayList<Student>();
    }

    private long makeNewId() {
        return this.id++;
    }

    public void clear() {
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> findAll() {
        return students;
    }

    public void edit(long id, Student student) {
        int index = this.students.indexOf(students.stream()
                .filter(part -> part.getId() == id)
                .findFirst()
                .orElseThrow()
        );
        this.students.set(index, student);
    }

    public Student find(long id) throws NoSuchElementException {
        return this.students.stream()
                .filter(part -> part.getId() == id)
                .findFirst()
                .orElseThrow();
    }


    public void delete(long id) {
        this.students.removeIf(part -> part.getId() == id);
    }

    public void add(Student student) {
        student.setId(this.makeNewId());
        this.students.add(student);
    }
}