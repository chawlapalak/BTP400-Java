
/**
 * @version 1.0
 * @author Palak Chawla - 17 February 2020
 * This is a Account class created for Lab 2 
 */
import java.math.*;

public class Account 
{
	//Instance Variables
	private String fullName;
	private String accNumber;
	private double bal;

	/**
	 * Default constructor
	 */
	public Account()
	{ 
		this.fullName = "";
		this.accNumber = "";
		this.bal = 0;

	}

	/**
	 * Three argument constructor
	 * @param fullName
	 * @param accNumber
	 * @param bal
	 */
	public Account(String fullName, String accNumber, double bal)
	{
		if(fullName == null) //null check for fullName
		{
			this.fullName = "";
		} 
		else
		{
			this.fullName = fullName;
		}
		if(accNumber == null)//null check for accNumber
		{
			this.accNumber = "";
		}
		else
		{
			this.accNumber = accNumber;
		}
		if( bal < 0) //negative check for Balance
		{
			this.bal = 0;
		}
		else
		{
			this.bal = bal;
		}
	}


	/**
	 * toString() method to print details of the Account
	 */
	@Override
	public String toString() {
		return "Account Name: " + getFullName() + 
				"\n" + "Account Number:" + getAccNumber() +
				"\n" + "Balance: $" + getBal() + "\n";
	}

	/**
	 * getter for account number
	 * @return accNumber
	 */
	public String getAccNumber() {
		return accNumber;
	}


	/**
	 * setter for account number
	 * @param accNumber
	 */
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	/**
	 * getter for full name
	 * @return fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * setter for full Name
	 * @param fullName
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * getter for account Balance
	 * @return bal
	 */
	public double getBal() {
		return bal;
	}

	/**
	 * setter for account Balance
	 * @param bal
	 */
	public void setBal(double bal) {
		this.bal = bal;
	}

	/**
	 * Checking for the equality of account objects on the basis of
	 * fullName, accNumber and bal 
	 * @param object
	 * @return boolean 
	 */
	@Override 
	public boolean equals(Object obj) {

		if(obj instanceof Account) {
			Account acc2 = (Account) obj;
			BigDecimal accBal = new BigDecimal(bal);
			BigDecimal accBal2 = new BigDecimal(acc2.bal);

			if(accBal.equals(accBal2) && 
					fullName.equals(acc2.fullName) && 
					accNumber.equals(acc2.accNumber))
			{
				return true;
			} 
		}

		return false;

	}


}
