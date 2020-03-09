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
		
		int l_sum=0;
		int r_sum=0;
		int c=0;
		for(int i=0;i<n;i++){
		    l_sum=0;
		    for(int j=0;j<i;j++){
		        l_sum=l_sum+arr[j];
		    }
		    for(int k=i+1;k<n;k++){
		        r_sum=r_sum+arr[k];
		    }
		    if(r_sum==l_sum){
		        System.out.println("Yes equilbrium point exists");
		        System.out.println("Equilbrium point is at "+i+" position");
		        c=1;
		        break;
		    }
		    else{
		        r_sum=0;
		    }
		}
		if(c!=1){
		    	System.out.println("No equibrium point exists");
		}
	}
}