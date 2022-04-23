package company;

public final class Secretary extends Employee{
    public Secretary(String name, int salary, int age) {
        super(name, salary, age);
        System.out.printf("Wywoluje konstruktor z Secretary z argumentami: %s i %s i %s\n", name, salary, age);
    }

    public void makeCall(String number){
        System.out.printf("Dzwonie do: " + number);
    }
}
