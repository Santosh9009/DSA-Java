public class cyclesort {

    public static void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        return;
    }


    public static void cycle(int nums[]){
        int i=0;
        String n="lolll";
        while(i!=nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
        return;
    }

    public static int print(int nums[]){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=(i+1)){
                return i+1; 
            }
          }
          return nums.length+1;
        }
    public static void main(String[] args) {
        int nums[]={7,8,9,11,12};
        cycle(nums);
        int ans=print(nums);
        System.out.println(ans);
    }
}
