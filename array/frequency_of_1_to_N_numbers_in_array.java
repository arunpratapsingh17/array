 public static void  printFrequency(int arr[], int n){
        
        // Your code here
        for(int i=0;i<n;i++){
            arr[i]=arr[i]-1;
        }
        for(int i=0;i<n;i++){
            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]/n+" ");
        }
    }