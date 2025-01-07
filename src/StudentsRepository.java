public class StudentsRepository {
    public StudentsRepository(){}
    public void addStudent(ArrayList<Student> students, Student student) {
        students.add(student)
    }

    public void editStudent(long id, String name, String sername, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setSername(sername);
            }
        }
    }

    public void deleteStudent(long id, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(id);
            }
        }
    }

    public void showStudent(long id, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student.getId() + ") " + student.getName() + ' ' + student.getSername());
            }
        }
    }

    public void showStudents(ArrayList<Student> students) {
        for (Student student : students) {
            showStudent(student.id, students);
        }
    }
}