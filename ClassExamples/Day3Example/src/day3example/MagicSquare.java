/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3example;

/**
 *
 * @author alan
 */
class MagicSquare {
    
    int N;
    int[][] sq;

    MagicSquare(int i) {
        N = i;
        makeIt();
    }

    private void makeIt() {
        sq = new int[N][N];
        int currentRow = 0;
        int currentCol = N / 2;
        sq[currentRow][currentCol] = 1;

        for (int nextNum = 2; nextNum <= N * N; nextNum++) {
            int oldR = currentRow;
            int oldC = currentCol;
            currentRow = currentRow - 1;
            if (currentRow < 0) {
                currentRow = N - 1;
            }
            currentCol = currentCol - 1;
            if (currentCol < 0) {
                currentCol = N - 1;
            }
            if (sq[currentRow][currentCol] != 0) {  // collide?
                currentRow = oldR + 1;
                currentCol = oldC;
            }
                
            sq[currentRow][currentCol] = nextNum;
        }
    }

    public String toString() {
        String returnMe = "I am a magic square:\n";

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                returnMe += " " + sq[row][col];
            }//inner 
            returnMe += "\n";
        }//outer for

        return returnMe;
    }
    
}
