public class recursion2 {

    static void bubble(int c,int r,int arr[]){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(c+1,r,arr);
        }else{
            bubble(0,r-1,arr);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,1};
        bubble(0,arr.length-1,arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
