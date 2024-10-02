package JavaPratice;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
	public static void main(String args[]) {
		String a = "madhan";
		String be = "NAVEEN";
		String gh = "he is agood boy";
		int b =123;
		float bf = 1.23f;
		double bfr = 1.23;
		long   asd = 1;
		char c ='a';
		boolean d =true;
		
		int[] e = {1,2,3,4,5};
		char[] f = {'a','B','c'};
		boolean[] g = {true,true,true};
		String[] h = {"mad","MAN","get"};
		
		System.out.println("a is a String : "+a);
		
		System.out.printf("%s is a string %d  %s %s \n",a,b,be,a+gh);
		
		int[][] w = {{1,2,3},{4,5,6}};
		
		System.out.println(gh);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(Arrays.toString(e));
		System.out.println(e.length);
		
		System.out.println(Arrays.toString(f));
		System.out.println(f.length);
		
		System.out.println(Arrays.toString(g));
		System.out.println(g.length);
		
		System.out.println(Arrays.toString(h));
		System.out.println(h.length);
		
		System.out.println(Arrays.deepToString(w));
		System.out.println(w.length);
		System.out.println(w[0].length);
		System.out.println(w[1].length);
		
		System.out.println(e[2]+e[3]);
		System.out.println(f[1]);
		System.out.println(g[1]);
		System.out.println(h[1]);
		System.out.println(w[1][1]); 
		System.out.print(b+"\n");
		
		System.out.println(h[0].toUpperCase());
		System.out.println(Character.toUpperCase(f[0]));
		
		System.out.println(h[1].toLowerCase());
		System.out.println(Character.toLowerCase(f[1]));
		//char p []= {'N','A','V','E','E','N','R','E','D','D','Y'};
		
		
		
		
		
		
		Scanner mySc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = mySc.nextLine();
		mySc.close();
		System.out.println("Given input is : "+s);
		char[] p = s.toCharArray();
		System.out.println("input Array :"+Arrays.toString(p));
		int l = p.length;
		System.out.println(l);
		for(int i=0;i<l;i++) {
			if(p[i]=='E') {
				p[i]='Z';
			
			}else {
				if(p[i]=='N'){
					p[i]='A';
				}
			}
						
		}
		System.out.println("output Array :"+Arrays.toString(p));

		
		
		
	}
}