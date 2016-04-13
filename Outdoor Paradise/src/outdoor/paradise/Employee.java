/* @author alwin */
package outdoor.paradise;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Employee extends javax.swing.JFrame {

    Connector conn;
    String selected = "";
    
    public Employee(Connector conn) {
        initComponents();
        
        this.conn = conn;
        
        this.Table.setModel(new DefaultTableModel()); /// clear the table
        this.FindBy_DropList.setModel(new DefaultComboBoxModel()); /// clear the list
        
        this.FindBy_DropList.addItem("id");
        this.FindBy_DropList.addItem("first_name");
    }
    
    public void Visability(String selected) {
        
        if(selected.equals("id"))
        {
            this.Id_Label.setVisible(true);
            this.Id_TextField.setVisible(true);
            this.Name_Label.setVisible(false);
            this.Name_TextField.setVisible(false);
        }
        
        else if(selected.equals("first_name"))
        {
            this.Name_Label.setVisible(true);
            this.Name_TextField.setVisible(true);
            this.Id_Label.setVisible(false);
            this.Id_TextField.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Id_Label = new javax.swing.JLabel();
        Id_TextField = new javax.swing.JTextField();
        Name_TextField = new javax.swing.JTextField();
        Name_Label = new javax.swing.JLabel();
        Find_Button = new javax.swing.JButton();
        FindBy_DropList = new javax.swing.JComboBox();
        SortBy_Label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(930, 300));

        Id_Label.setText("Id");

        Id_TextField.setPreferredSize(new java.awt.Dimension(350, 22));

        Name_TextField.setPreferredSize(new java.awt.Dimension(350, 22));

        Name_Label.setText("Name");

        Find_Button.setText("Find Employee");
        Find_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Find_ButtonActionPerformed(evt);
            }
        });

        FindBy_DropList.setName(""); // NOI18N
        FindBy_DropList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindBy_DropListActionPerformed(evt);
            }
        });

        SortBy_Label.setText("Sort by:");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Id_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SortBy_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FindBy_DropList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Find_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 519, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id_Label)
                    .addComponent(Id_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Label)
                    .addComponent(Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SortBy_Label)
                    .addComponent(FindBy_DropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Find_Button)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        close.setText("close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(close)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FindBy_DropListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBy_DropListActionPerformed

        selected = this.FindBy_DropList.getSelectedItem().toString();

        /// default is ID so it automaticly sets it to ID on creation

        switch(selected)
        {
            case "id": Visability(selected); break;
            case "first_name": Visability(selected); break;
        }
        
        this.Table.setModel(new DefaultTableModel());
    }//GEN-LAST:event_FindBy_DropListActionPerformed

    private void Find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Find_ButtonActionPerformed
        FindCoworker();
    }//GEN-LAST:event_Find_ButtonActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed
    
    public void FindCoworker() {
       
        DefaultTableModel tm = new DefaultTableModel();
        
        if(this.Id_TextField.isVisible()) { tm = conn.GetEmployee(this.Id_TextField.getText(), "id"); }
        
        else if(this.Name_TextField.isVisible()) { tm = conn.GetEmployee(this.Name_TextField.getText(), "first_name"); }
        
        this.Table.setModel(tm);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox FindBy_DropList;
    private javax.swing.JButton Find_Button;
    private javax.swing.JLabel Id_Label;
    private javax.swing.JTextField Id_TextField;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JTextField Name_TextField;
    private javax.swing.JLabel SortBy_Label;
    private javax.swing.JTable Table;
    private javax.swing.JButton close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
