/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr1[]=new int[]{2,3,5,6,7,8};
		int arr2[]=new int[]{1,3,4,6,9,12,16};
		int m=arr1.length;
		int n=arr2.length;
		int j=0;
		int i=0;
		while(i!=m&&j!=n){
		    if(arr2[j]<arr1[i]){
		        System.out.print(arr2[j++]+" ");
		    }
		    else{
		        System.out.print(arr1[i++]+" ");
		    }
		}
		while(j<n){
		    System.out.print(arr2[j++]+" ");
		}
		while(i<m){
		     System.out.print(arr1[i++]+" ");
		}
	}
}