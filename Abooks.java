// codechef a books problem solution
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    // n is the size of the list 
		    int n =sc.nextInt();
		    //
		    int arr[]= new int[n];
		   
		      int s[]= new int[n];
		    for(int i =0;i<n;i++){
		        arr[i]= sc.nextInt();
		    }
		    for(int i=0;i<n ;i++){
		         int count =0;
		        for(int j=1+i;j<n;j++){
		            if(arr[i]<arr[j]){
		                count++;
		            }
		        }
		        s[i]=count;
		    }
		    for(int i=0; i<n;i++){
		          System.out.print(s[i]+" ");
		    }
		    System.out.println();
		  
		    
		}
	}
}
