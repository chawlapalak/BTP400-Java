
/**
 * @version 1.0
 * @author Palak Chawla - 17 February 2020
 * Account Tester class which is used to test the Account class
 *
 */
public class AccountTester {

	/**
	 * @param args 
	 * main method
	 */
	public static void main(String[] args) {

		Account account1 = null; 
		Account account2 = new Account("Palak Chawla" , "TD12345" , 1000.99 ); 
		Account account3 = new Account("Palak Chawla" , "TD12345" , 1000.99);
		Account account4 = new Account("Peter Liu" , "TD125" , 10.99);

		System.out.println( "Account 1 details :" + account1);	
		System.out.println( "Account 2 details :");
		System.out.println(account2);	
		System.out.println( "Account 3 details :");
		System.out.println(account3);
		System.out.println( "Account 4 details :");
		System.out.println(account4);
		System.out.print( "Checking if account 2 equals account 3: ");
		System.out.println(account2.equals(account3)); //true when two Account objects are equal
		System.out.print( "Checking if account 2 equals account 4: ");
		System.out.println(account2.equals(account4)); //false when two Account objects are not equal
		System.out.print( "Checking if account 2 equals account 1(null reference): ");
		System.out.println(account2.equals(account1)); //false when it receives a null reference as the actual parameter.
	}

}
