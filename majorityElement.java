package arrayQue;

public class MajorityElemen {
	// Majority element is an element that appears more than n/2 times
	// in an array of size n ........
	public static void main(String[] args) {
		int arr[]= {8,3,4,8,8};
		int n =arr.length;
		
		for(int i=0;i<n;i++) {
			int count =1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			if(count>(n/2)) {
				System.out.println(i);
			}
			

		}
		
		
		
	}

}
