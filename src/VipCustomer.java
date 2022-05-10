public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;
    
    //constructors
    public VipCustomer(){
        this("Somyaranjan", 4500, "somya@abc.com");
    }
    public VipCustomer(String name, int creditLimit){
        this(name, creditLimit, "Unknown@xyz.com");
    }
    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    //Getters only
    //setters not required

    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}
