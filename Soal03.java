import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jam awal: ");
        int jamAwal = scanner.nextInt();
        System.out.print("Masukkan menit awal: ");
        int menitAwal = scanner.nextInt();
        System.out.print("Masukkan menit yang ditambahkan: ");
        int menitTambah = scanner.nextInt();

        int totalMenit = jamAwal * 60 + menitAwal + menitTambah;

        int jamAkhir = totalMenit / 60;
        int menitAkhir = totalMenit % 60;

        jamAkhir %= 24;

        System.out.println(jamAkhir + ":" + String.format("%02d", menitAkhir));
    }
}