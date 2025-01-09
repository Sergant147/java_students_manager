public interface StudentsRepositoryInterface {
    Student add( Student student);
    Student edit(id long, Student student);
    List<Student> findAll();
    Optional<Student> find(id long);
    Student get(id long);
    boolean delete(id long);
    long makeNewId();
}