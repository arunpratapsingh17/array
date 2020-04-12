/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr1[]=new int[]{23,43,5,6,2,1};
		merge1(arr1,0,arr1.length-1);
		System.out.println("Sorted array");
		for(int i=0;i<arr1.length;i++){
		    System.out.printf(arr1[i]+" ");
		}
	}
	static void merge1(int arr1[],int l,int r){
	    int mid=l+(r-l)/2;
	    if(l<r){
	        merge1(arr1,l,mid);
	        merge1(arr1,mid+1,r);
	        merge2(arr1,l,r,mid);
	    }
	}
	static void merge2(int arr1[],int l,int r,int mid){
	    int n1=mid-l+1;
	    int n2=r-mid;
	    int l1[]=new int[n1];
	    int r1[]=new int[n2];
	    for(int i=0;i<n1;i++){
	        l1[i]=arr1[i];
	    }
	    for(int i=0;i<n2;i++){
	        r1[i]=arr1[mid+1+i];
	    }
	    int i=0;
	    int j=0;
	    int k=0;
	    while(i<n1&&j<n2){
	        if(l1[i]>=r1[j]){
	            arr1[k++]=l1[i++];
	        }
	        else{
	            arr1[k++]=r1[j++];
	        }
	    }
	    while(i<n1){
	        arr1[k++]=l1[i++];
	    }
	    while(j<n2){
	        arr1[k++]=r1[j++];
	    }
	}
}