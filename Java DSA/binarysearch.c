#include<stdio.h>

int binarysearch(int arr[],int target,int length){
 int start=0,end=length-1;
 
 
  while(start<=end){

    int mid=(start+end)/2;

    if(arr[mid]>target){
        end=mid-1;
    }else if(arr[mid]<target){
        start=mid+1;
    }else{
        return mid;
    }
  }
  return -1;
}

int main(){
    int arr[]={1,2,3,4,5,6};
    int target=5;
    int length=sizeof(arr)/sizeof(arr[0]);
    printf("the number is present in index no %d", binarysearch(arr,target,length));
   return 0;
}