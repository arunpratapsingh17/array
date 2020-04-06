/* https://practice.geeksforgeeks.org/problems/subarray-with-given-sum/1/?track=SPCF-Searching&batchId=155 */

static void subarraySum(int n, int s, int[] m) {
        
        // Your code here
        int i=0;
        int j=0;
        int sum=0;
    
        for(i=0;i<n;i++){
            sum=sum+m[i];
            while(sum>s){
                sum=sum-m[j++];
            }
            if(sum==s){
                break;
            }
        }
        if(sum==s){
            System.out.print(j+1+" "+(i+1));
        }
        else{
            System.out.print("-1");
        }
    }