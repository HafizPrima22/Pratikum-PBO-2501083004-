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
public class PersegiPanjang {
    int panjang; //atribut
    int lebar;  //atribut
    
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int a,int b){
        panjang = a;
        lebar = b;
    }
    //method
    int hitungLuas(){
       return (panjang*lebar); 
    }
    
    int hitungKeliling(){
        return(2 *(panjang*lebar));
    }
}
