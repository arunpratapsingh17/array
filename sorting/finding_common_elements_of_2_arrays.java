/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr1[]=new int[]{1,3,4};
		int arr2[]=new int[]{1,2,4,5};
		int i=0;
		int j=0;
		int m=arr1.length;
		int n=arr2.length;
		while(i<m&&j<n){
		    if(i>0&&arr1[i-1]==arr1[i]){
		        i++;
		        continue;
		   }
		    if(arr1[i]==arr2[j]){
		        System.out.print(arr1[i]+" ");
		         i++;
		        j++;
		    }
		    else if(arr1[i]<arr2[j]){
		        i++;
		    }
		     else if(arr1[i]>arr2[j]){
		        j++;
		    }
		}
	}
}