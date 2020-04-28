public class Dog {

    public static void bark() {
        System.out.println("woof");
    }
}

class GermanShepherd extends Dog {

    // Overriding (same names same parameters)
    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }


    // Overloading (same name different parameters)
    public void bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }

}

