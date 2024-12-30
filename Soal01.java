import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan 5 nomor ID (dipisahkan spasi): ");
        String[] input = scanner.nextLine().split(" ");

        for (String nomor : input) {
            if (isValid(nomor)) {
                System.out.println(nomor + " valid");
            } else {
                System.out.println(nomor + " tidak valid");
            }
        }
    }

    public static boolean isValid(String nomor) {
        if (nomor.length() != 3) {
            return false;
        }

        char[] digits = nomor.toCharArray();
        if (digits[0] > digits[1] || digits[1] > digits[2]) {
            return false;
        }

        if (digits[2] % 2 == 0) {
            return false;
        }

        return true;
    }
}