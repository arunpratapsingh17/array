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
		int x=sc.nextInt();
		int r=right(arr,n,x);
		int l=left(arr,n,x);
		System.out.println(r-l+1);
	}
	static int left(int arr[],int n,int x){
	    int l=0;
	    int h=n-1;
	    int mid;
	    while(l<=h){
	        mid=l+(h-l)/2;
	        if(arr[mid]==x&&(mid==0||arr[mid-1]!=x)){
	            return(mid);
	        }
	        if(arr[mid]>=x){
	            h=mid-1;
	        }
	        else{
	            l=mid+1;
	        }
	    }
	    return(-1);
	}
	static int right(int arr[],int n,int x){
	    int l=0;
	    int h=n-1;
	    int mid;
	    while(l<=h){
	        mid=l+(h-l)/2;
	        if(arr[mid]==x&&(mid==n-1||arr[mid+1]!=x)){
	            return(mid);
	        }
	        if(arr[mid]<=x){
	            l=mid+1;
	        }
	        else{
	            h=mid-1;
	        }
	    }
	    return(-1);
	}
}