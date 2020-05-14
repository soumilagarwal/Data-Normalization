/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.util.Set;

/**
 *
 * @author asus
 */
public class Front extends javax.swing.JFrame {
    
    public Front() {
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

        jPanel1 = new javax.swing.JPanel();
        fd = new javax.swing.JLabel();
        attribute = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fds = new javax.swing.JTextField();
        cfd = new javax.swing.JButton();
        ca = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        check3 = new javax.swing.JButton();
        checkb = new javax.swing.JButton();
        ck = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        space2 = new javax.swing.JTextArea();
        sk = new javax.swing.JButton();
        bdeco = new javax.swing.JButton();
        Deco3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        space3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        space4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 5));

        fd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fd.setForeground(new java.awt.Color(255, 255, 255));
        fd.setText("FUNCTIONAL DEPENDENCIES :");

        attribute.setBackground(new java.awt.Color(204, 255, 255));
        attribute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        attribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attributeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ATTRIBUTES : ");

        fds.setBackground(new java.awt.Color(204, 255, 255));
        fds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        fds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdsActionPerformed(evt);
            }
        });

        cfd.setBackground(new java.awt.Color(255, 102, 102));
        cfd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cfd.setText("Clear FD");
        cfd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfdActionPerformed(evt);
            }
        });

        ca.setBackground(new java.awt.Color(255, 102, 102));
        ca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ca.setText("Clear Attribute ");
        ca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(255, 255, 51));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        check3.setBackground(new java.awt.Color(204, 153, 255));
        check3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        check3.setText("Check 3NF");
        check3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check3ActionPerformed(evt);
            }
        });

        checkb.setBackground(new java.awt.Color(204, 153, 255));
        checkb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        checkb.setText("Check BCNF");
        checkb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbActionPerformed(evt);
            }
        });

        ck.setBackground(new java.awt.Color(204, 153, 255));
        ck.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ck.setText("Super Key");
        ck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckActionPerformed(evt);
            }
        });

        space2.setBackground(new java.awt.Color(204, 255, 255));
        space2.setColumns(20);
        space2.setRows(5);
        space2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jScrollPane1.setViewportView(space2);

        sk.setBackground(new java.awt.Color(204, 153, 255));
        sk.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sk.setText("Check 2NF");
        sk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skActionPerformed(evt);
            }
        });

        bdeco.setBackground(new java.awt.Color(204, 153, 255));
        bdeco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bdeco.setText("Candidate Key");
        bdeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdecoActionPerformed(evt);
            }
        });

        Deco3.setBackground(new java.awt.Color(204, 153, 255));
        Deco3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Deco3.setText("2NF Decomposition");

        jButton1.setBackground(new java.awt.Color(204, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("BCNF Decomposition");

        jButton2.setBackground(new java.awt.Color(204, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("3NF Decomposition");

        jButton3.setBackground(new java.awt.Color(204, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Closure");

        space3.setBackground(new java.awt.Color(204, 255, 255));
        space3.setColumns(20);
        space3.setRows(5);
        space3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jScrollPane4.setViewportView(space3);

        space4.setBackground(new java.awt.Color(204, 255, 255));
        space4.setColumns(20);
        space4.setRows(5);
        space4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jScrollPane5.setViewportView(space4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(ck, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bdeco, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(checkb, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cfd, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sk, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(check3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ca, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(44, 44, 44)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(Deco3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 216, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fds, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(584, 584, 584)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ck)
                                    .addComponent(bdeco)
                                    .addComponent(check3)
                                    .addComponent(sk)
                                    .addComponent(Deco3)
                                    .addComponent(jButton2)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ca)
                                .addComponent(cfd)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(checkb))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(Submit)
                .addGap(313, 313, 313))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caActionPerformed
        attribute.setText("");
    }//GEN-LAST:event_caActionPerformed

    private void cfdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfdActionPerformed
        fds.setText("");
    }//GEN-LAST:event_cfdActionPerformed

    private void fdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fdsActionPerformed

    private void attributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attributeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attributeActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String att = attribute.getText();
        String fd = fds.getText();
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void check3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check3ActionPerformed
                
                String att = attribute.getText();
                String fd = fds.getText();
                //space.setText(fd);
                //space.setText(att);
                //Set<Attribute> attrs = Attribute.getSet(att);
		//Set<FuncDep> fds = FuncDep.getSet(fd);
		//space.setText("BCNF = " + Algos.checkBCNF(attrs, fds).isEmpty());
		//space.setText("3NF = " + Algos.check3NF(attrs, fds).isEmpty());
                
                
		Set<Attribute> attrs = Attribute.getSet(att);
		Set<FuncDep> FD = FuncDep.getSet(fd);
		boolean check = Algos.check3NF(attrs, FD).isEmpty();
                
                if (check == true)
                    space2.setText("This relation is already in 3NF");
                else
                    space2.setText("This relation is not in 3NF");
                
        
    }//GEN-LAST:event_check3ActionPerformed

    private void checkbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbActionPerformed
        
                String att = attribute.getText();
                String fd = fds.getText();
                
		Set<Attribute> attrs = Attribute.getSet(att);
		Set<FuncDep> FD = FuncDep.getSet(fd);
                boolean check = Algos.check3NF(attrs, FD).isEmpty();
		
                    if (check == true)
                        space2.setText("This relation is already in BCNF");
                    else
                        space2.setText("This relation is not in BCNF");
	
    }//GEN-LAST:event_checkbActionPerformed

    private void ckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckActionPerformed
                
                String att = attribute.getText();
                String fd = fds.getText();
                
                Set<FuncDep> FD = FuncDep.getSet(fd);
		Set<Attribute> attrs = Attribute.getSet(att);
		
		Set<Set<Attribute>> keys = Algos.keys(attrs, FD);
		for(Set<Attribute> sa : keys){
                        
			space2.setText("hello \n\n\n\n\n" + sa.toString());
		
		}
    }//GEN-LAST:event_ckActionPerformed

    private void skActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skActionPerformed
            
                String att = attribute.getText();
                String fd = fds.getText();
                
                Set<FuncDep> FD = FuncDep.getSet(fd);
		Set<Attribute> attrs = Attribute.getSet(att);
		
		Set<Set<Attribute>> keys = Algos.superKeys(attrs, FD);
                
                for(Set<Attribute> sa : keys)
                {
                    String[] array = new String[sa.size()];
                    sa.toString();       
		}
                
    }//GEN-LAST:event_skActionPerformed

    private void bdecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdecoActionPerformed
        
                String att = attribute.getText();
                String fd = fds.getText();
                
                Set<Attribute> attrs = Attribute.getSet(att);
		Set<FuncDep> FD = FuncDep.getSet(fd);
		
                Relation original = new Relation(attrs, FD);
		
		Set<Relation> decomposed = original.decomposeToBCNF();
		
		for(Relation r : decomposed){
			System.out.println(r);
			System.out.println();
                        space2.setText("hello \n\n\n\n\n" + r.toString());
                        
		}
    }//GEN-LAST:event_bdecoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deco3;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField attribute;
    private javax.swing.JButton bdeco;
    private javax.swing.JButton ca;
    private javax.swing.JButton cfd;
    private javax.swing.JButton check3;
    private javax.swing.JButton checkb;
    private javax.swing.JButton ck;
    private javax.swing.JLabel fd;
    private javax.swing.JTextField fds;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton sk;
    private javax.swing.JTextArea space2;
    private javax.swing.JTextArea space3;
    private javax.swing.JTextArea space4;
    // End of variables declaration//GEN-END:variables
}
