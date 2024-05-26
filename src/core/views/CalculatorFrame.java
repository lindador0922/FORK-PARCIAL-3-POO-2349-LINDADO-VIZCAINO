/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package core.views;

import core.models.Calculator;
import core.storage.History;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import core.controllers.AddController;
import core.controllers.SubtractController;
import core.controllers.MultiplyController;
import core.controllers.DivideController;
import core.controllers.PotencyController;
import core.controllers.UpdateController;

import core.storage.History;
import core.controllers.utils.Response;
import core.models.Operation;

/**
 *
 * @author Robert Lindado y Sebastian Vizcaino
 */
public class CalculatorFrame extends javax.swing.JFrame {

    private History history;

    /**
     * Creates new form Calculator
     */
    public CalculatorFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L1Title = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        subtractButton2 = new javax.swing.JButton();
        multiplyButton3 = new javax.swing.JButton();
        divideButton4 = new javax.swing.JButton();
        potencyButton5 = new javax.swing.JButton();
        clearButton6 = new javax.swing.JButton();
        updateButton7 = new javax.swing.JButton();
        number1TextField1 = new javax.swing.JTextField();
        number2TextField2 = new javax.swing.JTextField();
        L2Title = new javax.swing.JLabel();
        L3Title = new javax.swing.JLabel();
        L4Title = new javax.swing.JLabel();
        historyScrollPanel = new javax.swing.JScrollPane();
        historyList = new javax.swing.JList<>();
        resultTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L1Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        L1Title.setText("Calculator");

        addButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton1.setText("Add");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        subtractButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subtractButton2.setText("Subtract");
        subtractButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButton2ActionPerformed(evt);
            }
        });

        multiplyButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        multiplyButton3.setText("Multiply");
        multiplyButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButton3ActionPerformed(evt);
            }
        });

        divideButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divideButton4.setText("Divide");
        divideButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButton4ActionPerformed(evt);
            }
        });

        potencyButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        potencyButton5.setText("Potency");
        potencyButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potencyButton5ActionPerformed(evt);
            }
        });

        clearButton6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        clearButton6.setText("Clear numbers");
        clearButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButton6ActionPerformed(evt);
            }
        });

        updateButton7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        updateButton7.setText("Update history");
        updateButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton7ActionPerformed(evt);
            }
        });

        number1TextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        number2TextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L2Title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L2Title.setText("Number 1");

        L3Title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L3Title.setText("Number 2");

        L4Title.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L4Title.setText("Result");

        historyList.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        historyList.setEnabled(false);
        historyScrollPanel.setViewportView(historyList);

        resultTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultTextField3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(L4Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L2Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L3Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(number1TextField1)
                            .addComponent(number2TextField2)
                            .addComponent(resultTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(potencyButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplyButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(addButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtractButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(divideButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(historyScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(L1Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L1Title)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2Title)
                    .addComponent(number1TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L3Title)
                            .addComponent(number2TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L4Title)
                            .addComponent(resultTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton1)
                            .addComponent(subtractButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divideButton4)
                            .addComponent(multiplyButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencyButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton6))
                    .addComponent(historyScrollPanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        // TODO add your handling code here:
        String number1 = number1TextField1.getText();
        String number2 = number2TextField2.getText();

        Response response = AddController.add(number1, number2);

        int status = response.getStatus();
        String message = response.getMessage();

        if (status >= 500) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, "Response Message", JOptionPane.INFORMATION_MESSAGE);

            double result = (double) response.getObject();
            resultTextField3.setText("" + result);
        }
    }//GEN-LAST:event_addButton1ActionPerformed

    private void subtractButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButton2ActionPerformed
        // TODO add your handling code here:
        String number1 = number1TextField1.getText();
        String number2 = number2TextField2.getText();

        Response response = SubtractController.subtract(number1, number2);

        int status = response.getStatus();
        String message = response.getMessage();

        if (status >= 500) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, "Response Message", JOptionPane.INFORMATION_MESSAGE);

            double result = (double) response.getObject();
            resultTextField3.setText("" + result);
        }
    }//GEN-LAST:event_subtractButton2ActionPerformed

    private void multiplyButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButton3ActionPerformed
        // TODO add your handling code here:
        String number1 = number1TextField1.getText();
        String number2 = number2TextField2.getText();

        Response response = MultiplyController.multiply(number1, number2);

        int status = response.getStatus();
        String message = response.getMessage();

        if (status >= 500) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, "Response Message", JOptionPane.INFORMATION_MESSAGE);

            double result = (double) response.getObject();
            resultTextField3.setText("" + result);
        }
    }//GEN-LAST:event_multiplyButton3ActionPerformed

    private void divideButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButton4ActionPerformed
        // TODO add your handling code here:
        String number1 = number1TextField1.getText();
        String number2 = number2TextField2.getText();

        Response response = DivideController.divide(number1, number2);

        int status = response.getStatus();
        String message = response.getMessage();

        if (status >= 500) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, "Response Message", JOptionPane.INFORMATION_MESSAGE);

            double result = (double) response.getObject();
            resultTextField3.setText("" + result);
        }
    }//GEN-LAST:event_divideButton4ActionPerformed

    private void potencyButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potencyButton5ActionPerformed
        // TODO add your handling code here:
        String number1 = number1TextField1.getText();
        String number2 = number2TextField2.getText();

        Response response = PotencyController.potency(number1, number2);

        int status = response.getStatus();
        String message = response.getMessage();

        if (status >= 500) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.ERROR_MESSAGE);
        } else if (response.getStatus() >= 400) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, "Response Message", JOptionPane.INFORMATION_MESSAGE);

            double result = (double) response.getObject();
            resultTextField3.setText("" + result);
        }
    }//GEN-LAST:event_potencyButton5ActionPerformed

    private void clearButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButton6ActionPerformed
        // TODO add your handling code here:
        number1TextField1.setText("");
        number2TextField2.setText("");
        resultTextField3.setText("");
    }//GEN-LAST:event_clearButton6ActionPerformed

    private void updateButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton7ActionPerformed
        // TODO add your handling code here:
        Response response = UpdateController.readHistory();

        int status = response.getStatus();
        String message = response.getMessage();

        if (status >= 500) {
            JOptionPane.showMessageDialog(null, message, "Error " + status, JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, message, "Response Message", JOptionPane.INFORMATION_MESSAGE);

            ArrayList<Operation> recentHistory = (ArrayList<Operation>) response.getObject();

            DefaultListModel model = new DefaultListModel();
            model.addAll(recentHistory);
            historyList.setModel(model);
        }

        //
    }//GEN-LAST:event_updateButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1Title;
    private javax.swing.JLabel L2Title;
    private javax.swing.JLabel L3Title;
    private javax.swing.JLabel L4Title;
    private javax.swing.JButton addButton1;
    private javax.swing.JButton clearButton6;
    private javax.swing.JButton divideButton4;
    private javax.swing.JList<String> historyList;
    private javax.swing.JScrollPane historyScrollPanel;
    private javax.swing.JButton multiplyButton3;
    private javax.swing.JTextField number1TextField1;
    private javax.swing.JTextField number2TextField2;
    private javax.swing.JButton potencyButton5;
    private javax.swing.JTextField resultTextField3;
    private javax.swing.JButton subtractButton2;
    private javax.swing.JButton updateButton7;
    // End of variables declaration//GEN-END:variables
}
