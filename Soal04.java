import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode pekerjaan dan jumlah jam kerja: ");
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

        double honor = (jamKerja * HONOR_PER_JAM) + tunjangan;

        if (jamKerja > 160) {
            honor += (honor * 0.05);
        }
        if (jamKerja > 175) {
            honor += (honor * 0.07);
        }

        System.out.printf("Jumlah honor karyawan dalam satu bulan: %.1f%n", honor);
    }
}
