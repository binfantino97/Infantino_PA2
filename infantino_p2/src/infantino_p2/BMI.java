package infantino_p2;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int option;
		double height;
		double weight;
		double BMI;
		
		System.out.println("Press 1 to calculate BMI using lbs and inches.");
		System.out.println("Press 2 to calculate BMI using kg and centimeters.");
		option = scnr.nextInt();
		
		if(option == 1) {
			System.out.println("Enter your weight in lbs (pounds).");
			weight = scnr.nextInt();
			
			System.out.println("Enter your height in inches.");
			height = scnr.nextInt();
			
			BMI = (703 * weight) / (height * height);
			System.out.printf("Your BMI is: %.2f" , BMI);
		}
		
		else if(option == 2) {
			System.out.println("Enter your weight in kg (kilograms).");
			weight = scnr.nextInt();
			
			System.out.println("Enter your height in centimeters.");
			height = scnr.nextInt();
			
			// convert centimeters to meters
			height = height / 100.0;
			
			BMI = weight / (height * height);
			System.out.printf("Your BMI is: %.2f" , BMI);
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("BMI Categories:");
		System.out.println("Underweight <= 18.5");
		System.out.println("Normal Weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obseity >= 30");
		
	}
	
}
