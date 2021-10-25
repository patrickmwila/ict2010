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

        accountOne.setAccountName("Patrick Mwila");
        accountOne.setAccountNumber(2019037459);
        accountOne.setBalance(150.50);
        accountOne.deposit(200);

        // check if data has been stored in the fields
        System.out.println(
            accountOne.toString()
        );

        // create a Savings Account class
        SavingsAccount savingsAcc1 = new SavingsAccount("JaIT", 2021, 100, 60);
        savingsAcc1.deposit(100);

        System.out.println(savingsAcc1.toString());
    }
}
