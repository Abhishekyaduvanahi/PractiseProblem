// frequency in sorted array ......

package arrayQue;

import java.util.Arrays;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3};
		          //0 1 2 3 4
		int i=1, freq=1;
		int n =arr.length;//5
		while(i<arr.length) {
			while(i<n && arr[i]==arr[i-1]) { 
				freq++;  // 2
				i++; //4
			}
			System.out.println(arr[i-1]+ " "+ freq);
			i++; // 5
			freq=1;
		}
		if(n==1 || arr[n-1]!=arr[n-2] ) {
			System.out.println(arr[n-1]+" "+1);
		}
	}
	

}
