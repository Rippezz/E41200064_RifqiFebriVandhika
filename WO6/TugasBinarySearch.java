/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO6;
/**
 *
 * @author RifqiFebri
 */
public class TugasBinarySearch {
   
  public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("Elemen Ditemukan Pada Index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Elemen Tidak Ditemukan");  
   }  
 }  
 public static void main(String args[]){  
        int arr[] = {2,3,4,7,9,10};  
        int key = 9;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);     
 }  
}  
