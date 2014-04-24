package frame;

import client.service.transfer.TransferClient;
import com.marina.entity.creditprogram.CreditProgram;
import com.marina.message.RequestMsg;
import com.marina.message.ResponseMsg;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Форма авторизации
public class LogForm extends javax.swing.JFrame {

    //Создание формы авторизации
    public LogForm() {
        //Инициализация компонентов
        initComponents();
        //Размещение формы
        locateForm();
        //Добавляем слушателя на текстовые поля ввода
        addTextFieldsListener();
    }

    //Инициализация положения и отображение формы
    private void locateForm() {
        setLocation(300, 200);
        setVisible(true);
    }

    //Слушатель на нажатие Enter при вводе
    private void addTextFieldsListener() {
        //Создаем слушателя
        KeyListener keyListener = new KeyAdapter() {

            public void keyPressed(KeyEvent evt) {
                //Вход по нажатию на Enter
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    loginButton.doClick();
                }
            }
        };
        //Добавляем его в компоненты ввода
        loginField.addKeyListener(keyListener);
        passwordField.addKeyListener(keyListener);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLog = new javax.swing.JPanel();
        loginField = new javax.swing.JTextField();
        loginLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        clearFieldsDataButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        creditProgramsInfoPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        creditProgramsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Авторизация");

        panelLog.setBackground(new java.awt.Color(204, 204, 204));
        panelLog.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        loginLabel.setText("Логин:");

        passwordLabel.setText("Пароль:");

        clearFieldsDataButton.setText("Очистить");
        clearFieldsDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsDataButtonActionPerformed(evt);
            }
        });

        loginButton.setText("Вход");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLogLayout = new javax.swing.GroupLayout(panelLog);
        panelLog.setLayout(panelLogLayout);
        panelLogLayout.setHorizontalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordLabel)
                    .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearFieldsDataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(loginField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField))
                .addContainerGap())
        );
        panelLogLayout.setVerticalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(clearFieldsDataButton))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        creditProgramsInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        creditProgramsInfoPanel.setToolTipText("");

        creditProgramsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Название", "Короткое описание", "Полное описание"
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
        jScrollPane1.setViewportView(creditProgramsTable);

        javax.swing.GroupLayout creditProgramsInfoPanelLayout = new javax.swing.GroupLayout(creditProgramsInfoPanel);
        creditProgramsInfoPanel.setLayout(creditProgramsInfoPanelLayout);
        creditProgramsInfoPanelLayout.setHorizontalGroup(
            creditProgramsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditProgramsInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        creditProgramsInfoPanelLayout.setVerticalGroup(
            creditProgramsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creditProgramsInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel1.setText("КРЕДИТНЫЕ ПРОГРАММЫ БАНКА \"СУПЕР БАНК\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(creditProgramsInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditProgramsInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearFieldsDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsDataButtonActionPerformed
        loginField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_clearFieldsDataButtonActionPerformed

    //Авторизация и вход пользователя
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

    }//GEN-LAST:event_loginButtonActionPerformed
    
    private String[][] creditPrograms() {
        RequestMsg msg = TransferClient("CreditProgram.getCreditPrograms", null);
        ArrayList<CreditProgram> programList = (ArrayList<CreditProgram>)msg.getData();
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearFieldsDataButton;
    private javax.swing.JPanel creditProgramsInfoPanel;
    private javax.swing.JTable creditProgramsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginField;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel panelLog;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    // End of variables declaration//GEN-END:variables

    private RequestMsg TransferClient(String creditProgramgetCreditPrograms, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
