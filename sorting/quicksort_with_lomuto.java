/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int arr[]=new int[]{9,182,83,12,1};
	    quickS(arr,0,arr.length-1);
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }
	}
	static void quickS(int arr[],int l,int h){
	    int p;
	    if(l<h){
	        p=lomuto(arr,l,h);
	        quickS(arr,l,p-1);
	        quickS(arr,p+1,h);
	    }
	}
	static int lomuto(int arr[],int l,int h){
	    int key=arr[h];
	    int j=0;
	    int temp=0;
	    int i=j-1;  
	    for(int k=0;k<=h-1;k++){
	        if(arr[k]<=key){
	            i++;
	            temp=arr[k];
	            arr[k]=arr[i];
	            arr[i]=temp;
	        }
	    }
	    temp=arr[++i];
	    arr[i]=arr[h];
	    arr[h]=temp;
	    return(i);
	}
}