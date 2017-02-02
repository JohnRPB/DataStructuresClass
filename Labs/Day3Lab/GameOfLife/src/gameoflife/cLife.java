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
public class cLife {
    
    int n;
    Cell[][] myCells;
  
    // initial constructor
    
    cLife(int n) {        
        this.n = n;
        myCells = new Cell[n][n];
        
        for(int row = 0; row < n; row++) {
             for(int col = 0; col < n; col++) {                
                myCells[row][col] = new Cell();                
            }           
        }
        
        myCells[4][3].setAlive(true);
        myCells[4][4].setAlive(true);
        myCells[4][5].setAlive(true);
        myCells[5][3].setAlive(true);
        myCells[6][4].setAlive(true);        
    }
    
    // prints the display value of every cell in array
    
    public String toString() {
        
        String returnMe = "I am a cell:\n";
        
        for (int row = 0; row < n; row++) {
            
            for (int col = 0; col < n; col++) {
                
                returnMe += " " + myCells[row][col].display();
            
            }
            
            returnMe += "\n";
                 
        }
        
        return(returnMe);
        
    }
     
    public void establishState() {
        
        for(int col = 0; col < n; col++) {
            for(int row = 0; row < n; row++) {
        
                
                // setting arrays; these define an up->right->down->left->up trajectory
                int[] Row = {-1, -1, 0, 1, 1, 1, 0, -1};
                int[] Col = {0, 1, 1, 1, 0, -1, -1, -1};
                
                System.out.println("On row: " + row + " and col: " + col);
                
                // filling settor array with trajectory values
                for(int i = 0; i < 8; i++){
                    
                    if (Row[i] + row == n) {
                         Row[i] = 0;  
                    } else if (Row[i] + row == -1) {
                        Row[i] = n-1;
                    } else {
                        Row[i] = Row[i] + row;
                    }
                    
                    if (Col[i] + col == n) {
                         Col[i] = 0;  
                    } else if (Col[i] + col == -1) {
                        Col[i] = n-1;
                    } else {
                        Col[i] = Col[i] + col;
                    }

                }
                
                System.out.println("Torus after processing");
                for(int i = 0; i < 8; i++){
                    System.out.println("" + Row[i] + "," + Col[i]);
                }
              
                int nuLive = 0;
                
                for(int j = 0; j < 8; j++) {
                  
                        if(myCells[ Row[j] ][ Col[j] ].isAlive() == true) {
                            nuLive = nuLive + 1;
                        }   

                }
                
            System.out.println("Live neighbors:" + nuLive);
                
            myCells[row][col].setNeighbors(nuLive);
                
            }
        }
        
        
         
    }
    
    public void generalUpdate() {
        
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                myCells[row][col].update();
            }
        }
    }
    
    
    
    
}
