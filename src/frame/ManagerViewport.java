/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import com.marina.entity.creditprogram.CreditProgram;
import com.marina.entity.order.Order;
import controller.CreditProgramController;
import controller.OrderController;
import java.util.ArrayList;
import javax.swing.JTabbedPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marik
 */
public class ManagerViewport extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    protected ArrayList<CreditProgram> creditProgramsList;
    protected ArrayList<Order> newOrdersList;
    protected ArrayList<Order> ordersList;
    protected ArrayList<Order> declinedOdersList;
    protected ArrayList<Order> acceptedOdersList;

    protected DefaultTableModel creditProgramTableModel;
    protected DefaultTableModel newOrdersTableModel;
    protected DefaultTableModel acceptedTableModel;
    protected DefaultTableModel declinedTableModel;

    protected CreditProgramController creditProgramController = new CreditProgramController();
    protected OrderController orderController = new OrderController();

    /**
     * Creates new form ManagerForm
     */
    public ManagerViewport() {
        initComponents();
        creditProgramTableModel = (DefaultTableModel) creditProgramsTable.getModel();
        newOrdersTableModel = (DefaultTableModel) newOrdersTable.getModel();
        acceptedTableModel = (DefaultTableModel) acceptedOrdersTable.getModel();
        declinedTableModel = (DefaultTableModel) declinedOrdersTable.getModel();
        fillCreditProgramTable();

        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managersPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newOrdersTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        creditProgramsTable = new javax.swing.JTable();
        updateCreditProgramsButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newOrdersTable = new javax.swing.JTable();
        acceptButton = new javax.swing.JButton();
        declineButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        acceptedOrdersTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        declinedOrdersTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager's frame");

        jLabel1.setText("Manager's frame");

        newOrdersTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                newOrdersTabStateChanged(evt);
            }
        });

        creditProgramsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Short description", "Full description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        creditProgramsTable.setPreferredSize(new java.awt.Dimension(225, 200));
        jScrollPane3.setViewportView(creditProgramsTable);

        updateCreditProgramsButton.setText("Update list");
        updateCreditProgramsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCreditProgramsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addComponent(updateCreditProgramsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(updateCreditProgramsButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 44, Short.MAX_VALUE)))
        );

        newOrdersTab.addTab("Credit programs", jPanel1);

        newOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title", "Client ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(newOrdersTable);
        if (newOrdersTable.getColumnModel().getColumnCount() > 0) {
            newOrdersTable.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        acceptButton.setText("Accept");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        declineButton.setText("Decline");
        declineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(declineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton)
                    .addComponent(declineButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        newOrdersTab.addTab("New orders", jPanel2);

        acceptedOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title", "Client ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(acceptedOrdersTable);
        if (acceptedOrdersTable.getColumnModel().getColumnCount() > 0) {
            acceptedOrdersTable.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        newOrdersTab.addTab("Accepted orders", jPanel3);

        declinedOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Title", "Client ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(declinedOrdersTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        newOrdersTab.addTab("Declined orders", jPanel4);

        javax.swing.GroupLayout managersPanelLayout = new javax.swing.GroupLayout(managersPanel);
        managersPanel.setLayout(managersPanelLayout);
        managersPanelLayout.setHorizontalGroup(
            managersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(managersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newOrdersTab))
                .addContainerGap())
        );
        managersPanelLayout.setVerticalGroup(
            managersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newOrdersTab, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(managersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newOrdersTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_newOrdersTabStateChanged
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        int index = sourceTabbedPane.getSelectedIndex();
        if (index == 1) {
            fillNewOrderTable();
        } else if (index == 2) {
            fillAcceptedOrderTable();
        } else if (index == 3) {
            fillDeclinedOrderTable();
        }
    }//GEN-LAST:event_newOrdersTabStateChanged

    private void updateCreditProgramsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCreditProgramsButtonActionPerformed
        fillCreditProgramTable();
    }//GEN-LAST:event_updateCreditProgramsButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        int selectedRow = newOrdersTable.getSelectedRow();
        System.out.println("----------------- Selected row: " + selectedRow);
        Order order = newOrdersList.get(selectedRow);
        System.out.println("----------------- order: " + order);
        System.out.println("----------------- orderList: \\n" + order);
        orderController.updateStatusAccepted(order);

        fillNewOrderTable();
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void declineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineButtonActionPerformed
        int selectedRow = newOrdersTable.getSelectedRow();
        Order order = newOrdersList.get(selectedRow);
        orderController.updateStatusDeclined(order);

        fillNewOrderTable();
    }//GEN-LAST:event_declineButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JTable acceptedOrdersTable;
    private javax.swing.JTable creditProgramsTable;
    private javax.swing.JButton declineButton;
    private javax.swing.JTable declinedOrdersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel managersPanel;
    private javax.swing.JTabbedPane newOrdersTab;
    private javax.swing.JTable newOrdersTable;
    private javax.swing.JButton updateCreditProgramsButton;
    // End of variables declaration//GEN-END:variables

    private void fillCreditProgramTable() {
        creditProgramTableModel.setNumRows(0);
        creditProgramsList = creditProgramController.getCreditProgramsList();
        for (CreditProgram cp : creditProgramsList) {
            creditProgramTableModel.insertRow(creditProgramsTable.getRowCount(), new Object[]{cp.getTitle(), cp.getShortDescription(), cp.getFullDescription()});
        }
    }

    private void fillNewOrderTable() {
        newOrdersTableModel.setNumRows(0);
        newOrdersList = fillList(orderController.getManagersOrdersList(), 2);

        int i = 1;
        for (Order order : newOrdersList) {
            newOrdersTableModel.insertRow(newOrdersTable.getRowCount(), new Object[]{i++, order.getTitle(), order.getClientName() + " " + order.getClientSurname()});
        }
    }

    private void fillAcceptedOrderTable() {
        acceptedTableModel.setNumRows(0);
        acceptedOdersList = fillList(orderController.getManagersOrdersList(), 3);

        int i = 1;
        for (Order order : acceptedOdersList) {
            acceptedTableModel.insertRow(acceptedOrdersTable.getRowCount(), new Object[]{i++, order.getTitle(), order.getClientName() + " " + order.getClientSurname()});
        }
    }

    private void fillDeclinedOrderTable() {
        declinedTableModel.setNumRows(0);
        declinedOdersList = fillList(orderController.getManagersOrdersList(), 3);

        int i = 1;
        for (Order order : declinedOdersList) {
            declinedTableModel.insertRow(declinedOrdersTable.getRowCount(), new Object[]{i++, order.getTitle(), order.getClientName() + " " + order.getClientSurname()});
        }
    }

    private ArrayList<Order> fillList(ArrayList<Order> list, int statusId) {
        ArrayList<Order> tmpList = new ArrayList<>();
        for (Order order : list) {
            if (order.getStatusID() == statusId) {
                tmpList.add(order);
            }
        }
        return tmpList;
    }

}
