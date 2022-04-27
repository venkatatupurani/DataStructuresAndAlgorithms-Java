/**
 * 
 */
package DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

 

Example 1:

Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
Example 2:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 3:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 * @author bluearmy
 *
 */
public class IntToRoman {
	
	public String integerToRoman(int num) {
		  if (num>=1000) {
	            return ("M"+integerToRoman(num-1000));
	        } else if (num>=900) {
	            return ("CM"+integerToRoman(num-900));
	        } else if (num>=500) {
	            return ("D"+integerToRoman(num-500));
	        } else if (num>=400) {
	            return ("CD"+integerToRoman(num-400));
	        } else if (num>=100) {
	            return ("C"+integerToRoman(num-100));
	        } else if (num>=90) {
	            return ("XC"+integerToRoman(num-90));
	        } else if (num>=50) {
	            return ("L"+integerToRoman(num-50));
	        } else if (num>=40) {
	            return ("XL"+integerToRoman(num-40));
	        } else if (num>=10) {
	            return ("X"+integerToRoman(num-10));
	        } else if (num>=9) {
	            return ("IX"+integerToRoman(num-9));
	        } else if (num>=5) {
	            return ("V"+integerToRoman(num-5));
	        } else if (num>=4) {
	            return ("IV"+integerToRoman(num-4));
	        } else if (num>=1) {
	            return ("I"+integerToRoman(num-1));
	        }
	        return ("");
	
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntToRoman i = new IntToRoman();
		System.out.println(i.integerToRoman(58));

	}

}
