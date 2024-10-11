public class Student {

    private int studentId;
    // ab Schritt 4: static
    //private static int studentId;
    private String firstName;
    private String lastName;
    private int semester;
    private int matriculationNumber;

    public Student() {
        studentId++;
    }

    public Student(int id, String firstName, String lastName, int semester, int matriculationNumber) {
        this.studentId = id;
        //studentId++;          // ab Schritt 4
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
        this.matriculationNumber = matriculationNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSemester() {
        return semester;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setStudentId(int studentId) {
        if (studentId < 0) {
            System.err.println("Student ID must be greater than 0");
        }
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            System.err.println("First name must not be empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            System.err.println("Last name must not be empty");
        }
        this.lastName = lastName;
    }

    public void setSemester(int semester) {
        if (semester < 1) {
            System.err.println("Semester must be greater than 0");
        }
        this.semester = semester;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        if (matriculationNumber < 0) {
            System.err.println("Matriculation number must be greater than 0");
        }
        if (matriculationNumber < 100000 || matriculationNumber > 999999) {
            System.err.println("Matriculation number must be a 6-digit number");
        }
        this.matriculationNumber = matriculationNumber;
    }

}
