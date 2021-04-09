/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphWO5;

/**
 *
 * @author RifqiFebri
 */
public class Queue {
    private int maxsize;
    private long[] quearray;
    private int front;
    private int rear;
    private int nitems;
    
public Queue (int size) {
    this.maxsize = size;
    quearray = new long [maxsize];
    front = 0; rear = -1; nitems = 0;   
    }
public void insert (long value) {
    if (rear == maxsize - 1) {
        rear = -1;
    }
    quearray[++rear] = value;
    nitems++;
    }
public long remove () {
    long temp = quearray[front++];
    if (front == maxsize) {
        front = 0;
    }
    nitems--;
    return temp;
    }
public long peekfront(){
    return quearray[front];
    }
public boolean isempty () {
    return (nitems == maxsize);
    }
public boolean isfull() {
    return (nitems == maxsize);
}
public int size (){
    return nitems;
    }

}


    

