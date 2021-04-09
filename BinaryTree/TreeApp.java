/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author RIP SNI
 */
public class TreeApp {
    public static void main(String[] args)throws IOException{
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "lukman");
        theTree.insert(25, "betty");
        theTree.insert(75, "lukie");
        theTree.insert(12, "hakim");
        theTree.insert(37, "bakhtiar");
        theTree.insert(43, "silvi");
        theTree.insert(30, "callista");
        theTree.insert(33, "khanza");
        theTree.insert(87, "salwa");
        theTree.insert(93, "nabila");
        theTree.insert(97, "mikayshowla");
        
        while(true){
            System.out.print("Enter first letter of show," +
                    "insert, find, delete, or traverse : ");
            int choice = getChar();
            switch (choice){
            case 's':
               theTree.displayTree();
                break;
            case 'i' :
                System.out.print("enter value and data to " + " insert : ");
                value = getInt();
                data = getString();
                theTree.insert(value, data);
                break;
            case 'f' : 
                System.out.print("enter value to find : ");
                value = getInt();
                Node found = theTree.find(value);
                if (found != null){
                    System.out.print("Found : ");
                    found.displayNode();
                    System.out.print("\n");
                }else{
                    System.out.println("Could not find " + value);
                }
                break;
                
            case 'd' :
                    System.out.print("enter value to delete :");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Delete " + value);
                    }
                    break;
                    
            case 't' :
                System.out.print("Enter type 1,2, or 3 ");
                value = getInt();
                theTree.traverse(value);
                break;
            default:
                    System.out.println("invalid entry ");
                
            }
        }
    }
    
    public static String getString()throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    } 
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }
}

