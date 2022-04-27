/**
 * 
 */
package DataStructures.Arrays;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 *
 */
public class MaxConsecutiveOnes {
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for(int i =0; i < nums.length; i++) {
        	if(nums[i] == 1) {
        		count++;
        	}
        	else {
        		res = Math.max(res, count);
        		count = 0;
        	}
        }
        
        return Math.max(res, count);
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxConsecutiveOnes obj = new MaxConsecutiveOnes();
		System.out.println(""+obj.findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1,1,4,1,1,1,1}));
	}

}

