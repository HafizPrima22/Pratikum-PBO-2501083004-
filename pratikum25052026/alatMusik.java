/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum25052026;

/**
 *
 * @author LAB-SI-PC
 */
public abstract class alatMusik {
    protected String nama;
    protected String jenis;

    public alatMusik(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void info(){
        System.out.println("Alat Musik : "+nama+"jenis : "+jenis);
    }
    
    public abstract void mainkan();
    public abstract void stem();
    
    
}
