
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int arr[]=new int[5];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int temp[]=new int[n];
		temp[0]=arr[0];
		int res=1;
		for(int i=0;i<n;i++){
		    if(temp[res-1]!=arr[i]){
		        temp[res]=arr[i];
		        res++;
		    }
		}
		for(int i=0;i<res;i++){
		    System.out.println(temp[i]);
		}
	}
}