/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO3;

import java.util.Scanner;

/**
 *
 * @author RIP SNI
 */
public class TugasWO3IfElse {

    public static void main(String[] args) {
          // deklarasi variabel
       String nama;
       int barang1, barang2, barang3, barang4, barang5;
       
       
       // Output 
       Scanner x = new Scanner(System.in);
       
       System.out.println("  Kharisma Agung Plaza < KAP >");
       System.out.println("   Promo Belanja Berhadiah");
       System.out.println("Khusus Pembelian 5 Barang Pertama");
       System.out.println(" Dengan Harga Minimum Rp 100000");
       System.out.println("----------------------------------");
       
       System.out.print("Masukkan Nama Pembeli : ");
       nama= x.nextLine();
       System.out.print("Masukkan Harga Barang ke-1  : ");
       barang1= x.nextInt();
       System.out.print("Masukkan Harga Barang ke-2  : ");
       barang2= x.nextInt();
       System.out.print("Masukkan Harga Barang ke-3  : ");
       barang3= x.nextInt();
       System.out.print("Masukkan Harga Barang ke-4  : ");
       barang4= x.nextInt();
       System.out.print("Masukkan Harga Barang ke-5  : ");
       barang5= x.nextInt();
       int totalharga = (barang1)+(barang2)+(barang3)+(barang4)+(barang5);
       System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + totalharga);
       System.out.println(" ");
       
       if(totalharga >= 100000){
           System.out.println("Selamat");
           System.out.println("Anda Mendapatkan Hadiah 1 Buah Mug Cantik");
           System.out.println("------------------------------------------");
           System.out.println("               Terima Kasih");
           System.out.println("Anda Sudah Belanja di Kharisma Agung Plaza"); 
       }
       else{
           System.out.println("Maaf");
           System.out.println("Anda Tidak Mendapatkan Hadiah"); 
           
           System.out.println("------------------------------------------");
           System.out.println("               Terima Kasih");
           System.out.println("Anda Sudah Belanja di Kharisma Agung Plaza"); 
           
        
       }
        
    }
    
}
