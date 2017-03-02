/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningstringtokenizer;

import java.util.StringTokenizer;

/**
 *
 * @author levenick
 */
public class LearningStringTokenizer {

    private static final String OPERATORS = "*+-/";

    public static void main(String[] args) {
        elaboratedExample();
//        StringTokenizer st = new StringTokenizer("3 2 -1+", OPERATORS + " ", true);
//        while (st.hasMoreTokens()) {
//            String nextToken = st.nextToken();
//            System.out.println("nextToken =>" + nextToken + "<=");
//        }
    }

    static void elaboratedExample() {
        StringTokenizer st = new StringTokenizer("3 2 -1+", OPERATORS + " ", true);

        while (st.hasMoreTokens()) {
            String nextToken = st.nextToken();
            System.out.println("nextToken =>" + nextToken + "<=");
            if (nextToken.equals(" ")) {
                System.out.println("skipping the space");
                continue;
            }

            if (isAnOperator(nextToken)) {
                handleOperator(nextToken);
            } else {  // only two choices, so must be an operand
                handleOperand(nextToken);
            }

        }
    }

    private static boolean isAnOperator(String nextToken) {
        return OPERATORS.contains(""+nextToken.charAt(0));
    }

    private static void handleOperator(String nextToken) {
        System.out.println(nextToken + " is an operator! Need to write handling code for operators.");
    }

    private static void handleOperand(String nextToken) {
        System.out.println(nextToken + " is an operand! Need to write handling code for operands.");

    }

}