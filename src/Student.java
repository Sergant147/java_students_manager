public class Student {
    private long id;
    private String name;
    private String sername;

    public Student(long id, String name, String sername) {
        this.id = id;
        this.name = name;
        this.sername = sername;
    }

    public getName() {
        return this.name;
    }

    public setName(String name) {
        this.name = name;
    }

    public getId(long id) {
        this.id = id;
    }

    public getSername() {
        return this.sername;
    }

    public setSername(String sername) {
        this.sername = sername;
    }
}