package arayüz;

import baglanti.database;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class yonetici_oyuncu_bilgileri extends javax.swing.JPanel {

    database bglnt = new database();
    public Date baslangic = new Date();

    public yonetici_oyuncu_bilgileri() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablo2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bilgiler = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        guncellebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(229, 213, 234));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 24)); // NOI18N
        jLabel1.setText("TABLO BİLGİLERİ ");

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jScrollPane1.setHorizontalScrollBar(null);

        tablo1.setBackground(new java.awt.Color(247, 148, 198));
        tablo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablo1.setGridColor(new java.awt.Color(0, 0, 0));
        tablo1.setShowGrid(true);
        jScrollPane1.setViewportView(tablo1);

        jScrollPane4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jScrollPane4.setHorizontalScrollBar(null);
        jScrollPane4.setViewportView(null);

        tablo2.setBackground(new java.awt.Color(247, 148, 198));
        tablo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablo2.setGridColor(new java.awt.Color(0, 0, 0));
        tablo2.setShowGrid(true);
        jScrollPane4.setViewportView(tablo2);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/yonetici1.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        bilgiler.setBackground(new java.awt.Color(91, 110, 116));
        bilgiler.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        bilgiler.setForeground(new java.awt.Color(255, 255, 255));
        bilgiler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kullanıcı Bilgileri", "Çalışan Bilgileri", "İşletme Bilgileri", "Small Arsa Bilgileri", "Medium Arsa Bilgileri", "Large Arsa Bilgileri", "Oyun Bilgileri" }));
        bilgiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgilerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setText("Veritabanında Güncellemek İstediğiniz İşlemi Seçiniz :");

        guncellebtn.setBackground(new java.awt.Color(91, 110, 116));
        guncellebtn.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        guncellebtn.setForeground(new java.awt.Color(255, 255, 255));
        guncellebtn.setText("Güncelle");
        guncellebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncellebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bilgiler, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bilgiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bilgilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgilerActionPerformed
        String secim;
        yoneticiekran yo = new yoneticiekran("");
        secim = (String) bilgiler.getSelectedItem();
        if (secim.equalsIgnoreCase("Kullanıcı Bilgileri")) {
            yo.yazdirkullanici();

        } else if (secim.equalsIgnoreCase("Large Arsa Bilgileri")) {
            yo.yazdirlarge();

        } else if (secim.equalsIgnoreCase("Small Arsa Bilgileri")) {
            yo.yazdirsmall();

        } else if (secim.equalsIgnoreCase("Medium Arsa Bilgileri")) {
            yo.yazdirmedium();

        } else if (secim.equalsIgnoreCase("Çalışan Bilgileri")) {
            yo.yazdircalisanlar();

        } else if (secim.equalsIgnoreCase("İşletme Bilgileri")) {
            yo.yazdirisletme();

        } else if (secim.equalsIgnoreCase("Oyun Bilgileri")) {
            yo.yazdiroyun();

        }


    }//GEN-LAST:event_bilgilerActionPerformed

    private void guncellebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncellebtnActionPerformed

        String secim, str, alanb;
        int deger, sec, sira;
        int yemek = 0, esya = 0, para = 0;

        yoneticiekran yo = new yoneticiekran("");

        String liste[] = {"Başlangıç Yemek", "Başlangıç Eşya", "Başlangıç Para", "Alan Boyutu", "İşletme Sabit Gelir Oranı", "Başlangıç Tarihi", "Günlük Ücret", "Yemek Ücreti", "Eşya Ücreti"};

        JComboBox cb = new JComboBox(liste);

        sira = JOptionPane.showConfirmDialog(this, cb, "Veritabanında Güncellemek İstediğiniz İşlemi Seçiniz", JOptionPane.DEFAULT_OPTION);
        secim = (String) cb.getSelectedItem();

        Connection c = bglnt.dbcon();
        Statement st = null;
        Statement st2 = null;
        Statement st3 = null;
        Statement st1 = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs1 = null;
        try {
            st = c.createStatement();
            st1 = c.createStatement();
            rs = st.executeQuery("SELECT * FROM oyun_bilgileri");

            while (rs.next()) {

             
                if (secim.equalsIgnoreCase("Başlangıç Yemek")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Değeri Giriniz ");
                    deger = Integer.parseInt(str);
                    st1.executeUpdate("UPDATE oyun_bilgileri SET baslangic_yemek='" + deger + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("Başlangıç Eşya")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Değeri Giriniz ");
                    deger = Integer.parseInt(str);
                    st1.executeUpdate("UPDATE oyun_bilgileri SET baslangic_esya='" + deger + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("Başlangıç Para")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Değeri Giriniz ");
                    deger = Integer.parseInt(str);
                    st1.executeUpdate("UPDATE oyun_bilgileri SET baslangic_para='" + deger + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("Alan Boyutu")) {
                    String alanlar[] = {"Small", "Medium", "Large"};
                    JComboBox cb1 = new JComboBox(alanlar);

                    sec = JOptionPane.showConfirmDialog(this, cb1, "Alan Boyutunu Seçiniz", JOptionPane.DEFAULT_OPTION);
                    alanb = (String) cb1.getSelectedItem();

                    st1.executeUpdate("UPDATE oyun_bilgileri SET alan_boyutu='" + alanb + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("İşletme Sabit Gelir Oranı")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Değeri Giriniz ");
                    deger = Integer.parseInt(str);
                    st1.executeUpdate("UPDATE oyun_bilgileri SET isletme_sabit_gelir_oran='" + deger + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("Başlangıç Tarihi")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Tarihi Giriniz(yyyy-aa-gg)");

                    st1.executeUpdate("UPDATE oyun_bilgileri SET oyun_baslangictarihi='" + str + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Tarih Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("Günlük Ücret")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Değeri Giriniz ");
                    deger = Integer.parseInt(str);

                    st1.executeUpdate("UPDATE oyun_bilgileri SET gunluk_ucret='" + deger + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("Yemek Ücreti")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Değeri Giriniz ");
                    deger = Integer.parseInt(str);

                    st1.executeUpdate("UPDATE oyun_bilgileri SET yemek_ucreti='" + deger + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                } else if (secim.equalsIgnoreCase("Eşya Ücreti")) {
                    str = JOptionPane.showInputDialog("Güncellemek İstediğiniz Yeni Değeri Giriniz ");
                    deger = Integer.parseInt(str);

                    st1.executeUpdate("UPDATE oyun_bilgileri SET esya_ucreti='" + deger + "' WHERE kontrol_id=1");
                    JOptionPane.showMessageDialog(null, "Girdiğiniz Değer Veritabanında Güncellemiştir");

                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(yonetici_oyuncu_bilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st1 = c.createStatement();
            rs1 = st1.executeQuery("SELECT * FROM oyun_bilgileri");
            while (rs1.next()) {

                yemek = rs1.getInt("baslangic_yemek");
                esya = rs1.getInt("baslangic_esya");
                para = rs1.getInt("baslangic_para");
                baslangic = rs1.getDate("oyun_baslangictarihi");
            }
        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            st2 = c.createStatement();
            st3 = c.createStatement();
            rs2 = st2.executeQuery("SELECT * FROM kullanici");
            while (rs2.next()) {
               
                st3.executeUpdate("UPDATE kullanici SET kullanici_yemek='" + yemek + "',kullanici_esya='" + esya + "',kullanici_para='" + para + "',kullanici_baslangictarihi='" + baslangic + "'");
            }
        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                st.close();
                st1.close();
                st2.close();
                st3.close();
                rs.close();
                rs1.close();
                rs2.close();
                c.close();
            } catch (SQLException ex) {
                Logger.getLogger(yonetici_oyuncu_bilgileri.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_guncellebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> bilgiler;
    public javax.swing.JButton guncellebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable tablo1;
    public javax.swing.JTable tablo2;
    // End of variables declaration//GEN-END:variables
}
