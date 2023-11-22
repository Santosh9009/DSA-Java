public class rotatedarray {

    public static int search(int nums[], int target) {
        int pivot = pivot(nums);

        if (pivot == -1) {
            return binary(nums, target, 0, nums.length - 1);
        }

        if (target == nums[pivot]) {
            return pivot;
        } else if (target >= nums[0]) {
            return binary(nums, target, 0, pivot - 1);
        }
        return binary(nums, target, pivot + 1, nums.length - 1);
    }

    public static int binary(int nums[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static int pivot(int nums[]) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > end && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 1, 3 };
        int target = 5;
        System.out.println(search(nums, target));

    }
}
