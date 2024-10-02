
public class intarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345679;
		int rev;
		int count=0;       //count the number of digits
		while(num>0) {
			num=num/10;
			count++;
		}
  System.out.println(count);
  for(int i=1;i<=8;i++) {
	  if(i%2==0) {
		  System.out.println("even numbers - "+i);
	  }else {
		  System.out.println("odd numbers - "+i);
	  }
  }
int ll=65;
  char ch=(char)ll;
  System.out.println(ch);
	}
	
	

}
