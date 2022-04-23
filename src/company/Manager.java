package company;

public class Manager extends Employee{
    private int bonus;
    private Secretary secretary;

    public Manager(String name, int salary, int age) {
        super(name, salary, age);
    }

    public Manager(String name, int salary, int bonus, int age) {
        super(name, salary, age);
        this.bonus = bonus;
        System.out.printf("Wywoluje konstruktor z Manager z argumentami: %s i %s i %s i %s\n", name, salary, age, bonus);
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }

    public void makeCall(String number){
        if (secretary == null){
            System.out.println("Nie umiem dzwonic");
        }
        else {
            secretary.makeCall(number);
        }
    }

    public void makeSpeech(){
        System.out.println("blah blah blah");
    }

    @Override
    public int getSalary() {
        //return super.getSalary() + bonus;
        return salary + bonus;
    }

    public void makeSpeech(String additionalMessage){
        makeSpeech();
        System.out.println(additionalMessage);
    }
}
