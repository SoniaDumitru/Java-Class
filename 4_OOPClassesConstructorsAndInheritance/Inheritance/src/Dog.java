// class Dog will inherit from Animal Class
public class Dog extends Animal {

    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    // the parameters from Animal Class
    public Dog(String name, int size, int weight, int eyes, int tail, int teeth, String coat) {
        // super class initialized the Animal Class but can also add extra state (fields) and behaviour
        // that are unique for Dog
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called!");
    }
    // overriding a method that is in the superclass
    @Override
    public void eat() {
        System.out.println("Dog.eat() called in the override");
        chew();
        super.eat(); // Animal.eat() is called
    }
}
