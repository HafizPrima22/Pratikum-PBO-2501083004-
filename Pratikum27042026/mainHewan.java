/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author LAB-SI-PC
 */
public class mainHewan {
    public static void main(String[] args) {
        Hewan hewanku = new Hewan("Mahkluk Hidup");
        Kucing kucingku = new Kucing("Diana!");
        Harimau harimauku = new Harimau("Hugh!");
        
        System.out.println("tampilkan akses super class hewan");
        hewanku.tampilkanNama();
        hewanku.Bersuara();
        
        System.out.println("\ntampilkan akses super class hewan");
        kucingku.tampilkanNama();
        kucingku.Bersuara();
        
        System.out.println("tampilkan akses super class hewan");
        harimauku.tampilkanNama();
        harimauku.Bersuara();
    }
    
}
