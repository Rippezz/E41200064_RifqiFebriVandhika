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
public class TugasWO3ArrayRandom {

    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tuliskan Panjang Array : ");
        int x = scanner.nextInt();
        
        int[] array = new int[x];
        
        for (int i=0; i < array.length; i++){
            int number = (int)(Math.random()*9+1);
            array[i] = number;
            
            System.out.print(array[i]+" ");
        }
        
    }
   }
    
