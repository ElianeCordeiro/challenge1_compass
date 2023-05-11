package emotionsCount;

import java.util.Scanner;

public class Emotions {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String fun = ":-)";
		String upset = ":-(";
		
		int funCount = 0;
		int upsetCount = 0;
		
		System.out.println("Right a message down below. ");
		String message = scanner.nextLine();
		
		String[] splitMessage = message.split(" ");
		
		for (String emotion : splitMessage) {
			
			if(emotion.equals(fun)) funCount++;
			if(emotion.equals(upset)) upsetCount++;
			
		}
		
		if(funCount == upsetCount) System.out.println("Neutral");
		else if (funCount > upsetCount) System.out.println("Fun");
		else if (funCount < upsetCount) System.out.println("Upset");
		
		
		scanner.close();
	}	
	
	
}
