import java.util.Scanner;

public class SearchNilai12 {
    public static void main(String[] args) {
        int jumlahMurid;
        int cariNilai;

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah murid yang akan dicatat nilainya:");
        jumlahMurid = sc.nextInt();
        System.out.println("Masukkan nilai yang akan dicari: ");
        cariNilai = sc.nextInt();

        int[] arrNilai = new int[jumlahMurid];
        for (int i = 0; i < jumlahMurid; i++) {
            System.out.println("Masukkan nilai murid: ");
            arrNilai[i] = sc.nextInt();
        }
        
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++){
            if (cariNilai == arrNilai[i]){
                hasil = i;
                break;
            }
        }
        System.out.println();
        if (hasil == -1) {
            System.out.println("Nilai tidak ditemukan");
        } else {
        System.out.println("Nilai "+ cariNilai +" ketemu di indeks ke-"+hasil);
        } 
        System.out.println();
    }
}
