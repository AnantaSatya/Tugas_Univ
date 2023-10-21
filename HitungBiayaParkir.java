import java.util.Scanner;

public class HitungBiayaParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            int tarifPerJam = 0;

            // Input jenis kendaraan (1 untuk motor, 2 untuk mobil)
            int jenisKendaraan;
            do {
                System.out.print("Masukkan jenis kendaraan (1 untuk motor, 2 untuk mobil): ");
                jenisKendaraan = input.nextInt();
                if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                    System.out.println("Jenis kendaraan tidak valid. Masukkan 1 untuk motor atau 2 untuk mobil.");
                }
            } while (jenisKendaraan != 1 && jenisKendaraan != 2);

            // Input waktu parkir dalam jam
            System.out.print("Masukkan waktu parkir (jam): ");
            int waktuParkir = input.nextInt();

            // Menentukan tarif berdasarkan jenis kendaraan
            if (jenisKendaraan == 1) {
                tarifPerJam = 3000; // Tarif untuk motor
            } else if (jenisKendaraan == 2) {
                tarifPerJam = 5000; // Tarif untuk mobil
            }

            // Menghitung biaya parkir
            int biayaParkir = tarifPerJam * waktuParkir;

            // Menampilkan biaya parkir
            System.out.println("Biaya parkir untuk kendaraan jenis " + (jenisKendaraan == 1 ? "motor" : "mobil") + " selama " + waktuParkir + " jam adalah: Rp " + biayaParkir);

            // Tanya apakah ingin menginput lagi
            System.out.print("Apakah ingin menginput lagi? (1 untuk ya, 2 untuk tidak): ");
            int pilihan = input.nextInt();
            if (pilihan != 1) {
                break; // Keluar dari loop jika tidak ingin menginput lagi
            }
        } while (true);

        input.close();
    }
}
