import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode pekerjaan (DES, PRG, WRT, MKT): ");
        String kodePekerjaan = scanner.nextLine();
        System.out.print("Masukkan jumlah jam kerja: ");
        int jumlahJam = scanner.nextInt();

        double upahPerJam = 30000;
        double honorDasar = jumlahJam * upahPerJam;
        double tunjangan = 0;
        double bonus = 0;

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
                tunjangan = 1000000;
                break;
            default:
                System.out.println("Kode pekerjaan tidak valid");
                return;
        }

        if (jumlahJam > 160) {
            bonus = honorDasar * 0.05;
        } else if (jumlahJam > 175) {
            bonus = honorDasar * 0.07;
        }

        double totalHonor = honorDasar + tunjangan + bonus;
        System.out.println("Total honor: Rp " + totalHonor);
    }
}