package Models;
import java.io.*;
public class User {
	private String name;
	private String email;
	private String number;
	private int userCountOfRound;
	private int score;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getUserCountOfRound() {
		return userCountOfRound;
	}

	public void setUserCountOfRound(int userCountOfRound) {
		this.userCountOfRound = userCountOfRound;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
