package conway;

/**
 *
 * @author levenick
 */
public class LifeFrame extends javax.swing.JFrame {

    private final Life myLife;

    public LifeFrame() {
        initComponents();
        setTitle("Conway!");
        setSize(800,800);
        myLife = new Life();
        display();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        theTA = new javax.swing.JTextArea();
        stepButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        theTA.setColumns(20);
        theTA.setFont(new java.awt.Font("Courier", 0, 14)); // NOI18N
        theTA.setRows(5);
        jScrollPane1.setViewportView(theTA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 890, 1120);

        stepButton.setText("Step");
        stepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepButtonActionPerformed(evt);
            }
        });
        getContentPane().add(stepButton);
        stepButton.setBounds(210, 0, 75, 29);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepButtonActionPerformed
        myLife.step();
        display();
    }//GEN-LAST:event_stepButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton stepButton;
    private javax.swing.JTextArea theTA;
    // End of variables declaration//GEN-END:variables

    private void display() {
        theTA.setText(myLife.toString());
    }

}
