public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                // Step 2
                if (year % 100 == 0) {
                    // Either Step 4 or Step 5
                    return (year % 400 == 0);
                } else {
                    // Step 4: The year is a leap year (it has 366 days)
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
