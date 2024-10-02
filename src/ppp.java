import java.util.Arrays;

public class ppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello world";
        char target = 'l';
        int count = 1;
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == target) {
                result =result+ count;
                count=count+count;
            } else {
                result =result+ ch;
            }
        }

      
        System.out.println("Output: " + result); // Output: he12o wor3d
        isContains();
        counting();
        isContains1() ;
        isPalndrom();
    }
	
	public static boolean isContains() {
		String s1="HELLO World";
		String s2="! hello java";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		String[]array=s3.split(" ");
		System.out.println(Arrays.toString(array));
		char []ch = s3.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println(String.valueOf(ch));
		return false;
		
	}
	public static String counting() {
	String word ="Naveen Kumar Reddy";
	int l =word.length();
	int count =0;
	char target='e';
	boolean flag =true;
	String result="";
	String target1="Kumar";
	for(int i =0;i<l;i++) {
		char ch = word.charAt(i);
		if(ch==target) {
			result=result+count;
			count++;
			
	}else {
		result=result+ch;
	}
	}
	System.out.println(result);
    return word;
	}
	public static boolean isContains1() {
		String word="Naveen Kumar Reddy";
		boolean contain=true;
		String cont="naveen kumar reddy";
		for(int i=0;i<word.length();i++) {
			if(word.contains(cont)) {
				contain=true;
			}else{
				contain=false;
			}
		}
		System.out.println(contain);
		return contain;
		
	}
	public static boolean isPalndrom() {
		String name= "Nitin";
		boolean ispalndrom=true;
		int l =name.length();
	    String reverse="";
	    for(int i=l-1;i>=0;i--) {
	    	reverse=reverse+name.charAt(i);
	    }
	    	if(name.equalsIgnoreCase(reverse)) {
	    		ispalndrom=true;
	    		System.out.println("is palndrom");
	    	}else {
	    		ispalndrom=false;
	    		System.out.println("not palndrom");
	    	}
	    
	    System.out.println(reverse);
		return ispalndrom;
	    
	}
	
	
}
