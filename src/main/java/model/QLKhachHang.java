package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import util.FileHelper;

/**
 *
 * Họ tên sinh viên: Nguyen Thanh An
 */
public class QLKhachHang {

    private ArrayList<KhachHang> dsKhachHang;

    public QLKhachHang() {
        dsKhachHang = new ArrayList<>();
    }

    public QLKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

    public ArrayList<KhachHang> getDsKhachHang() {
        return dsKhachHang;
    }

    public void setDsKhachHang(ArrayList<KhachHang> dsKhachHang) {
        this.dsKhachHang = dsKhachHang;
    }

   
    public void DocKhachHang(String filename) {
        //sinh viên viết code 
       ArrayList<String> input = FileHelper.readFileText(filename); //doc file
        //đổ dữ liệu vào danh sách
        dsKhachHang.clear();
        for (String item : input) {
            String[] arr = item.split(";");
            KhachHang kh = new KhachHang();
            kh.setMaso(arr[0]);
            kh.setHoten(arr[1]);            
            kh.setSonhankhau(Integer.parseInt(arr[2]));
            kh.setChisocu(Double.parseDouble(arr[3]));
            kh.setChisomoi(Double.parseDouble(arr[4]));  
            dsKhachHang.add(kh);
        }
    }

    public boolean GhiHoaDon(String filename) {
        //sinh viên viết code 
         ArrayList<String> output = new ArrayList<>();
        for (KhachHang kh : dsKhachHang){
            String info = kh.getMaso() + ";" + kh.getHoten() + ";" + kh.getSonhankhau() + ";" + kh.getChisocu() + ";" + kh.getChisomoi();
            output.add(info);
        }
        return FileHelper.writeFileText(filename, output);       
    }

   
    public void sapXepTheoMucTieuThu() {
        //sinh viên viết code
          Comparator<KhachHang> cmp = (kh1, kh2) -> {
            return Double.compare(kh2.getTieuThu(), kh1.getTieuThu());
        };
        Collections.sort(dsKhachHang, cmp);
    }
    
    public double getTieuThuCaoNhat()
    {
      double max=0;     
      return max;
    }
    
    public double getTieuThuThapNhat()
    {
       double min=0;
       return min;       
    }
    
    public double getTieuThuTrungBinh()
    {
       return 0;     
    }
}
