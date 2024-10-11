import java.util.List;
import java.util.ArrayList;

public class StudentList {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                return;
            }
        }        
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(String lastName) {
        for (Student student : students) {
            if (student.getLastName().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public Student getStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

}
