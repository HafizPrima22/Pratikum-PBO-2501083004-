/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;
public abstract class pembayaran {
    protected double jumlahBayar;
    protected String idTansaksi;

    public pembayaran(double jumlahBayar, String idTansaksi) {
        this.jumlahBayar = jumlahBayar;
        this.idTansaksi = idTansaksi;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getIdTansaksi() {
        return idTansaksi;
    }

    public void setIdTansaksi(String idTansaksi) {
        this.idTansaksi = idTansaksi;
    }
    
    public abstract void prosesPembayaran();
}
