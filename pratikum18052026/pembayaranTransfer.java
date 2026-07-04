/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

public class pembayaranTransfer extends pembayaran{
    private String namaBank;
    
    public pembayaranTransfer(String namaBank, double jumlahBayar, String idTansaksi) {
        super(jumlahBayar, idTansaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    
    @Override
    public void prosesPembayaran() {
      System.out.println("pembayaran melalui E-wallet : ");
      System.out.println("E-wallet "+namaBank);
      System.out.println("ID Transaksi "+idTansaksi);
      System.out.println("Jumlah Bayar Rp. "+jumlahBayar);
    }
    
}
