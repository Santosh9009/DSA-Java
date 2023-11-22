public class bubble {
    public static void main(String[] args) {
        int arr[]={6,3,2,8,1};
        
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
    }
}
