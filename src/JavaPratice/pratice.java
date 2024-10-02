package JavaPratice;

import java.util.Arrays;
import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
		Scanner hari = new Scanner(System.in);
		System.out.println("Enter the input:");
		String ram = hari.nextLine();
		String[] ds = ram.split(" ");
		System.out.println(Arrays.toString(ds));
		System.out.println(ds.length);
		char[] sita = ram.toCharArray();
		System.out.println("The user input is : "+ram);
		int l = sita.length;
		System.out.println(l);
		System.out.printf("total number of letters in your input %s is %d ",ram,l);
		
		
//		String a = "  hello  ";
//		System.out.println(a.trim());
//	

	}

}
