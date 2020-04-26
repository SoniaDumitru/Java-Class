// super is used to access/call the parent class members
// this to call the current class members
// this is used in constructors and setters and optional in getters
// super is used in method overriding

class SuperClass {
    public void printMethod() {
        System.out.println("super.printMethod() => Printed in Superclass");
    }
}

class SubClass extends SuperClass{
    // overrides method from parent
    @Override
    public void printMethod() {
        super.printMethod(); // calls method in SuperClass (parent)
        System.out.println("Printed in SubClass");
    }
}

class MainClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}

// constructor chaining to avoid code duplication

class Rectangle {
    private int x;
    private int width;
    private int height;

    // 1st constructor
    public Rectangle() {
        this(0,0); // calls 2nd constructor
    }
    // 2nd constructor
    public Rectangle(int width, int height) {
        this(0, width, height);
    }
    // 3rd constructor does the initial initialization
    public Rectangle(int x, int width, int height) {
        this.x = x;
        this.width = width;
        this.height = height;
    }

    // super example
    
}

