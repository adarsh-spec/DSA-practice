import java.util.ArrayList;
import java.util.List;

public class BinaryCombinations {

    // Method to generate combinations of binary strings
    public static List<String> generateCombinations(int n, int k) {
        List<String> result = new ArrayList<>();
        generateBinaryStrings(result, new char[n], 0, k);
        return result;
    }

    // Helper method to fill the binary string recursively
    private static void generateBinaryStrings(List<String> result, char[] binary, int index, int onesLeft) {
        if (index == binary.length) {
            if (onesLeft == 0) {
                result.add(new String(binary));
            }
            return;
        }

        // Option 1: Place a '0' at current position
        binary[index] = '0';
        generateBinaryStrings(result, binary, index + 1, onesLeft);

        // Option 2: Place a '1' at current position (only if we still need more ones)
        if (onesLeft > 0) {
            binary[index] = '1';
            generateBinaryStrings(result, binary, index + 1, onesLeft - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;  // Length of binary string
        int k = 1;  // Number of ones

        List<String> combinations = generateCombinations(n, k);

        // Print the generated binary strings
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
