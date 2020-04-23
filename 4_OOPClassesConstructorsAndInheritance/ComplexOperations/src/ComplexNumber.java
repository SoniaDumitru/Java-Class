public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add (ComplexNumber parameter) {
        add(parameter.real, parameter.imaginary);
    }
    public void subtract (double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract (ComplexNumber parameter){
        subtract(parameter.getReal(), parameter.getImaginary());
    }

}
