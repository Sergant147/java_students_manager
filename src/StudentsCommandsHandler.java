import java.util.ArrayList;

public class StudentsCommandsHandler {
    public ArrayList<Student> students = new ArrayList<Student>();

    public StudentsCommandsHandler() {
    }

    public void addStudent(String name, String sername) {
        students.add(generateNewStudent(name, sername))
    }

    public void editStudent(long id, String name, String sername) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setSername(sername);
            }
        }
    }

    public void deleteStudent(long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(id);
            }
        }
    }

    public void clearStudents() {
        students = new ArrayList<Student>();
    }

    public void showStudent(long id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student.getId() + ") " + student.getName() + ' ' + student.getSername());
            }
        }
    }

    public void showStudents() {
        for (Student student : students) {
            showStudent(student.id);
        }
    }

    private void generateNewId() {
        long maxId = 0;
        for (Student student : students) {
            if (student.id > maxId) {
                maxId = student.id;
            }
        }
        return maxId + 1;
    }

    private void generateNewStudent(String name, String sername) {
        return new Student(generateNewId(), name, sername);
    }
}