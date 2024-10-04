package javaPratice;

public class variable {
	static int pincode; // class variable (static variable
	int l =598; // instance variable (non- static)
	public static void main(String[] args) {
		int number=1234;// local variable
		variable object1=new variable();
		number =2345;
		System.out.println(pincode);
		System.out.println(object1.l);
		System.out.println(number);
		
	}

}
