/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int arr[]=new int[]{5,2,38,7};
		quickS(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]);
		}
	}
	static void quickS(int arr[],int l,int h){
	    int p=0;
	    if(l<h){
	        p=hoare(arr,l,h);
	        quickS(arr,0,p);
	        quickS(arr,p+1,h);
	    }
	}
	static int hoare(int arr[],int l,int h){
	    int pivot=arr[l];
	    int i=l-1;
	    int temp=0;
	    int j=h+1;
	    while(true){
	        do{
	            i++;
	        }while(arr[i]<pivot);
	        do{
	            j--;
	        }while(arr[j]>pivot);
	        if(i>=j){
	            return(j);
	        }
	        temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	}
}