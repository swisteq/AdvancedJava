package company;

public class Employee {
    private String name;
    int salary;
    final int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        System.out.printf("Wywoluje konstruktor z Employee z argumentami: %s i %s i %s\n", name, salary, age);
    }

    public int getSalary() {
        return salary;
    }

    public void show(){
        System.out.println("Imie: " + name + " pensja:" + salary);
    }
}
