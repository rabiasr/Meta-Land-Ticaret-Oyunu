package arayüz;

import static arayüz.alan.arsabilgi;
import static arayüz.alan.frame;
import static arayüz.alan.kullanicipaneli;
import baglanti.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import veritabani.Kullanici;

public class yoneticiekran extends JFrame {

    public static JFrame frame = new JFrame();
    public static yonetici_oyuncu_bilgileri yob = new yonetici_oyuncu_bilgileri();
    public static yoneticiarsabilgileri yab = new yoneticiarsabilgileri();
    public DefaultTableModel tablekullanici1 = new DefaultTableModel();
    public DefaultTableModel tablekullanici2 = new DefaultTableModel();
    public DefaultTableModel tablecalisanlar = new DefaultTableModel();
    public DefaultTableModel tableisletme = new DefaultTableModel();
    public DefaultTableModel tablelarge = new DefaultTableModel();
    public DefaultTableModel tablesmall = new DefaultTableModel();
    public DefaultTableModel tablemedium = new DefaultTableModel();
    public DefaultTableModel tableoyunbilgileri = new DefaultTableModel();
    public DefaultTableModel kontrol = new DefaultTableModel();
    Object[] kolon1 = {"Oyuncu ID", "Adı", "Soyadı", "Çalıştığı Arsa", "Baslangıç Tarihi", "Bitiş Tarihi"};
    Object[] kolon2 = {"Çalışacağı Gün", "Çalıştığı Gün", "Yiyecek Miktarı", "Para Miktarı", "Eşya Miktarı", "Sahip Olduğu Arsa"};
    Object[] koloncalisanlar = {"Kullanıcı ID", "Çalıştığı Arsa", "Vardiya", "Baslangıç Tarihi", "Bitiş Tarihi", "Çalışacağı Gün"};
    Object[] kolonisletme = {"Arso No", "Seviye", "Kapasite", "Çalışan Sayısı", "Seviye Mevcut Başlangıç Tarihi"};
    Object[] kolonlarge = {"Arsa No", "Arsa Türü", "Arsa Sahibi"};
    Object[] kolonsmall = {"Arsa No", "Arsa Türü", "Arsa Sahibi"};
    Object[] kolonmedium = {"Arsa No", "Arsa Türü", "Arsa Sahibi"};
    Object[] kolonoyun = {"Başlangıç Yemek", "Başlangıç Eşya", "Başlangıç Para", "Seçilen Alan", "İşletme Gelir Oranı", "Oyun Başlangıç Tarihi", "Günlük Ücret", "Yemek Ücreti", "Eşya Ücreti","Para Ücreti"};
    Object[] kolonkontrol = new Object[6];

    public Object[] bilgi = null;
    public Date baslangic = new Date();
    private database bglnt = new database();

    public yoneticiekran(String str) {

        if (str.equalsIgnoreCase("small")) {
            dispose();
            smally small = new smally();
            small.setBounds(0, 0, 800, 470);
            frame.add(small);

        } else if (str.equalsIgnoreCase("medium")) {
            dispose();
            mediumy medium = new mediumy();
            medium.setBounds(0, 0, 800, 470);
            frame.add(medium);

        } else if (str.equalsIgnoreCase("large")) {

            largey large = new largey();
            large.setBounds(0, 0, 800, 470);
            frame.add(large);
        } else if (str.equalsIgnoreCase("")) {

        }

        frame.add(yab);
        frame.add(yob);
        
        yab.setBounds(10, 480, 780, 310);

        yob.setBounds(800, 10, 704, 780);
        frame.setSize(1920, 1080);
        frame.getContentPane().setBackground(new java.awt.Color(255, 255, 204));
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public yoneticiekran() {

    }

    

    public ResultSet bilgial(String query) {

        Connection c = bglnt.dbcon();
        Statement st = null;
        ResultSet rs = null;

        try {
            st = c.createStatement();
            rs = st.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void alanbilgileri(int no, String tur, String sahip) {

        yab.yalannotxt.setText("" + no + "");
        yab.yalanturutxt.setText(tur);
        yab.yalansahibitxt.setText(sahip);

    }

    public void yazdirkullanici() {
        String query = null;

        query = "SELECT * FROM kullanici";
        ResultSet rs = this.bilgial(query);
        tablekullanici1.setColumnIdentifiers(kolon1);
        tablekullanici2.setColumnIdentifiers(kolon2);

        try {
            while (rs.next()) {
                kolon1[0] = rs.getInt("kullanici_no");
                kolon1[1] = rs.getString("kullanici_ad");
                kolon1[2] = rs.getString("kullanici_soyad");
                kolon1[3] = rs.getInt("kullanici_arsanocalis");
                kolon1[4] = rs.getDate("kullanici_baslangictarihi");
                kolon1[5] = rs.getDate("kullanici_bitistarihi");
                tablekullanici1.addRow(kolon1);
                kolon2[0] = rs.getInt("kullanici_calisilacakgun");
                kolon2[1] = rs.getInt("kullanici_calistigigun");
                kolon2[2] = rs.getInt("kullanici_yemek");
                kolon2[3] = rs.getInt("kullanici_para");
                kolon2[4] = rs.getInt("kullanici_esya");
                kolon2[5] = rs.getInt("kullanici_arsanosahip");
                tablekullanici2.addRow(kolon2);
            }
            yob.tablo1.setModel(tablekullanici1);
            yob.tablo2.setModel(tablekullanici2);

        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void yazdircalisanlar() {
        String query = null;

        query = "SELECT * FROM calisanlar";
        ResultSet rs = this.bilgial(query);
        tablecalisanlar.setColumnIdentifiers(koloncalisanlar);
        kontrol.setColumnIdentifiers(kolonkontrol);

        try {
            while (rs.next()) {
                koloncalisanlar[0] = rs.getInt("kullanici_id");
                koloncalisanlar[1] = rs.getInt("arsa_no");
                koloncalisanlar[2] = rs.getString("kullanici_calisma_saatleri");
                koloncalisanlar[3] = rs.getDate("kullanici_calisma_baslangic_tarihi");
                koloncalisanlar[4] = rs.getDate("kullanici_calisma_bitis_tarihi");
                koloncalisanlar[5] = rs.getInt("kullanici_calisma_gün_sayisi");
                tablecalisanlar.addRow(koloncalisanlar);

            }
            yob.tablo1.setModel(tablecalisanlar);
            yob.tablo2.setModel(kontrol);

        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void yazdirisletme() {
        String query = null;

        query = "SELECT * FROM isletme";
        ResultSet rs = this.bilgial(query);
        tableisletme.setColumnIdentifiers(kolonisletme);
        kontrol.setColumnIdentifiers(kolonkontrol);

        try {
            while (rs.next()) {
                kolonisletme[0] = rs.getInt("arsa_no");
                kolonisletme[1] = rs.getInt("isletme_seviyesi");
                kolonisletme[2] = rs.getInt("isletme_kapasitesi");
                kolonisletme[3] = rs.getInt("isletme_calisma_sayisi");
                kolonisletme[4] = rs.getDate("isletme_mevcut_seviye_baslangic_tarihi");

                tableisletme.addRow(kolonisletme);

            }
            yob.tablo1.setModel(tableisletme);
            yob.tablo2.setModel(kontrol);

        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void yazdirlarge() {
        String query = null;

        query = "SELECT * FROM large_arsa_bilgileri";
        ResultSet rs = this.bilgial(query);
        tablelarge.setColumnIdentifiers(kolonlarge);
        kontrol.setColumnIdentifiers(kolonkontrol);
        try {
            while (rs.next()) {
                kolonlarge[0] = rs.getInt("arsa_no");
                kolonlarge[1] = rs.getString("arsa_turu");
                kolonlarge[2] = rs.getString("arsa_sahibi");

                tablelarge.addRow(kolonlarge);

            }
            yob.tablo1.setModel(tablelarge);
            yob.tablo2.setModel(kontrol);

        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void yazdirsmall() {
        String query = null;

        query = "SELECT * FROM small_arsa_bilgileri";
        ResultSet rs = this.bilgial(query);
        tablesmall.setColumnIdentifiers(kolonsmall);
        kontrol.setColumnIdentifiers(kolonkontrol);

        try {
            while (rs.next()) {
                kolonsmall[0] = rs.getInt("arsa_no");
                kolonsmall[1] = rs.getString("arsa_turu");
                kolonsmall[2] = rs.getString("arsa_sahibi");

                tablesmall.addRow(kolonsmall);

            }
            yob.tablo1.setModel(tablesmall);
            yob.tablo2.setModel(kontrol);

        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void yazdirmedium() {
        String query = null;

        query = "SELECT * FROM medium_arsa_bilgileri";
        ResultSet rs = this.bilgial(query);
        tablemedium.setColumnIdentifiers(kolonmedium);
        kontrol.setColumnIdentifiers(kolonkontrol);

        try {
            while (rs.next()) {
                kolonmedium[0] = rs.getInt("arsa_no");
                kolonmedium[1] = rs.getString("arsa_turu");
                kolonmedium[2] = rs.getString("arsa_sahibi");

                tablemedium.addRow(kolonmedium);

            }
            yob.tablo1.setModel(tablemedium);
            yob.tablo2.setModel(kontrol);

        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void yazdiroyun() {
        String query = null;

        query = "SELECT * FROM oyun_bilgileri";
        ResultSet rs = this.bilgial(query);
        tableoyunbilgileri.setColumnIdentifiers(kolonoyun);
        kontrol.setColumnIdentifiers(kolonkontrol);
        try {
            while (rs.next()) {
                kolonoyun[0] = rs.getInt("baslangic_yemek");
                kolonoyun[1] = rs.getInt("baslangic_esya");
                kolonoyun[2] = rs.getInt("baslangic_para");
                kolonoyun[3] = rs.getString("alan_boyutu");
                kolonoyun[4] = rs.getInt("isletme_sabit_gelir_oran");
                kolonoyun[5] = rs.getDate("oyun_baslangictarihi");
                kolonoyun[6] = rs.getInt("gunluk_ucret");
                kolonoyun[7] = rs.getInt("yemek_ucreti");
                kolonoyun[8] = rs.getInt("esya_ucreti");
                kolonoyun[9] =rs.getInt("para_ucreti");
                tableoyunbilgileri.addRow(kolonoyun);

            }
            yob.tablo1.setModel(tableoyunbilgileri);
            yob.tablo2.setModel(kontrol);

        } catch (SQLException ex) {
            Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
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
        }
        finally{
            try {
                c.close();
                st.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(yoneticiekran.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

        return baslangic;

    }
}
