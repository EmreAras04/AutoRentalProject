package com.exemple.vue;

import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RegisterCustomer extends javax.swing.JFrame {

   
    // Importation des bibliothèque pour DB
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    private void ConnectDB() 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/projectjava","root","");
            System.out.println("Connected to Database");
            
        }
        catch(Exception e)
        {
            
            // if we have an error
            e.printStackTrace();   
            
        }
    }
    
    
    private void SaveTable1()
{
    String [] customer = {"Username", "Password", "Surname", "Firstname","phone","email","location", "member","typemember", "amount","qsecurity"};

    String [] vue = new String[12];

    DefaultTableModel model = new DefaultTableModel(null,customer);

    String sql = "SELECT * FROM customer";
    try{
        ConnectDB();
        Statement stmt = con.createStatement();

        rs = stmt.executeQuery(sql);

        // Condition pour afficher les données
        while(rs.next())
        {
            vue[0] = rs.getString("Username");
            vue[1] = rs.getString("Password");
            vue[2] = rs.getString("Surname");
            vue[3] = rs.getString("Firstname");
            vue[4] = rs.getString("phone");
            vue[5] = rs.getString("email");
            vue[6] = rs.getString("location");
            vue[7] = rs.getString("member");
            vue[8] = rs.getString("typemember");
            vue[9] = rs.getString("amount");
            vue[9] = rs.getString("qsecurity");
            model.addRow(vue);
        }
        // Fermer la connexion à la base de données après la boucle while
        con.close();

        rs.close();
        stmt.close();

    }
    catch(SQLException  e)
    {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
}

    public RegisterCustomer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        txtpsd = new javax.swing.JTextField();
        txtsur = new javax.swing.JTextField();
        txtfir = new javax.swing.JTextField();
        txtpho = new javax.swing.JTextField();
        txtema = new javax.swing.JTextField();
        txtloc = new javax.swing.JTextField();
        txtmem = new javax.swing.JTextField();
        txttyp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQuestion = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Surname");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("First-name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Phone");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("e-mail");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Location");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Member ( 1 or 0 )");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Type ( PRO , PAR, nothing )");

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jLabel10.setText("Security Question : What is your favorite animal ?");

        jButton6.setText("HOME");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuestion)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(70, 70, 70)
                        .addComponent(txtema, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(56, 56, 56)
                        .addComponent(txtloc, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69)
                        .addComponent(txtpho, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(42, 42, 42)
                        .addComponent(txtfir, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(txtsur, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(txtuser))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(txtpsd, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtmem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(txttyp, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpsd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtfir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtloc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtmem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            // Methode pour se connecter à la base de donnée
            ConnectDB();
            pst = con.prepareStatement("INSERT INTO customer(Username,Password,Surname,Firstname,phone,email,location,member,typemember,amount,qsecurity)"
                + "value(?,?,?,?,?,?,?,?,?,?,?)");
            
            pst.setString(1, txtuser.getText());
            pst.setString(2, txtpsd.getText());
            pst.setString(3, txtsur.getText());
            pst.setString(4, txtfir.getText());
            pst.setString(5, txtpho.getText());
            pst.setString(6, txtema.getText());
            pst.setString(7, txtloc.getText());
            pst.setString(8, txtmem.getText());
            pst.setString(9, txttyp.getText());
            
            if("".equals(txttyp.getText()))
            {
                pst.setString(10,"0.00");
            }
            else switch (txttyp.getText()) {
                case "PRO" -> pst.setString(10,"10.00");
                case "PAR" -> pst.setString(10,"5.00");
                default -> pst.setString(10,"0.00");
            }
            pst.setString(11, txtQuestion.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Your account has been created, please check your e-mail for verification of your account");
            SaveTable1();
        
            final String username = "aras.mohaemre@gmail.com";
            final String password = "xcmlxhkrpglktjde";

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");

            Session session = Session.getInstance(props,
              new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });

            try {

                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(username));
                message.setRecipients(
                  Message.RecipientType.TO,
                  InternetAddress.parse(txtema.getText())
                );
                message.setSubject("Registration Confirmation");
                message.setText("Dear User,\n\nThank you for registering with us. Your account has been created successfully. Please check your email for verification of your account.\n\nBest regards,\nThe Admin Team");

                Transport.send(message);

                JOptionPane.showMessageDialog(null,"Email sent successfully.");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            } catch(Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            
        
        /*
        final String username = "aras.muhammed@outlook.com";
        final String password = "";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(txtema.getText()));
            message.setSubject("Registration Confirmation");
            message.setText("Dear User,\n\nThank you for registering with us. Your account has been created successfully. Please check your email for verification of your account.\n\nBest regards,\nThe Admin Team");

            Transport.send(message);

            System.out.println("E-mail envoyé avec succès.");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        */
        } catch (SQLException ex) {
            Logger.getLogger(RegisterCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       PanelToLogin ptl = new PanelToLogin();
       this.dispose();
       
       ptl.setVisible(true);
       
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegisterCustomer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtQuestion;
    private javax.swing.JTextField txtema;
    private javax.swing.JTextField txtfir;
    private javax.swing.JTextField txtloc;
    private javax.swing.JTextField txtmem;
    private javax.swing.JTextField txtpho;
    private javax.swing.JTextField txtpsd;
    private javax.swing.JTextField txtsur;
    private javax.swing.JTextField txttyp;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
