public class prime {

    static int prime(int n){
        if(n==1){
            return-1;
        }else if(n==2){
            return 1;
        }else{
        for(int i=2;i<n;i++){
            if(n%i!=0){
                return -1;
            }
        }
    }
        return 1;
    }
    public static void main(String[] args) {
        int n=10;
        int num=prime(n);
        if(num==-1){
            System.out.println("number is  prime");
        }else{
            System.out.println("not prime");
        }
    }
}
