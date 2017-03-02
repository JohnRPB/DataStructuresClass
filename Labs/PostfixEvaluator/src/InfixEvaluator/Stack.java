/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfixEvaluator;
import java.util.StringTokenizer;

/**
 *
 * @author alan
 */
class Stack<E> {
    private Object[] list;
    private int last;
    private final int MAX=1000;

    Stack() {
        last = -1; // first element on running 'push' is bumped up one, to zero
        list = new Object[MAX];
    } 
   
    public void push(E insertMe) {
        last++;
        list[last] = insertMe;
    }
    
    public double toDouble(String toBeDoubled) {
        Double d = Double.parseDouble(toBeDoubled);
        return d;
    }
    
    // combines two operands with given operation, stores result on top of stack
    
    public void push(double insertOne, String Operator, double insertTwo) {
        last++;
        double result = 0;       
        
        switch(Operator) {
            case "+": 
                result = insertOne + insertTwo;
                break;
            case "-": 
                result = insertOne - insertTwo;
                break;
            case "*":
                result = insertOne * insertTwo;
                break;
            case "/":
                result = insertOne / insertTwo;
                break;
            default: System.out.println("Bad operator");
                break;
        }
        
        list[last] = result;
    } 
    
    public E pop() {
        Object returnMe;
        returnMe = list[last];
        last--;
        return (E) returnMe;
    }
    
    public E top() {
        Object returnMe = list[last];
        return (E) returnMe;
    }
   
    public boolean isEmpty() {
        return last == -1;
    }
   
}
