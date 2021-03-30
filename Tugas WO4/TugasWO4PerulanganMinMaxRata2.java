/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO4;
import java.util.Scanner;

/**
 *
 * @author RIP SNI
 */
public class TugasWO4PerulanganMinMaxRata2 {
 
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        String a;
        int ke1, ke2, ke3, ke4;
        
        
            System.out.print("Masukkan Banyaknya Data Nilai: ");
            a = x.next();
            
           
          switch(a) {
            case "1": 
                System.out.print("Masukkan Data Nilai Ke-1 = ");
                ke1 = x.nextInt();
            int[] o = {    
                ke1                
        };
        int maxo=o[0];
        int mino=o[0];
        for (int i = 0; i < o.length; i++) {
            if (o[i]>maxo){
                maxo = o[i];
            }else if(o[i]<mino){
                mino = o[i];
            }
        }
        int ratarata = (ke1)/1;
        System.out.println("nilai max = "+maxo);
        System.out.println("nilai min = "+mino);
        System.out.println("nilai rata ratanya = "+ratarata);    
                break;  
           
        //pilihan 2        
            case "2":  
                System.out.print("Masukkan Data Nilai Ke-1 = ");
                ke1 = x.nextInt();
                System.out.print("Masukkan Data Nilai Ke-2 = ");
                ke2 = x.nextInt();
            int[] u = {    
                ke1,     
                ke2           
        };
        int maxu=u[0];
        int minu=u[0];
        for (int i = 0; i < u.length; i++) {
            if (u[i]>maxu){
                maxu = u[i];
            }else if(u[i]<minu){
                minu = u[i];
            }
        }
        int ratarata2 = (ke1+ke2)/2;
        System.out.println("nilai max = "+maxu);
        System.out.println("nilai min = "+minu);
        System.out.println("nilai rata ratanya = "+ratarata2);  
                break;
                
        //pilihan 3        
            case "3":     
                System.out.print("Masukkan Data Nilai Ke-1 = ");
                ke1 = x.nextInt();
                System.out.print("Masukkan Data Nilai Ke-2 = ");
                ke2 = x.nextInt();
                System.out.print("Masukkan Data Nilai Ke-3 = ");
                ke3 = x.nextInt();
            int[] r = {    
                ke1,     
                ke2,
                ke3           
        };
        int maxr=r[0];
        int minr=r[0];
        for (int i = 0; i < r.length; i++) {
            if (r[i]>maxr){
                maxr = r[i];
            }else if(r[i]<minr){
                minr = r[i];
            }
        }
        int ratarata3 = (ke1+ke2+ke3)/3;
        System.out.println("nilai max = "+maxr);
        System.out.println("nilai min = "+minr);
        System.out.println("nilai rata ratanya = "+ratarata3);  
                break;
                
        //pilihan 4        
            case "4":         
                System.out.print("Masukkan Data Nilai Ke-1 = ");
                ke1 = x.nextInt();
                System.out.print("Masukkan Data Nilai Ke-2 = ");
                ke2 = x.nextInt();
                System.out.print("Masukkan Data Nilai Ke-3 = ");
                ke3 = x.nextInt();
                System.out.print("Masukkan Data Nilai Ke-4 = ");
                ke4 = x.nextInt(); 
            int[] y = {    
                ke1,     
                ke2,
                ke3,
                ke4,
        };
        int maxy=y[0];
        int miny=y[0];
        for (int i = 0; i < y.length; i++) {
            if (y[i]>maxy){
                maxy = y[i];
            }else if(y[i]<miny){
                miny = y[i];
            }
        }
        int ratarata4 = (ke1+ke2+ke3+ke4)/4;
        System.out.println("nilai max = "+maxy);
        System.out.println("nilai min = "+miny);
        System.out.println("nilai rata ratanya = "+ratarata4); 
                break;
            default:    
                System.out.print("Data Nilai Tidak Tersedia"); 
        
                
                
             
                
          
            
              
        }
        
    }
}    
    

