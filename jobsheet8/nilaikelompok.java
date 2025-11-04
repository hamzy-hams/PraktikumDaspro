import java.util.Scanner;

public class nilaikelompok12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahKelompok = 6;
        int jumlahPenilai = 5;
        double rataRataKelompok;
        double rataTertinggi = 0;          // untuk menyimpan nilai rata-rata tertinggi
        int kelompokTertinggi = 0;         // untuk menyimpan nomor kelompok dengan rata-rata tertinggi

        // Outer loop untuk 6 kelompok
        for (int i = 1; i <= jumlahKelompok; i++) {
            double totalNilai = 0;  // diinisialisasi di dalam outer loop

            // Inner loop untuk 5 penilai
            for (int j = 1; j <= jumlahPenilai; j++) {
                System.out.print("Masukkan nilai penilai " + j + " untuk kelompok " + i + ": ");
                double nilai = input.nextDouble();
                totalNilai += nilai;  // menjumlahkan setiap input penilai
            }

            rataRataKelompok = totalNilai / jumlahPenilai;
            System.out.println("Rata-rata kelompok " + i + ": " + rataRataKelompok);
            System.out.println("----------------------------------");

            // Mengecek apakah rata-rata kelompok ini lebih tinggi dari sebelumnya
            if (rataRataKelompok > rataTertinggi) {
                rataTertinggi = rataRataKelompok;
                kelompokTertinggi = i;
            }
        }

        // Menampilkan hasil akhir
        System.out.println("\nKelompok dengan rata-rata tertinggi adalah kelompok " 
                            + kelompokTertinggi + " dengan nilai rata-rata " + rataTertinggi);
    }
}
