/* @author alwin */
package outdoor.paradise;

public class IntroScreen extends javax.swing.JFrame {
    
    Connector conn = new Connector();
    
    Employee M;
    Trip T;
    Excursion E;
    
    public IntroScreen() {
        initComponents();
        
        M = new Employee(conn);
        T = new Trip(conn);
        E = new Excursion(conn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Employee_Button = new javax.swing.JButton();
        Trip_Button = new javax.swing.JButton();
        Excursion_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Make a choice from one of the options below");

        Employee_Button.setText("Employee");
        Employee_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employee_ButtonActionPerformed(evt);
            }
        });

        Trip_Button.setText("Trip");
        Trip_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trip_ButtonActionPerformed(evt);
            }
        });

        Excursion_Button.setText("Excursion");
        Excursion_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excursion_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Employee_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Trip_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Excursion_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Employee_Button)
                    .addComponent(Trip_Button)
                    .addComponent(Excursion_Button))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Employee_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employee_ButtonActionPerformed
        M.setVisible(true);
    }//GEN-LAST:event_Employee_ButtonActionPerformed

    private void Trip_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trip_ButtonActionPerformed
        T.setVisible(true);
    }//GEN-LAST:event_Trip_ButtonActionPerformed

    private void Excursion_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excursion_ButtonActionPerformed
        E.setVisible(true);
    }//GEN-LAST:event_Excursion_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Employee_Button;
    private javax.swing.JButton Excursion_Button;
    private javax.swing.JButton Trip_Button;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
