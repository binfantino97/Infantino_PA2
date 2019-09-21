import java.util.Scanner;
public class encrypt {
  	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int input;
		int dig1;
		int dig2;
		int dig3;
		int dig4;
		
		System.out.println("Enter an integer");
		input = scnr.nextInt();

		System.out.println("Encrypting");		
		
		dig1 = input/1000;
		dig2 = (input/100)%10;
		dig3 = (input / 10) % 10;
		dig4 = input % 10;
		
		//System.out.println(input);
		//System.out.print(dig1 + " " + dig2 + " " + dig3 + " " + dig4);
		
		//System.out.println("Adding 7 to digits");
		dig1 = (dig1 + 7) % 10;
		dig2 = (dig2 + 7) % 10;
		dig3 = (dig3 + 7) % 10;
		dig4 = (dig4 + 7) % 10;
		
		int temp;
		
		temp = dig1;
		//swapped first and 3rd
		dig1 = dig3;
		dig3 = temp;
		
		temp = dig2;
		//swapped  2nd and 4th
		dig2 = dig4;
		dig4 = temp;
			
		System.out.println("Encrypted: " + dig1 + dig2 + dig3 + dig4);	
	}
}
