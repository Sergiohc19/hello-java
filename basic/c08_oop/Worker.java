package basic.c08_oop;

public class Worker {
    String name;
    double salary;


    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println("El trabajador " + name + " tiene un salario de: " + salary);
    }


}

