import com.serugle.sergey.studentmanager.model.Student;
import com.serugle.sergey.studentmanager.repository.StudentsRepository;

import java.util.Scanner;

public class StudentsCommandsHandler {
    private StudentsRepository repository;
    private Scanner scanner;

    public StudentsCommandsHandler() {
        this.scanner = new Scanner(System.in);
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
        System.out.print("Id: ");
        long id = scanner.nextLong();
        Student studentMaking = this.repository.find(id);
        System.out.println(studentMaking.getName() + ' ' + studentMaking.getSername());
    }

    public void remove() {
        System.out.print("Id: ");
        long id = scanner.nextLong();
        this.repository.delete(id);
    }

    public void add() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Sername: ");
        String sername = scanner.nextLine();
        this.repository.add(new Student(-1, name, sername));
    }

    public void edit() {
        System.out.print("Id: ");
        long id = Long.parseLong(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Sername: ");
        String sername = scanner.nextLine();
        this.repository.edit(id, new Student(id, name, sername));
    }

    public void run() {
        String command;
        label:
        while (true) {
            System.out.print("Command (edit, add, remove, get, get_all, clear, stop): ");
            command = scanner.nextLine();
            switch (command) {
                case "stop":
                    break label;
                case "clear":
                    clear();
                case "get_all":
                    getAll();
                case "get":
                    get();
                case "remove":
                    remove();
                case "add":
                    add();
                case "edit":
                    edit();
            }
        }
        scanner.close();
    }
}