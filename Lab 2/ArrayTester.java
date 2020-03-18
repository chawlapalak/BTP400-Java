
/**
 * @version 1.0
 * @author Palak Chawla 17 February 2020
 * ArrayTester class to create an array of 7 Account objects and display a
 * summary of comparing the Account objects in the array.
 */

public class ArrayTester {

	public static void main(String[] args) //main method
	{

		Account accArray[] = new Account[7];//Array of Account object

		accArray[0] = new Account("Peter Liu", "A12345", 5000);
		accArray[1] = new Account("Peter Liu", "A67890", 6000);
		accArray[2] = new Account("Abraham Lincoln", "Z6789", 7777);
		accArray[3] = new Account("Peter Liu", "A12345", 5000);
		accArray[4] = new Account("Palak Chawla", "E3333", 9000);
		accArray[5] = new Account("Abraham Lincoln", "Z6789", 7777);
		accArray[6] = new Account("Abraham Lincoln", "Z6789", 7777);

		System.out.println("COUNTING SUMMARY");
		System.out.println("+ total number of accounts: " + accArray.length);
		//total number of account

		Account usedArray[] = new Account[accArray.length];//Array to store used accounts
		int index = 1; //index to print the summary of accounts
		for(int i = 0; i < accArray.length ; i++) //loop to iterate over array of accounts
		{
			boolean flag = false; //used account flag

			for(int k = 0; k < usedArray.length ; k++) 
				//inner loop to check whether current account is used array
			{
				if(accArray[i].equals(usedArray[k]))
					//condition to check occurrence of current account in used array
				{
					flag = true; 
					break;
				}
			}
			if(!flag) //if not used account
			{
				int count = 1;
				for(int j = i+1; j < accArray.length ; j++) // loop to count no. of occurrence of acc
				{
					if(accArray[i].equals(accArray[j])) // condition to count occurrence of account
					{
						count++; //increment count
					}
				}
				usedArray[i] = accArray[i]; //pushed account to used array
				System.out.print(index + ". " + accArray[i].getFullName() + ", " +
						accArray[i].getAccNumber() +", ");
				System.out.printf("%.2f", accArray[i].getBal());
				System.out.println(": " + count); 
				index++;
			}
		}

	}
}
