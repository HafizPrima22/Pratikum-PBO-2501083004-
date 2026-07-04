/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum09032026;
/**
program : pengulangan_for.java
pembuat : Anugrah Mahesa Awdi
tanggal : 09 maret 2026
deskripsi : pengulangan
 */
import java.util.Scanner;
public class perulangansoal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        b=0;
        do
        {
        System.out.print("masukan nilai a : ");
        a = in.nextInt();
        b++;
        }while(a>0);
        System.out.println("\ttotal input"+b);
        
    }
}
   
