import java.util.Scanner;
public class decrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int encryptedInt;
		int temp;
		int dig1;
		int dig2;
		int dig3;
		int dig4;
		
		System.out.print("Enter a number to decrypt: ");
		encryptedInt = scnr.nextInt();
		System.out.print("Decrypting: ");
		
		dig1 = encryptedInt / 1000;
		dig2 = (encryptedInt / 100) % 10;
		dig3 = (encryptedInt / 10) % 10;
		dig4 = encryptedInt % 10;
		
		temp = dig1;
		//swapped first and 3rd
		dig1 = dig3;
		dig3 = temp;
		
		temp = dig2;
		//swapped  2nd and 4th
		dig2 = dig4;
		dig4 = temp;
		
		//checks number and decrypt accordingly
		if(dig1 >= 7)
		{
			dig1 = dig1 - 7;
		}
		else
		{
			dig1 = dig1 + 3;
		}
		
		if(dig2 >= 7)
		{
			dig2 = dig2 - 7;
		}
		else
		{
			dig2 = dig2 + 3;
		}
		
		if(dig3 >= 7)
		{
			dig3 = dig3 - 7;
		}
		else
		{
			dig3 = dig3 + 3;
		}
		
		if(dig4 >= 7)
		{
			dig4 = dig4 - 7;
		}
		else
		{
			dig4 = dig4 + 3;
		}

		
		int decryptedInt = dig4 + dig3 * 10 + dig2 * 100 + dig1 * 1000;
		
		System.out.println(decryptedInt);
		

	}

}
