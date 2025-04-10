package Service;
import java.util.*;

import Models.Game;
public class GameService {
//	GameService(){}
	Game game = new Game();
//	UserService userService = new UserService();
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public void displayUserScore(UserService userService) {
//		UserService userService = new UserService();
		int count=3;
		int tempCount = 1;
		int diff = 0;
//		int a = userService.numberPicker();
		int randomNumber = random.nextInt(100);
		while(tempCount<=count) {
			int a = userService.numberPicker();
//			diff = randomNumber-a;
			if(a!=randomNumber) {
				System.out.println("Wrong number picked");
			}
			else if(a==randomNumber) {
				break;
			}
			tempCount+=1;
		}
		String ans = "";
		if (tempCount>count) {
			System.out.println("Your score is"+" "+getUserScore(tempCount));
			System.out.println("The correct number was"+" "+randomNumber);
			playAnotherRound(userService);
		}
//		return getUserScore(tempCount);
//		if(!("No").equalsIgnoreCase(playAnotherRound(userService))){
//			System.out.println(playAnotherRound(userService));
//		}
		else if(tempCount<=count) {
			System.out.println("Congratulations!!!!! Your score is"+" "+getUserScore(tempCount));
		}

	}
	
	private void playAnotherRound(UserService userService) {
		System.out.println("Do you want to play another round?");
		System.out.println("Please enter Yes or No");
		String ans ="";
		String s = scanner.next();
		if(!s.equalsIgnoreCase("Yes")&&(!s.equalsIgnoreCase("No"))) {
			System.out.println("Please enter a valid text");
			s = scanner.next();
		}
		if(s.equalsIgnoreCase("Yes")) {
			displayUserScore(userService);
		}
		if(s.equalsIgnoreCase("No")) {
			System.out.println("Thank you for playing!!");
		}
	}
	
	
	private int getUserScore(int tempCount) {
		int score = 0;
		if(tempCount==1) {
			score = 30;
		}
		else if(tempCount==2) {
			score = 15;
		}
		else if(tempCount==3) {
			score = 5;
		}
		else {
			score = 0;
		}
		return score;
	}
}
