public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int toMegaBytes = (kiloBytes / 1024);
            int toRemainingKiloBytes = (kiloBytes % 1024);
            System.out.println(kiloBytes +
                    " KB = " + toMegaBytes + " MB and " + toRemainingKiloBytes + " KB");
        }
    }
}
