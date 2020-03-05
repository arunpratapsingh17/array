/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int diff=arr[0]-min;
		for(int i=0;i<n;i++){
		    if(arr[i]-min>diff){
		        diff=arr[i]-min;
		    }
		    if(arr[i]<min){
		        min=arr[i];
		    }
		}
		System.out.println(diff);
	}
}