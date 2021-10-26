package ch.gabriel.miniTest01;

import java.util.Scanner;

public class IsItLetter {
	
	private static final Scanner KEYB = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Type a character : ");
		char c = KEYB.next().charAt(0);
		
		boolean b = Character.isLetter(c);
		
		if (b) {
			System.out.println("You typed a letter.");
		}
		else {
			System.out.println("You didn't type a letter.");
		}
	}
}