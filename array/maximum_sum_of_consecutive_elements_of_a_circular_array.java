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
		int max=fun(arr,n);
		int sum=0;
		for(int i=0;i<n;i++){
		    sum=sum+arr[i];
		    arr[i]=-arr[i];
		}
		if(sum<0){
		    System.out.println(sum);
		    return;
		}
		int min=fun(arr,n);
		int val=sum+min;
		int ans=Math.max(max,val);
		System.out.println(ans);
	}
	static int fun(int arr[],int n){
	    int max=0;
	    int res=0;
	    for(int i=0;i<n;i++){
	        max=Math.max(max+arr[i],arr[i]);
	        res=Math.max(res,max);
	    }
	    return(res);
	}
}