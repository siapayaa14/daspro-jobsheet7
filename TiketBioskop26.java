import java.util.Scanner;

public class TiketBioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        
        System.out.print("Masukkan jumlah pelanggan (atau ketik 0 untuk selesai): ");
        int jumlahPelanggan = sc.nextInt();
        
        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            int jmlTiket = sc.nextInt();
            
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                i--; // mengulang iterasi untuk pelanggan ini
                continue;
            }
            
            double hargaTotal = jmlTiket * hargaTiket;
            double diskon = 0;
            
            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }
            
            double hargaDiskon = hargaTotal - (hargaTotal * diskon);
            totalPenjualan += hargaDiskon;
            totalTiketTerjual += jmlTiket;
        }
        
        System.out.println("Total tiket terjual hari ini: " + totalTiketTerjual);
        System.out.println("Total pendapatan penjualan tiket: Rp " + totalPenjualan);
    }
}