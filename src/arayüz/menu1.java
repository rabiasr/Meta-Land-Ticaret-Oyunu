package arayüz;

import javax.swing.JOptionPane;
import java.sql.*;
import baglanti.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import veritabani.Kullanici;

import veritabani.Yonetici;

public class menu1 extends javax.swing.JFrame {

    private database bglnt = new database();
    int sec;
    String secim;

    public menu1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yoneticiidtxt = new javax.swing.JTextField();
        yoneticigirisbtn = new javax.swing.JButton();
        yoneticisifretxt = new javax.swing.JPasswordField();
        arsasecbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        kullaniciidtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kullanicisifretxt = new javax.swing.JPasswordField();
        kullanicigirisbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("META-LAND");
        setBackground(new java.awt.Color(102, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        jLabel2.setText("   Meta-Land Ticaret Oyununa Hosgeldiniz");

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jTabbedPane1.setInheritsPopupMenu(true);
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setNextFocusableComponent(jTabbedPane1);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setInheritsPopupMenu(true);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Yönetici ID : ");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("Şifre :");

        yoneticiidtxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        yoneticiidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticiidtxtActionPerformed(evt);
            }
        });

        yoneticigirisbtn.setText("GİRİŞ");
        yoneticigirisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticigirisbtnActionPerformed(evt);
            }
        });

        yoneticisifretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticisifretxtActionPerformed(evt);
            }
        });

        arsasecbtn.setText("ARSA SEÇ");
        arsasecbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsasecbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(yoneticiidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(yoneticisifretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(arsasecbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yoneticigirisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addComponent(yoneticiidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(yoneticisifretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arsasecbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yoneticigirisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Yönetici Giriş", jPanel1);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setInheritsPopupMenu(false);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Oyuncu ID : ");

        kullaniciidtxt.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        kullaniciidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciidtxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Şifre :");

        kullanicisifretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicisifretxtActionPerformed(evt);
            }
        });

        kullanicigirisbtn.setText("GİRİŞ");
        kullanicigirisbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicigirisbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(kullaniciidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(kullanicisifretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kullanicigirisbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(494, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5))
                    .addComponent(kullaniciidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(kullanicisifretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(kullanicigirisbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Oyuncu Giriş", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(814, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void arsasecbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsasecbtnActionPerformed
        Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
        if (yoneticiidtxt.getText().length() == 0 || yoneticisifretxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Lütfen Boş Alanları Doldurunuz!");
            yoneticiidtxt.setText("");
            yoneticisifretxt.setText("");
        } else {

            try {

                st = c.createStatement();
                rs = st.executeQuery("SELECT * FROM yonetici");
                while (rs.next()) {
                    if ((yoneticiidtxt.getText().equalsIgnoreCase(rs.getString("yonetici_no")) && (yoneticisifretxt.getText().equalsIgnoreCase(rs.getString("yonetici_sifre"))))) {
                        Yonetici yonetici = new Yonetici();
                        yonetici.setYonetici_no(rs.getInt("yonetici_no"));
                        yonetici.setYonetici_sifre(rs.getString("yonetici_sifre"));
                        alan arsa;

                        String alanlar[] = {"Small", "Medium", "Large"};
                        JComboBox cb = new JComboBox(alanlar);

                        sec = JOptionPane.showConfirmDialog(this, cb, "Alan Boyutunu Seçiniz", JOptionPane.DEFAULT_OPTION);
                        secim = (String) cb.getSelectedItem();

                        yoneticiidtxt.setText("");
                        yoneticisifretxt.setText("");
                        Statement st1 = c.createStatement();
                        st1.executeUpdate("UPDATE oyun_bilgileri SET alan_boyutu='" + secim + "'  WHERE kontrol_id=1");

                    } else {
                        JOptionPane.showMessageDialog(null, "Yönetici Bilgileri Yanlış! Lütfen Tekrar Giriniz.");
                        yoneticiidtxt.setText("");
                        yoneticisifretxt.setText("");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    c.close();
                    st.close();
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }


    }//GEN-LAST:event_arsasecbtnActionPerformed
    }
    private void yoneticisifretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticisifretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoneticisifretxtActionPerformed

    private void yoneticigirisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticigirisbtnActionPerformed
        Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;

        Statement st1 = null;
        ResultSet rs1 = null;
        try {
            st1 = c.createStatement();

            rs1 = st1.executeQuery("SELECT alan_boyutu FROM oyun_bilgileri");

            while (rs1.next()) {

                secim = rs1.getString("alan_boyutu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (yoneticiidtxt.getText().length() == 0 || yoneticisifretxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Lütfen Boş Alanları Doldurunuz!");
            yoneticiidtxt.setText("");
            yoneticisifretxt.setText("");
        } else //JOptionPane.showMessageDialog(null,"Giris Yapildi!");
        {

            try {
                st = c.createStatement();
                rs = st.executeQuery("SELECT * FROM yonetici");
                while (rs.next()) {
                    if ((yoneticiidtxt.getText().equalsIgnoreCase(rs.getString("yonetici_no")) && (yoneticisifretxt.getText().equalsIgnoreCase(rs.getString("yonetici_sifre"))))) {
                        Yonetici yonetici = new Yonetici();
                        yonetici.setYonetici_no(rs.getInt("yonetici_no"));
                        yonetici.setYonetici_sifre(rs.getString("yonetici_sifre"));
                        yoneticiidtxt.setText("");
                        yoneticisifretxt.setText("");

                        yoneticiekran ekran = new yoneticiekran("" + secim + "");
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Yönetici Bilgileri Yanlış! Lütfen Tekrar Giriniz.");
                        yoneticiidtxt.setText("");
                        yoneticisifretxt.setText("");

                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    c.close();
                    st.close();
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }//GEN-LAST:event_yoneticigirisbtnActionPerformed

    private void yoneticiidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticiidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yoneticiidtxtActionPerformed

    private void kullaniciidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciidtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullaniciidtxtActionPerformed

    private void kullanicisifretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicisifretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kullanicisifretxtActionPerformed

    private void kullanicigirisbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicigirisbtnActionPerformed
        Connection c = bglnt.dbcon();
        Connection c1 = bglnt.dbcon();
        Statement st = null;
        alan arsa = null;

        Statement st1 = null;
        Statement st2 = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;

        boolean flag = false;
        Kullanici kullanici = new Kullanici();

        if (kullaniciidtxt.getText().length() == 0 || kullanicisifretxt.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Lütfen Boş Alanları Doldurunuz!");
            kullaniciidtxt.setText("");
            kullanicisifretxt.setText("");
        } else {

            try {

                st = c.createStatement();
                rs = st.executeQuery("SELECT * FROM kullanici");

                st1 = c.createStatement();

                rs1 = st1.executeQuery("SELECT alan_boyutu FROM oyun_bilgileri ");

                while (rs.next()) {
                    if ((kullaniciidtxt.getText().equalsIgnoreCase(rs.getString("kullanici_no")) && (kullanicisifretxt.getText().equalsIgnoreCase(rs.getString("kullanici_sifre"))))) {
                        flag = true;

                        kullanici.setKullanici_no(rs.getInt("kullanici_no"));
                        kullanici.setKullanici_ad(rs.getString("kullanici_ad"));
                        kullanici.setKullanici_soyad(rs.getString("kullanici_soyad"));
                        kullanici.setKullanici_sifre(rs.getString("kullanici_sifre"));
                        kullanici.setKullanici_yemek(rs.getInt("kullanici_yemek"));
                        kullanici.setKullanici_esya(rs.getInt("kullanici_esya"));
                        kullanici.setKullanici_para(rs.getInt("kullanici_para"));
                        kullanici.setKullanici_arsanosahip(rs.getInt("kullanici_arsanosahip"));
                        kullanici.setKullanici_arsanocalis(rs.getInt("kullanici_arsanocalis"));
                        kullanici.setKullanici_calisilacakgun(rs.getInt("kullanici_calisilacakgun"));
                        kullanici.setKullanici_calistigigun(rs.getInt("kullanici_calistigigun"));
                        kullanici.setKullanici_baslangictarihi(rs.getDate("kullanici_baslangictarihi"));
                        kullanici.setKullanici_bitistarihi(rs.getDate("kullanici_bitistarihi"));

                        while (rs1.next()) {

                            if (secim == null && (rs1.getString("alan_boyutu") == null)) {
                                JOptionPane.showMessageDialog(null, "Oyun Alanı Seçilmedi!");

                            }
                            if (sec == JOptionPane.OK_OPTION && (rs1.getString("alan_boyutu") != null)) {
                                switch (rs1.getString("alan_boyutu")) {
                                    case "Small":

                                        arsa = new alan("small");

                                        dispose();
                                        break;
                                    case "Medium":

                                        arsa = new alan("medium");
                                        dispose();
                                        break;
                                    case "Large":

                                        arsa = new alan("large");
                                        dispose();
                                        break;

                                }
                            }
                        }
                        kullaniciidtxt.setText("");
                        kullanicisifretxt.setText("");
                        arsa.kullanicial(kullanici);

                        arsa.oldur();
                        arsa.buton();

                    } else {

                    }

                }
                if (flag == false) {
                    JOptionPane.showMessageDialog(null, "Oyuncu Bilgileri Yanlış! Lütfen Tekrar Giriniz.");
                    kullaniciidtxt.setText("");
                    kullanicisifretxt.setText("");
                }

            } catch (SQLException ex) {
                Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            st2 = c1.createStatement();

            rs2 = st2.executeQuery("SELECT * FROM calisanlar");
            while (rs2.next()) {

                if (kullanici.getKullanici_no() == rs2.getInt("kullanici_id")) {
                    arsa.calismabilgilerial(rs2.getString("kullanici_calisma_saatleri"), rs2.getInt("arsa_no"), rs2.getInt("kullanici_calisma_gün_sayisi"));

                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
               c.close();
                c1.close();
                st.close();
                st1.close();
                rs.close();
                rs1.close();
                st2.close();
                rs2.close();
            } catch (SQLException ex) {
                Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

         
        arsa.calismabilgileri();


    }//GEN-LAST:event_kullanicigirisbtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arsasecbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kullanicigirisbtn;
    private javax.swing.JTextField kullaniciidtxt;
    private javax.swing.JPasswordField kullanicisifretxt;
    private javax.swing.JButton yoneticigirisbtn;
    private javax.swing.JTextField yoneticiidtxt;
    private javax.swing.JPasswordField yoneticisifretxt;
    // End of variables declaration//GEN-END:variables
}
