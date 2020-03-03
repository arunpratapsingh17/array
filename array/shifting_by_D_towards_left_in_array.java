/*package whatever //do not write package name here */

import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
		    if(i<d){
		        arr[n-d+i]=sc.nextInt();
		    }
		    else{
		        arr[i-d]=sc.nextInt();
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
}