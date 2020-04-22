public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Sonia");
        person.setLastName("Dumitru");
        person.setAge(31);
        System.out.println("My full name is " + person.getFullName());
        System.out.println("Am I a teen? " + person.isTeen());
    }
}
