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
		int sum=0;
		int res=arr[0];
		int max=arr[0];
		for(int i=1;i<n;i++){
		    max=Math.max(max+arr[i],arr[i]);
		    res=Math.max(res,max);
		}
		System.out.println(res);
	}
}