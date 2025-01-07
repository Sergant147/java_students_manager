import lombok.*;
@Getter
@Setter
public class Student {
    private long id;
    private String name;
    private String sername;
    public Student(long id, String name, String sername){
        this.id = id;
        this.name = name;
        this.sername = sername;
    }
}