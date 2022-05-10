public class App {
    public static void main(String[] args) {
        Account acc = new Account(9999,400.0,
        "Somya","abc@xyz.com","7008792514"); //calling constructor

        

        System.out.println("Account Number : "+acc.getNumber());
        System.out.println("Name : "+acc.getCustomerName());

        acc.withdraw(100);
        acc.diposit(15);
        acc.withdraw(5);
    }
}
