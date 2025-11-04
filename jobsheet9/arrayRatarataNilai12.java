import java.util.Scanner;

public class arrayRatarataNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        double rata2 = 0;
        int jumlahMhs, rata2lulus, rata2Gagal;

        System.out.println("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();

        int nilaiMhs = 0;
        double[] totalLulus = new double[jumlahMhs];
        double[] totalGagal = new double[jumlahMhs];
        for (int i = 0; i < jumlahMhs; i++) {
            totalGagal[i] = 0;
            totalLulus[i]  = 0;
        }

        

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs = sc.nextInt();

            if (nilaiMhs > 70) {
                totalLulus[i] = nilaiMhs;
            } else {
                totalGagal[i] = nilaiMhs;
            }
        }

        for (int i = 0; i < totalLulus.length; i++) {
            total += totalLulus[i];
        }
        rata2 = total / totalLulus.length;
        System.out.println("rata-rata nilai lulus adalah: " + rata2);

        total = 0;

        for (int i = 0; i < totalGagal.length; i++) {
            total += totalGagal[i];
        }
        rata2 = total / totalLulus.length;
        System.out.println("rata-rata nilai gagal adalah: " + rata2);

        
    }
}   
