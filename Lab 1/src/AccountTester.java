
/**
 * @version 1.0
 * @author Palak Chawla 15 February 2020
 * Account Tester class which is used to test the Account class
 *
 */
public class AccountTester {

	/**
	 * @param args 
	 * main method
	 */
	public static void main(String[] args) {
		
		Account account1 = new Account(null, null, -1); //invalid values
		Account account2 = new Account("Palak Chawla" , "TD12345" , 1000.99 ); //valid values
		Account account3 = new Account(); //default constructor check

		//checking the 3 argument  constructor through account 1 with invalid values
		System.out.println(account1);
		
		//checking the 3 argument  constructor through account 2 with valid values
		System.out.println(account2);
		
		//output default constructor for account3
		System.out.println(account3);
		
		//checking the setters used in account
		account3.setFullName("Picxie Chawla");
		account3.setBal(1000.99);
		account3.setAccNumber("RBC1234");
		
		//output of account 3 after using the setters
		System.out.println(account3);
	}

}
 