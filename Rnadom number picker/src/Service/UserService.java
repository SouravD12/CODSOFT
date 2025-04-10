package Service;
import java.io.*;
import java.util.*;
import java.util.Scanner;

import Models.User;
public class UserService {
	User user = new User();
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	public int numberPicker() {
		System.out.println("Enter a number between 1-100");
		int number = scanner.nextInt();
		return number;
	}
}
