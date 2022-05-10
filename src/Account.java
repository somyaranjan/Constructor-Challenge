public class Account {
    private int number;
    private int balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void diposit(int ammount){
        this.balance += ammount;
        System.out.println("new balance : "+balance);
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
    public void setBalance(int balance) {
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
