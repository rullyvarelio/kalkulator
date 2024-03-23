
package Main;

public class App extends javax.swing.JFrame {
    
    double enterNum1, enterNum2, result;
    String operator;

    public App() {
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

        jPanel4 = new javax.swing.JPanel();
        textField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bckspcBtn = new javax.swing.JButton();
        ceBtn = new javax.swing.JButton();
        cBtn = new javax.swing.JButton();
        plusminusBtn = new javax.swing.JButton();
        digit7 = new javax.swing.JButton();
        digit8 = new javax.swing.JButton();
        digit9 = new javax.swing.JButton();
        opMultiply = new javax.swing.JButton();
        digit4 = new javax.swing.JButton();
        digit5 = new javax.swing.JButton();
        digit6 = new javax.swing.JButton();
        opPlus = new javax.swing.JButton();
        digit1 = new javax.swing.JButton();
        digit2 = new javax.swing.JButton();
        digit3 = new javax.swing.JButton();
        opDivide = new javax.swing.JButton();
        digit0 = new javax.swing.JButton();
        pointBtn = new javax.swing.JButton();
        equalsBtn = new javax.swing.JButton();
        opMinus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(244, 244, 244));
        setMinimumSize(new java.awt.Dimension(300, 430));
        setPreferredSize(new java.awt.Dimension(300, 430));
        setResizable(false);

        jPanel4.setLayout(new java.awt.CardLayout(10, 10));

        textField.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        textField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(textField, "card2");

        jPanel1.setLayout(new java.awt.GridLayout(5, 4));

        bckspcBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        bckspcBtn.setText("←");
        bckspcBtn.setMinimumSize(new java.awt.Dimension(60, 23));
        bckspcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckspcBtnActionPerformed(evt);
            }
        });
        jPanel1.add(bckspcBtn);

        ceBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        ceBtn.setText("CE");
        ceBtn.setMinimumSize(new java.awt.Dimension(60, 23));
        ceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ceBtn);

        cBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        cBtn.setText("C");
        cBtn.setMinimumSize(new java.awt.Dimension(60, 23));
        cBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cBtn);

        plusminusBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        plusminusBtn.setText("±");
        plusminusBtn.setMinimumSize(new java.awt.Dimension(60, 23));
        plusminusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusBtnActionPerformed(evt);
            }
        });
        jPanel1.add(plusminusBtn);

        digit7.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit7.setText("7");
        digit7.setMinimumSize(new java.awt.Dimension(60, 23));
        digit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit7ActionPerformed(evt);
            }
        });
        jPanel1.add(digit7);

        digit8.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit8.setText("8");
        digit8.setMinimumSize(new java.awt.Dimension(60, 23));
        digit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit8ActionPerformed(evt);
            }
        });
        jPanel1.add(digit8);

        digit9.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit9.setText("9");
        digit9.setMinimumSize(new java.awt.Dimension(60, 23));
        digit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit9ActionPerformed(evt);
            }
        });
        jPanel1.add(digit9);

        opMultiply.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        opMultiply.setText("*");
        opMultiply.setMinimumSize(new java.awt.Dimension(60, 23));
        opMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMultiplyActionPerformed(evt);
            }
        });
        jPanel1.add(opMultiply);

        digit4.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit4.setText("4");
        digit4.setMinimumSize(new java.awt.Dimension(60, 23));
        digit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit4ActionPerformed(evt);
            }
        });
        jPanel1.add(digit4);

        digit5.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit5.setText("5");
        digit5.setMinimumSize(new java.awt.Dimension(60, 23));
        digit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit5ActionPerformed(evt);
            }
        });
        jPanel1.add(digit5);

        digit6.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit6.setText("6");
        digit6.setMinimumSize(new java.awt.Dimension(60, 23));
        digit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit6ActionPerformed(evt);
            }
        });
        jPanel1.add(digit6);

        opPlus.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        opPlus.setText("+");
        opPlus.setMinimumSize(new java.awt.Dimension(60, 23));
        opPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPlusActionPerformed(evt);
            }
        });
        jPanel1.add(opPlus);

        digit1.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit1.setText("1");
        digit1.setMinimumSize(new java.awt.Dimension(60, 23));
        digit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit1ActionPerformed(evt);
            }
        });
        jPanel1.add(digit1);

        digit2.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit2.setText("2");
        digit2.setMinimumSize(new java.awt.Dimension(60, 23));
        digit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit2ActionPerformed(evt);
            }
        });
        jPanel1.add(digit2);

        digit3.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit3.setText("3");
        digit3.setMinimumSize(new java.awt.Dimension(60, 23));
        digit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit3ActionPerformed(evt);
            }
        });
        jPanel1.add(digit3);

        opDivide.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        opDivide.setText("/");
        opDivide.setMinimumSize(new java.awt.Dimension(60, 23));
        opDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDivideActionPerformed(evt);
            }
        });
        jPanel1.add(opDivide);

        digit0.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        digit0.setText("0");
        digit0.setMinimumSize(new java.awt.Dimension(60, 23));
        digit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit0ActionPerformed(evt);
            }
        });
        jPanel1.add(digit0);

        pointBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        pointBtn.setText(".");
        pointBtn.setMinimumSize(new java.awt.Dimension(60, 23));
        pointBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointBtnActionPerformed(evt);
            }
        });
        jPanel1.add(pointBtn);

        equalsBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        equalsBtn.setText("=");
        equalsBtn.setMinimumSize(new java.awt.Dimension(60, 23));
        equalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(equalsBtn);

        opMinus.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        opMinus.setText("-");
        opMinus.setMinimumSize(new java.awt.Dimension(60, 23));
        opMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMinusActionPerformed(evt);
            }
        });
        jPanel1.add(opMinus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit9ActionPerformed
        enterNum("9");
    }//GEN-LAST:event_digit9ActionPerformed

    private void digit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit8ActionPerformed
        enterNum("8");
    }//GEN-LAST:event_digit8ActionPerformed

    private void digit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit7ActionPerformed
        enterNum("7");
    }//GEN-LAST:event_digit7ActionPerformed

    private void digit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit6ActionPerformed
        enterNum("6");
    }//GEN-LAST:event_digit6ActionPerformed

    private void digit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit5ActionPerformed
        enterNum("5");
    }//GEN-LAST:event_digit5ActionPerformed

    private void digit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit4ActionPerformed
        enterNum("4");
    }//GEN-LAST:event_digit4ActionPerformed

    private void digit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit3ActionPerformed
        enterNum("3");
    }//GEN-LAST:event_digit3ActionPerformed

    private void digit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit2ActionPerformed
        enterNum("2");
    }//GEN-LAST:event_digit2ActionPerformed

    private void digit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit1ActionPerformed
        enterNum("1");
    }//GEN-LAST:event_digit1ActionPerformed

    private void digit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit0ActionPerformed
        enterNum("0");
    }//GEN-LAST:event_digit0ActionPerformed

    private void bckspcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckspcBtnActionPerformed
        String backspace = null;
        
        if (textField.getText().length() > 0) {
            StringBuilder sb = new StringBuilder(textField.getText());
            
            sb.deleteCharAt(textField.getText().length() - 1);
            backspace = sb.toString();
            textField.setText(backspace);
        }
    }//GEN-LAST:event_bckspcBtnActionPerformed

    private void ceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceBtnActionPerformed
        textField.setText("");
        
        String firstNum, secondNum;
        
        firstNum = String.valueOf(enterNum1);
        secondNum = String.valueOf(enterNum2);
        
        firstNum = "";
        secondNum = "";
    }//GEN-LAST:event_ceBtnActionPerformed

    private void cBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBtnActionPerformed
        textField.setText("");
    }//GEN-LAST:event_cBtnActionPerformed

    private void plusminusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusBtnActionPerformed
        double pmNum = Double.parseDouble(String.valueOf(textField.getText()));
        
        pmNum = pmNum * (-1);
        textField.setText(String.valueOf(pmNum));
    }//GEN-LAST:event_plusminusBtnActionPerformed

    private void opMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMultiplyActionPerformed
        enterNum1 = Double.parseDouble(textField.getText());
        
        textField.setText("");
        operator = "*";
    }//GEN-LAST:event_opMultiplyActionPerformed

    private void opPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPlusActionPerformed
        enterNum1 = Double.parseDouble(textField.getText());
        
        textField.setText("");
        operator = "+";
    }//GEN-LAST:event_opPlusActionPerformed

    private void opDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDivideActionPerformed
        enterNum1 = Double.parseDouble(textField.getText());
        
        textField.setText("");
        operator = "/";
    }//GEN-LAST:event_opDivideActionPerformed

    private void opMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMinusActionPerformed
        enterNum1 = Double.parseDouble(textField.getText());
        
        textField.setText("");
        operator = "-";
    }//GEN-LAST:event_opMinusActionPerformed

    private void pointBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointBtnActionPerformed
        if (!textField.getText().contains(".")) {
            textField.setText(textField.getText() + pointBtn.getText());
        }
    }//GEN-LAST:event_pointBtnActionPerformed

    private void equalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsBtnActionPerformed
        enterNum2 = Double.parseDouble(textField.getText());
        
        if (operator == "*") {
            result = enterNum1 * enterNum2;
            textField.setText(String.valueOf(result));
        } else if (operator == "+") {
            result = enterNum1 + enterNum2;
            textField.setText(String.valueOf(result));
        } else if (operator == "/") {
            result = enterNum1 / enterNum2;
            textField.setText(String.valueOf(result));
        } else if (operator == "-") {
            result = enterNum1 - enterNum2;
            textField.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_equalsBtnActionPerformed
    
    private void enterNum(String dgit) {
        String num = textField.getText() + dgit;
        textField.setText(num);
    }
    
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckspcBtn;
    private javax.swing.JButton cBtn;
    private javax.swing.JButton ceBtn;
    private javax.swing.JButton digit0;
    private javax.swing.JButton digit1;
    private javax.swing.JButton digit2;
    private javax.swing.JButton digit3;
    private javax.swing.JButton digit4;
    private javax.swing.JButton digit5;
    private javax.swing.JButton digit6;
    private javax.swing.JButton digit7;
    private javax.swing.JButton digit8;
    private javax.swing.JButton digit9;
    private javax.swing.JButton equalsBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton opDivide;
    private javax.swing.JButton opMinus;
    private javax.swing.JButton opMultiply;
    private javax.swing.JButton opPlus;
    private javax.swing.JButton plusminusBtn;
    private javax.swing.JButton pointBtn;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
