/**
 * SavingsAccount 
 * under construction
 */

public class SavingsAccount extends BankAccount
{
    // instance variables
    private int interest;

    /**
     * Inherated Constructor
     */
    public SavingsAccount(String accountName, int accountNumber, double balance, int interest)
    {
        super(accountName, accountNumber, balance);
        this.interest = interest;
    }

    public void setInterest(int interest)
    {
        this.interest = interest;
    }

    /**
     *
     */
    public int getInterest()
    {
        return interest;
    }

    /**
     *
     */
    public void deposit(double depositAmount)
    {
        super.setBalance(super.getBalance() + depositAmount + interest);
    }

    /**
     *
     */
    public String toString()
    {
        String str = super.toString() + ", " + this.interest;
        return str;
    }
}

