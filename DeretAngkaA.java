public class DeretAngkaA {
    public static void main(String[] args) {
        int n = 10; // Jumlah elemen dalam deret
        int angkaAwal = 1;
        int angkaSebelumnya = angkaAwal + 1;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 1) {
                angkaSebelumnya -= 1;
            } else if (i % 3 == 2) {
                angkaSebelumnya += 1;
            } else {
                angkaSebelumnya += 2;
            }
            System.out.print(angkaSebelumnya + " ");
        }
    }
}
