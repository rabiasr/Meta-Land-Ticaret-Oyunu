 
package arayüz;

import baglanti.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

 
public class largey extends javax.swing.JPanel {
private database bglnt = new database();
     
    public largey() {
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

        arsa1btn = new javax.swing.JButton();
        arsa3btn = new javax.swing.JButton();
        arsa4btn = new javax.swing.JButton();
        arsa2btn = new javax.swing.JButton();
        arsa7btn = new javax.swing.JButton();
        arsa8btn = new javax.swing.JButton();
        arsa6btn = new javax.swing.JButton();
        arsa5btn = new javax.swing.JButton();
        arsa11btn = new javax.swing.JButton();
        arsa12btn = new javax.swing.JButton();
        arsas10btn = new javax.swing.JButton();
        arsa9btn = new javax.swing.JButton();
        arsa15btn = new javax.swing.JButton();
        arsa16btn = new javax.swing.JButton();
        arsa14btn = new javax.swing.JButton();
        arsa13btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        arsa1btn.setBackground(new java.awt.Color(255, 153, 153));
        arsa1btn.setText("EMLAK");
        arsa1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa1btnActionPerformed(evt);
            }
        });

        arsa3btn.setBackground(new java.awt.Color(204, 255, 204));
        arsa3btn.setText("MARKET");
        arsa3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa3btnActionPerformed(evt);
            }
        });

        arsa4btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa4btn.setText("ARSA");
        arsa4btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa4btnActionPerformed(evt);
            }
        });

        arsa2btn.setBackground(new java.awt.Color(255, 204, 153));
        arsa2btn.setText("MAĞAZA");
        arsa2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa2btnActionPerformed(evt);
            }
        });

        arsa7btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa7btn.setText("ARSA");
        arsa7btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa7btnActionPerformed(evt);
            }
        });

        arsa8btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa8btn.setText("ARSA");
        arsa8btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa8btnActionPerformed(evt);
            }
        });

        arsa6btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa6btn.setText("ARSA");
        arsa6btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa6btnActionPerformed(evt);
            }
        });

        arsa5btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa5btn.setText("ARSA");
        arsa5btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa5btnActionPerformed(evt);
            }
        });

        arsa11btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa11btn.setText("ARSA");
        arsa11btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa11btnActionPerformed(evt);
            }
        });

        arsa12btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa12btn.setText("ARSA");
        arsa12btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa12btnActionPerformed(evt);
            }
        });

        arsas10btn.setBackground(new java.awt.Color(235, 184, 110));
        arsas10btn.setText("ARSA");
        arsas10btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsas10btnActionPerformed(evt);
            }
        });

        arsa9btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa9btn.setText("ARSA");
        arsa9btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa9btnActionPerformed(evt);
            }
        });

        arsa15btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa15btn.setText("ARSA");
        arsa15btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa15btnActionPerformed(evt);
            }
        });

        arsa16btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa16btn.setText("ARSA");
        arsa16btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa16btnActionPerformed(evt);
            }
        });

        arsa14btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa14btn.setText("ARSA");
        arsa14btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa14btnActionPerformed(evt);
            }
        });

        arsa13btn.setBackground(new java.awt.Color(235, 184, 110));
        arsa13btn.setText("ARSA");
        arsa13btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arsa13btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arsa1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa5btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa9btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa13btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arsa2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa6btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsas10btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa14btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arsa3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa7btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa11btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa15btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arsa16btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa12btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa8btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa4btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arsa1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa3btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa4btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arsa5btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa7btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa8btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa6btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arsa9btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa11btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa12btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsas10btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arsa13btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa15btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa16btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arsa14btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arsa1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa1btnActionPerformed
          String tur = null;
        String sahip = null;
       yoneticiekran ekran=new yoneticiekran("");
        
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                         
                         st = c.createStatement();

        rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==1){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                      finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
                   
                   
        
        ekran.alanbilgileri(1,tur,sahip);
        
                                            
    }//GEN-LAST:event_arsa1btnActionPerformed

    private void arsa15btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa15btnActionPerformed
          String tur = null;
        String sahip = null;
       yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                      
                        st = c.createStatement();

      rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==15){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
            finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }           
                   
        
        ekran.alanbilgileri(15,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa15btnActionPerformed

    private void arsa3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa3btnActionPerformed
          String tur = null;
        String sahip = null;
        yoneticiekran ekran=new yoneticiekran("");
        
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                        
                        st = c.createStatement();

         rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==3){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                  finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
                   
        
        ekran.alanbilgileri(3,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa3btnActionPerformed

    private void arsa2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa2btnActionPerformed
            String tur = null;
        String sahip = null;
      yoneticiekran ekran=new yoneticiekran("");   
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                     
                        st = c.createStatement();

        rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==2){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }   finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
                   
                   
        
        ekran.alanbilgileri(2,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa2btnActionPerformed

    private void arsa4btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa4btnActionPerformed
          String tur = null;
        String sahip = null;
       yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                        
                         st = c.createStatement();

         rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==4){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                    finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
                   
        
        ekran.alanbilgileri(4,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa4btnActionPerformed

    private void arsa5btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa5btnActionPerformed
           String tur = null;
        String sahip = null;
        yoneticiekran ekran=new yoneticiekran("");
        
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                         c = bglnt.dbcon();
                        st = c.createStatement();

          rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==5){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                   finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
                   
        
        ekran.alanbilgileri(5,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa5btnActionPerformed

    private void arsa6btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa6btnActionPerformed
           String tur = null;
        String sahip = null;
       yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                         st = c.createStatement();

       rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==6){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }   finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
                   
                   
        
        ekran.alanbilgileri(6,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa6btnActionPerformed

    private void arsa7btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa7btnActionPerformed
          String tur = null;
        String sahip = null;
       yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                      
                     st = c.createStatement();
                       rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==7){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                  finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
                   
        
        ekran.alanbilgileri(7,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa7btnActionPerformed

    private void arsa8btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa8btnActionPerformed
         String tur = null;
        String sahip = null;
       yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                       
                         st = c.createStatement();

           rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==8){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }   finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
                   
                   
        
        ekran.alanbilgileri(8,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa8btnActionPerformed

    private void arsa9btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa9btnActionPerformed
          String tur = null;
        String sahip = null;
        yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                       
                         st = c.createStatement();

           rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==9){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }   finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
                   
                   
        
        ekran.alanbilgileri(9,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa9btnActionPerformed

    private void arsas10btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsas10btnActionPerformed
          String tur = null;
        String sahip = null;
      yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                       st = c.createStatement();

         rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==10){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                    finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
                   
        
        ekran.alanbilgileri(10,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsas10btnActionPerformed

    private void arsa11btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa11btnActionPerformed
          String tur = null;
        String sahip = null;
      yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                       
                        st = c.createStatement();

          rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==11){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                  finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
                   
        
        ekran.alanbilgileri(11,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa11btnActionPerformed

    private void arsa12btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa12btnActionPerformed
           String tur = null;
        String sahip = null;
        yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                        
                         st = c.createStatement();

          rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==12){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                     finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
                   
        
        ekran.alanbilgileri(12,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa12btnActionPerformed

    private void arsa13btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa13btnActionPerformed
         String tur = null;
        String sahip = null;
        yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                      
                         st = c.createStatement();

           rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==13){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                    finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
                   
        
        ekran.alanbilgileri(13,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa13btnActionPerformed

    private void arsa14btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa14btnActionPerformed
            String tur = null;
        String sahip = null;
         yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                         
                         st = c.createStatement();

         rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==14){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }
                   finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
                   
        
        ekran.alanbilgileri(14,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa14btnActionPerformed

    private void arsa16btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arsa16btnActionPerformed
           String tur = null;
        String sahip = null;
        yoneticiekran ekran=new yoneticiekran("");
         Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
                   try { 
                       
                       
                     
                        st = c.createStatement();

         rs = st.executeQuery("SELECT * FROM large_arsa_bilgileri");
         
         while(rs.next()){
                     if(rs.getInt("arsa_no")==16){
                           tur=rs.getString("arsa_turu");
                           sahip=rs.getString("arsa_sahibi");
                     }  
            
          
         }
     } catch (SQLException ex) {
         Logger.getLogger(largey.class.getName()).log(Level.SEVERE, null, ex);
     }   finally {
            try {   c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(medium.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
                   
                   
        
        ekran.alanbilgileri(16,tur,sahip);
        
                                          
    }//GEN-LAST:event_arsa16btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arsa11btn;
    private javax.swing.JButton arsa12btn;
    private javax.swing.JButton arsa13btn;
    private javax.swing.JButton arsa14btn;
    private javax.swing.JButton arsa15btn;
    private javax.swing.JButton arsa16btn;
    private javax.swing.JButton arsa1btn;
    private javax.swing.JButton arsa2btn;
    private javax.swing.JButton arsa3btn;
    private javax.swing.JButton arsa4btn;
    private javax.swing.JButton arsa5btn;
    private javax.swing.JButton arsa6btn;
    private javax.swing.JButton arsa7btn;
    private javax.swing.JButton arsa8btn;
    private javax.swing.JButton arsa9btn;
    private javax.swing.JButton arsas10btn;
    // End of variables declaration//GEN-END:variables
}
