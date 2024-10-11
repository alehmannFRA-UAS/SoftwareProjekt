package edu.fra.uas.abstracts;

public class Employee extends Person {

    private String company;
    private int id;

    public Employee(String name, int age, String company, int id) {
        super(name, age);
        this.company = company;
        this.id = id;
    }

    @Override
    public void work() {
        if (id == 0) {
            System.out.println("Employee does not work for any company");
            return;            
        }
        System.out.println("Employee works for " + company);
    }

    public String getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + ", Company: " + company + ", ID: " + id;
    }

}
