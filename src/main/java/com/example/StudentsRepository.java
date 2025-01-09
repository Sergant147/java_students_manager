package com.example;

import java.util.ArrayList;

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
        for (Student studentFound : this.students) {
            if (studentFound.getId() == id) {
                studentFound.setName(student.getName());
                studentFound.setSername(student.getSername());
            }
        }
    }

    public Student find(long id) {
        for (Student student : this.students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return this.students.get(0);
    }

    public void delete(long id) {
        for (Student student : this.students) {
            if (student.getId() == id) {
                this.students.remove(student);
            }
        }
    }

    public void add(Student student) {
        student.setId(this.makeNewId());
        this.students.add(student);
    }
}