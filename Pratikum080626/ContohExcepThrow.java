/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pratikum080626;

import java.util.Scanner;


public class ContohExcepThrow {
    
    public static void cekNilai(int nilai) throws Exception{
        if(nilai<0){
            throw new Exception("Nilai tidak bole negatif");
        }
        else if(nilai>100){
            throw new Exception("Nilai maksimum 100");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukan sebuah angka = ");
            int angka=input.nextInt();
            cekNilai(angka);
        }catch(Exception e){
            System.out.println("gagal : "+e.getMessage());
        }finally{
            System.out.println("Sistem berhasil ");
        }
    }
    
}
