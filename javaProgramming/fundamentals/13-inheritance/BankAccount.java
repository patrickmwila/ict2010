/**
 * Bank Account class
 * Under construction implementing ideas of encapsulation
 */
public class BankAccount
{
    // instance variables
    private String accountName;
    private int accountNumber;
    private double balance;

    /**
     * Default Constructor
     */
    public BankAccount()
    {
        this.accountName   = null;
        this.accountNumber = 0;
        this.balance       = 0.0;
    }

    /**
     * Constructor
     * @param balance The balance for the BankAccount object
     */
    public BankAccount(double balance)
    {
        this.balance = balance;
    }

    /**
     * full Constructor
     */
    public BankAccount(String accountName, int accountNumber, double balance)
    {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * The setAccountName method stores a name in the accountName field.
     * @param name is the name to be stored in the accountName field.
     */
    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
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
     * The setAccountNumber stores the object's account number in the account
     *                      number field.
     *  @param accountNumber The account number to be stored
     */
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    /**
     * The getAccountNumber Returns the BankAccount object's account number.
     * @return The account number
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * The setBalance method stores a value amount in the balance field.
     * @param balance is the value to be stored in balance.
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    /**
     * The getBalance method returns the BankAcouunt object's balance.
     * @return The amount in the balance field .
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * deposit() Increments the current balance with deposit amount entered
     * @param depositAmount The cash amount deposited
     */
    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
    }

    /**
     * withdraw() Decrements the current balance by subtracting the withdraw amount
     * @param withdrawAmount The cash amount withdrawn
     */
    public void withdraw(double withdrawAmount)
    {
        this.balance -= withdrawAmount;
    }

    /**
     * The toString() verifies the values stored in our fields
     * @return A concatenated string of values stored in the fields
     */
    public String toString()
    {
        return this.accountName + ", " + this.accountNumber + ", " + this.balance;
    }
}
