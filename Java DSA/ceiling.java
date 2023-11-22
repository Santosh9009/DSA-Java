public class ceiling {
    public static int ceil(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        if (target >= arr[arr.length - 1]) {
            return -1;
        }

        while (s <= e) {
            int mid = (s + e) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return arr[s];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 7, 15, 17, 19 };
        int target = 3;
        System.out.println(ceil(arr, target));
    }
}
