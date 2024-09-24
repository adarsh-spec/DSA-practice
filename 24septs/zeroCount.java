import java.util.Scanner;
public class zeroCount {
    public static int zeroCount(int B, int K) {
        if (K == 0) {
            return B;
        }
        if (K == B) {
            return 0;
        }
        int maxZeros = 0;
        if (K > 0) {
            maxZeros = 1;
        }
        return maxZeros;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int B = scanner.nextInt();
        int result = zeroCount(K, B);
        System.out.println(result);
        scanner.close();
    }
}