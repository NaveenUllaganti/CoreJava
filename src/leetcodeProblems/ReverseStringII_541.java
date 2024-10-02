package leetcodeProblems;
/*
 * Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

 

Example 1:

Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Example 2:

Input: s = "abcd", k = 2
Output: "bacd"
 

Constraints:

1 <= s.length <= 104
s consists of only lowercase English letters.
1 <= k <= 104
 */

public class ReverseStringII_541 {

	public static void main(String[] args) {

	
	//public String reverseStr(String s, int k) {
		String s ="abcd";
		int k =5;
		char[] ch =s.toCharArray();
		for (int i=0,j=0;i<ch.length;) {
			int m = j+k-1;
			if((j+k)>ch.length) m=ch.length-1;
			reverseString(ch,j,m);
			System.out.println(String.valueOf(ch));
			i=j+k+k;
			j=i;
			
			}
		System.out.println(String.valueOf(ch));
		//return String.valueOf(ch);
		}
	public static void reverseString(char[] a,int l,int r) {
		while(l<r) {
			char temp = a[l];
			a[l++]=a[r];
			System.out.println(a[l]);
			a[r--]=temp;
			System.out.println(a[r]);
		}
	
		for(int p=0;p<9;p++) {
			for(int o=1;o<9;o++) {
				if(o==1 || o==8) {
					System.out.print(" K ");
				}else if (p==4) {
					System.out.print(" p ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		
	}	}

}
