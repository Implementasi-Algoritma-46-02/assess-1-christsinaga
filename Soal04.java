import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kodePekerjaan = scanner.next();
        int jamKerja = scanner.nextInt();

        final double HONOR_PER_JAM = 30000;

        double tunjangan = 0;
        switch (kodePekerjaan) {
            case "DES":
                tunjangan = 600000;
                break;
            case "PRG":
                tunjangan = 1200000;
                break;
            case "WRT":
                tunjangan = 400000;
                break;
            case "MKT":
                tunjangan = 0;
                break;
            default:
                System.out.println("Kode pekerjaan tidak valid.");
                return;
        }

        double honorDasar = (jamKerja * HONOR_PER_JAM) + tunjangan;

        double bonus = 0;
        if (jamKerja > 175) {
            bonus = honorDasar * 0.07;
        } else if (jamKerja > 160) {
            bonus = honorDasar * 0.05;
        }

        double totalHonor = honorDasar + bonus;

        System.out.printf("%.1f%n", totalHonor);
    }
}
