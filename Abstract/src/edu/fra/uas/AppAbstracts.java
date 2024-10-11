package edu.fra.uas;

import edu.fra.uas.abstracts.Person;
import edu.fra.uas.abstracts.Student;
import edu.fra.uas.abstracts.Employee;

public class AppAbstracts {
    public static void main(String[] args) throws Exception {
        Person[] persons = new Person[4];
        persons[0] = new Student("Alice", 20, "UAS", 12345);
        persons[1] = new Student("Bob", 21, "UAS", 0);

        persons[2] = new Employee("Charlie", 30, "Bosch", 34567);
        persons[3] = new Employee("David", 40, "Siemens", 0);

        for (Person person : persons) {
            System.out.println(person.toString());
            person.work();
            System.out.println();
        }

    }
}
