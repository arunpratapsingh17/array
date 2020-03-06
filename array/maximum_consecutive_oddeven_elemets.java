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
		int res=0;
		int c=0;
		for(int i=1;i<n;i++){
		    if(((arr[i]%2==0)&&(arr[i-1]%2!=0))||((arr[i]%2!=0)&&(arr[i-1]%2==0))){
		        c++;
		        res=Math.max(res,c);
		    }
		    else{
		        c=0;
		    }
		}
		System.out.println(res+1);
	}
}