 /*https://practice.geeksforgeeks.org/problems/check-if-array-is-sorted-and-rotated-clockwise/1/?track=SPCF-Arrays&batchId=155 */
 
 public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
        int d=0;
        int u=0;
        for(int i=0;i<num-1;i++){
            if(arr[i+1]>arr[i]){
                u++;
            }
            else if(arr[i+1]<arr[i]){
                d++;
            }
        }
        if(((u==(num-2))&&(arr[0]>arr[num-1]))||((d==(num-2))&&(arr[0]<arr[num-1]))){
            return(true);
        }
        else{
            return(false);
        }
        
    }