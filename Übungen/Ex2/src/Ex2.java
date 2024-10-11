public class Ex2 {

    public static void main(String[] args) {
        first();

        second();

        third();

        fourth();

        fifth();
        
        StudentManagementSystem.main(args);
    }

    private static void first() {
        Student student = new Student(1, "Max", "Mustermann", 1, 123456);
        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Firstname: " + student.getFirstName());
        System.out.println("Lastname:" + student.getLastName());
        System.out.println("Semester:" + student.getSemester());
        System.out.println("MatrNo:" + student.getMatriculationNumber());
    }

    private static void second() {
        Student student1 = new Student(1, "Max", "Mustermann", 1, 123456);
        
        Student student2 = new Student();
        student2.setStudentId(2);
        student2.setFirstName("Erika");
        student2.setLastName("Mustermann");
        student2.setSemester(2);
        student2.setMatriculationNumber(654321);

        System.out.println("Student Id: " + student1.getStudentId());
        System.out.println("Firstname: " + student1.getFirstName());
        System.out.println("Lastname:" + student1.getLastName());
        System.out.println("Semester:" + student1.getSemester());
        System.out.println("MatrNo:" + student1.getMatriculationNumber());

        System.out.println("Student Id: " + student2.getStudentId());
        System.out.println("Firstname: " + student2.getFirstName());
        System.out.println("Lastname:" + student2.getLastName());
        System.out.println("Semester:" + student2.getSemester());
        System.out.println("MatrNo:" + student2.getMatriculationNumber());
    }
    
    private static void third() {
        StudentList studentList = new StudentList();
        Student student1 = new Student(1, "Max", "Mustermann", 1, 123456);
        Student student2 = new Student(2, "Erika", "Mustermann", 2, 654321);
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        System.out.println("Students: " + studentList.getStudents());
        studentList.removeStudent(1);
        System.out.println("Students: " + studentList.getStudents());
    }

    private static void fourth() {
        for(int i = 0; i < 10; i++) {
            Student student = new Student();
            System.out.println("Student Id: " + student.getStudentId());
        }
    }

    private static void fifth() {
        Student student1 = new Student(1, "Max", "Mustermann", 1, 123456);
        Student student2 = new Student(2, "Erika", "Mustermann", 2, 654321);
        Student student3 = new Student(3, "Fritz", "Mustermann", 1, 123457);
        Student student4 = new Student(4, "Ede", "Mustermann", 2, 654322);
        Student student5 = new Student(5, "Claudia", "Mustermann", 1, 123458);
        StudentList studentList = new StudentList();
        studentList.addStudent(student1);
        studentList.addStudent(student2);
        studentList.addStudent(student3);
        studentList.addStudent(student4);
        studentList.addStudent(student5);
        System.out.println("First Student with lastname Mustermann: ");
        Student student = studentList.getStudent("Mustermann");
        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Firstname: " + student.getFirstName());
        System.out.println("Lastname:" + student.getLastName());
        System.out.println("Semester:" + student.getSemester());
        System.out.println("MatrNo:" + student.getMatriculationNumber());
    }

}
