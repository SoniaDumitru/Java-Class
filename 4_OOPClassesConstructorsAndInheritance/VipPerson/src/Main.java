public class Main {

    public static void main(String[] args) {

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());

        System.out.println("***************************");

        VipPerson person2 = new VipPerson("Sonia", 24000.00);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());

        System.out.println("***************************");
        VipPerson person3 = new VipPerson("Sonia", 199, "sonia@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());

    }
}
