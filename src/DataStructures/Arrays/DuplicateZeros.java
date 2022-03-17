package DataStructures.Arrays;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

Example 1:

Input: [1,0,2,3,0,0,5,0]
	   [1,0,0,2,3,0,0,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9

 * @author bluearmy
 *
 */
public class DuplicateZeros {
	
	void solution(int[] arr) {
		if(arr.length > 0) {
			int dupNum = 0;
			for(int i : arr) {
				if(i == 0) {
					dupNum++;
				}
			}
			
			if(dupNum > 0) {
				int i = arr.length - 1;
				int j = arr.length + dupNum - 1;
				
				while( i != j) {
					insert(arr,i,j--);
					if(arr[i] == 0) {
						insert(arr,i,j--);
					}
					i--;
				}
			}
		}
	}
	
	private void insert(int[] arr,int i, int j) {
		if(j<arr.length) {
			arr[j] = arr[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
