/**
 * Author     : 2019037459
 * Instructor : Phyela Mbewe
 * Date       : 10-09-2021
 * Description: Demonstrating how to create object's based on our userDefined
 *              BankAccount class.
 */
public class Main
{
    public static void main(String[] args)
    {
        // create a BankAccount object
        BankAccount accountOne = new BankAccount();

        // initialize balance for accountOne 
        accountOne.setBalance(700.50);
        double balance = accountOne.getBalance();

        // display the balance for accountOne
        System.out.println("\nBalance for accountOne is $" + balance);


        // create a BankAccount object
        BankAccount accountTwo = new BankAccount();

        // initialize balance for accountTwo
        accountTwo.setBalance(5799.50);
        double balanceTwo = accountTwo.getBalance();

        // display the balance for accountOne
        System.out.println("Balance for accountTwo is $" + balanceTwo);

        // create a BankAccount object
        BankAccount accountThree = new BankAccount();
        System.out.println("Balance for accountThree is $" + accountThree.getBalance());
        System.out.println("Account Three name is " + accountThree.getAccountName());


        // create a BankAccount object
        BankAccount accountFour = new BankAccount("2019037459", 2703.50);

        System.out.println();
        accountFour.setAccountName("UBA Africard");

        System.out.println(accountFour.getAccountName());
        System.out.println(accountFour.getAccountNumber());
        System.out.println(accountFour.getBalance());
    }
}
