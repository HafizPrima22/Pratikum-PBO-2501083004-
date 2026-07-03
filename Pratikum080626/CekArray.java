/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pratikum080626;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LAB-SI-PC
 */
public class CekArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = {10,20,30,40,50};
        try{
        System.out.print("Mau bagi index ke berapa = ");
        int index = input.nextInt();
        System.out.println("Angka pada index "+index+" adalah" +angka[index]);
        System.out.print("Mau dibagi berapa = ");
        int pembagi = input.nextInt();
        int hasil = angka[index]/pembagi;
        System.out.println("hasil pembagi = "+hasil);
    }
    catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index array tidak ada, masukan 0-4");
    }
    catch(InputMismatchException e){
            System.out.println("Pastikan input berupa angka");
      }
    catch(ArithmeticException e){
            System.out.println("Tidak boleh pembagian dengan 0");
        }finally{
            System.out.println("Proses selesai, isi array adalah = ");
            
        }    
    }
    
}
