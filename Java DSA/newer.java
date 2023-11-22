public class newer {
    public static void element(int[] n, int target) {
        int s = 0, e = n.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (n[mid] == target) {
                System.out.print("The target is present in the index = " + mid);
                return;
            }
            if (n[e] > n[s]) {
                if (target > n[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if (target < n[mid]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] n = { 22, 14, 12, 10, 10, 8, 7, 5, 1 };
        int target = 1;
        element(n, target);
    }
}
