import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan masa studi (tahun): ");
        double masaStudi = scanner.nextDouble();
        System.out.print("Masukkan IPK: ");
        double ipk = scanner.nextDouble();
        System.out.print("Masukkan nilai EPRT: ");
        int eprt = scanner.nextInt();
        System.out.print("Apakah memiliki HKI (ya/tidak): ");
        String hki = scanner.next();
        System.out.print("Apakah juara lomba internasional (ya/tidak): ");
        String lomba = scanner.next();

        boolean isCumlaude = masaStudi == 3 && ipk > 3.5 && eprt > 450 && (hki.equals("ya") || lomba.equals("ya"));

        if (isCumlaude) {
            System.out.println("Cumlaude");
        } else {
            System.out.println("Tidak cumlaude");
        }
    }
}