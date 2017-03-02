/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

public class Queue2_21 {

   public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.dequeue() = " + q.dequeue());
        System.out.println("q.dequeue() = " + q.dequeue());
    }
    
}