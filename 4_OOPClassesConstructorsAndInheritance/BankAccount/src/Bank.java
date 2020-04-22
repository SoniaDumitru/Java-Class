public class Bank {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    // constructor to set the initial value of the fields, to initialize the object when its being created
    // the new Bank() method is calling the constructor
    public Bank() {
        // constructor in a constructor
        this("123", 400, "Default name", "Default address", "default name");
        System.out.println("Empty constructor!");
        // if the empty constructor is called we can set up some default values
    }

    public Bank(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Constructor with parameters was called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made.");
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance-withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed.");
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
