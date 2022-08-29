package Test_Night_028;

public class BankAccount {

    //create custom class called BankAccount for CapitalOne bank accounts:
    //			public variables:  bankName, firstName, lastName
    //	 		private variables: accountHolder, accountNumber, balance
    //	 		encapsulate all the private data
    //	 		create a constructor that can initialize firstName and fullName
    //
    //	 		action:
    //	 				depositing
    //	 				withdrawing
    //	 				available balance
    //	 				toString: returns the full name and balance

    // public variables:  bankName, firstName, lastName
    public static String bankName = "CapitalOne"; // static public : since we will work only CapitalOne
    // bankName will be a unique name thas why we made static
    public String firstName; // instance public : since we will have multiple costumers
    // that mean we will need to create multiple copy from first name object
    public String lastName;  // instance public :

    //	 		private variables: accountHolder, accountNumber, balance
    private String accountHolder;
    private long accountNumber;
    private double balance;

    // encapsulate all the private data

    // create a constructor that can initialize first name, last name and account holder
    public BankAccount(String firstName, String lastName){

        this.firstName=firstName;
        this.lastName=lastName;
        this.accountHolder=firstName + " " + lastName;

    }
    public void setAccountHolder(String firstName, String lastName){
        this.accountHolder=firstName + " " + lastName;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance( double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }


    //	 		action:
    //	 				depositing
    //	 				withdrawing
    //	 				available balance
    //	 				toString: returns the full name and balance

    public void deposit(double money){
        // now you balance needs to be updated
        setBalance(balance + money);

        // balance 100
        // deposit 20
        // new balance will be set setBalance(balance + money
    }
    public void availableBaance(){
        System.out.println("Available Blance is : " + getBalance());
    }

    public String toString(){
        return "Full name is : " + getAccountHolder() + "Balance is : " + getBalance();
    }



}
