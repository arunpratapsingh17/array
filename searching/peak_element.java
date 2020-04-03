/*https://practice.geeksforgeeks.org/problems/peak-element/1/?track=SPCF-Searching&batchId=155 */

	public int peakElement(int[] a,int n)
    {
       //add code here.
       if(n==1){
           return(0);
       }
     if(a[0]>a[1]){
         return(0);
     }
     if(a[n-1]>a[n-2]){
         return(n-1);
     }
     
     int l=1;
     int h=n-2;
     int mid=0;
     while(l<=h){
         mid=l+(h-l)/2;
         if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]){
             return(mid);
         }
         h=mid-1;
     }
      while(l<=h){
         mid=l+(h-l)/2;
         if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]){
             return(mid);
         }
         l=mid+1;
     }
     return(-1);
    }