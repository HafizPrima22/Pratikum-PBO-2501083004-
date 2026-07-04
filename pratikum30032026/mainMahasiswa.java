/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum30032026;
/**
program : pengulangan_for.java
pembuat : Anugrah Mahesa Awdi
tanggal : 30 maret 2026
deskripsi : fungsi prosedur
*/
public class mainMahasiswa {
    String Nama;
    int NIM;
    double TGS;
    double UTS;
    double UAS;
    double NilaiAkhir;
    
        
    mainMahasiswa(){
        
    }
    
    mainMahasiswa(String a,int b){
        Nama = a;
        NIM = b ;
    } 
    mainMahasiswa(double a,double b, double c){
        TGS = a;
        UTS = b;
        UAS = c;
    } 
    
    double NilaiAkhir(){
        return (0.25*TGS + 0.35*UTS + 0.40*UAS);
    }
}