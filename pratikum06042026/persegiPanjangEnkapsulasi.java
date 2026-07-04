/**
program : .java
pembuat : Anugrah Mahesa Awdi
tanggal : 09 maret 2026
deskripsi : persegi Panjang Enkapsulasi
*/
package pratikum06042026;
public class persegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public persegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    
    public persegiPanjangEnkapsulasi(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        jumlahObjek++;
    }
    
    public void setpanjang(int panjang){
        this.panjang = 20;
    }
    
   public int getpanjang(){
       return panjang;
   } 
   
   public void setlebar(int lebar){
       this.lebar = 10;
   }
   
   public int getlebar(){
       return lebar;
   }
   
   public static int getjumlahObjek(){
       return jumlahObjek;
   }
   
   public int getluas(){
       return (panjang*lebar);
   }
   
   public int getkeliling(){
       return (2*panjang+2*lebar);
   }
}
