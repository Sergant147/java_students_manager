package com.serugle.sergey.studentmanager.model;

public class Student {
    private long id;
    private String name;
    private String sername;

    public Student(long id, String name, String sername) {
        this.id = id;
        this.name = name;
        this.sername = sername;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSername() {
        return this.sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public long getId() {return this.id;}
}