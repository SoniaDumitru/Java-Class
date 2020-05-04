
public class Main {
    // polymorphism is the method that allows actions to act differently based on the actual action that is being performed on
    // demonstrate polymorphism by creating multiple classes
    // movie.plot() is looking at the object that we've created to see if it has a plot method
    // we're basically assigning new functionality depending on the type of object we've created

    public static void main(String [] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot" + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        // return a random movie
        int randomNumber = (int)(Math.random() * 5) + 1; // casting because Math return a double type (return a number between 1..5)
        System.out.println("Random number generated was: " + randomNumber);
        // create one of those movie classes
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Titanic();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }

}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    // constructor
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A shark eats lots of people";
    }
}

class Titanic extends Movie {

    public Titanic() {
        super("Titanic");
    }

    @Override
    public String plot() {
        return "Titanic  most popular movie";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super ("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // no plot movie method that has been overwritten so as a result we look in parent class, since we are extending from Movie Class

}


