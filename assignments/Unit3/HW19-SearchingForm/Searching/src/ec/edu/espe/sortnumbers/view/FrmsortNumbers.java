/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sortnumbers.view;


import javax.swing.JOptionPane;

/**
 *
 * @author BIOSTAR
 */
public class FrmsortNumbers extends javax.swing.JFrame {

    /**
     * Creates new form FrmsortNumbers
     */
    public FrmsortNumbers() {
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

        sortNumber = new javax.swing.JLabel();
        Firstnumber = new javax.swing.JLabel();
        secondNumber = new javax.swing.JLabel();
        thirdNumber = new javax.swing.JLabel();
        fourthNumber = new javax.swing.JLabel();
        fifthNumber = new javax.swing.JLabel();
        sixthNumber = new javax.swing.JLabel();
        txtnumber1 = new javax.swing.JTextField();
        txtnumber2 = new javax.swing.JTextField();
        txtnumber3 = new javax.swing.JTextField();
        txtnumber4 = new javax.swing.JTextField();
        txtnumber5 = new javax.swing.JTextField();
        txtnumber6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sortNumber.setText("SORT NUMBERS");

        Firstnumber.setText("Enter the first number:");

        secondNumber.setText("Enter the second number:");

        thirdNumber.setText("Enter the third number:");

        fourthNumber.setText("Enter the fourth number:");

        fifthNumber.setText("Enter the fifth number:");

        sixthNumber.setText("Enter the sixth number:");

        txtnumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumber1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Firstnumber)
                    .addComponent(secondNumber)
                    .addComponent(thirdNumber)
                    .addComponent(fourthNumber)
                    .addComponent(fifthNumber)
                    .addComponent(sixthNumber))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortNumber)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtnumber6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(txtnumber5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnumber4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnumber3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnumber2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtnumber1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sortNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Firstnumber)
                    .addComponent(txtnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secondNumber)
                    .addComponent(txtnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thirdNumber)
                    .addComponent(txtnumber3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourthNumber)
                    .addComponent(txtnumber4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fifthNumber)
                    .addComponent(txtnumber5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sixthNumber)
                    .addComponent(txtnumber6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumber1ActionPerformed
       int number1;
       int number2;
       int number3;
       int number4;
       int number5;
       int number6;
       String data;
       
       
      number1=Integer.parseInt(txtnumber1.getText());
      number2=Integer.parseInt(txtnumber2.getText());
      number3=Integer.parseInt(txtnumber3.getText());
      number4=Integer.parseInt(txtnumber4.getText());
      number5=Integer.parseInt(txtnumber5.getText());
      number6=Integer.parseInt(txtnumber6.getText());
      data = number1 + " , " + number2 + " , " + number3 + " , " + number4 + " , " + number5 + " , " + number6; 
      
        JOptionPane.showMessageDialog(null, data);
        
      
        
       
    }//GEN-LAST:event_txtnumber1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmsortNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmsortNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmsortNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmsortNumbers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmsortNumbers().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Firstnumber;
    private javax.swing.JLabel fifthNumber;
    private javax.swing.JLabel fourthNumber;
    private javax.swing.JLabel secondNumber;
    private javax.swing.JLabel sixthNumber;
    private javax.swing.JLabel sortNumber;
    private javax.swing.JLabel thirdNumber;
    private javax.swing.JTextField txtnumber1;
    private javax.swing.JTextField txtnumber2;
    private javax.swing.JTextField txtnumber3;
    private javax.swing.JTextField txtnumber4;
    private javax.swing.JTextField txtnumber5;
    private javax.swing.JTextField txtnumber6;
    // End of variables declaration//GEN-END:variables
}
