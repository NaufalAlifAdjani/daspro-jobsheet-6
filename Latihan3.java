import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String merk, kategori;
        int ukuran;

        System.out.print("Masukkan Merk (Converse, Sketcher, Nike): ");
        merk = sc.nextLine();

        if(merk.equalsIgnoreCase("converse")){
            System.out.print("Masukkan Kategori (Slip On/High Top): ");
            kategori = sc.nextLine();
            if (kategori.equalsIgnoreCase("slip on")) {
                System.out.print("Masukkan ukuran : ");
                ukuran = sc.nextInt();
                if(ukuran >= 36 && ukuran <= 40){
                    System.out.println("Harga Rp 800.000");
                }else{
                    System.out.println("Ukuran tidak ada");
                }
            }else if(kategori.equalsIgnoreCase("high top")){
                System.out.print("Masukkan ukuran : ");
                ukuran = sc.nextInt();
                if(ukuran >= 40 && ukuran <= 44){
                    System.out.println("Harga Rp 1.200.000");
                }else{
                    System.out.println("Ukuran tidak ada");
                }
            }
        }else if(merk.equalsIgnoreCase("sketcher")){
            System.out.print("Masukkan Kategori (woman/man): ");
            kategori = sc.nextLine();
            if (kategori.equalsIgnoreCase("woman")) {
                System.out.print("Masukkan ukuran : ");
                ukuran = sc.nextInt();
                if(ukuran >= 36 && ukuran <= 41){
                    System.out.println("Harga Rp 1.000.000");
                }else{
                    System.out.println("Ukuran tidak ada");
                }
            }else if(kategori.equalsIgnoreCase("man")){
                System.out.print("Masukkan ukuran : ");
                ukuran = sc.nextInt();
                if(ukuran >= 41 && ukuran <= 44){
                    System.out.println("Harga Rp 1.800.000");
                }else{
                    System.out.println("Ukuran tidak ada");
                }
            }
        }else if(merk.equalsIgnoreCase("nike")){
            System.out.print("Masukkan Kategori (kids/adult): ");
            kategori = sc.nextLine().toLowerCase();
            if (kategori.equalsIgnoreCase("kids")) {
                System.out.print("Masukkan ukuran : ");
                ukuran = sc.nextInt();
                if(ukuran >= 36 && ukuran <= 40){
                    System.out.println("Harga Rp 750.000");
                }else{
                    System.out.println("Ukuran tidak ada");
                }
            }else if(kategori.equalsIgnoreCase("adult")){
                System.out.print("Masukkan ukuran : ");
                ukuran = sc.nextInt();
                if(ukuran >= 40 && ukuran <= 44){
                    System.out.println("Harga Rp 1.500.000");
                }else{
                    System.out.println("Ukuran tidak ada");
                }
            }
        }
    }
}