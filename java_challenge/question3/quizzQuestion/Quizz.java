package quizzQuestion;

import java.util.Scanner;

public class Quizz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] questions = {
				"1. What word becomes shorter when you add two letters on it? ",
				"2. What gets wetter the more it dries? ",
				"3. Which word in the dictionary is spelled incorrectly? ",
				"4. What spends all the time on the floor but never gets dirty?",
				"5. If two is company and three is a crowd, what is four and five? ",
				"6. What has a neck but doesn´t have a head? ",
				"7. What do you call a cute door? ",
				"8. What has 3 letters and start with gas? ",
				"9. What is so unbelievably fragile that just by speaking it´s name will break it? ",
				"10. What starts with a T, ends with a T and is full of T? "
		};
		
		String[] answers = {"short", "a towel", "incorrectly", "the shadow", "nine", 
				"a bottle", "adoorable", "car", "the silence", "a teapot"};
		
		
		int right = 0;
		int wrong = 0;
		String answer;
		
		System.out.println("Welcome to the Compass Riddles Quizz.  Have fun! \n");
		
		for(int i = 0; i < questions.length; i++) {
			
			System.out.println(questions[i]);
			answer = scanner.nextLine().toLowerCase();
			
			if(answer.equals(answers[i])) {right++; System.out.println("Great job! You did right");
				} else {wrong ++; System.out.println("You´ve got it wrong :(");}
		}
		
		System.out.println("Inform your name. ");
		String name = scanner.nextLine();
		
		System.out.println("User " + name + "\nright: " + right + "\nwrong: "+wrong);
		
		scanner.close();
	}
	
}
