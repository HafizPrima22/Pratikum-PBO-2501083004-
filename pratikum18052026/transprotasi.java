/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;
public abstract class transprotasi {
    protected double biayaPembayara;
    protected String namaPenumpang;
    public transprotasi(double biayaPembayara, String namaPenumpang) {
        this.biayaPembayara = biayaPembayara;
        this.namaPenumpang = namaPenumpang;
    } 

    public double getJumlahBayar() {
        return biayaPembayara;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.biayaPembayara = jumlahBayar;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }
    
   public abstract void prosesPembayaran();
}
