public class leap {
    static void swap(int arr[],int a,int b){
        
    }
    static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       int arr[]={2,3,5,4,1};
       int min;

       for(int i=0;i<arr.length;i++){
        min=i;
        for(int j=i+1;i<arr.length;j++){
            if(arr[j]<arr[min]){
               min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
       }
       show(arr);
    }
}
