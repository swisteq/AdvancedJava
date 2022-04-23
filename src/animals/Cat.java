package animals;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void saySomething() {
        System.out.println(name + " mew mew");
    }
}
