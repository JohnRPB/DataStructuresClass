package conway;

/**
 *
 * @author levenick
 */
public class Conway {

    static Cell[][] grid = new Cell[5][5];

    public static void main(String[] args) {
        //new LifeFrame();
        //new LifeFrameAnimated();
        init();
        String input = "hi...";
        display();
        parse(grid[2], input);
        display();
    }

    private static void display() {
        System.out.println("the grid...");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + grid[i][j].display());
            }
            System.out.println("");
        }
    }

    private static void parse(Cell[] row, String input) {
        System.out.println("input = " + input);
        for (int i = 0; i < input.length(); i++) {
            row[i].setAlive(input.charAt(i) == '.');
        }
    }

    private static void init() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

}
