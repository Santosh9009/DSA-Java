public class dew {
     static int sum(int arr[],int start,int end,int n){
      int mid=(start+end)/2;
      if(arr[mid]>n){
       return sum(arr,start,mid-1,n);
      }else if(arr[mid]<n){
       return sum(arr,mid+1,end,n);
      }else{
        return mid;
      }
    }
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,7,8,9};
     int ans=sum(arr,0,arr.length-1,5);
     System.out.println(ans);  
  }
}

