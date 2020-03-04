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
		int lead=arr[n-1];
		System.out.println(lead);
		for(int i=n-2;i>=0;i--){
		    if(arr[i]>lead){
		        System.out.println(arr[i]);
		        lead=arr[i];
		    }
		}
	}
}