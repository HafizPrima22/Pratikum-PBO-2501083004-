/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum18052026;

import java.util.Scanner;

public class mainPembayaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pembayaran pembayaran = null;
        
        System.out.println("-----Sistem Pembayaran Toko Online-----");
        System.out.print("Masukan ID Transaksi =");
        String id = scanner.nextLine();
        
        System.out.println("Masukan Jumlah Bayar :");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih Metode Pembayaran :");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("1. E-wallet");
        System.out.print("Pilih Metode Pembayaran (1/2/3) : ");
        int pilihan=scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan){
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.print("Masukan nama bank tujuan :");
                     String bank = scanner.nextLine();
                     pembayaran = new pembayaranTransfer(bank,jumlah,id);
                     break;
            case 2 : System.out.println("Metode Kartu kredit");
                     System.out.print("Masukan Nomor Kartu tujuan :");
                     String kartuKredit = scanner.nextLine();
                     pembayaran = new pembayaranTransfer(kartuKredit,jumlah,id);
                     break;
            case 3 : System.out.println("Metode E-wallet");
                     System.out.print("Masukan E-wallet tujuan :");
                     String ewallet = scanner.nextLine();
                     pembayaran = new pembayaranTransfer(ewallet,jumlah,id);
                     break;
        }
    }
    
}
