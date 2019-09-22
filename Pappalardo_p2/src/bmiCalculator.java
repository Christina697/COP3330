import java.util.Scanner;
public class bmiCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		float weight, height;
		double bmi;
		
		System.out.println("This program will calculate your body mass index (BMI) using pounds (weight) and inches (height).");
		
		System.out.println("Please enter your weight (in pounds): ");
		weight = scnr.nextFloat();
		System.out.println("Please enter your height (in inches): ");
		height = scnr.nextFloat();
		
		bmi = (703 * weight ) / (Math.pow(height, 2));
		
		System.out.printf("Your BMI is %.1f\n", bmi);
		
		if(bmi < 18.5)
		{
			System.out.println("You are underweight.");
		}
		else if(bmi == 18.5 || bmi <= 24.9)
		{
			System.out.println("You are normal weight.");
		}
		else if(bmi == 25 || bmi <29.9)
		{
			System.out.println("You are overweight.");
		}
		else 
		{
			System.out.println("You are obese.");
		}
		
		scnr.close();
	}

}
