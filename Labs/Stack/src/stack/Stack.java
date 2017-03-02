/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author alan
 */
public class Stack {
    int[] list;
    int last;
    private int MAX=1000;

   Stack() {
       last = -1; // first element on running 'push' is bumped up one, to zero
       list = new int[MAX];
   }
   
   void push(int insertMe) {
       last++;
       list[last] = insertMe;
   } 
    
   int pop() {
       int returnMe = list[last];
       last--; // reduces 'last' by one, since list is now one smaller
       return returnMe;
   }
   
    boolean isEmpty() {
        return last == -1;
    }
   
}
