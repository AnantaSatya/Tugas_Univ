import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Kata: ");
        String kata = scanner.nextLine();

        // Konversi kata menjadi huruf kecil dan hapus spasi.
        kata = kata.toLowerCase().replaceAll(" ", "");

        // Membalikkan kata.
        String kataTerbalik = new StringBuilder(kata).reverse().toString();

        // Periksa apakah kata asli sama dengan kata yang telah dibalik.
        boolean adalahPalindrome = kata.equals(kataTerbalik);

        // Cetak hasil apakah kata tersebut adalah palindrome atau tidak.
        if (adalahPalindrome) {
            System.out.println("Ini adalah Kata Palindrome.");
        } else {
            System.out.println("Ini Bukan Kata Palindrome.");
        }
    }
}
