public class bitarray {
    static int tobinary(int n){
        int binary=0,count =0;
        while(n!=0){
            int rem=n%2;
            double c=Math.pow(10,count);
            binary = (int) (binary + c* rem);
            n=n/2;
            count++;
        }
        return binary;
    }
        static int check(int n){
            int binary=0,count=0;
            while(n!=0){
                int rem1=n%10;
                int rem=rem1%3;
                binary = (int) (binary + Math.pow(10,count) * rem);
                n=n/10;
                count++;
            }
            return binary;
    }
    public static void main(String[] args) {
        int arr[]={3,4,3,6,5,5,4,4,3,5};
        int narr[]=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
           narr[i]=tobinary(arr[i]);
           System.out.println(narr[i]);
           sum=sum+narr[i];
        }   
        System.out.println(sum);
          System.out.println(check(sum));

    }
}

