public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            boolean isLeapYear = isLeapYear(year);
            if (isLeapYear) { // Check first if month is february (2)
                if (month == 2) {
                    return 29;
                }
            }
            switch (month) {
                case 2:
                    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
        return -1;
    }
}
