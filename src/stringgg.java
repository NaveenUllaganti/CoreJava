import java.util.Arrays;

public class stringgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="hello world";
		char ch []=a.toCharArray();
		int m = ch.length;
		System.out.println(Arrays.toString(ch));
		char temp;
		int count=0;
		for(int i=0;i<m;i++) {
			if(ch[i]=='l') {
				count++;
			}
		}
		
		
		String java ="JAVA IS NOT EASY";
		System.out.println(java);
		String[] words = java.split("");
		System.out.println(Arrays.toString(words));
		char[]cha = java.toCharArray();
		System.out.println(cha);
		int length = cha.length;
		System.out.println(length);
		char temp1;
		for(int i=0;i<length/2;i++) {
			temp=cha[i];
			cha[i]=cha[(length-1)-i];
			cha[(length-1)-i]=temp;
			
		}
		
		System.out.println(Arrays.toString(cha));
		
		
		

	}
	
}

