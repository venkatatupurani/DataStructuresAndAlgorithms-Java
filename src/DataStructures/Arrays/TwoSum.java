/**
 * 
 */
package DataStructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bluearmy
 * Problem Statement
 * =========================
 *Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */
public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(indexMap.containsKey(diff)) {
                return new int[] {i, indexMap.get(diff)};
            }
            indexMap.put(nums[i],i);
        }
        return null;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		System.out.println("Results -- : "+Arrays.toString(t.twoSum(new int[]{2,19,11,15,7}, 9)));

	}

}
