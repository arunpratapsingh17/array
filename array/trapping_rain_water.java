static int trappingWater(int arr[], int n) { 
        
        // Your code here
       int left[]=new int[n];
       int right[]=new int[n];
       int temp;
       temp=arr[0];
       left[0]=arr[0];
       for(int i=1;i<n;i++){
           if(arr[i]>temp){
               temp=arr[i];
               left[i]=temp;
           }
           else{
               left[i]=temp;
           }
       }
       temp=arr[n-1];
       right[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--){
           if(arr[i]>temp){
               right[i]=arr[i];
               temp=arr[i];
           }
           else{
               right[i]=temp;
           }
       }
       int v;
       int sum=0;
       for(int i=0;i<n;i++){
           v=Math.min(left[i],right[i]);
           sum=sum+(v-arr[i]);
       }
       return sum;
    } 