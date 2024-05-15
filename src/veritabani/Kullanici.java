package veritabani;

import com.sun.jdi.connect.spi.Connection;
import java.util.Date;
import baglanti.database;
import java.sql.*;
import java.util.ArrayList;
public class Kullanici {

    private int kullanici_no;
    String kullanici_ad, kullanici_soyad, kullanici_sifre,arsa_turu;
    int kullanici_yemek, kullanici_esya, kullanici_para, kullanici_arsanosahip, kullanici_arsanocalis, kullanici_calisilacakgun, kullanici_calistigigun;
    Date kullanici_baslangictarihi, kullanici_bitistarihi;
    

    public Kullanici(int kullanici_no, String kullanici_ad, String kullanici_soyad, String kullanici_sifre, int kullanici_yemek, int kullanici_esya, int kullanici_para, int kullanici_arsanosahip, int kullanici_arsanocalis, int kullanici_calisilacakgun, int kullanici_calistigigun, Date kullanici_baslangictarihi, Date kullanici_bitistarihi,String arsa_turu) {
        this.kullanici_no = kullanici_no;
        this.kullanici_ad = kullanici_ad;
        this.kullanici_soyad = kullanici_soyad;
        this.kullanici_sifre = kullanici_sifre;
        this.kullanici_yemek = kullanici_yemek;
        this.kullanici_esya = kullanici_esya;
        this.kullanici_para = kullanici_para;
        this.kullanici_arsanosahip = kullanici_arsanosahip;
        this.kullanici_arsanocalis = kullanici_arsanocalis;
        this.kullanici_calisilacakgun = kullanici_calisilacakgun;
        this.kullanici_calistigigun = kullanici_calistigigun;
        this.kullanici_baslangictarihi = kullanici_baslangictarihi;
        this.kullanici_bitistarihi = kullanici_bitistarihi;
        this.arsa_turu=arsa_turu;
    }
    
   

  public Kullanici() {

        kullanici_no = this.kullanici_no;
        kullanici_ad = this.kullanici_ad;
        kullanici_soyad = this.kullanici_soyad;
        kullanici_sifre = this.kullanici_sifre;
        kullanici_yemek = this.kullanici_yemek;
        kullanici_esya = this.kullanici_esya;
        kullanici_para = this.kullanici_para;
        kullanici_arsanosahip = this.kullanici_arsanosahip;
        kullanici_arsanocalis = this.kullanici_arsanocalis;
        kullanici_calisilacakgun = this.kullanici_calisilacakgun;
        kullanici_calistigigun = this.kullanici_calistigigun;
        kullanici_baslangictarihi = this.kullanici_baslangictarihi;
        kullanici_bitistarihi = this.kullanici_bitistarihi;
        arsa_turu=this.arsa_turu;
    }

    public String getArsa_turu() {
        return arsa_turu;
    }

    public void setArsa_turu(String arsa_turu) {
        this.arsa_turu = arsa_turu;
    }

    
    public int getKullanici_no() {
        return kullanici_no;
    }

    public void setKullanici_no(int kullanici_no) {
        this.kullanici_no = kullanici_no;
    }

    public String getKullanici_ad() {
        return kullanici_ad;
    }

    public void setKullanici_ad(String kullanici_ad) {
        this.kullanici_ad = kullanici_ad;
    }

    public String getKullanici_soyad() {
        return kullanici_soyad;
    }

    public void setKullanici_soyad(String kullanici_soyad) {
        this.kullanici_soyad = kullanici_soyad;
    }

    public String getKullanici_sifre() {
        return kullanici_sifre;
    }

    public void setKullanici_sifre(String kullanici_sifre) {
        this.kullanici_sifre = kullanici_sifre;
    }

    public int getKullanici_yemek() {
        return kullanici_yemek;
    }

    public void setKullanici_yemek(int kullanici_yemek) {
        this.kullanici_yemek = kullanici_yemek;
    }

    public int getKullanici_esya() {
        return kullanici_esya;
    }

    public void setKullanici_esya(int kullanici_esya) {
        this.kullanici_esya = kullanici_esya;
    }

    public int getKullanici_para() {
        return kullanici_para;
    }

    public void setKullanici_para(int kullanici_para) {
        this.kullanici_para = kullanici_para;
    }

    public int getKullanici_arsanosahip() {
        return kullanici_arsanosahip;
    }

    public void setKullanici_arsanosahip(int kullanici_arsanosahip) {
        this.kullanici_arsanosahip = kullanici_arsanosahip;
    }

    public int getKullanici_arsanocalis() {
        return kullanici_arsanocalis;
    }

    public void setKullanici_arsanocalis(int kullanici_arsanocalis) {
        this.kullanici_arsanocalis = kullanici_arsanocalis;
    }

    public int getKullanici_calisilacakgun() {
        return kullanici_calisilacakgun;
    }

    public void setKullanici_calisilacakgun(int kullanici_calisilacakgun) {
        this.kullanici_calisilacakgun = kullanici_calisilacakgun;
    }

    public int getKullanici_calistigigun() {
        return kullanici_calistigigun;
    }

    public void setKullanici_calistigigun(int kullanici_calistigigun) {
        this.kullanici_calistigigun = kullanici_calistigigun;
    }

    public Date getKullanici_baslangictarihi() {
        return kullanici_baslangictarihi;
    }

    public void setKullanici_baslangictarihi(Date kullanici_baslangictarihi) {
        this.kullanici_baslangictarihi = kullanici_baslangictarihi;
    }

    public Date getKullanici_bitistarihi() {
        return kullanici_bitistarihi;
    }

    public void setKullanici_bitistarihi(Date kullanici_bitistarihi) {
        this.kullanici_bitistarihi = kullanici_bitistarihi;
    }
    
    
    
    

}
