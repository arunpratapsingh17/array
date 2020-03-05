/*package whatever //do not write package name here */

import java.util.*;
import java.util.Collections; 


class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int ans[]=new int[n];
		int k=0;
		int c=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==1){
		        c++;
		    }
		    if(arr[i]==0||i==(n-1)){
		        ans[k++]=c;
		        c=0;
		    }
		}
		int max=0;
		for(int i=0;i<k;i++){
		    if(ans[i]>max){
		        max=ans[i];
		    }
		}
		System.out.println(max);
	}
}