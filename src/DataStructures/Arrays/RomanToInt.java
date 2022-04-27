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
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 * @author bluearmy
 *
 */
public class RomanToInt {

	public int convertRomanToInt(String s) {
		Map<String,Integer> values = new HashMap<>();
		values.put("I", 1);
		values.put("V", 5);
		values.put("X", 10);
		values.put("L", 50);
		values.put("C", 100);
		values.put("D", 500);
		values.put("M", 1000);
		
		int total = 0, lastVal = 0;
		// find total of last character.
		total = values.get(s.substring(s.length()-1));
		lastVal = total;
		
		for(int i = s.length()-2; i>=0;i--) {
			String subStr = s.substring(i, i+1);
			int currVal = values.get(subStr);
			if( currVal < lastVal) {
				total = total - currVal;
			}
			else {
				total = total + currVal;
			}
			lastVal = currVal;
		}
		
		return total;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "LVIII";
		RomanToInt r = new RomanToInt();
		System.out.println("Integer Value of "+s+" is : "+r.convertRomanToInt(s));

	}

}
