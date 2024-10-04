import java.util.Scanner;

public class Pemilihan2Percobaan216 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        String menu,qris,member;
        int jumlah_beli, total_bayar, harga = 0, potonganQris = 1000;
        double diskon= 0.1;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        
        System.out.print("Masukkan menu : ");
        menu = input16.nextLine();

        System.out.print("Masukkan jumlah : ");
        jumlah_beli = input16.nextInt();

        System.out.print("Apakah anda punya member (y/n) : ");
        member = input16.next();


        if (menu.equalsIgnoreCase("kopi")) {
            harga = 12000;
        } else if (menu.equalsIgnoreCase("teh")) {
            harga = 7000;
        } else if (menu.equalsIgnoreCase("roti")) {
            harga = 20000;
        } else {
            System.out.println("Menu tidak valid!");
            System.exit(0);
        }

        if (member.equalsIgnoreCase("y")) {
            total_bayar = (int) (harga - (harga * diskon)) * jumlah_beli;
        } else {
            total_bayar = harga * jumlah_beli;
        }

        System.out.println("Total bayar: Rp " + total_bayar);
    }
}
