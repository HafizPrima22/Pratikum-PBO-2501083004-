/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

public class pembayaranEwallet extends pembayaran{

    public pembayaranEwallet(String namaEwallet, double jumlahBayar, String idTansaksi) {
        super(jumlahBayar, idTansaksi);
        this.namaEwallet = namaEwallet;
    }
    private String namaEwallet;

    public String getNamaEwallett() {
        return namaEwallet;
    }

    public void setNamaEwallet(String namaEwallet) {
        this.namaEwallet = namaEwallet;
    }
    
    @Override
    public void prosesPembayaran() {
      System.out.println("pembayaran melalui E-wallet : ");
      System.out.println("E-wallet "+namaEwallet);
      System.out.println("ID Transaksi "+idTansaksi);
      System.out.println("Jumlah Bayar Rp. "+jumlahBayar);
    }
}
