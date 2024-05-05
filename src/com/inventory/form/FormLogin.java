
package com.inventory.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import com.inventory.dao.UsersDAO;
import com.inventory.main.FormMenuUtama;
import com.inventory.model.ModelUsers;
import com.inventory.menu.LightDarkMode;
import com.inventory.service.ServiceUsers;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;


public class FormLogin extends javax.swing.JPanel {

    private ServiceUsers servis = new UsersDAO();

    
    private  LightDarkMode lightDarkMode;

    
    public FormLogin() {
        initComponents();
        setLayoutForm();
        
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Silahkan Masukan Username Anda");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Silahkan Masukan Password Anda");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbTitle1 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnLogin.setBackground(new java.awt.Color(255, 255, 255));

        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Sistem Informasi Inventory Barang");

        lbTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle1.setText("PT. Dantesco Kori Agung");

        lbUser.setText("Username");

        lbPass.setText("Password");

        txtUsername.setBackground(new java.awt.Color(250, 250, 250));
        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(250, 250, 250));
        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/icon/logoDashboard2.png"))); // NOI18N

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(258, 258, 258))
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbUser)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPass)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnLogin)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle1)
                .addGap(18, 18, 18)
                .addComponent(lbUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnLogin)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void setLayoutForm(){
        lightDarkMode = new LightDarkMode();
        setLayout(new FormLoginLayout());
        pnLogin.setLayout(new LoginLayout());
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "font:h1.font");
        pnLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Login.background;"
                + "arc:20;"
                + "border:30,40,50,30");
        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true;"
                + "showCapsLock:true");
        btnLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        add(lightDarkMode);
    }
    
    private class FormLoginLayout implements LayoutManager{

        @Override
        public void addLayoutComponent(String name, Component comp) {
            
        }

        @Override
        public void removeLayoutComponent(Component comp) {
           
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()){
                return new Dimension(0, 0);
            }
        }    

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()){
                return new Dimension(0, 0);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()){
                int xx = 50;
                int yy = 20;
                int zz = 200;
                lightDarkMode.setBounds(xx,yy,zz, lightDarkMode.getPreferredSize().height);
                int width = parent.getWidth();
                int height = parent.getHeight();
                int loginWidth = UIScale.scale(400);
                int loginHeight = pnLogin.getPreferredSize().height;
                int x = (width - loginWidth) / 2;
                int y = (height - loginHeight) / 2;
                pnLogin.setBounds(x, y, loginWidth, loginHeight);
            }
        }
        
    
    }
    
    private class LoginLayout implements LayoutManager{
        
        
        private final int titleGap = 10;
        private final int title1Gap = 10;
        private final int textGap = 10;
        private final int labelGap = 10;
        private final int buttonGap = 50;

        @Override
        public void addLayoutComponent(String name, Component comp) {
            
        }

        @Override
        public void removeLayoutComponent(Component comp) {
            
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                Insets insets = parent.getInsets();
                int height = insets.top + insets.bottom;
                
                
                height += lbLogo.getPreferredSize().height;
                height += UIScale.scale(titleGap);
                height += lbTitle.getPreferredSize().height;
                height += UIScale.scale(titleGap);
                height += lbTitle1.getPreferredSize().height;
                height += UIScale.scale(titleGap);
                height += lbUser.getPreferredSize().height;
                height += UIScale.scale(labelGap);
                height += txtUsername.getPreferredSize().height;
                height += UIScale.scale(textGap);
                
                height += lbPass.getPreferredSize().height;
                height += UIScale.scale(labelGap);
                height += txtPassword.getPreferredSize().height;
                height += UIScale.scale(buttonGap);
                height += btnLogin.getPreferredSize().height;
                return new Dimension(0, height);
                
                
                
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0, 0);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                Insets insets = parent.getInsets();
                int x = insets.left;
                int y = insets.top;
                int width = parent.getWidth() - (insets.left + insets.right);

                
                lbLogo.setBounds(x, y, width, lbLogo.getPreferredSize().height);
                y += lbLogo.getPreferredSize().height + UIScale.scale(titleGap);
                
                lbTitle.setBounds(x, y, width, lbTitle.getPreferredSize().height);
                y += lbTitle.getPreferredSize().height + UIScale.scale(titleGap);
                
                lbTitle1.setBounds(x, y, width, lbTitle1.getPreferredSize().height);
                y += lbTitle1.getPreferredSize().height + UIScale.scale(titleGap);

                lbUser.setBounds(x, y, width, lbUser.getPreferredSize().height);
                y += lbUser.getPreferredSize().height + UIScale.scale(labelGap);
                txtUsername.setBounds(x, y, width, txtUsername.getPreferredSize().height);
                y += txtUsername.getPreferredSize().height + UIScale.scale(textGap);

                lbPass.setBounds(x, y, width, lbPass.getPreferredSize().height);
                y += lbPass.getPreferredSize().height + UIScale.scale(labelGap);
                txtPassword.setBounds(x, y, width, txtPassword.getPreferredSize().height);
                y += txtPassword.getPreferredSize().height + UIScale.scale(buttonGap);

                btnLogin.setBounds(x, y, width, btnLogin.getPreferredSize().height);
            }
        }
    
    
    }
    
    private boolean inputValidation(String[] inputs){
        boolean valid = true;
        for (String input : inputs) {
            if (input.trim().isEmpty()){
                valid = false;
            }
        }
        if(!valid) {
          JOptionPane.showMessageDialog(null, "Username atau Password tidak boleh kosong");
        }
        return valid;
    }
     
    private boolean login(){
        String username = txtUsername.getText();
        char[] passwordChars = txtPassword.getPassword();

        String password = new String(passwordChars);
        String[] inputs = {username, password};
        if(!inputValidation(inputs)) return false;
        //System.out.println("MASUK LOGIN");
        
        boolean loginService = servis.login(username, password);
        if(loginService) {
           JOptionPane.showMessageDialog(null, "Berhasil login!");
           FormMenuUtama.login();
        } else {
            JOptionPane.showMessageDialog(null, "Username atau Password salah!");
        }
        return true;

    }


}
