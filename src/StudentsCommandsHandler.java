import java.util.ArrayList;

public class StudentsCommandsHandler {
    public ArrayList<Student> students;
    private long lastId;
    private StudentsRepository repository;

    public StudentsCommandsHandler() {
        this.students = new ArrayList<Student>();
        this.repository = new StudentsRepository();
    }

    public void clearStudents() {students = new ArrayList<Student>();}
    public void addStudent(String name, String sername){repository.addStudent(this.students, generateNewStudent(name, sername));}
    public void deleteStudent(long id){repository.deleteStudent(this.students, id);}
    public void editStudent(long id, String name, String sername){repository.editStudent(id, name, sername, this.students)}
    public void showStudent(long id){repository.showStudent(id, this.students);}
    public void showStudents(){repository.showStudents(this.students);}
    private void generateNewStudent(String name, String sername) {return new Student(generateNewId(), name, sername);}
    private void generateNewId() {
        this.lastId += 1;
        return lastId - 1;
    }
}