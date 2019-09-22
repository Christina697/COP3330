import java.util.Scanner;
public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int encrypted, firstDigit, secondDigit, thirdDigit, fourthDigit;
		
		int newFirstDigit, newSecondDigit, newThirdDigit, newFourthDigit;
		
		
		System.out.print("Please enter the encrypted interger: ");
		encrypted = scnr.nextInt();
		
		firstDigit = ((encrypted / 1000));
		secondDigit = ((((encrypted / 100) % 10)));
		thirdDigit = ((((encrypted / 10) % 10)));
		fourthDigit = (((encrypted / 1) % 10));

		if(firstDigit < 7) {
			newFirstDigit = (firstDigit + 10) - 7;
		}
		else {
			newFirstDigit = firstDigit - 7;
		}
		
		if(secondDigit < 7) {
			newSecondDigit = (secondDigit + 10) - 7;
		}
		else {
			newSecondDigit = secondDigit - 7;
		}
		
		if(thirdDigit < 7) {
			newThirdDigit = (thirdDigit + 10) - 7;
		}
		else {
			newThirdDigit = thirdDigit - 7;
		}
		
		if(fourthDigit < 7) {
			newFourthDigit = (fourthDigit + 10) - 7;
		}
		else {
			newFourthDigit = fourthDigit - 7;
		}
		
		System.out.println(""+ newThirdDigit + newFourthDigit + newFirstDigit + newSecondDigit);
		
		
		scnr.close();

	}

}
