package JavaPratice;

import java.util.Arrays;

public class IntArrayRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=124234;
	       int number2=3456789;
	       int length1=(int)Math.log10(number1)+1;
	       int length2=(int)Math.log10(number2)+1;
	       int[]array1=new int[length1];
	       int[]array2=new int[length2];
	       for(int i=length1-1;i>=0;i--) {
	    	   array1[i]=number1%10;
	    	   number1/=10;
	       }
	       System.out.println(Arrays.toString(array1));
	       for(int j=length2-1;j>=0;j--) {
	    	   array2[j]=number2%10;           //int to int array
	    	   number2/=10;
	       }
	       System.out.println(Arrays.toString(array2));
	       int[]array3=new int[array1.length+array2.length];
	       for(int i=0;i<array1.length;i++) {
	    	   array3[i]=array1[i];              // concat two int arrays  
	       }                              
	       System.out.println(Arrays.toString(array3));
	       for(int i=0;i<array2.length;i++) {
	    	   array3[array1.length+i]=array2[i];
	       }
	       System.out.println(Arrays.toString(array3));
	       Arrays.sort(array3);
	       int j=0;
	       for(int i=0;i<array3.length-1;i++) {
	    	   if(array3[i]!=array3[i+1]) {
	    		   array3[j]=array3[i];
	    		   j++;
	    	   }                  //remove duplicate elements
	       }
	       array3[j]=array3[array3.length-1];
	       for(int k=0;k<=j;k++) {
	    	   System.out.print(array3[k]);
	       }
	       System.out.println(Arrays.toString(array3));

	}

}
