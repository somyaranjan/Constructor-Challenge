public class App {
    public static void main(String[] args) {
        Account acc = new Account(9999,400.0,
        "Somya","abc@xyz.com","7008792514"); //calling constructor

        System.out.println("Account Number : "+acc.getNumber());
        System.out.println("Name : "+acc.getCustomerName());

        acc.withdraw(100);
        acc.diposit(15);
        acc.withdraw(5);
        
        // constructors for 2nd challenge
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Jackob", 6922);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("John", 7855, "john@xyz.com");
        System.out.println(person3.getName());
    }
}
