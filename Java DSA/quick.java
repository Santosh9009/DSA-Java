public class quick {

    public static void boundry(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                break;
            }
        }
    }

    public static void search(int arr[], int target) {
        int start = 0, end = 1;

        while (start <= end) {
            if (target > arr[end]) {
                int newstart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newstart;
            } else if (target < arr[end]) {
                boundry(arr, target, start, end);
                break;
            } else {
                if (target == arr[0]) {
                    System.out.println(start);
                    break;
                } else if (target == arr[1]) {
                    System.out.println(end);
                    break;
                } else {
                    System.out.println("invalid input");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 17, 19 };
        int target = 8;
        search(arr, target);

    }
}
