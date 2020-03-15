/*Code By Arun Pratap Singh */
class Stock{

    // Function to find the buy and sell days and print them
    static void stockBuySell(int price[], int n) {
        
        // Your code here
        
       int low=price[0];
       int l=0;
       int high=0;
       int c=-1;
       int i1=0;
       for(int i=0;i<n-1;i++){
           if((price[i]<price[i+1])&&(l==0)){
               low=price[i];
               i1=i;
               l=1;
               c=1;
       }
        if((price[i+1]<price[i])&&(l!=0)){
            high=price[i];
            System.out.print("("+i1+" "+i+")"+" ");
            l=0;
            low=price[i];
        }
        if((i==n-2)&&(price[i+1]>low)){
            System.out.print("("+i1+" "+(i+1)+")"+" ");
        }
    }
    if(c==-1){
        System.out.print("No Profit");
    }
    return;
    }
}

