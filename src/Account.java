public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // user-defined constructors
    public Account(int number, double balance, String customerName, String customerEmail, String customerPhone){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void diposit(double amount){
        this.balance += amount;
        System.out.println("Diposit of "+amount+" is processed & Balance is : " + this.balance);
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Balance is "+balance+" withdrawl not processed");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawl of "+amount+ " is processed & Balance is : "+this.balance);
        }
    }

    //getters & setters are not required after user-defined constructor
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double getBalance() {
        if(balance < 0){
            System.out.println("Invalid Balance");
        }
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
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
