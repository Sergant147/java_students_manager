package org.task.artem.students_manager;

public class Main {
    public static void main(String[] args) {
        StudentsCommandsHandler handler = new StudentsCommandsHandler();
        handler.run();
        System.out.println("You are caught! All the students are gone from the proram's memory now!");
    }
}