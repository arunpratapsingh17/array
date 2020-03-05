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
		int a=arr[0];
		int u=0;
		int d=0;
		int b=arr[n-1];
		for(int i=1;i<n;i++){
		    if((arr[i]>arr[i-1])){
		        u++;
		    }
		    else if(arr[i]<arr[i-1]){
		        d++;
		    }
		}
		int sum=0;
		if((u==n-1)||(d==n-1)){
		    System.out.println("CAnt fill");
		    return;
		}
		int l=Math.min(a,b);
		for(int i=1;i<n-1;i++){
		    if(l>arr[i]){
		        sum=sum+(l-arr[i]);
		    }
		}
		System.out.println(sum);
	}
}