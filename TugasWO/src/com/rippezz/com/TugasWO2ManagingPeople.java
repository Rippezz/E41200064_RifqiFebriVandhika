/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rippezz.com;

/**
 *
 * @author RIP SNI
 */
public class TugasWO2ManagingPeople {

    public static void main(String[] args) {
        TugasWO2Person p1 = new TugasWO2Person("ripp", 29);
        TugasWO2Person p2 = new TugasWO2Person("verm", 30);
        
        if(p1.getUmur()==p2.getUmur())
        {
            System.out.println(p1.getNama()+" adalah usia yang sama dengan "+p2.getNama());
        }
        else
        {
            System.out.println(p1.getNama()+" adalah bukan usia yang sama dengan "+p2.getNama());
        }
    }
    
}
