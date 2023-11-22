public class firstandlast {
    public static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        ans[0]=first;
        ans[1]=last;

        return ans;
    }
    
    public static int search(int[] nums, int target,boolean firstindex) {
        int ans=-1;
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (target > nums[mid]) {
                s = mid + 1;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                ans=mid;
                if(firstindex){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
    

    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6, 7, 7, 15, 17, 19 };
        int target = 7;
        System.out.println(searchRange(nums,target));
        
    }
}
