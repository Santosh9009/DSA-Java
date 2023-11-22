public class recursion3 {

    static void selection(int arr[],int c,int r,int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,c+1,r,c);
            }else{
            selection(arr,c+1,r,max);
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selection(arr,0,r-1,0);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,7,6,3,1};
        selection(arr,0,arr.length,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
