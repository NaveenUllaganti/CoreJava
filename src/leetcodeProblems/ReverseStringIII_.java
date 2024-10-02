package leetcodeProblems;

import java.util.Arrays;

public class ReverseStringIII_ {

	public static void main(String[] args) {
		String input = "vector<string> split (string s, char delimiter)";
		char[] ch=input.toCharArray();
	    int l=0,r =0;
	    while(r<ch.length) {
	    	if(ch[r]==' ') {
	    		reverse(ch,l,r-1);
	    		l=r+1;
	    	}
	    	r++;
	    }
	    reverse(ch,l,r-1);
	    
		
		System.out.println(Arrays.toString(ch));
		System.out.println(new String(ch));
	}
	public static void reverse(char[] ch,int l,int r) {
		//int len=ch.length;
		while(r>l) {
			char temp =ch[l];
			ch[l++]=ch[r];
			ch[r--]=temp;
		}
	}
	
}
