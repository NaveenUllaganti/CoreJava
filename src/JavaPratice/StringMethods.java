package JavaPratice;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name =" Ram Charan  ";
		String names = new String();
		names = "Ram Charan Allu Arjun Prabhas ";
        
		// length(); Returns the length of the string;
		System.out.println(name.length());
		int length = names.length();
		System.out.println(length);
		System.out.println();
		System.out.println("str.charAt(index number) out put char at given index number");
		//charAt(int index); Returns the character at the Specified Index.
		System.out.println(name.charAt(5));
		char ch =names.charAt(13);
		System.out.println(ch);
		System.out.println();
		
		System.out.println("str.substring()-INT BEGIN INEX OR && INT LAST INDEX ");
		//substring(int beginIndex) or (int beginIndex int lastIndex);
		//returns a new string that is a substring of the orginal string stsrting from beginIndex to lastIndex;
		System.out.println(name.substring(3));
		String sub = names.substring(2, 8);
		System.out.println(sub);
		
		//indexOf(String str); Returns the index of the first occurrence of the specified substring.
		System.out.println(name.indexOf("Charan"));
		System.out.println(name.indexOf("a")); 
		int s =names.indexOf("Ram");
		System.out.println(s);
		
		//lastIndexOf(String str); Returns the index of the last occurrence of the specified substring.
		
		System.out.println(names.lastIndexOf('l'));//using char
		System.out.println(names.lastIndexOf("Allu"));//using string
		System.out.println(names.lastIndexOf("u", 15));//using string int from index
		System.out.println(names.lastIndexOf('r', 20)); //using char int from index
		System.out.println();
		System.out.println("str.isEmpty()-return boolean value");
		
		//isEmpty(): Checks if the string is empty (length is 0).
		String emptee="";
		String emp = "full";
		System.out.println(emptee.isEmpty());//true 
		System.out.println(emp.isEmpty());//false
		System.out.println();
		System.out.println("str.toUpperCase()");
		
		//toUpperCase(): Converts all characters of the string to uppercase.
		String upper ="Converts all Characters of the string to uppercase - touppercase";
		System.out.println(upper.toUpperCase());
		System.out.println();
		System.out.println("str.toLowerCase()");
		//toLowerCase(); Converts all characters of the string to LOwer CASE;
		String lower ="Converts ALL CHARACTERS of The STRing INTO lower CASE - toLowerCase";
		System.out.println(lower.toLowerCase());
		System.out.println();
		System.out.println("str.trim()-remove leading and trailing white spaces");
		//trim(): Removes leading and trailing whitespace.
		String trm = "     Removes the leading and trailling whitespace-trim     ";
		System.out.println(trm.trim());
		
		System.out.println();
		System.out.println("str.replace()-old specified to new specified car && char sequence target to char dequence replacement");
		//replace(char oldChar, char newChar): Replaces all occurrences of the specified 
		//          old character with the specified new character.
		String repl="replace specified old char to specified new char";
		String replace = repl.replace('p', 'P');
		System.out.println(replace);
		String replace1 = replace.replace("old","OLD");//char sequence target to char sequence replacement
		System.out.println(replace1);
		System.out.println();
		
		System.out.println("str.contains");
		
		//contains(CharSequence); Returns true if the sequence of characters 
		//                         exists in this string; false otherwise.
		String contain ="return true if the sequence of the characters is exists in the string, if not return false ";
		boolean contan = contain.contains("sequence of the character is exists in the string");
				System.out.println(contan);
				System.out.println();
				System.out.println("str.startsWith()");
	    //Returns true if the string starts with the specified prefix; false otherwise
	    String start ="If the string starts with specified prefix";
	    System.out.println(start.startsWith("If"));
	    System.out.println(start.startsWith("if")); //case sensitive
	    System.out.println(start.startsWith(""));  //every string starts with an empty string
	    System.out.println(start.startsWith("starts",14));  //index range
	    System.out.println();
	    System.out.println("str.endsWith()");
	    
	   // Returns true if the string ends with the specified suffix; false otherwise.
	    String suffix="if the string ends with specified suffix";
	    System.out.println(suffix.endsWith("suffix"));
	    System.out.println(suffix.endsWith("suff"));  
	    System.out.println(suffix.endsWith(""));  
	    
	    System.out.println();
	    String replacealll="apple,bannan;grape";
	    String repla=replacealll.replaceAll("apple", "grape");
	    System.out.println(repla);
	    System.out.println(replacealll.replaceAll("[,;]+","1"));
	    System.out.println(replacealll.replaceAll(",","-"));
	    System.out.println();
	    
	    String splitt = "apple,banna:grape;mango";
	    String[]words =splitt.split("[,:;]");
	    
	    System.out.println(splitt);
	    System.out.println(Arrays.toString(words));
	    System.out.println(words.length);
	    char[] cha =splitt.toCharArray();
	    System.out.println(Arrays.toString(cha));
	    
	    
	    String comp = "Naveen";
	    String comp1 = "naveen";
	    String compa3= "Naveen";
	    System.out.println(comp1.compareTo(comp));
	    System.out.println(comp.compareToIgnoreCase(comp1));
	    System.out.println(comp.compareTo(compa3));
	    
	    char[]val= {'H','E','L','L','O',' ','W','O','R','L','D'};
	     String st =String.valueOf(val, 5,3);
	     System.out.println(st);
	    System.out.println(String.valueOf(val));
	   
	    String up ="hello world";
	   // System.out.println(up.toLower());
	

	}

}
