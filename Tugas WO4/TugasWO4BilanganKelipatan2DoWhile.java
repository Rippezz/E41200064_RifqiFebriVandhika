/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO4;

/**
 *
 * @author RIP SNI
 */
public class TugasWO4BilanganKelipatan2DoWhile {

    public static void main(String[] args) {
        
        int x = 1;
            System.out.println("         Do_While");
            System.out.println("Bilangan kelipatan 2 (1-100)");
            System.out.println("----------------------------");
        do {
            System.out.print("  " + x);
            x = x * 2;
        } while (x < 100);
            System.out.println("");
    }
}

