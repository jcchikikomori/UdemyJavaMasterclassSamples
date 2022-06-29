public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) return false;
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        // Validation
        if ((start < 0 || end < 0) || (start > end)) {
            return -1;
        }
        // Start
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println("Odd number: " + i);
                sum += i;
            }
        }
        return sum;
    }
}
