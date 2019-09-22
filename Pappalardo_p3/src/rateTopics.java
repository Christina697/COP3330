import java.util.Scanner;
public class rateTopics {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] topics = new String[5];
		int[][] surveyResponses = new int[5][10];
		int userInput;
		
		
		topics[0] = "Ocean Pollution";
		topics[1] = "Student Loan Debt";
		topics[2] = "Mental Health Awareness";
		topics[3] = "Pets";
		topics[4] = "Clean Living Space";
		
		System.out.println("Rate each topic on a scale of 1 (least important) to 10 (most important)");
			
		//gets input from user
		for(int i = 0; i < surveyResponses.length; i++) {
			System.out.println(topics[i]);
			userInput = scnr.nextInt();
			surveyResponses[i][userInput] = + 1;
		}
		
		//My makeshift table
		System.out.println(""+topics[0] + "         " + surveyResponses[0][0] + " " + surveyResponses[0][1] + " " + surveyResponses[0][2] + " " + surveyResponses[0][3] + " " + surveyResponses[0][4] + " " + surveyResponses[0][5] + " " + surveyResponses[0][6]  + " " + surveyResponses[0][7]  + " " + surveyResponses[0][8]  + " " + surveyResponses[0][9]);
		System.out.println(""+topics[1] + "       " + surveyResponses[1][0] + " " + surveyResponses[1][1] + " " + surveyResponses[1][2] + " " + surveyResponses[1][3] + " " + surveyResponses[1][4] + " " + surveyResponses[1][5] + " " + surveyResponses[1][6]  + " " + surveyResponses[1][7]  + " " + surveyResponses[1][8]  + " " + surveyResponses[1][9]);
		System.out.println(""+topics[2] + " " + surveyResponses[2][0] + " " + surveyResponses[2][1] + " " + surveyResponses[2][2] + " " + surveyResponses[2][3] + " " + surveyResponses[2][4] + " " + surveyResponses[2][5] + " " + surveyResponses[2][6]  + " " + surveyResponses[2][7]  + " " + surveyResponses[2][8]  + " " + surveyResponses[2][9]);	
		System.out.println(""+topics[3] + "                    " + surveyResponses[3][0] + " " + surveyResponses[3][1] + " " + surveyResponses[3][2] + " " + surveyResponses[3][3] + " " + surveyResponses[3][4] + " " + surveyResponses[3][5] + " " + surveyResponses[3][6]  + " " + surveyResponses[3][7]  + " " + surveyResponses[3][8]  + " " + surveyResponses[3][9]);
		System.out.println(""+topics[4] + "      " + surveyResponses[4][0] + " " + surveyResponses[4][1] + " " + surveyResponses[4][2] + " " + surveyResponses[4][3] + " " + surveyResponses[4][4] + " " + surveyResponses[4][5] + " " + surveyResponses[4][6]  + " " + surveyResponses[4][7]  + " " + surveyResponses[4][8]  + " " + surveyResponses[4][9]);
		
		scnr.close();
		}
}
