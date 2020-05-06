public class Main {

    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.starEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.starEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Falscon");
        System.out.println(ford.starEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}

class Mitsubishi extends Car {

        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String starEngine() {
            return getClass().getSimpleName() + " => startEngineeee";
        }

        @Override
        public String accelerate() {
            return "Main.Mitsubishi => accelerate engine";
        }

        @Override
        public String brake() {
            return "Main.Mitsubishi => break engine";
        }
    }

class Ford extends Car {

        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String starEngine() {
            return "Main.Ford => start engine";
        }

        @Override
        public String accelerate() {
            return "Main.Ford => accelerate engine";
        }

        @Override
        public String brake() {
            return "Main.Ford => break engine";
        }
    }

    class Car {

        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;

        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.wheels = 4;
            this.engine = true;
        }

        public boolean isEngine() {
            return engine;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }

        public int getWheels() {
            return wheels;
        }

        public String starEngine() {
            return "car => start engine";
        }

        public String accelerate() {
            return "car => accelerate()";
        }
        public String brake() {
            return "car => brake()";
        }
    }

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String starEngine() {
        return "Main.Holden => start engine";
    }

    @Override
    public String accelerate() {
        return "Main.Holden => accelerate engine";
    }

    @Override
    public String brake() {
        return "Main.Holden => break engine";
    }
}
