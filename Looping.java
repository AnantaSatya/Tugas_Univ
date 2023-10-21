public class Looping {
    public static void main(String[] args) {
        int n = 3; // Jumlah baris dalam pola
        int startValue = 1; // Nilai awal

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(startValue + " ");
                startValue++;
            }
            System.out.println(); // Pindah ke baris berikutnya
            startValue = startValue - 2 + 1; // Setel kembali nilai awal untuk baris berikutnya
        }
    }
}
