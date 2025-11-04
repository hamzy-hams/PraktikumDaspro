import java.util.Scanner;

public class arrayNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            System.out.print("");
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Lulus!");
            } else {
                System.out.println("Tidak lulus!");
            }
        }
    }
    
}
