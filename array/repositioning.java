/* https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/1/?track=SPCF-Arrays&batchId=155 */
/* VVVVVIMP */


 public static void rearrange(int arr[], int n){
        
        // Your code here
       
        int a=0;
        int b=n-1;
        int t=arr[n-1]+1;
        int i=0;
        while(a<=b){
            if(i%2==0){
                int k=(arr[b]%t)*t;
                arr[i]=arr[i]+k;
                b--;
            }
            else{
                arr[i]=arr[i]+(arr[a]%t)*t;
                a++;
            }
            i++;
        }
        for(i=0;i<n;i++){
            arr[i]=arr[i]/t;
            
        }
    }