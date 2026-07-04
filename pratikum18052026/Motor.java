/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum18052026;

/**
 *
 * @author LAB-SI-PC
 */
public class Motor extends transprotasi {
    private String motor;
    public Motor(String motor, double biayaPembayara, String namaPenumpang) {
        super(biayaPembayara, namaPenumpang);
        this.motor = motor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    @Override
    public void prosesPembayaran() {
      System.out.println("perajalanan menggunakan mobil  : ");
      System.out.println("jenis mobil "+motor);
      System.out.println("Nama Penumpang "+namaPenumpang);
      System.out.println("Jumlah Bayar Rp. "+biayaPembayara);
    }
    
}
