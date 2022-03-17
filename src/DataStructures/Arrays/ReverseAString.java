/**
 * 
 */
package DataStructures.Arrays;


public class ReverseAString {
	
	//Solution 1 : using String. Time Complexity - O(n)
	static String reverseString(String str) {
		
		if(str == null || str.length() <=0) {
			return "";
		}
		
		String reversedStr = "";
		for(int i = str.length()-1; i >=0; i--) {
			reversedStr += str.charAt(i);
		}
		return reversedStr;
		
	}
	
	//Solution2 : Using StringBuilder. Time Complexity - O(n)
	static String reverseString2(String str) {
		if(str == null || str.length() <=0) {
			return "";
		}
			
		StringBuilder reversedStr = new StringBuilder();
		for(int i = str.length()-1; i>=0;i++) {
			reversedStr.append(str.charAt(i));
		}
		return reversedStr.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( reverseString("abcde"));
		System.out.println( reverseString("xyzabcd"));
        ;
	}

}
