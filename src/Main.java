import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentsCommandsHandler commandsHandler = new StudentsCommandsHandler();
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
                commandsHandler.clearStudents();
            } else if (command.equals("get_all")) {
                commandsHandler.showStudents();
            } else if (command.equals("get")) {
                System.out.print("Id: ");
                id = scanner.nextLong();
                commandsHandler.showStudent(id);
            } else if (command.equals("remove")) {
                System.out.print("Id: ");
                commandsHandler.deleteStudent(id);
            } else if (command.equals("add")) {
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Sername: ");
                sername = scanner.nextLine();
            } else if (command.equals("edit")) {
                System.out.print("Id: ");
                id = scanner.nextLong();
                System.out.print("Name: ");
                name = scanner.nextLine();
                System.out.print("Sername: ");
                sername = scanner.nextLine();
                commandsHandler.editStudent(id, name, sername);
            }
        }
        scanner.close();
    }
}