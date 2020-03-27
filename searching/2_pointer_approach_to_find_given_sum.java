/*https://ide.geeksforgeeks.org/30981SspdV */
/*This is helpful when we are required to find two numbers in an array */
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int flag=-1;
		int l=0;
		int r=n-1;
		int x=sc.nextInt();
		while(l<r){
		    if(arr[l]+arr[r]==x){
		        flag=1;
		        break;
		    }
		    if((arr[l]+arr[r])>x){
		        r=r-1;
		    }
		    else {
		        l=l+1;
		    }
		}
		if(flag==-1){
		    System.out.println("Not found");
		}
		else{
		    System.out.println("Found");
		}
	}
}