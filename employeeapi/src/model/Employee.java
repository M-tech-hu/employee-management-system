package model;

public class Employee {

    private int id;
    private  String name;
    private  String Deppartment;

    public Employee(int id, String name, String deppartment) {
        this.id = id;
        this.name = name;
        Deppartment = deppartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeppartment() {
        return Deppartment;
    }

    public void setDeppartment(String deppartment) {
        Deppartment = deppartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Deppartment='" + Deppartment + '\'' +
                '}';
    }
}


