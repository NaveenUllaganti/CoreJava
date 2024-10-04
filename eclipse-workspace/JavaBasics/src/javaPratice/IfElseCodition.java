package javaPratice;

public class IfElseCodition {
	public static void main(String[]srgs) {
		String name = " Naveen Kumar Reddy ";
		String target ="Kumar";
		Boolean b=false;
		if(name.contains(target)) {
			b =true;
			System.out.println(b);
		}else {
			b=false;
			System.out.println(b);
		}
		
		int i=10;
		int j=20;
		if(i<=j && i!=j) {
			b=true;
			System.out.println("INTEGER -"+b);
		}else {
			b=false;
			System.out.println( "integer -"+b);
		}
	}

}
