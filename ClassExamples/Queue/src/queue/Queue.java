/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author alan
 */
public class Queue {
    int[] list;
    int last;
    private int MAX=1000;
    
    Queue() { // constructor; starts new Queue
        last = -1;
        list = new int[MAX];
    }
    
    void enqueue(int insertMe) {
        last++;
        list[last] = insertMe;
    }
    
    int dequeue() {
        int returnMe = list[0];
        shiftUp(); // takes out bottom token; re-arranges others
        last--; // reduces 'last' by one, since list is now one smaller
        return returnMe;
    }
    
    void shiftUp() {
        for (int i = 1; i <= last; i++) {
            list[i-1] = list[i];
        }
    }
    
    boolean isEmpty() {
        return last == -1;
    }
}