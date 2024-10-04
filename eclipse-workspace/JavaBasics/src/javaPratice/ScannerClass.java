package javaPratice;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.printf("Hey %s how are you ? \n", name);
		scanner.nextLine();
		System.out.println("How old are you");
		scanner.nextInt();
		System.out.println("Thank you for the information");
			scanner.close();
		
	}
	

}
