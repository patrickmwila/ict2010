/**
 * Bank Account class
 * Under construction implementing ideas of encapsulation
 */

public class BankAccount
{
    // instance variables
    private String accountName;
    private String accountNumber;
    private double balance;


    /**
     * Constructor
     */
    public BankAccount()
    {
        accountName = "Xapit";
    }

    /**
     * Constructor
     * @param aNumber The number for the BankAccount object
     * @param aBalance The balance for the BankAccount object
     */
    public BankAccount(String aNumber, double aBalance)
    {
        accountNumber = aNumber;
        balance       = aBalance;
    }

    /**
     * Constructor
     * @param aName The name for the BankAccount object
     * @param aNumber The number for the BankAccount object
     * @param aBalance The balance for the BankAccount object
     */
    public BankAccount(String accountName, String accountNumber, double balance)
    {
        this.accountName   = accountName;
        this.accountNumber = accountNumber;
        this.balance       = balance;
    }

    /**
     * The setAccountName method stores a name in the accountName field.
     * @param name is the name to be stored in the accountName field.
     */
    public void setAccountName(String name)
    {
        accountName = name;
    }

    /**
     * The setAccountNumber stores the object's account number in the account
     *                      number field.
     *  @param number is the account number to be stored
     */
    public void setAccountNumber(String number)
    {
        accountNumber = number;
    }

    /**
     * The setBalance method stores a value amount in the balance field.
     * @param amount is the value to be stored in balance.
     */
    public void setBalance(double amount)
    {
        balance += amount;
    }

    /**
     * The getAccountName returns the BankAccount object's name.
     * @return The account name stored in the accountName field.
     */
    public String getAccountName()
    {
        return accountName;
    }

    /**
     * The getAccountNumber returns the BankAccount object's account number.
     * @return The account number
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * The getBalance method returns the BankAcouunt object's balance.
     * @return The amount in the balance field .
     */
    public double getBalance()
    {
        return balance;
    }
}
