package conway;

/**
 *
 * @author levenick
 */
public class LifeFrame extends javax.swing.JFrame {

    private final Life myLife;

    public LifeFrame() {
        initComponents();
        LifePanel mp = new LifePanel(this);
        add(mp);
        setTitle("Conway!");
        setSize(800,800);
        myLife = new Life();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables



}
