package javaPratice;

public class Method extends variable{
	static int currentbalance =1000;
	public static void greeting() {
		System.out.println("Welcome sir");
	}
	public int deposit() {
		int amount =100;
		currentbalance=currentbalance+amount;
		System.out.println("Deposit -"+amount);
		return amount; 
	}
	public static void main(String[] args) {
	     greeting();
	     Method bank =new Method();
	     bank.deposit();
	     bank.withdraw();
	     getcurrentbalance();
	     
	}
	public int withdraw() {
		int l = 1000;
		currentbalance = currentbalance-l;
		System.out.println(l);
		return l;
		
	}
public  static int getcurrentbalance() {
	System.out.println(currentbalance);
	return currentbalance;
	
}
}
