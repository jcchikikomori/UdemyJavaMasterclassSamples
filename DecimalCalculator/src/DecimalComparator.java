public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
        int int1 = (int) (d1 * 1000);
        int int2 = (int) (d2 * 1000);
        System.out.println(int1);
        System.out.println(int2);
        return (int1 == int2);
    }
}
