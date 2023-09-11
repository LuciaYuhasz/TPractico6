/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpractico6;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tpractico6.Producto;

public class PorNombre extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo= new DefaultTableModel(){
    
    public boolean isCellEditable (int f, int c){
        return false;
    }
};
    /** Creates new form PorNombre */
    public PorNombre() {
        initComponents();
        armarCabecera();
    }
    @SuppressWarnings("unchecked")
    
    
    
    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {                                     
    borrarFilas();
        for(Producto prod:menuGeneral.lista){
    
            if(prod.getDescripcion().toLowerCase().startsWith(jtNombre.getText().toLowerCase())){
                    modelo.addRow(new Object[]{
                            prod.getCodigo(),
                            prod.getDescripcion(),
                            prod.getPrecio(),
                            prod.getStoock(),
           });
    }
}       
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        jLabel1.setText("Escriba el nombre ");

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
     int filaSeleccionada=jtProductos.getSelectedRow();
        int codigo=(Integer)jtProductos.getValueAt(filaSeleccionada, 0);
        JOptionPane.showMessageDialog(this,"El codigo "+codigo);
                                            

    }//GEN-LAST:event_jtProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtProductos;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){
    modelo.addColumn("Codigo");
    modelo.addColumn("Descripcion");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    jtProductos.setModel(modelo);
}

private void borrarFilas(){
    int f= modelo.getRowCount()-1;
    for (;f>=0;f--){
        modelo.removeRow(f);
    }
}
}