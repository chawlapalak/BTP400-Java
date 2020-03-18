/**
 * @version 1.0
 * @author Palak Chawla - 17 February 2020
 * Bank Tester class which is used to test the Bank class
 *
 */

public class BankTester {

	public static void main(String[] args)
	{

		String accountNames[]   = { "John Doe", "Mary Ryan", "Peter Liu", "John Doe", "Peter Liu" };
		String accountNumbers[] = { "A1234", "B5678", "C9999", "A1234", "D8901" };
		double accountBalances[] = { 1000, 3000, 5000, 7000, 3000 };

		Bank bank1 = new Bank("Palak Chawla");
		//testing 2a with 0 bank accounts
		System.out.println("Testing toString(2a) with 0 bank accounts");
		System.out.println(bank1 + "\n");

		for(int i = 0; i < accountNames.length; i++)
		{
			Account temp = new Account(accountNames[i],accountNumbers[i],accountBalances[i]);
			bank1.addAccount(temp);
		}
		//testing 2b with arrays of data
		System.out.println("Testing arrays of data(2b)"); 
		System.out.print(bank1+ "\n"); 
		for(int i = 0; i < bank1.getArrList().size() ; i++)
		{
			System.out.print((i+1) + ". number: " + bank1.getArrList().get(i).getAccNumber() + 
					", name: " + bank1.getArrList().get(i).getFullName()
					+ ", balance: $");
			System.out.printf("%.0f", bank1.getArrList().get(i).getBal());
			System.out.println();
		}

		System.out.println();
		// testing 2c with null values
		System.out.println("Testing addAccount with null values(2c)"); 
		System.out.println(bank1.addAccount(null)+ "\n"); 

		//testing 2d searchByBalance with 3000
		System.out.println("Testing searchByBalance with 3000 value(2d)");	
		Account[] search = bank1.searchByBalance(3000);
		System.out.print("We have found " + search.length + " accounts whose balance is $3000");
		System.out.println();
		//printing searchByBalance with 3000
		for(int i = 0; i < search.length; i++)
		{
			System.out.println((i+1) + ". number: " + search[i].getAccNumber() + ", name: " 
					+ search[i].getFullName());
		}
		System.out.println();

		//testing 2e searchByBalance with -1111
		System.out.println("Testing searchByBalance with -1111 value(2e)");	
		search = bank1.searchByBalance(-1111);
		//printing 2e searchByBalance with -1111
		if(bank1.searchByBalance(-1111).length != 0) 
		{
			Account[] test = bank1.searchByBalance(-1111);
			System.out.println("We have found " + test.length + " accounts whose balance is $" +  -1111);
			for(int i = 0; i < test.length; i++)
			{
				System.out.println((i+1) + ". number: " + test[i].getAccNumber() + ", name: " + 
						test[i].getFullName());
			}
			System.out.println();
		}
		else
		{
			System.out.println("*** NO ACCOUNT FOUND ***\n");
		}

		// Testing equals() method with random Account
		Bank randomOrder = new Bank("Palak Chawla");
		Bank sameOrder = new Bank("Palak Chawla");
		for(int i = accountNames.length - 1; i >= 0; i--)
		{
			Account random = new Account(accountNames[i], accountNumbers[i], 
					accountBalances[i]);
			randomOrder.addAccount(random);
		}

		//printing bank with random order of accounts
		System.out.println("Printing bank with random order of accounts");  
		for(int i = 0; i < randomOrder.getArrList().size() ; i++)
		{
			System.out.print((i+1) + ". number: " + randomOrder.getArrList().get(i).getAccNumber() + 
					", name: " + randomOrder.getArrList().get(i).getFullName()
					+ ", balance: $");
			System.out.printf("%.0f", randomOrder.getArrList().get(i).getBal());
			System.out.println();
		}

		System.out.println();
		System.out.println("Testing 3: equals() method for the random order");
		System.out.println(bank1.equals(randomOrder));
		System.out.println();

		//Testing equals() method with same order of Account
		for(int i = 0; i < accountNames.length; i++)
		{
			Account temp = new Account(accountNames[i],accountNumbers[i],accountBalances[i]);
			sameOrder.addAccount(temp);
		}
		System.out.println("Testing 3: equals() method for the same order");
		System.out.println(bank1.equals(sameOrder));
	}
}
