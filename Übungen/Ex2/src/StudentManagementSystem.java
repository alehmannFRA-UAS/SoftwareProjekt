import java.util.Scanner;

public class StudentManagementSystem {

    private static StudentList studentList = new StudentList();
    private static Scanner scanner = new Scanner(System.in);

    private final static int ADD_STUDENT = 1;
    private final static int REMOVE_STUDENT = 2;
    private final static int LIST_STUDENTS = 3;
    private final static int FIND_STUDENT = 4;
    private final static int EXIT = 5;

    public static void main(String[] args) {
        System.out.println("Student Management System");
        while (true) {
            cmd();
            int cmd = scanner.nextInt();
            switch (cmd) {
                case ADD_STUDENT:
                    addStudent();
                    break;
                case REMOVE_STUDENT:
                    removeStudent();
                    break;
                case LIST_STUDENTS:
                    listStudents();
                    break;
                case FIND_STUDENT:
                    findStudent();
                    break;
                case EXIT:
                    return;
                default:
                    System.err.println("Invalid command");
            }
        }
    }

    private static void cmd() {
        System.out.println("Enter command: ");
        System.out.println("1: Add student");
        System.out.println("2: Remove student");
        System.out.println("3: List students");
        System.out.println("4: Find student by id");
        System.out.println("5: Exit");
    }

    private static void addStudent() {
        System.out.println("Enter firstname: ");
        String firstName = scanner.next();
        System.out.println("Enter lastname: ");
        String lastName = scanner.next();
        System.out.println("Enter semester: ");
        int semester = scanner.nextInt();
        System.out.println("Enter matriculation number: ");
        int matriculationNumber = scanner.nextInt();
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setSemester(semester);
        student.setMatriculationNumber(matriculationNumber);
        studentList.addStudent(student);
    }

    private static void removeStudent() {
        System.out.println("Enter student id: ");
        int studentId = scanner.nextInt();
        studentList.removeStudent(studentId);
    }

    private static void listStudents() {
        System.out.println("Students: ");
        for (Student student : studentList.getStudents()) {
            System.out.println("\t- " + student.getStudentId()
                            + " " + student.getFirstName() 
                            + " " + student.getLastName()
                            + " " + student.getSemester()
                            + " " + student.getMatriculationNumber());
        }
    }

    private static void findStudent() {
        System.out.println("Enter student id: ");
        int studentId = scanner.nextInt();
        Student student = studentList.getStudent(studentId);
        if (student != null) {
            System.out.println("Student found: ");
            System.out.println(student.getStudentId()
                            + student.getFirstName() 
                            + student.getLastName()
                            + student.getSemester()
                            + student.getMatriculationNumber());
        } else {
            System.out.println("No student data available");
        }
    }

}
