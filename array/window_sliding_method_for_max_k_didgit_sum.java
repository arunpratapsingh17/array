/*Code to get maximum sum of given k consecutive digits in the array*/

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		int res;
		for(int i=0;i<k;i++){
		    sum=sum+arr[i];
		}
		res=sum;
		for(int i=k;i<n;i++){
		    sum=sum+arr[i]-arr[i-k];
		    res=Math.max(res,sum);
		}
		System.out.println(res);
	}
}