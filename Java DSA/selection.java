public class selection {
    public static void main(String[] args) {
        
        int arr[]={3,5,6,9,1};

        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
                int temp=arr[arr.length-i-1];
                arr[arr.length-i-1]=arr[max];
                arr[max]=temp;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
