public class Main {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        one.add(1,1);

        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
    }
}
