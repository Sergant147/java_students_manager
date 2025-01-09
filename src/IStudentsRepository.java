public interface StudentsRepositoryInterface {
    Student add(Student student);

    Student edit(long id, Student student);

    List<Student> findAll();

    Optional<Student> find(long id);

    Student get(long id);

    boolean delete(long id);
}