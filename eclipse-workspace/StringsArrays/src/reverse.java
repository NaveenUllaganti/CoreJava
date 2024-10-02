import java.util.Arrays;

public class reverse {

	public static void main(String[] args) {

		reverse("hello java ");
		countOccurance();
		containSequence();
		palndrom();
		concat(); // string concat
		arrayConcat(); // prime i=0,i+=2 and even i=1; i+=2 index elements
		String reversed = eachWordReverse();
		System.out.println(reversed);
	}

	public static String reverse(String name) {
		// String name = "Concatenates the specified;string,to the end of this string";
		String[] array = name.split("[ ;,]");
		System.out.println(Arrays.toString(array));
		int rl = array.length;
		String temp = null;
		for (int i = 0; i < rl / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));
		return temp;

	}

	public static int countOccurance() {
		String names = "Returns the string representation of the int argument";
		char target = 'n';
		int count = 0;
		int le = names.length();
		for (int k = 0; k < le; k++) {
			if (names.charAt(k) == target) {
				count++;
			}
		}
		System.out.println();
		System.out.printf("The %c letter is repeated : " + count, target);
		return count;

	}

	public static boolean containSequence() {
		String names = "Returns the string representation of the int argument";
		String[] array = names.split(" ");
		String target = "the";
		boolean contain = false;
		int le = names.length();
		for (String word : array) {
			if (word.equals(target)) {
				contain = true;
			}
		}
		System.out.println();
		System.out.printf("The string contains %s is : " + contain, target);
		return contain;
	}

	public static boolean palndrom() {
		String name = "nitin";
		String reverse = "";
		boolean ispalndrom = true;
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println();
		System.out.println(reverse);
		if (name.equalsIgnoreCase(reverse)) {
			ispalndrom = true;
			System.out.println("The given string is a palndrom");
		} else {
			ispalndrom = false;
			System.out.println("The given string is not a palndrom");
		}

		return ispalndrom;
	}

	public static String concat() {
		String name = "Naveen ";
		String names = "Kumar Reddy";
		System.out.println();
		String combined = name.concat(names);
		System.out.println(combined);
		// System.out.println(combined.so)
		return null;
	}

	public static String[] arrayConcat() {
		String[] name = { "Naveen", "Kumar", "Reddy" };
		String[] names = { "Madhan", "Mohan", "Reddy" };
		int ln = name.length;
		int ls = names.length;
		int totallength = ln + ls;
		String[] combined = new String[totallength];
		for (int i = 0; i < ln; i++) {
			combined[i] = name[i];
		}
		for (int i = 0; i < ls; i++) {
			combined[ln + i] = names[i];
		}
		System.out.println(Arrays.toString(combined));
		Arrays.sort(combined);
		System.out.println(Arrays.toString(combined));
		// System.out.println();
		for (int i = 0; i < totallength; i += 2) {
			System.out.println((combined[i]));
		}
		for (int i = 1; i < totallength; i += 2) {
			System.out.println((combined[i]));
		}
		System.out.println(Arrays.toString(combined));
		System.out.println();
		return combined;

	}

	public static String eachWordReverse() {
		String[] words = { "EACH", "WORD", "REVERSE" };
		StringBuilder reverseString = new StringBuilder();
		for (String word : words) {
			StringBuilder reverseWord = new StringBuilder(word);
			reverseWord.reverse();
			reverseString.append(reverseWord).append(" ");
		}
		return reverseString.toString().trim();
	}
}
