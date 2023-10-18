import java.util.Scanner;

public class Toko07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.println("Program Toko");

        // Fungsi ini merupakan inputan nama pelanggan
        System.out.print("Masukkan nama Anda: ");
        String namaPelanggan = input07.nextLine();

        double totalHarga = 0;
        int totalItem = 0;
        double totalDiskon = 0;

        // Jadi fungsi merupaka untuk inputan untuk yang dibeli
        char lanjut = 'y';
        while (lanjut == 'y' || lanjut == 'Y') {
            System.out.print("Masukkan produk yang Anda beli: ");
            String produk = input07.nextLine();

            System.out.print("Banyaknya: ");
            int kuantitas = input07.nextInt();

            System.out.print("Harga: ");
            double hargaSatuan = input07.nextDouble();

            System.out.print("Diskon (%): ");
            double diskon = input07.nextDouble();

            double subTotal = kuantitas * hargaSatuan;
            double diskonProduk = (subTotal * diskon / 100);

            totalItem += kuantitas;
            totalHarga += subTotal;

            totalDiskon += diskonProduk;

            System.out.print("Apakah Anda mau menambahkan belanja lagi (Y/N)? ");
            lanjut = input07.next().charAt(0);
            input07.nextLine();
        }

        // Merupakan fungsi untuk mengecek pelanggan apakah member atau bukan
        System.out.print("Apakah anda punya kartu member (Y/N)? ");
        char isMember = input07.next().charAt(0);

        input07.close();

        double memberDiskon = 0;
        if (isMember == 'Y' || isMember == 'y') {
            if (totalHarga >= 200000) {
                memberDiskon = totalHarga * 0.1;
            } else {
                memberDiskon = totalHarga * 0.05;
            }
        }

        // Output hasil13
        System.out.println("-----------------Total Belanja--------------");
        System.out.println("Nama pelanggan: " + namaPelanggan);
        System.out.println("Tipe Pelanggan: " + (isMember == 'Y' || isMember == 'y' ? "Member" : "Bukan Member"));
        System.out.println("Total item barang : " + totalItem);
        System.out.println("SubTotal                     = " + totalHarga);
        System.out.println("Total Diskon                 = " + (totalDiskon + memberDiskon));
        System.out.println("Total yang harus dibayar     = " + (totalHarga - totalDiskon - memberDiskon));
        System.out.println("----------------------------------------------");
    }
}