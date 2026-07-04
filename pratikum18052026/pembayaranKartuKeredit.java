/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

public class pembayaranKartuKeredit extends pembayaran{
       private int nomorKartu;

    public pembayaranKartuKeredit(int nomorKartu, double jumlahBayar, String idTansaksi) {
        super(jumlahBayar, idTansaksi);
        this.nomorKartu = nomorKartu;
    }

    public int getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(int nomorKartu) {
        this.nomorKartu = nomorKartu;
    }
    
    
    @Override
    public void prosesPembayaran() {
      System.out.println("pembayaran melalui Kartu Keredit : ");
      System.out.println("E-wallet "+nomorKartu);
      System.out.println("ID Transaksi "+idTansaksi);
      System.out.println("Jumlah Bayar Rp. "+jumlahBayar);
    }
}
