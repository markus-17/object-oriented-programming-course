import java.util.ArrayList;
import java.util.List;

class University {
    public String name;
    public int foundationYear;
    public List<Student> students;

    public University(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = new ArrayList<Student>();
    }
}
