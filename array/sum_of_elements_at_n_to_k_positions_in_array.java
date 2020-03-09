/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int l=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int prefix_sum[]=new int[n];
		prefix_sum[0]=arr[0];
		for(int i=1;i<n;i++){
		    prefix_sum[i]=prefix_sum[i-1]+arr[i];
        }
        if(k!=0){
            int sum=prefix_sum[l]-prefix_sum[k-1];
            System.out.println(sum);
        }
        else{
            System.out.println(prefix_sum[l]);
        }
	}
}