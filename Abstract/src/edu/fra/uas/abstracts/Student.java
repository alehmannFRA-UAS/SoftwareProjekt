package edu.fra.uas.abstracts;

public class Student extends Person {

    private String university;
    private int matriculationNumber;

    public Student(String name, int age, String university, int matriculationNumber) {
        super(name, age);
        this.university = university;
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public void work() {
        if (matriculationNumber == 0) {
            System.out.println("Student does not study at any university");
            return;            
        }
        System.out.println("Student studies at " + university);
    }

    public String getUniversity() {
        return university;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", University: " + university + ", Matriculation Number: " + matriculationNumber;
    }

}
