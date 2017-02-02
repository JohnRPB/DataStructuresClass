package conway;

/**
 * @author levenick Jan 19, 2017 2:46:24 PM
 */
class Cell {

    boolean alive;
    int numNbrs;
    
    private char ALIVE = '*';
    private char DEAD = '-';

    public int getNumNbrs() {
        return numNbrs;
    }

    public void setNumNbrs(int numNbrs) {
        this.numNbrs = numNbrs;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    Cell() {
    }

    @Override
    public String toString() {
        return "Cell{" + "numNbrs=" + numNbrs + ", alive=" + alive + '}';
    }

    char display() {
        if (alive) {
            return ALIVE;
        }
        return DEAD;
    }

    void update() {
        alive = (numNbrs==3 || alive && numNbrs==2);
    }

}
