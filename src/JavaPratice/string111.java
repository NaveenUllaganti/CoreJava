package JavaPratice;

import java.util.Arrays;
import java.util.Scanner;

public class string111 {

	public static void main(String[] args) {
		String ramu = "Ramu ia a good boy.";
		char intial = 'A';
		int age = 12;
		float weight = 23.67f;
		boolean details = true;
//		
//		System.out.print(ramu+".Intial is:"+intial+".Age is:"+age+".Weight is:"+weight+".Overal details is:"+details);
//		System.out.println();
//		System.out.printf("%sAge is %d.Weight is %f. ",ramu,age,weight);
//	    .System.outprintln();
//		
//		String [] sita = {"Sita is a good girl.","She is studying LKG."};
//		char [] a = {'A','B','C','D'};
//		int []b = {145,10};
//		int [][]c= {{1,2,3},{4,5,6}};
//	
//		System.out.println(Arrays.toString(sita));
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.deepToString(c));
//		
//		System.out.println(sita.length);
//		System.out.println(a.length);
//		System.out.println(a[2]);
//		System.out.println(b[0]+b[1]);
//		System.out.println(c.length);
//		System.out.println(c[0].length);
//	    System.out.println(c[1].length);
//		//System.out.println(c[1][3]);
//
//		System.out.println(Character.toLowerCase(a[0]));
//		System.out.println(sita[0].toUpperCase());
//		System.out.println(sita[0].toLowerCase());
		
		Scanner z = new Scanner(System.in);
		System.out.println("ENTER INPUT");
		String w = z.nextLine();
		char[] n= w.toCharArray();
		System.out.println("user input is : "+w);
		int m = w.length();
		int s= n.length;
		System.out.printf("total numbers of letters in your input %s is %d\n",w,m);
		for(int i=0; i<m;i++) {
			int count =0;
			char temp =n[i];
			for(int h=0;h<m;h++) {
				if(n[h]==temp && temp!='*') {
					count++;
					n[h]='*';
				}
			}
			if(temp !='*') {
				System.out.println("Number of times character "+temp+" reapeated is : "+count);
			}
		}
		
		
		
//		
	}

}
