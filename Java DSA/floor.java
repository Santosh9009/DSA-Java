public class floor {
    public static int flooring(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (target > arr[mid]) {
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[e];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 7, 7, 15, 17, 19 };
        int target = 4;
        System.out.println(flooring(arr, target));
        
    }
}
