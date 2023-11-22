public class insetion {
    public static void main(String[] args) {

        int arr[] = { 3, 6, 0, 1, 4 };

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
