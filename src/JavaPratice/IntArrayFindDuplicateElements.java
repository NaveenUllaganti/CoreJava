package JavaPratice;

import java.util.Arrays;

public class IntArrayFindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
nt num = 12235345;
        
        // Calculate the number of digits in the number
        int length = (int) Math.log10(num) + 1;
        
        // Convert the number to a string to verify the length
        String str = String.valueOf(num);
        int l = str.length();
        
        // Print lengths for verification
        System.out.println("Length using log10: " + length);
        System.out.println("Length using String: " + l);
        
        // Create an array to hold the digits
        int[] array = new int[length];
        
        // Convert number to array of digits
        for (int i = l - 1; i >= 0; i--) {
            array[i] = num % 10;  // Get the last digit and store it in the array
            num /= 10;  // Remove the last digit from the number
            System.out.println(Arrays.toString(array));  // Print the array at each step
        }
     
        // Print the final array with digits separated by space
        for (int digit : array) {
            System.out.print(digit + "");
        }
        int result=0;
     for(int i=0;i<array.length;i++) {
    	result =result*10+array[i];
     }
     System.out.println();
     System.out.println(result);
     for(int i=0;i<array.length;i++) {// found duplicate element in an int array
    	 for(int j=i+1;j<array.length;j++) {
    		 if(array[i]==array[j]) {
    			 System.out.println("Found duplicate element - "+array[i]);
    		 }
    	 }
     }
     

	}

}
