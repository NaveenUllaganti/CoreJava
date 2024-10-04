package javaPratice;

import java.util.Scanner;

public class Pratice {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Give me input");
		int a =scanner.nextInt();
		scanner.close();
		for(int i=2;i<a;i++) {
			if(i%2==0) {
				System.out.print(i);
			}else {
				System.out.print(" ");
			}
		}
	}

}
