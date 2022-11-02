package arrayQue;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int arr[]= {1,4,20,3,10,5};
		int output =4;
		
		for(int i =0;i<arr.length;i++) {
			int sum =0;
			for(int j=i;j<arr.length;j++) {
				sum= sum+arr[j];
				if(sum == output) {
					System.out.println("True");
					break;
				}
			}
			
		}

	}

}
