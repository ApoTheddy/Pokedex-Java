package Componentes;

import java.awt.Color;
import java.awt.Dimension;

public class ContenedorType extends javax.swing.JPanel {

    private final String type;
    private final Color color;
    private final int numTypes;
    
    public ContenedorType(Color color, String type,int numTypes) {
        this.color = color;
        this.type = type;
        this.numTypes = numTypes;
        initComponents();
        establecerDatos();
    }
    
    public void establecerDatos() {
        setMaximumSize(new Dimension(180/numTypes, 10));
        setBackground(color);
        lblType.setText(type.toUpperCase());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblType = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(30, 30));

        lblType.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        lblType.setForeground(new java.awt.Color(255, 255, 255));
        lblType.setText("TYPE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblType)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblType)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}
