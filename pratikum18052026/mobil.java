/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

public class mobil extends transprotasi{
    private String mobil; 
    public mobil(String mobil, double biayaPembayara, String namaPenumpang) {
        super(biayaPembayara, namaPenumpang);
        this.mobil = mobil;
    }

    public String getMobil() {
        return mobil;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }
    
    @Override
    public void prosesPembayaran() {
      System.out.println("perajalanan menggunakan mobil  : ");
      System.out.println("jenis mobil "+mobil);
      System.out.println("Nama Penumpang "+namaPenumpang);
      System.out.println("Jumlah Bayar Rp. "+biayaPembayara);
    }
}
