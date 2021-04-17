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
public class TugasSelectionSort {
    void sort(int arr[]) {
        int n = arr.length;
        int move = 0;
        
        for (int i=0; i<n-1; i++){
            int minim_idx=i;
                for (int j = i+1; j<n; j++)
                    if (arr[j] < arr[minim_idx])
                    minim_idx=j;
                
                int temp = arr[minim_idx];
                arr[minim_idx] = arr[i];
                arr[i] = temp;
                move++;
        }
        System.out.println("Sort Array");
        System.out.println("Experience " + move + " Swap");
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[]) {
        TugasSelectionSort x = new TugasSelectionSort();
        int arr[] = {9,3,5,20,10};
        x.sort(arr);
        x.printArray(arr);
    }
}
