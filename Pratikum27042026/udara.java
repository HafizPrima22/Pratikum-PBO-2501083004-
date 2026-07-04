/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum27042026;

/**
 *
 * @author LAB-SI-PC
 */
public class udara extends Kendaraan{
    private boolean mesin;
    
    public boolean getMesin(){
        return mesin;
    }
    
    public void setMesin(boolean mesin){
        this.mesin=mesin;
    }
    
    public udara(){
        
    }
    
    public udara(String nama,int tahunProduksi,boolean mesin){
        super(nama,tahunProduksi);
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Menggunalan mesin ="+(mesin?"ya" :"tidak"));
    }
}
