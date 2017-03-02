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
public class PostfixEvaluator {

    String result = "";
    /**
     * @param args the command line arguments
     */
    
    public void PostFixEvaluator() {
        
    }
    
    public static double evaluate(String inputLine) {
        Stack<Double> stack = new Stack();
        StringTokenizer st = new StringTokenizer(inputLine, "+-*/ ", true);
        String nextToken; 
        double x; double y;
        
        while (st.hasMoreTokens()) {
           nextToken = st.nextToken();
           if (!"+".equals(nextToken) && !"-".equals(nextToken) && !"*".equals(nextToken) && !"/".equals(nextToken) && !" ".equals(nextToken)) {
               stack.push(stack.toDouble(nextToken));
           } else if (" ".equals(nextToken)){
               
           } else {  // an operator
               x = stack.pop();
               y = stack.pop();
               stack.push(y, nextToken, x);   // need to implement the operation as a method
           } // else
      }
        return(stack.pop());
    }
    
    public void emit(String s) {
        result += s;
    }
    
    public String getResult() {
        return result;
    }
    
    public String toString(double toBeStringed) {
        return "" + toBeStringed;
    }
    
    public double toDouble(String toBeDoubled) {
        Double d = Double.parseDouble(toBeDoubled);
        return d;
    }
    
    public static void main(String[] args) {
        
        new InfixGUI();
        
//        MyReader mr = new MyReader("postfixfile");
//        
//        while (mr.hasMoreData()) {
//            System.out.println("\n");
//            String nextLine = mr.giveMeTheNextLine();
//            System.out.println(nextLine + "=" + PostfixEvaluator.evaluate(nextLine) + "\n");
//        }
        
        
        
    }
    
}