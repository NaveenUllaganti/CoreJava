package javaPratice;

public class Operators {
	public static void main(String[] args) {
		int j=20;
		int i =10;
		// Arthemetical operators
		System.out.println(j+i);
		System.out.println(j-i);
		System.out.println(j*i);
		System.out.println(j/i);
		System.out.println(j%i);
		
		//Uniray operators (++ ,--)
		System.out.println(i);
		System.out.println(++i);//preincrement
		System.out.println(i++);// postincrement
		System.out.println(i);
		//same as postdecrement and predecrement
		
		//relational operators
		   System.out.println(i==j);
		   System.out.println(i!=j);
		   System.out.println(i<=j);//lessthan or equal to
		   System.out.println(i>=j);
		   System.out.println(i<j);
		   System.out.println(i>j);
		   
		   //conditional operators
		 
		   System.out.println(i<=j && i!=j);//and satisfy both conditions must
		   System.out.println(i<j||i==j);// or satisfy any one condition
			// assignment operators
		   int a=20;
		   a+=5;
		   System.out.println(a);
		   a*=5;
		   System.out.println(a);
		   
	}

}
