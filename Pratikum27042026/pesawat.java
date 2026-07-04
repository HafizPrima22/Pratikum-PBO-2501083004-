/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author LAB-SI-PC
 */
public class pesawat extends udara {
    private int muatan;
    
    public int getBuatan(){
        return muatan;
    }
    
    public void setBuatan(int buatan){
        this.muatan=muatan;
    }
    
    public pesawat(){
        
    }
    
    public pesawat(String nama,int tahunProduksi,boolean mesin,int muatan){
        super(nama, tahunProduksi, mesin);
        this.muatan=muatan;
    }
}
