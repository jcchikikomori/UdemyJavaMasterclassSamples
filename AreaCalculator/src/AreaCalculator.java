public class AreaCalculator {
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static double area(double x) {
        if (x < 0) {
            return -1;
        }
        return x * x * Math.PI;
    }
}
