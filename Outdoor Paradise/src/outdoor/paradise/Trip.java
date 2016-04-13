/* @author alwin */
package outdoor.paradise;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Trip extends javax.swing.JFrame {

    Connector conn;
    String selected = "";
    CU_Trip cu;
    
    public Trip(Connector conn) {
        initComponents();
        
        this.conn = conn;
        this.cu = new CU_Trip(this, conn);
        
        this.Table.setModel(new DefaultTableModel());
        this.FindBy_DropList.setModel(new DefaultComboBoxModel());
        
        this.FindBy_DropList.addItem("number");
        this.FindBy_DropList.addItem("name");
    }
    
    public void Visability(String selected) {
        
        if(selected.equals("number"))
        {
            this.Number_Label.setVisible(true);
            this.Number_TextField.setVisible(true);
            this.Name_Label.setVisible(false);
            this.Name_TextField.setVisible(false);
        }
        
        else if(selected.equals("name"))
        {
            this.Name_Label.setVisible(true);
            this.Name_TextField.setVisible(true);
            this.Number_Label.setVisible(false);
            this.Number_TextField.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Number_Label = new javax.swing.JLabel();
        Number_TextField = new javax.swing.JTextField();
        Name_TextField = new javax.swing.JTextField();
        Name_Label = new javax.swing.JLabel();
        Find_Button = new javax.swing.JButton();
        FindBy_DropList = new javax.swing.JComboBox();
        SortByLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Create_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(930, 300));

        Number_Label.setText("Number");

        Number_TextField.setPreferredSize(new java.awt.Dimension(350, 22));

        Name_TextField.setPreferredSize(new java.awt.Dimension(350, 22));

        Name_Label.setText("Name");

        Find_Button.setText("Find Trip");
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

        SortByLabel.setText("Sort by:");

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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Table);

        Create_Button.setText("Create Trip");
        Create_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_ButtonActionPerformed(evt);
            }
        });

        Update_Button.setText("Update Trip");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setText("Delete Trip");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Name_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SortByLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Find_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Delete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Create_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FindBy_DropList, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Number_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Number_Label)
                    .addComponent(Number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name_Label)
                    .addComponent(Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SortByLabel)
                    .addComponent(FindBy_DropList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Find_Button)
                    .addComponent(Create_Button)
                    .addComponent(Update_Button)
                    .addComponent(Delete_Button))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );

        close.setText("close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Find_ButtonActionPerformed
        FindTrip();
    }//GEN-LAST:event_Find_ButtonActionPerformed

    private void FindBy_DropListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindBy_DropListActionPerformed

        selected = this.FindBy_DropList.getSelectedItem().toString();

        /// default is number so it automaticly sets it to ID on creation

        switch(selected)
        {
            case "number": Visability(selected); break;
            case "name": Visability(selected); break;
        }

        this.Table.setModel(new DefaultTableModel());
    }//GEN-LAST:event_FindBy_DropListActionPerformed

    public void FindTrip() {
       
        DefaultTableModel tm = new DefaultTableModel();
        
        if(this.Number_TextField.isVisible()) { tm = conn.GetTrip(this.Number_TextField.getText(), "number"); }
        
        else if(this.Name_TextField.isVisible()) { tm = conn.GetTrip(this.Name_TextField.getText(), "name"); }
        
        this.Table.setModel(tm);
    }
    
    private void Create_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_ButtonActionPerformed
        
        ArrayList values = new ArrayList();
        
        for(int i = 0; i< 15; i++)
        { values.add(""); }
        
        cu.setVariables(values);
        cu.setVisible(true);
        
    }//GEN-LAST:event_Create_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        
        int row = this.Table.getSelectedRow();
        
        ArrayList values = new ArrayList();
        
        if(row != -1)
        {
            for(int i = 0; i < this.Table.getColumnCount(); i++)
            {
                if(this.Table.getValueAt(row, i) != null)
                { values.add(this.Table.getValueAt(row, i).toString()); }
            
                else
                { values.add(""); }
            }
        
            cu.setVariables(values);
            cu.setVisible(true);
        }
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        int row = this.Table.getSelectedRow();
        conn.deleteSelection("trip", this.Table.getValueAt(row, 0).toString());
        FindTrip();
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create_Button;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JComboBox FindBy_DropList;
    private javax.swing.JButton Find_Button;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JTextField Name_TextField;
    private javax.swing.JLabel Number_Label;
    private javax.swing.JTextField Number_TextField;
    private javax.swing.JLabel SortByLabel;
    private javax.swing.JTable Table;
    private javax.swing.JButton Update_Button;
    private javax.swing.JButton close;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
