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
    
  boolean alive;
    int liveNeighbors;
    
    public Cell(){
    this.setAlive(false);
    this.setNeighbors(2);
    }
    public Cell(boolean alive, int liveNeighbors){
        
    }

    public boolean isAlive(){
        return this.alive;
    }
    public void setAlive(boolean alive){
        this.alive = alive;}
    
    public int liveNeighbors(){
        return liveNeighbors;       
    }
    public void setNeighbors(int nuNeighbors){
        nuNeighbors = liveNeighbors;
    }
    public String toString(){
        if (this.isAlive()){
            return ("The cell is alive and has " + liveNeighbors + " living neighbors.");
        }
        else{
            return ("The cell is dead and has " + liveNeighbors + " living neighbors.");
        }
    }
    public char display(){
        if (this.alive){
            return '*';
        }
        else{
            return '-';
        }
    }
    
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