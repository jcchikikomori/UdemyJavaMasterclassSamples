public class BarkingDog {
     public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
         if (barking) {
             if (hourOfDay < 0) {
                 return false;
             } else if (hourOfDay > 23) {
                 return false;
             }
             return hourOfDay > 22 || hourOfDay < 8;
         }
         return false;
     }
}
