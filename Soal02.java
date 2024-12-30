import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double masaStudi = scanner.nextDouble();
        double ipk = scanner.nextDouble();

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
