 
package arayüz;
 
import javax.swing.ImageIcon;
 
public class kullanicipaneli extends javax.swing.JPanel {

    
    public kullanicipaneli() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        yemektxt = new javax.swing.JTextField();
        paratxt = new javax.swing.JTextField();
        esyatxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        calismasaatleritxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        calismayeritxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gunlukkazanctxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        calismasaatleritxt1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        calismayeritxt1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        gunlukkazanctxt1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        calismasaatleritxt3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        calismayeritxt2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        gunlukkazanctxt2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        calismasaatleritxt4 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        calismayeritxt3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        gunlukkazanctxt3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        calismagunsayisitxt = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        baslangictarihitxt = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        bitistarihitxt = new javax.swing.JTextField();
        adsoyad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(203, 242, 250));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel1.setText("KULLANICI PANELİ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/yemeklogo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/paralogo1.png"))); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/esyalogo1.png"))); // NOI18N
        jLabel4.setText("jLabel2");

        yemektxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        yemektxt.setText(" ");
        yemektxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yemektxtActionPerformed(evt);
            }
        });

        paratxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        paratxt.setText(" ");

        esyatxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        esyatxt.setText(" ");

        jPanel1.setBackground(new java.awt.Color(203, 242, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("ÇALIŞMA BİLGİLERİ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 0, 181, 31);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/calismalogo1.png"))); // NOI18N
        jLabel6.setText("jLabel2");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 10, 60, 60);

        calismasaatleritxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismasaatleritxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismasaatleritxtActionPerformed(evt);
            }
        });
        jPanel1.add(calismasaatleritxt);
        calismasaatleritxt.setBounds(150, 30, 270, 20);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel7.setText("Çalışma Saatleri :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 30, 140, 20);

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel8.setText("Çalışma Yeri : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 60, 140, 20);

        calismayeritxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismayeritxt.setText(" ");
        calismayeritxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismayeritxtActionPerformed(evt);
            }
        });
        jPanel1.add(calismayeritxt);
        calismayeritxt.setBounds(150, 60, 270, 20);

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel9.setText("Günlük Kazancı :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 90, 140, 20);

        gunlukkazanctxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        gunlukkazanctxt.setText(" ");
        jPanel1.add(gunlukkazanctxt);
        gunlukkazanctxt.setBounds(150, 90, 270, 20);

        jPanel2.setBackground(new java.awt.Color(203, 242, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setText("ÇALIŞMA BİLGİLERİ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 0, 181, 31);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/calismalogo1.png"))); // NOI18N
        jLabel11.setText("jLabel2");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(513, 7, 60, 60);

        calismasaatleritxt1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismasaatleritxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismasaatleritxt1ActionPerformed(evt);
            }
        });
        jPanel2.add(calismasaatleritxt1);
        calismasaatleritxt1.setBounds(150, 30, 283, 32);

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel12.setText("Çalışma Saatleri :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 30, 137, 30);

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel13.setText("Çalışma Yeri : ");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 70, 138, 30);

        calismayeritxt1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismayeritxt1.setText(" ");
        calismayeritxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismayeritxt1ActionPerformed(evt);
            }
        });
        jPanel2.add(calismayeritxt1);
        calismayeritxt1.setBounds(150, 70, 283, 32);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel14.setText("Günlük Kazancı :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 110, 138, 32);

        gunlukkazanctxt1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        gunlukkazanctxt1.setText(" ");
        jPanel2.add(gunlukkazanctxt1);
        gunlukkazanctxt1.setBounds(150, 110, 283, 32);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 0, 0);

        jPanel3.setBackground(new java.awt.Color(203, 242, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("ÇALIŞMA BİLGİLERİ");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(10, 0, 181, 31);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/calismalogo1.png"))); // NOI18N
        jLabel17.setText("jLabel2");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(513, 7, 60, 60);

        calismasaatleritxt3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismasaatleritxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismasaatleritxt3ActionPerformed(evt);
            }
        });
        jPanel3.add(calismasaatleritxt3);
        calismasaatleritxt3.setBounds(150, 30, 270, 20);

        jLabel18.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel18.setText("Çalışma Saatleri :");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(10, 30, 140, 20);

        jLabel19.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel19.setText("Çalışma Yeri : ");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(10, 60, 140, 20);

        calismayeritxt2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismayeritxt2.setText(" ");
        calismayeritxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismayeritxt2ActionPerformed(evt);
            }
        });
        jPanel3.add(calismayeritxt2);
        calismayeritxt2.setBounds(150, 60, 270, 20);

        jLabel20.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel20.setText("Günlük Kazancı :");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(10, 90, 140, 20);

        gunlukkazanctxt2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        gunlukkazanctxt2.setText(" ");
        jPanel3.add(gunlukkazanctxt2);
        gunlukkazanctxt2.setBounds(150, 90, 270, 20);

        jPanel4.setBackground(new java.awt.Color(203, 242, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel21.setText("ÇALIŞMA BİLGİLERİ");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(10, 0, 181, 31);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arayüz/calismalogo1.png"))); // NOI18N
        jLabel22.setText("jLabel2");
        jPanel4.add(jLabel22);
        jLabel22.setBounds(513, 7, 60, 60);

        calismasaatleritxt4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismasaatleritxt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismasaatleritxt4ActionPerformed(evt);
            }
        });
        jPanel4.add(calismasaatleritxt4);
        calismasaatleritxt4.setBounds(150, 30, 283, 32);

        jLabel23.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel23.setText("Çalışma Saatleri :");
        jPanel4.add(jLabel23);
        jLabel23.setBounds(10, 30, 137, 30);

        jLabel24.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel24.setText("Çalışma Yeri : ");
        jPanel4.add(jLabel24);
        jLabel24.setBounds(10, 70, 138, 30);

        calismayeritxt3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismayeritxt3.setText(" ");
        calismayeritxt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismayeritxt3ActionPerformed(evt);
            }
        });
        jPanel4.add(calismayeritxt3);
        calismayeritxt3.setBounds(150, 70, 283, 32);

        jLabel25.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel25.setText("Günlük Kazancı :");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(10, 110, 138, 32);

        gunlukkazanctxt3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        gunlukkazanctxt3.setText(" ");
        jPanel4.add(gunlukkazanctxt3);
        gunlukkazanctxt3.setBounds(150, 110, 283, 32);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 0, 0, 0);

        jLabel26.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jPanel3.add(jLabel26);
        jLabel26.setBounds(10, 150, 137, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 0, 0);

        jLabel27.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel27.setText("Çalışılacak Gün Sayısı:");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(10, 120, 140, 20);

        calismagunsayisitxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        calismagunsayisitxt.setText(" ");
        calismagunsayisitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismagunsayisitxtActionPerformed(evt);
            }
        });
        jPanel1.add(calismagunsayisitxt);
        calismagunsayisitxt.setBounds(150, 120, 270, 20);

        jLabel28.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel28.setText("Başlangıç Tarihi :  ");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(10, 150, 120, 20);

        baslangictarihitxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        baslangictarihitxt.setText(" ");
        baslangictarihitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslangictarihitxtActionPerformed(evt);
            }
        });
        jPanel1.add(baslangictarihitxt);
        baslangictarihitxt.setBounds(150, 150, 270, 20);

        jLabel29.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel29.setText("Bitiş Tarihi : ");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(10, 180, 140, 20);

        bitistarihitxt.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        bitistarihitxt.setText(" ");
        jPanel1.add(bitistarihitxt);
        bitistarihitxt.setBounds(150, 180, 270, 20);

        adsoyad.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        adsoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adsoyadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yemektxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(esyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yemektxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esyatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paratxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void yemektxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yemektxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yemektxtActionPerformed

    private void adsoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adsoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adsoyadActionPerformed

    private void calismasaatleritxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismasaatleritxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismasaatleritxtActionPerformed

    private void calismayeritxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismayeritxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismayeritxtActionPerformed

    private void calismasaatleritxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismasaatleritxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismasaatleritxt1ActionPerformed

    private void calismayeritxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismayeritxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismayeritxt1ActionPerformed

    private void calismasaatleritxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismasaatleritxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismasaatleritxt3ActionPerformed

    private void calismayeritxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismayeritxt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismayeritxt2ActionPerformed

    private void calismasaatleritxt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismasaatleritxt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismasaatleritxt4ActionPerformed

    private void calismayeritxt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismayeritxt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismayeritxt3ActionPerformed

    private void calismagunsayisitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismagunsayisitxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismagunsayisitxtActionPerformed

    private void baslangictarihitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslangictarihitxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baslangictarihitxtActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField adsoyad;
    public javax.swing.JTextField baslangictarihitxt;
    public javax.swing.JTextField bitistarihitxt;
    public javax.swing.JTextField calismagunsayisitxt;
    public javax.swing.JTextField calismasaatleritxt;
    public javax.swing.JTextField calismasaatleritxt1;
    public javax.swing.JTextField calismasaatleritxt3;
    public javax.swing.JTextField calismasaatleritxt4;
    public javax.swing.JTextField calismayeritxt;
    public javax.swing.JTextField calismayeritxt1;
    public javax.swing.JTextField calismayeritxt2;
    public javax.swing.JTextField calismayeritxt3;
    public javax.swing.JTextField esyatxt;
    public javax.swing.JTextField gunlukkazanctxt;
    public javax.swing.JTextField gunlukkazanctxt1;
    public javax.swing.JTextField gunlukkazanctxt2;
    public javax.swing.JTextField gunlukkazanctxt3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField paratxt;
    public javax.swing.JTextField yemektxt;
    // End of variables declaration//GEN-END:variables
}
