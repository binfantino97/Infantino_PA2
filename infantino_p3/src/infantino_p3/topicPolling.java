package infantino_p3;
import java.util.Scanner;
public class topicPolling {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int numPeople;
		
		System.out.println("How many people are taking this poll?");
		numPeople = scnr.nextInt();
		
		int i; int j; int k; double rate;
		String topics[] = new String[5];
		topics[0] = "Political Issues";
		topics[1] = "Phsyical Wellness";
		topics[2] = "Mental Wellness";
		topics[3] = "Religion";
		topics[4] = "Gun Control";
		
		
		System.out.println("Please rate each topic between 1 and 10.");
		double result[] = new double[5];
		for(i=0; i<numPeople;i++) {
			
			k = i+1;
			for(j=0; j<5; j++)
			{
				System.out.println("Person " + k + ": Rate " + topics[j] + ".");
				rate = scnr.nextDouble();
				
				if(rate > 10)
				{
					System.out.println("Invalid Answer");
					System.out.println("Please enter a number between 1 and 10");
					rate = scnr.nextDouble();
				}
				result[j] = result[j] + rate;
			}
		
		}
		
		for(i = 0; i<5; i++)
		{
			System.out.println("The average rating for " + topics[i] + " is " + (result[i]/numPeople));
		}
		
		double min = 0;
		double max = 0;
		
		min = result[0];
		max = result[0];
		
		String lowest=topics[0];
		String highest=topics[0];
		
		for(i = 0; i<5; i++) {
			if(result[i]>max)
			{
				max = result[i];
				highest = topics[i];
			}
			
			
			if(result[i] < min)
			{
				min = result[i];
				lowest = topics[i];
			}
			
		}
		
		System.out.println("The topic with the lowest total rating is " + lowest);
		System.out.println("The topic with the highest total rating is " + highest);
	
	}

}
