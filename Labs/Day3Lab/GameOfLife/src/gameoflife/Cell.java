/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author alan
 */
class Cell {
  
    // defining variable for true/false value of being alive
    
    boolean alive;
    
    // defining variable for the number of living neighbors the cell has
  
    int liveNeighbors;
    
    public Cell() {
        this.setAlive(false);
    }
    
    // Constructor for class, "Cell" -- makes a cell and sets it to dead
    
    public Cell(boolean alive, int liveNeighbors){
        this.setAlive(alive);
        this.setNeighbors(liveNeighbors);
    }

    // ---- Accessor methods -----
    
    // checks if object is alive; returns boolean
    
    public boolean isAlive(){
        return this.alive;
    }
    
    // returns value of 'liveNeighbors' variable
    
    public int liveNeighbors(){
        return this.liveNeighbors;       
    }
    
    // ---- setting methods ----
    
    // method to set object to alive
    
    public void setAlive(boolean alive){
        this.alive = alive;
    }
    
    // method to set number of livebeighbors
    
    public void setNeighbors(int nuNeighbors){
        this.liveNeighbors = nuNeighbors;
    }  
    
     public String toString() {
        
        String returnMe = "I am a cell:\n";
        
        for (int row = 0; row<1; row++) {
            
            for (int col = 0; col < 1; col++) {
                
                returnMe += " " + display();
            
            }
            
            returnMe += "\n";
                 
        }
        
        return(returnMe);
        
    }

    
    // returns symbols (for printout) that codify 'alive' and 'dead'
    
    public char display(){
        if (this.alive){
            return '*';
        }
        else{
            return '-';
        }
    }
    
    // Call this method on a cell; if that cell is alive and it has either 2 or
    // 3 live neighbors, return 
    
    public void update(){
        if ((this.isAlive() && (liveNeighbors == 2 || liveNeighbors == 3))){
        return;
        }
        else if ((!this.isAlive() && liveNeighbors == 3)){
            this.setAlive(true);
        }
        else{
            if (this.isAlive()){
                this.setAlive(false);
            }
            else{
                return;
            }
        }
    }
    
    
    
    
}