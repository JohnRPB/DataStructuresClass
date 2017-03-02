package InfixEvaluator;

import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class InfixEvaluator {
    
    String result = "";
    
    public void InfixEvaluator() {
        
    }
    
    public static String evaluate(String input) {
        Stack<String> stack = new Stack();
        StringTokenizer st = new StringTokenizer(input, "+-*/ ", true);
        String nextToken; 
        InfixEvaluator infix = new InfixEvaluator();
        
        while(st.hasMoreTokens()) {
            nextToken = st.nextToken();
            if (!"+".equals(nextToken) && !"-".equals(nextToken) && !"*".equals(nextToken) && !"/".equals(nextToken) && !" ".equals(nextToken)) {
                infix.emit(nextToken);
            } else if (" ".equals(nextToken)){
               
            } else {
                while(!stack.isEmpty() && (infix.precedence(stack.top()) >=  infix.precedence(nextToken))) {
                    infix.emit(stack.pop());
                }
                stack.push(nextToken);
            }
        }
        
        while(!stack.isEmpty()) {
            infix.emit(stack.pop());
        }
        
        return infix.getResult();
    }
    
    public void emit(String s) {
        result += s + " ";
    }
    
    public String getResult() {
        return result;
    }
    
    public int precedence(String s) {
        if ("+".equals(s) || "-".equals(s)) {
            return 1;
        } else {
            return 2;
        }
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
