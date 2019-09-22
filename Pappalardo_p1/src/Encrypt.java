import java.util.Scanner;
public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int fourDigitInt, firstDigit, secondDigit, thirdDigit, fourthDigit;
		int divide = 10;
		
		System.out.print("Please enter the four-digit interger: ");
		fourDigitInt = scnr.nextInt();
		
		firstDigit = ((fourDigitInt / 1000) + 7) % divide;
		
		secondDigit = (((fourDigitInt / 100) % 100) + 7) % divide;
		
		thirdDigit = ((((fourDigitInt / 10) % 10) + 7)) % divide;
		
		fourthDigit = (((fourDigitInt / 1) + 7)) % divide;
		
		System.out.println(""+ thirdDigit + fourthDigit + firstDigit + secondDigit);
		
		
		scnr.close();
	}

}
