package Test_Night_028;

public class CapitalOne {

    public static void main(String[] args) {
        // we want to create costumer for CapitalOne by using BankAccount class

        BankAccount lucasAccount = new BankAccount("lucas", "asdas");

        System.out.println("lucasAccount = " + lucasAccount.firstName);
        System.out.println("lucasAccount.getAccountHolder() = " + lucasAccount.getAccountHolder());

        System.out.println("lucasAccount.getBalance() = " + lucasAccount.getBalance());

        lucasAccount.setBalance(-200);
        System.out.println("lucasAccount.getBalance() = " + lucasAccount.getBalance());

        lucasAccount.deposit(-100);
        lucasAccount.availableBaance();


        lucasAccount.setAccountNumber(1231512312);
        System.out.println("lucasAccount.getAccountNumber() = " + lucasAccount.getAccountNumber());
    }
}
