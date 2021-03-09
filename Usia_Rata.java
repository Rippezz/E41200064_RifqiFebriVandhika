/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rippezz.program;

/**
 *
 * @author RIP SNI
 */
public class Usia_Rata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DATA RIPPEZZVANDHIKA
        String pertama ="Rippezz Vandhika";
        String nim1 ="E41200065";
        int usia1;
        //DATA RPZVANZ
        String kedua ="Rpz Vanz";
        String nim2 ="E4120062";
        int usia2;
        //DATA LYFEZZRIPP
        String ketiga ="Lyfezz Ripp";
        String nim3 ="E4120098";
        int usia3;
        //KET USIA
        usia1 = 18;
        usia2 = 19;
        usia3 = 20;
        //RATA-RATA
        double nilai1a, nilai2a, nilai3a,total;
        nilai1a=90;
        nilai2a=95;
        nilai3a=93;
        total=3;
        double nilai=(nilai1a+nilai2a+nilai3a)/3;
        //OUTPUT RIPPEZZVANDHIKA
        System.out.println("Nama: "+pertama);
        System.out.println("NIM: "+nim1);
        System.out.println("Usia: "+usia1);
        System.out.println("Nilai: "+nilai1a);
        //BATAS JARAK
        System.out.println();
        //OUTPUT RPZVANZ
        System.out.println("Nama: "+kedua);
        System.out.println("NIM: "+nim2);
        System.out.println("Usia: "+usia2);
        System.out.println("Nilai: "+nilai2a);
        //BATAS JARAK
        System.out.println();
        //OUTPUT LYFEZZRIPP
        System.out.println("Nama: "+ketiga);
        System.out.println("NIM: "+nim3);
        System.out.println("Usia: "+usia3);
        System.out.println("Nilai: "+nilai3a);
        //BATAS JARAK
        System.out.println();
        //RATA-RATA NILAI
        System.out.println("Rata-Rata Nilai :"+nilai);
    }
    
}
