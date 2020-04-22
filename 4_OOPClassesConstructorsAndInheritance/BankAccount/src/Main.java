public class Main {
    public static void main(String[] args) {

        Bank soniaAccount = new Bank();
//      Bank soniaAccount = new Bank("6328761284", 90000, "Sonia Dumitru", "soni@gmail.com", "31271568687");
        System.out.println(soniaAccount.getCustomerName());

        soniaAccount.deposit(10000);
        soniaAccount.withdrawal(100.0);


    }
}
