public class mountain {

    public static int real(int target, int arr[]) {
        int start = 0, end = search(arr);

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int search(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 9, 5, 4, 3, 2, 1 };
        int target = 3;
        System.out.println(real(target, arr));
        
    }
}
