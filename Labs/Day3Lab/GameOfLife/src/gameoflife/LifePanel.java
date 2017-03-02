/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;
import java.awt.Graphics;

/**
 *
 * @author alan
 */
public class LifePanel extends javax.swing.JPanel {

    cLife myLife = new cLife();
    
    private final CellFrame theFrame;
    private boolean running = true;
    
    int buttonNum;
    
    /**
     * Creates new form LifeFrame
     */
    public LifePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Step = new javax.swing.JButton();

        setLayout(null);

        Step.setText("Step");
        Step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StepActionPerformed(evt);
            }
        });
        add(Step);
        Step.setBounds(270, 30, 67, 25);
    }// </editor-fold>//GEN-END:initComponents

    cLife myCells;
    
    private void StepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StepActionPerformed
         
        if(buttonNum == 0) {
             myCells = new cLife(10);
        } else {
            myCells.establishState();
            myCells.generalUpdate();
        }
        
        String input = myCells.toString();
        
        buttonNum = buttonNum + 1;
        
    }//GEN-LAST:event_StepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Step;
    // End of variables declaration//GEN-END:variables
}
