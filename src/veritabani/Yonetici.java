 
package veritabani;

 
public class Yonetici {
    
    private int yonetici_no;
    String yonetici_sifre;

    public int getYonetici_no() {
        return yonetici_no;
    }

    public void setYonetici_no(int yonetici_no) {
        this.yonetici_no = yonetici_no;
    }

    public String getYonetici_sifre() {
        return yonetici_sifre;
    }

    public void setYonetici_sifre(String yonetici_sifre) {
        this.yonetici_sifre = yonetici_sifre;
    }

    public Yonetici(int yonetici_no, String yonetici_sifre) {
        this.yonetici_no = yonetici_no;
        this.yonetici_sifre = yonetici_sifre;
    }
    
    
    public Yonetici(){
        
    }
    
    
}
