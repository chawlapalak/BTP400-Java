/**
 * @version 1.0
 * @author Palak Chawla - 17 February 2020
 * This is a Bank class created for Lab 2 
 */
import java.util.ArrayList;

public class Bank
{
	//Instance Variables
	private String name;
	private ArrayList<Account> arrList;

	//Default Constructor
	public Bank()
	{
		this.name = "Seneca@York";
		this.arrList = new ArrayList<Account>();

	}

	//One-argument constructor
	public Bank(String name)
	{
		this.name = name;
		this.arrList = new ArrayList<Account>();

	}


	/**
	 * @return the arrList
	 * Getter for the @param arrList
	 */
	public ArrayList<Account> getArrList() 
	{
		return arrList;
	}

	//addAccount method that adds a method to the bank
	public boolean addAccount( Account newAccount )
	{

		if(newAccount == null)
		{
			return false;
		}
		if(arrList.size() > 0)
		{
			for(int i = 0; i < arrList.size() ; i++)
			{
				if(arrList.get(i).getAccNumber().equals(newAccount.getAccNumber()))
				{
					return false;
				}
			}
		}

		arrList.add(newAccount);
		return true;
	}


	@Override 
	//toString to display the string mentioned below
	public String toString()
	{
		return "*** Welcome to the Bank of " + this.name + " ***" +
				"\n" + "It has " + arrList.size() + " accounts.";
	}

	@Override
	//equals method to check if two Bank objects are equal
	public boolean equals(Object obj) 
	{

		if(obj instanceof Bank)
		{
			Bank bank2 = (Bank) obj;
			if(!this.name.equals(bank2.name))
			{
				return false;
			}

			for( int i = 0; i < arrList.size(); i++) 
			{
				if(!arrList.get(i).equals(bank2.arrList.get(i)))
				{
					return false;
				}
			}


		}
		return true;

	}
//searchByBalance to search in a account via balance
	public Account[] searchByBalance(double bal)
	{
		ArrayList<Account> temp = new ArrayList<Account>();
		for(int i = 0; i < arrList.size() ; i++)
		{
			if(arrList.get(i).getBal() == bal)
			{
				temp.add(arrList.get(i));
			}
		}
		Account [] arrTemp = temp.toArray(new Account[temp.size()]);
		return  (Account[]) arrTemp;

	}


}
