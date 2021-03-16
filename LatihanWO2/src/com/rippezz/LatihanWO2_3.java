/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rippezz;

/**
 *
 * @author RIP SNI
 */

class buku{
    int harga;
    int halaman;
    
    public void set (int price, int pages){
        
        this.harga = harga;
        this.halaman = halaman;
        
    }
    
    public void show (){
        
        System.out.println("Keterangan Buku");
        System.out.println("Harga Buku : " + harga);
        System.out.println("Jumlah Halaman :"+ halaman);
        
    }
}

public class LatihanWO2_3 {
        public static void main(String[] args) {
            buku javabook = new buku();
            javabook.set(60000, 112);
            javabook.show();
            
        }
        
    }

