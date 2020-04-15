/*Given a number(in this code,last element is taken),you need to put all the numbers smaller than or equal to the given number on it's left and all the greater number on the right of the given number */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int a[]=new int[]{10,90,45,100,70};
		int n=a.length;
		int key=a[n-1];
		int j=0;
		int i=j-1;
		int temp;
		for(int k=0;k<n-1;k++){
		    if(a[k]<=key){
		        i++;
		        temp=a[i];
		        a[i]=a[k];
		        a[k]=temp;
		    }
		}
		i++;
		temp=a[n-1];
		a[n-1]=a[i];
		a[i]=temp;
		for(i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}
	}
}