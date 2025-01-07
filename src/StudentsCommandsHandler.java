import java.util.Scanner;
import java.util.ArrayList;

public class StudentsCommandsHandler {
    public ArrayList<Student> students;
    private long lastId;
    private StudentsRepository repository;

    public StudentsCommandsHandler() {
        this.students = new ArrayList<Student>();
        this.repository = new StudentsRepository();
    }

    public void clearStudents() {
        students = new ArrayList<Student>();
    }

    public void addStudent(String name, String sername) {
        repository.addStudent(this.students, generateNewStudent(name, sername));
    }

    public void deleteStudent(long id) {
        repository.deleteStudent(this.students, id);
    }

    public void editStudent(long id, String name, String sername) {
        repository.editStudent(id, name, sername, this.students)
    }

    public void showStudent(long id) {
        repository.showStudent(id, this.students);
    }

    public void showStudents() {
        repository.showStudents(this.students);
    }

    private void generateNewStudent(String name, String sername) {
        return new Student(generateNewId(), name, sername);
    }

    private void generateNewId() {
        this.lastId += 1;
        return lastId - 1;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String command;
        String name;
        String sername;
        long id;
        while (true) {
            System.out.print("Command (edit, add, remove, get, get_all, clear, stop): ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            } else if (command.equals("clear")) {
                this.clearStudents();
            } else if (command.equals("get_all")) {
                this.showStudents();
            } else if (command.equals("get")) {
                System.out.print("Id: ");
                id = scanner.nextLong();
                this.showStudent(id);
            } else if (command.equals("remove")) {
                System.out.print("Id: ");
                this.deleteStudent(id);
            } else if (command.equals("add")) {
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Sername: ");
                sername = scanner.nextLine();
                this.addStudent(name, sername);
            } else if (command.equals("edit")) {
                System.out.print("Id: ");
                id = scanner.nextLong();
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Sername: ");
                sername = scanner.nextLine();
                this.editStudent(id, name, sername);
            }
        }
        scanner.close();
    }
}