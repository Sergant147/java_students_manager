package org.task.artem.task1;

import java.util.Scanner;

public class StudentsCommandsHandler {
    private StudentsRepository repository;

    public StudentsCommandsHandler() {
        this.repository = new StudentsRepository();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String command;
        String name;
        String sername;
        long id;
        Student studentMaking;
        while (true) {
            System.out.print("Command (edit, add, remove, get, get_all, clear, stop): ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("clear")) {
                this.repository.clear();
            } else if (command.equals("get_all")) {
                for (Student student : this.repository.findAll()) {
                    System.out.println(student.getName() + ' ' + student.getSername());
                }
            } else if (command.equals("get")) {
                System.out.print("Id: ");
                id = scanner.nextLong();
                studentMaking = this.repository.find(id);
                System.out.println(studentMaking.getName() + ' ' + studentMaking.getSername());
            } else if (command.equals("remove")) {
                System.out.print("Id: ");
                id = scanner.nextLong();
                this.repository.delete(id);
            } else if (command.equals("add")) {
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Sername: ");
                sername = scanner.nextLine();
                this.repository.add(new Student(-1, name, sername));
            } else if (command.equals("edit")) {
                System.out.print("Id: ");
                id = Long.parseLong(scanner.nextLine());
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Sername: ");
                sername = scanner.nextLine();
                this.repository.edit(id, new Student(id, name, sername));
            }
        }
        scanner.close();
    }
}