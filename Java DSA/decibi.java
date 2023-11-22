public class decibi {
    static int decimalToBinary(int N)
    {
 
        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;
 
            // Count used to store exponent value
            cnt++;
        }
 
        return B_Number;
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        int N = 4;
          System.out.println("Decimal - " + N);
          System.out.print("Binary - ");
        System.out.println(decimalToBinary(N));
    }
}
