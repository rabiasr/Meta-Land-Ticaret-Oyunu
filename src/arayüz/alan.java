package arayüz;

import baglanti.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import veritabani.Kullanici;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class alan extends JFrame {

    public static JFrame frame = new JFrame();
    public static arsabilgi arsabilgi = new arsabilgi();
    public static kullanicipaneli kullanicipaneli = new kullanicipaneli();
    public static Kullanici kullanici;
    public String secim = null;
    public int gun = 0;
    public int arsa_no;
    public int index = 0;

    public Date baslangic = new Date();
    private database bglnt = new database();

    public alan(String str) {

        JPanel panel1 = new JPanel();

        if (str.equalsIgnoreCase("small")) {
            dispose();
            small small = new small();
            small.setBounds(0, 0, 800, 470);
            frame.add(small);

        } else if (str.equalsIgnoreCase("medium")) {
            dispose();
            medium medium = new medium();
            medium.setBounds(0, 0, 800, 470);
            frame.add(medium);

        } else if (str.equalsIgnoreCase("large")) {

            large large = new large();
            large.setBounds(0, 0, 800, 470);
            frame.add(large);
        } else if (str.equalsIgnoreCase("")) {

        }

        frame.add(kullanicipaneli);
        frame.add(arsabilgi);
        
        kullanicipaneli.setBounds(10, 480, 780, 310);

        arsabilgi.setBounds(800, 10, 704, 780);
        frame.setSize(1920, 1080);
        frame.getContentPane().setBackground(new java.awt.Color(255, 255, 204));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public alan() {

    }
//Menuyu calistiriyor

    public void menu() {

        menu1 menu = new menu1();
        menu.setVisible(true);

    }
//kullaniciyi alıyor

    public void kullanicial(Kullanici kullanici) {

        this.kullanici = kullanici;
        kullanicibilgileri();

    }
//arsabilgilerindeki arsa bilgilerini ekrana yazdırıyor

    public void alanbilgileri(int no, String tur, String sahip) {

        arsabilgi.alannotxt.setText("" + no + "");
        arsabilgi.alanturutxt.setText(tur);
        arsabilgi.alansahibitxt.setText(sahip);

    }

//kullanicipanelindeki yemekleri ve isimi ekrana yzdırıyor kullanici veritabanından alıyor
    public void kullanicibilgileri() {

        Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
        try {

            st = c.createStatement();
            rs = st.executeQuery("SELECT * FROM kullanici");

            while (rs.next()) {

                if (kullanici.getKullanici_no() == rs.getInt("kullanici_no")) {
                    kullanicipaneli.adsoyad.setText("" + rs.getString("kullanici_ad") + " " + rs.getString("kullanici_soyad") + "");
                    kullanicipaneli.esyatxt.setText("" + rs.getInt("kullanici_esya") + "");
                    kullanicipaneli.yemektxt.setText("" + rs.getInt("kullanici_yemek") + "");
                    kullanicipaneli.paratxt.setText("" + rs.getInt("kullanici_para") + "");

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(small.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
//kullanici ilk girdiğinde kendi çalışma bilgilerini ekranda görüyor veritabanından çekiyor

    public void calismabilgileri() {
        Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;
        Statement st1 = null;
        ResultSet rs1 = null;
        int gunlukucret = 0;

        try {
            st1 = c.createStatement();
            rs1 = st1.executeQuery("SELECT gunluk_ucret FROM oyun_bilgileri");
            while (rs1.next()) {

                gunlukucret = rs1.getInt("gunluk_ucret");
                arsabilgi.ucrettxt.setText(""+rs1.getInt("gunluk_ucret")+"  TL dir");
            }

        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            st = c.createStatement();
            rs = st.executeQuery("SELECT * FROM kullanici");
 
            while (rs.next()) {

                if ((kullanici.getKullanici_no() == rs.getInt("kullanici_no"))) {
                    kullanicipaneli.calismasaatleritxt.setText("" + rs.getString("kullanici_calisma_saatleri") + "");
                    kullanicipaneli.calismayeritxt.setText("" + rs.getInt("kullanici_arsanocalis") + "");
                    kullanicipaneli.gunlukkazanctxt.setText("" + gunlukucret + "");
                    kullanicipaneli.calismagunsayisitxt.setText("" + rs.getInt("kullanici_calisilacakgun") + "");
                    kullanicipaneli.baslangictarihitxt.setText("" + rs.getDate("kullanici_baslangictarihi") + "");
                    kullanicipaneli.bitistarihitxt.setText("" + rs.getDate("kullanici_bitistarihi") + "");
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                st.close();
                st1.close();
                rs.close();
                rs1.close();
                c.close();

            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void calismabilgilerial(String secim, int arsano, int gun) {

        this.arsa_no = arsano;
        this.secim = secim;
        this.gun = gun;
    }

    public void calisantable() {

        Connection c = bglnt.dbcon();
        Connection c1 = bglnt.dbcon();
        Statement st = null;
        Statement st1 = null;
        Statement st2 = null;
        Statement st3 = null;
        Statement st4 = null;
        Statement st5 = null;
        Statement st6 = null;
        Statement st7 = null;
        Statement st8 = null;
        Statement st9 = null;
        ResultSet rs = null;
        ResultSet rs1 = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        ResultSet rs4 = null;
        ResultSet rs5 = null;
        PreparedStatement pr = null;
        int a = kullanici.getKullanici_no();
        int b = arsa_no;
        String str = secim;

        baslangic = this.tarihal();

        try {

            st = c.createStatement();
            st1 = c.createStatement();
            st2 = c.createStatement();
            st3 = c.createStatement();
            st4 = c.createStatement();
            st5 = c.createStatement();
            st6 = c.createStatement();
            st7 = c.createStatement();
            st8 = c.createStatement();
            st9 = c.createStatement();
           
            String sec = "SELECT calisanlar.index FROM calisanlar ORDER BY calisanlar.index DESC LIMIT 1;";
            rs5 = st9.executeQuery(sec);
            while (rs5.next()) {
                index = rs5.getInt("index");
              
            }
            int flag = 0;
            int sayac = index + 1;
            rs1 = st4.executeQuery("SELECT kullanici_id,calisanlar.index FROM calisanlar ");
            while (rs1.next()) {
                Date bitis = new Date();

                if ((rs1.getInt("kullanici_id") != a) && (flag == 0)) {

                    String query = "INSERT INTO calisanlar (kullanici_id,arsa_no,kullanici_calisma_saatleri,kullanici_calisma_baslangic_tarihi,kullanici_calisma_gün_sayisi) VALUES ('" + a + "','" + b + "','" + str + "','" + baslangic + "', '" + gun + "') ";

                    st3.executeUpdate(query);
                    flag = 1;

                }
                if ((rs1.getInt("kullanici_id") == a) || (rs1.getInt("kullanici_id") != a)) {

                    this.bitistarihi();

                }

             

            }

            rs2 = st5.executeQuery("SELECT * FROM calisanlar LEFT JOIN medium_arsa_bilgileri  ON calisanlar.arsa_no=medium_arsa_bilgileri.arsa_no");
            while (rs2.next()) {

                if (rs2.getInt("arsa_no") == b) {
                    kullanicipaneli.calismayeritxt.setText(rs2.getInt("arsa_no") + " - " + rs2.getString("arsa_turu"));
                    kullanicipaneli.calismasaatleritxt.setText(rs2.getString("kullanici_calisma_saatleri"));
                }

            }

            rs3 = st6.executeQuery("SELECT  * FROM calisanlar LEFT JOIN small_arsa_bilgileri  ON calisanlar.arsa_no=small_arsa_bilgileri.arsa_no");
            while (rs3.next()) {

                if (rs3.getInt("arsa_no") == b) {
                    kullanicipaneli.calismayeritxt.setText(rs3.getInt("arsa_no") + " - " + rs3.getString("arsa_turu"));
                    kullanicipaneli.calismasaatleritxt.setText(rs3.getString("kullanici_calisma_saatleri"));
                }

            }

            rs4 = st7.executeQuery("SELECT  * FROM calisanlar LEFT JOIN large_arsa_bilgileri  ON calisanlar.arsa_no=large_arsa_bilgileri.arsa_no");
            while (rs4.next()) {

                if (rs4.getInt("arsa_no") == b) {
                    kullanicipaneli.calismayeritxt.setText(rs4.getInt("arsa_no") + " - " + rs4.getString("arsa_turu"));
                    kullanicipaneli.calismasaatleritxt.setText(rs4.getString("kullanici_calisma_saatleri"));
                }

            }

            rs = st.executeQuery("SELECT kullanici_no FROM  kullanici ");
            while (rs.next()) {

                if (a == rs.getInt("kullanici_no")) {
                    st1.executeUpdate("UPDATE kullanici SET kullanici_arsanocalis='" + b + "' , kullanici_calisilacakgun= '" + gun + "',kullanici_baslangictarihi='" + baslangic + "', kullanici_calisma_saatleri='" + secim + "' WHERE kullanici_no='" + a + "' ");

                    st8.executeUpdate(" UPDATE kullanici SET kullanici_bitistarihi = DATE_ADD( kullanici_baslangictarihi, INTERVAL '" + gun + "' DAY) WHERE kullanici_no='" + a + "' ");

                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                c.close();
                c1.close();
                
                st.close();
                st1.close();
                st2.close();
                st3.close();
                st4.close();
                st5.close();
                st6.close();
                st7.close();
                st8.close();
                st9.close();
                rs.close();
                rs1.close();
                rs2.close();
                rs3.close();
                rs4.close();
                rs5.close();
            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public Date tarihal() {
        Date baslangic = new Date();
        Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;

        try {
            st = c.createStatement();
            rs = st.executeQuery("SELECT oyun_baslangictarihi FROM oyun_bilgileri");
            while (rs.next()) {

                baslangic = rs.getDate("oyun_baslangictarihi");

            }

        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return baslangic;

    }

    public void bitistarihi() {
        Connection c = bglnt.dbcon();
        Statement st = null;
        Statement st1 = null;
        ResultSet rs = null;
        int sayac = index + 1;

        try {
            st = c.createStatement();
            st1 = c.createStatement();
            rs = st.executeQuery("SELECT kullanici_id,calisanlar.index FROM calisanlar ");

            while (rs.next()) {

                st1.executeUpdate(" UPDATE calisanlar SET kullanici_calisma_bitis_tarihi = DATE_ADD( kullanici_calisma_baslangic_tarihi, INTERVAL '" + gun + "' DAY) WHERE calisanlar.index='" + sayac + "' ");

            }

        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                c.close();
                st.close();
                st1.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void digergun(int gunsayisi) {

        int yemek = 0;
        int esya = 0;
        int para=0;
        int parac = 0;
        int paraemlak=0;
        int a = kullanici.getKullanici_no();
        int x = 0;
        int yazalt =0;
        int eazalt =0;
        int pazalt =0;
        int gunlukkazanc = 0;
        Connection c = bglnt.dbcon();
        Statement st = null;
        Statement st1 = null;
        ResultSet rs = null;
        Statement st2 = null;
        ResultSet rs1 = null;
        Statement st3 = null;
        ResultSet rs2 = null;

        String oyun = "SELECT * FROM oyun_bilgileri";
        try {
            st3 = c.createStatement();
            rs2 = st3.executeQuery(oyun);
            while (rs2.next()) {

                gunlukkazanc = rs2.getInt("gunluk_ucret");
                 yazalt = (rs2.getInt("yemek_ucreti")) * gunsayisi;
                 eazalt =(rs2.getInt("esya_ucreti"))*gunsayisi;
                 pazalt =(rs2.getInt("para_ucreti"))*gunsayisi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        }

        String aa = "SELECT * FROM kullanici ";
        try {
            st2 = c.createStatement();
            rs1 = st2.executeQuery(aa);
            while (rs1.next()) {
                if (rs1.getInt("kullanici_no") == kullanici.getKullanici_no()) {
                    yemek = (rs1.getInt("kullanici_yemek") - yazalt);
                    esya = (rs1.getInt("kullanici_esya") - eazalt);
                    parac = (rs1.getInt("kullanici_para") - pazalt + gunlukkazanc);
                    para=(rs1.getInt("kullanici_para")-pazalt);
                    paraemlak=(rs1.getInt("kullanici_para"))+gunlukkazanc;
                    x = (rs1.getInt("kullanici_calistigigun") + gunsayisi);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            st = c.createStatement();
            st1 = c.createStatement();
            String query = "SELECT * FROM kullanici LEFT JOIN small_arsa_bilgileri ON kullanici.kullanici_arsanocalis=small_arsa_bilgileri.arsa_no;";
            rs = st.executeQuery(query);

            while (rs.next()) {

                if ((rs.getInt("kullanici_no") == kullanici.getKullanici_no()) && (rs.getInt("kullanici_arsanocalis") != 0)) {

                    if ((rs.getString("arsa_turu").equalsIgnoreCase("Emlak"))) {
                        st1.executeUpdate(" UPDATE kullanici SET kullanici_yemek = '" + yemek + "',kullanici_esya='" + esya + "',kullanici_para='"+paraemlak+"' ,kullanici_calistigigun='" + x + "' WHERE kullanici_no='" + a + "'");
                        this.oldur();
                    }
                } if ((rs.getInt("kullanici_no") == kullanici.getKullanici_no()) && ((rs.getInt("kullanici_arsanocalis") != 0))) {
                    if ((rs.getString("arsa_turu").equalsIgnoreCase("Mağaza"))) {
                        st1.executeUpdate(" UPDATE kullanici SET kullanici_yemek = '" + yemek + "',kullanici_para='" + parac + "',kullanici_calistigigun='" + x + "' WHERE kullanici_no='" + a + "'");
                        this.oldur();
                    }
                } if ((rs.getInt("kullanici_no") == kullanici.getKullanici_no()) && (rs.getInt("kullanici_arsanocalis") != 0)) {
                    if ((rs.getString("arsa_turu").equalsIgnoreCase("Market"))) {
                        st1.executeUpdate(" UPDATE kullanici SET kullanici_esya ='" + esya + "',kullanici_para='" + parac+ "',kullanici_calistigigun='" + x + "' WHERE kullanici_no='" + a + "'");

                        this.oldur();
                    }
                } if ((rs.getInt("kullanici_no") == kullanici.getKullanici_no()) && (rs.getInt("kullanici_arsanocalis") == 0)) {
                    st1.executeUpdate(" UPDATE kullanici SET kullanici_yemek='"+yemek+"',kullanici_esya ='" + esya + "',kullanici_para='" + para + "' WHERE kullanici_no='" + a + "'");
                    this.oldur();
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                c.close();
                st.close();
                st1.close();
                st2.close();
                st3.close();
                rs.close();
                rs1.close();
                rs2.close();
            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        this.kullanicibilgileri();

    }

    public void buton() {

        Connection c = bglnt.dbcon();
        Statement st = null;
        Statement st1 = null;
        ResultSet rs = null;
        boolean flag = false;
        int a = kullanici.getKullanici_no();
        
        try {
            st = c.createStatement();
            st1 = c.createStatement();
            rs = st.executeQuery("SELECT * FROM kullanici");
            {
                while (rs.next()) {
                    if (kullanici.getKullanici_no() == rs.getInt("kullanici_no")) {

                        if ((rs.getInt("kullanici_calisilacakgun") <= rs.getInt("kullanici_calistigigun"))) {

                            arsabilgi.emlakilanbtn.setEnabled(true);
                            arsabilgi.magazailanbtn.setEnabled(true);
                            arsabilgi.marketilanbtn.setEnabled(true);
                            arsabilgi.ozelilanbtn.setEnabled(true);
                    st1.executeUpdate("UPDATE kullanici SET kullanici_calistigigun=0 ,kullanici_calisilacakgun=0,kullanici_arsanocalis=0,kullanici_calisma_saatleri='"+" "+"' WHERE kullanici_no='" + a + "' ");

                        } else {

                            arsabilgi.emlakilanbtn.setEnabled(false);
                            arsabilgi.magazailanbtn.setEnabled(false);
                            arsabilgi.marketilanbtn.setEnabled(false);
                            arsabilgi.ozelilanbtn.setEnabled(false);
                        }
                        if ((rs.getInt("kullanici_calisilacakgun") == 0) && (rs.getInt("kullanici_calistigigun") == 0)) {

                            arsabilgi.emlakilanbtn.setEnabled(true);
                            arsabilgi.magazailanbtn.setEnabled(true);
                            arsabilgi.marketilanbtn.setEnabled(true);
                            arsabilgi.ozelilanbtn.setEnabled(true);

                        }

                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                c.close();
                st.close();
                st1.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }

    public void oldur() {
        Connection c = bglnt.dbcon();

        Statement st3 = null;
        Statement st4=null;
        ResultSet rs3 = null;
        int a=kullanici.getKullanici_no();
        try {
            st3 = c.createStatement();
            st4=c.createStatement();
            rs3 = st3.executeQuery("SELECT * FROM kullanici");
            while (rs3.next()) {

                if (kullanici.getKullanici_no() == rs3.getInt("kullanici_no")) {
                    if ((rs3.getInt("kullanici_yemek") <= 0)) {
                        JOptionPane.showMessageDialog(null, " Yemeğiniz Bittiği İçin Oyunu Kaybettiniz.");

                        System.exit(0);

                    } else if ((rs3.getInt("kullanici_esya") <= 0)) {
                        JOptionPane.showMessageDialog(null, " Eşyanız Bittiği İçin Oyunu Kaybettiniz.");

                        System.exit(0);
                    }else if ((rs3.getInt("kullanici_para") <= 0)) {
                      st4.executeUpdate("UPDATE kullanici SET kullanici_para=0 WHERE kullanici_no='"+a+"'");
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(menu1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                c.close();
                st3.close();
                st4.close();
                rs3.close();
            } catch (SQLException ex) {
                Logger.getLogger(alan.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
