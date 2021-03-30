/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO4;
import java.util.*;
/**
 *
 * @author RIP SNI
 */
public class TugasWO4PerulanganFor {

    public static void main(String[] args) {
        Scanner x = new Scanner (System.in); 
        System.out.println("Buatlah program untuk menampilkan bilangan genap dari kecil ke besar dengan \n" +
                            "batas awal dan batas akhir bilangan yang didapatkan dari masukan keyboard user. \n" +
                            "Gunakan perulangan FOR");
        System.out.println("-----------------------");
        System.out.println("Jawab");
        
        int ke1, ke2;
        System.out.print("Masukkan Nilai Terkecil: ");
        ke1 = x.nextInt();
        System.out.print("Masukkan Nilai Terbesar: ");
        ke2 = x.nextInt();
        int[] o = {    
                ke1,
                ke2
        };
        
        for (int i=ke1;i<= ke2;i=i+2){
             System.out.print(i+ ",");
         
        
          
          }
        
    }
}
