/*https://ide.geeksforgeeks.org/dZdvRjkmkr */

import java.util.*;

class GFG {
    public static int ans=-1;
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
		for(int i=0;i<7;i++){
		     ans=fun(arr,i+1,8,6-arr[i]);
		    if(ans==1){
		        break;
		    }
		}
		if(ans==1){
		    System.out.println("Found");
		}
		else{
		    System.out.println("Not Found");
		}
	}
	static int fun(int arr[],int l,int r,int x){
	    while(l<r){
	         if(arr[l]+arr[r]==x){
	       return(1);
	   }
	   if((arr[l]+arr[r])>x){
	        r=r-1;
	   }
	   else{
	       l=l+1;
	   }
	    }
	   	return(-1);
	}
}