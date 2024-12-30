import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan masa studi dan IPK: ");
        double masaStudi = scanner.nextDouble();
        double ipk = scanner.nextDouble();

        System.out.print("Masukkan nilai EPRT, status HKI, dan lomba internasional: ");
        int eprt = scanner.nextInt();
        String hki = scanner.next();
        String lomba = scanner.next();

        if (masaStudi <= 3.0 && ipk > 3.5 && eprt >= 450 && 
            (hki.equals("ada") || lomba.equals("ada"))) {
            System.out.println("Cumlaude");
        } else {
            System.out.println("Tidak cumlaude");
        }
    }
}
