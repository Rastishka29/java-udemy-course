public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        if (kiloBytes >= 0){
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        } else {
            System.out.println("Invalid value");
        }

    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}

