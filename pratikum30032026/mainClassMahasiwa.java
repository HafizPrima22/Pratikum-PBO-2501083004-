/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum30032026;
/**
program : pengulangan_for.java
pembuat : Anugrah Mahesa Awdi
tanggal : 30 maret 2026
deskripsi : fungsi prosedur
*/
import java.util.Scanner;
public class mainClassMahasiwa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Objek Mahasiswa");
        System.out.print("Nama     = ");
        String Nama = input.nextLine();
        System.out.print("NIM      = ");
        int NIM = input.nextInt();
        mainMahasiswa pp1 = new  mainMahasiswa(Nama,NIM);
    }
    
}
