package Models;
import Service.GameService;
import Service.UserService;

public class Main {
	public static void main(String[] args) {
		GameService gameService = new GameService();
		UserService userService = new UserService();
		gameService.displayUserScore(userService);
	}
}