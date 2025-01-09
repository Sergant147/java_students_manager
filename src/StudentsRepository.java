import java.util.ArrayList;

public class StudentsRepository implements IStudentsRepository {
    private ArrayList<Student> students;
    private long id;

    public StudentsRepository() {
        students = new ArrayList<Student>();
    }

    private void makeNewId() {
        return this.id++;
    }

    public void clear() {
        this.students = new ArrayList<Student>();
    }

    public void findAll() {
        return students;
    }

    public void edit(long id, Student student) {
        for (Student studentFound : this.students) {
            if (studentFound.id == id) {
                studentFound.setName(student.getName());
                studentFound.setSername(student.getSername());
            }
        }
    }

    public Optional<Student> find(long id) {
        for (Student student : this.students) {
            if (student.id == id) {
                return student;
            }
        }
    }

    public boolean delete(long id) {
        for (Student student : this.students) {
            if (student.id == id) {
                this.students.remove(student);
            }
        }
    }

    public void add(Student student) {
        student.setId(this.makeNewId());
        this.students.add(student);
    }
}