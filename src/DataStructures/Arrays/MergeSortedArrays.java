package DataStructures.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
	
	static int[] mergeSortedArrs(int[] nums1, int[] nums2) {
		
		if(nums1 == null || nums2 == null) {
			return null;
		}
		
		if(nums1.length <= 0 && nums2.length <= 0) {
			return null;
		}
		
		// Take lengths of arrays.
		int n1 = nums1.length, n2= nums2.length, i = 0, j = 0, k = 0;
		int[] retArr = new int[n1+n2];
		
		while(i < n1 && j < n2) {
			if(nums1[i] < nums2[j]) 
				retArr[k++] = nums1[i++];
			else 
			   retArr[k++] = nums2[j++];							
		}
		
		while(i < n1) {
			retArr[k++] = nums1[i++];
		}
		
		while(j < n2)
			retArr[k++] = nums2[j++];
		
		return retArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {1,3,5,7,9};
		int[] nums2 = new int[] {2,4,6};
		int[] mergedArr = mergeSortedArrs(nums1,nums2);
		
		System.out.println(Arrays.toString(mergedArr));

	}

}
