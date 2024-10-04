package javaPratice;

public class forLoop {
	public static void main(String[] args) {
		System.out.println("Print numbers 10 to 100");
		for(int i=0; i<=100;i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("Print even numbers betwwen 200 to 500");
		for(int i=200;i<=500;i++) {
			if(i%2==0) {
				System.out.print(" "+i);		
			}
		}
		System.out.println();
		System.out.println("Print numbers 150 to 300 divisble by 7");
		for(int i=150;i<=300;i++) {
			if(i%7==0) {
			System.out.print(" "+i);
		}
		}
		System.out.println();
		System.out.println("Print the sum of even numbers 40 to 80");
		int addd=0;
		for(int i=40;i<=80;i++) {
			if(i%2==0) {
				addd=addd+i;
				System.out.print(" "+i);
			}

		}
		System.out.println();
		System.out.println(addd);
		System.out.println("Print odd numbers 25 to 200 in reverse order");
		for(int i=200;i>=25;i--) {
			if(i%2!=0) {
				System.out.print(" "+i);
			}
		}
		
	}

}
