package JavaPratice;

import java.util.Arrays;

public class StringLargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Naveennnn Kumar Reddyy";
		String[]nameArray=name.split(" ");
		System.out.println(Arrays.toString(nameArray));
		char[] charray=name.toCharArray();
		System.out.println(Arrays.toString(charray));
		int l =name.length();
		String target="Kumar";
		boolean contain=true;
		for(int i=0;i<l;i++) {
			if(name.contains(target)) {
				contain=true;              //contains
			}else{
				contain=false;
			}
		}
		System.out.println(contain);
		int count =0;
		char targ='e';
		String result="";
		for(int i=0;i<l;i++) {
			if(name.charAt(i)=='e') {       //count
				count++;
				result=result+count;
			}else {
				result=result+name.charAt(i);
			}
		}
		System.out.println("Resultant String : "+result+" -target repeated- "+count);
		
		String largest=nameArray[0];
		String Smallest=nameArray[0];
		int length=nameArray.length;          //largest string and smallest string
		for(int i=0;i<length;i++) {
			if(nameArray[i].length()>largest.length()) {
				largest=nameArray[i];
			}else if(nameArray[i].length()<Smallest.length()) {
			      Smallest=nameArray[i];
			}
		}
		System.out.println(largest);
		System.out.println(Smallest);
		
		 String temp="";
		 for(int i=0;i<nameArray.length/2;i++) {
			 temp=nameArray[i];                           //Reverse of String
			 nameArray[i]=nameArray[nameArray.length-1-i];
			 nameArray[nameArray.length-1-i]=temp; 
		 }
		 System.out.println(Arrays.toString(nameArray));
		 
		 int num=1234;
	        String str = String.valueOf(num);
	        int ls= str.length();
	        char ch;
	        for(int i=0;i<ls;i++) {
	        	ch =str.charAt(i);
	        	System.out.println("Character At "+i+" is :"+ch);
	        }
		 
		 
		

	}

}
