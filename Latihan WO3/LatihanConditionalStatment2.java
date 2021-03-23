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
public class LatihanConditionalStatment2 {
    public static void main(String[] args) {
        
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan warna : ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, BERHENTI !");
                break;
            case "kuning":
                System.out.println("Lampu kuning, BERSIAP !");
                break;
            case "hijau":
                System.out.println("Lampu hijau, BERANGKAT !");
                break;
            default:
                System.out.println("Salah Warna");
        }
        
    }
}
