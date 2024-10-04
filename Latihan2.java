import java.util.Scanner;
public class Latihan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari, jenis_buku;
        int jumlah_buku;

        System.out.print("Masukkan Hari : ");
        hari = sc.nextLine();
        System.out.print("Masukkan jenis buku : ");
        jenis_buku = sc.nextLine();
        System.out.print("Masukkan jumlah_buku : ");
        jumlah_buku = sc.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
            if (jenis_buku.equalsIgnoreCase("kamus") || jenis_buku.equalsIgnoreCase("novel")) {
                if (jenis_buku.equalsIgnoreCase("kamus")) {
                    if (jumlah_buku > 2) {
                        System.out.println("Jumlah diskon 12%");
                    } else {
                        System.out.println("Jumlah diskon 10%");
                    }
                } else {
                    if (jumlah_buku > 3) {
                        System.out.println("Jumlah diskon 9%");
                    } else {
                        System.out.println("Jumlah diskon 8%");
                    }
                }
            } else if (jumlah_buku > 3){
                System.out.println("Jumlah diskon 5%");
            }
        }else{
            System.out.println("Tidak ada diskon");
        }

    }
}