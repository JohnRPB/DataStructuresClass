package conway;

import java.awt.Graphics;

/**
 * @author levenick Jan 19, 2017 2:44:19 PM
 */
class Life {

    final static int N = 30;

    Cell[][] cells;

    Life() {
        cells = new Cell[N][N];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                cells[row][col] = new Cell();
            }
        }

        cells[5][5].setAlive(true);
        cells[5][6].setAlive(true);
        cells[5][7].setAlive(true);
        cells[6][7].setAlive(true);
        cells[7][6].setAlive(true);
        cells[7][7].setAlive(true);

    }

    public String toString() {
        String returnMe = "";

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                returnMe += cells[row][col].display();
            }
            returnMe += "\n";
        }

        return returnMe;
    }

    public String toStringCounts() {
        String returnMe = "";

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                returnMe += cells[row][col].getNumNbrs();
            }
            returnMe += "\n";
        }

        return returnMe;
    }

    void step() {
        countNbrs();
        // System.out.println("toStringCounts() = " + toStringCounts());
        update();
    }

    private void countNbrs() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                countNbrs(row, col);
            }
        }
    }

    void countNbrs(int row, int col) {
        int count = 0;                                  // count the nbrs of [row][col]
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if ((i != row || j != col) && cells[fix(i)][fix(j)].isAlive()) {
                    count++;
                }
            }
        }
        cells[row][col].setNumNbrs(count);              // set the instance variable!!
    }

    private void update() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                cells[row][col].update();
            }
        }
    }

    private int fix(int n) {
        if (n == -1) {
            return N - 1;
        }
        if (n == N) {
            return 0;
        }
        return n;
    }

}
