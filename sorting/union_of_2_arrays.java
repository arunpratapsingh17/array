/*union of 2 arrays means all the distinct elements of the 2 arrays*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int a[]=new int[]{1,2,3,3,4,7};
		int b[]=new int[]{2,3,4,5};
		int i=0;
		int j=0;
		int m=a.length;
		int n=b.length;
		while(i<m&&j<n){
		    if(i>0&&a[i]==a[i-1]){
		        i++;
		        continue;
		    }
		    if(a[i]<b[j]){
		        System.out.print(a[i]+" ");
		        i++;
		    }
		    else if(a[i]==b[j]){
		        System.out.print(a[i]);
		        i++;
		        j++;
		    }
		    else if(b[j]<=a[i]){
		        System.out.print(b[j]+" ");
		        j++;
		    }
		}
		while(i<m){
		    System.out.print(a[i++]+" ");
		}
		while(j<n){
		    System.out.print(b[j++]+" ");
		}
	}
}