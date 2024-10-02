package JavaPratice;


public class reverse {

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "abcde";
		int len =s.length();
		
//		String d = s.substring(2,3);
//		System.out.println(d);
		
		char[] input = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char temp = input[0];
			for(int j =0;j<len-1;j++) {
				input[j]=input[j+1];
				System.out.println(String.valueOf(input));
			}
			input[len-1]=temp;
			
	}
}}
