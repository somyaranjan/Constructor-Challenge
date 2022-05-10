public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void diposit(double amount){
        this.balance += amount;
        System.out.println("Balance : "+balance);
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Fund");
        } else {
            balance -= amount;
            System.out.println("Balance : "+balance);
        }
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getBalance() {
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
