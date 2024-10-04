package JavaPratice;

public class CountOccuranceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Hello World";
		String result="";
		int leng=name.length();
		char target='l';
		int count=0;
		for(int i=leng-1;i>=0;i--) {
			char ch =name.charAt(i);
		 if(ch==target) {
			 count++;
			 result=result+count;
		 }else {
			 result=result+name.charAt(i); 
		 }	
	}
		System.out.println(result);
		System.out.println(count);
	}

}
