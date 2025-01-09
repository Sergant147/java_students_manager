package org.task.artem.task1;

import java.util.Scanner;

public class StudentsCommandsHandler {
    private StudentsRepository repository;

    public StudentsCommandsHandler() {
        this.repository = new StudentsRepository();
    }
    public void clear() {
        this.repository.clear();
    }
    public void getAll() {
        for (Student student : this.repository.findAll()) {
            System.out.println(student.getName() + ' ' + student.getSername());
        }
    }
    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        long id = scanner.nextLong();
        Student studentMaking = this.repository.find(id);
        System.out.println(studentMaking.getName() + ' ' + studentMaking.getSername());
        scanner.close();
    }
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        long id = scanner.nextLong();
        this.repository.delete(id);
        scanner.close();
    }
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Sername: ");
        String sername = scanner.nextLine();
        this.repository.add(new Student(-1, name, sername));
        scanner.close();
    }
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Id: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Sername: ");
        String sername = scanner.nextLine();
        this.repository.edit(id, new Student(id, name, sername));
        scanner.close();
    }
        public void run() {
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true) {
            System.out.print("Command (edit, add, remove, get, get_all, clear, stop): ");
            command = scanner.nextLine();
            if (command.equals("stop")) {break;}
            else if (command.equals("clear")) {clear();}
            else if (command.equals("get_all")) {getAll();}
            else if (command.equals("get")) {get();}
            else if (command.equals("remove")) {remove();}
            else if (command.equals("add")) {add();}
            else if (command.equals("edit")) {edit();}
        }
        scanner.close();
    }
}