/*Following code can be used to find the element which appears maximum number of times in an array,and then we check whether that element appears more than n/2 times(n=size of array)*/

import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int res=1;
		int count=1;
		    for(int i=1;i<n;i++){
		        if(arr[res]==arr[i]){
		            count++;
		        }
		        else{
		            count--;
		        }
		        if(count==0){
		            res=i;
		            count=1;
		        }
		    }
		    int c=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==arr[res]){
		            c++;
		        }
		    }
		    if(c>n/2){
		        System.out.println(arr[res]);
		    }
		    else{
		        System.out.println("No majority");
		    }
	}
}