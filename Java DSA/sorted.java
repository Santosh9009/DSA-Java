public class sorted {

static int binary(int arr[],int s,int e, int target){
    int mid=(s+e)/2;
    if(s>=e){
        return -1;
    }
    if(arr[s]<arr[mid]){
        if(arr[s]<=target && target<=arr[mid]){
            return binary(arr,s,mid-1,target);
        }else{
            return binary(arr,mid+1,e,target);
        }
    }else if(arr[s]>arr[mid]){
        if(arr[mid]<=target && target<=arr[e]){
            return binary(arr,mid+1,e,target);
        }else{
            return binary(arr,s,mid-1,target);
        }
    }
    return mid;
}
 public static void main(String[] args) {
    int arr[]={4,5,6,19,0,1,2,3};
    System.out.println(binary(arr,0,arr.length-1,2));
}
}