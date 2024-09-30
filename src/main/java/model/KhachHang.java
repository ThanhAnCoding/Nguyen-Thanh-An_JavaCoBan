package model;

/**
 *
 * Họ tên sinh viên: Nguyen Thanh An
 */
public class KhachHang {
    private String maso;
    private String hoten;
    private int sonhankhau;
    private double chisocu;
    private double chisomoi;            

    //constructor
    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int sonhankhau, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.sonhankhau = sonhankhau;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    //setter và getter

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getSonhankhau() {
        return sonhankhau;
    }

    public void setSonhankhau(int sonhankhau) {
        this.sonhankhau = sonhankhau;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

     
    
    //phương thức tính toán    

    public double getTieuThu()
    {
      double getTieuThu = chisomoi-chisocu;          
      return getTieuThu;
    }
    
    public double getDinhMuc()
    {
        
        double getDinhMuc=0;
        if(getTieuThu()/sonhankhau<4){
            getDinhMuc = 6700;
        }else if(getTieuThu()/sonhankhau<6){
            getDinhMuc = 12900;
        }else {
            getDinhMuc = 14400;
        }
       return getDinhMuc;
    }
    
    
    public double tinhTienTra()
    {
        double tienTra=0;        
        double giaBan=getDinhMuc()*getTieuThu();
        double thueGTGT = 0.05*giaBan;
        double tDVTN = 0.25*giaBan;
        double thueTDVTN = 0.08*tDVTN;
        tienTra=giaBan+thueGTGT+tDVTN+thueTDVTN;
       return tienTra;
    }         
}
