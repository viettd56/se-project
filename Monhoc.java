/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * 
 */
public class Monhoc implements Serializable {
    private String tenMonHoc;   //ten mon hoc
    private String maMonHoc;    //ma mon hoc
    private int soTinChi, gioLyThuyet, gioThucHanh, gioTuHoc;       //so tin chi cua mon hoc
    private String loaiMonHoc;    //loai cua mon hoc
    private String monTienQuyet;  //ma mon hoc dieu kien tien quyet
    private boolean dieuKien;     //kiem tra dieu kien bat buoc cua mon hoc
    ArrayList<Monhoc> arrayMonHocs;       
    private int demMH = 0;
    
	//constructor non arguments
    public Monhoc()
    {
        tenMonHoc = "";
        maMonHoc = "";
        soTinChi = gioLyThuyet = gioThucHanh = gioTuHoc = 0;
        loaiMonHoc = "";
        monTienQuyet = "";
    }//end method
    
    //constructor with arguments
    public Monhoc(String ten,String ma,int tinchi,int lythuyet,int thuchanh,
                int tuhoc,String loaimh,String montq)
    {
        tenMonHoc = ten;
        maMonHoc = ma;
        soTinChi = tinchi;
        gioThucHanh = thuchanh;
        gioLyThuyet = lythuyet;
        gioTuHoc = tuhoc;
        loaiMonHoc = loaimh;
        monTienQuyet = montq;
        
    }//end constructor
    
    //method setName
    public void setName(String tenMonHoc)
    {
        this.tenMonHoc = tenMonHoc;
    }//end method
    
    //method getName 
    public String getName()
    {
        return tenMonHoc;
    }//end method
    
    //method setCode
    public void setCode(String maMonHoc)
    {
        this.maMonHoc = maMonHoc; 
    }//end method
    
    //method getCode
    public String getCode()
    {
        return maMonHoc;
    }//end method
    
    //method setNumber
    public void setNumber(int soTinChi,int gioLyThuyet,int gioThucHanh,int gioTuHoc)
    {
        if(checkNumber(soTinChi, gioLyThuyet, gioThucHanh, gioTuHoc) == true)
        {
            this.soTinChi = soTinChi;
            this.gioLyThuyet = gioLyThuyet;
            this.gioThucHanh = gioThucHanh;
            this.gioTuHoc = gioTuHoc;
        }
    }//end method
    
    //method getNumber
    public int getNumberTc()
    {
        return soTinChi;
    }//end method
    
    //method getNumberLt
    public int getNumberLt()
    {
        return gioLyThuyet;
    }//end method
    
    //method getNumberThh
    public int getnumberThh()
    {
        return gioThucHanh;
    }//end method
    
    //method getNumberTh
    public int getNumberTh()
    {
        return gioTuHoc;
    }//end method
    //method setType
    public void setType(String loaiMonHoc)
    {
        this.loaiMonHoc = loaiMonHoc;
    }
    //method getType
    public String getType()
    {
        return loaiMonHoc;
    }//end method
    
    //method setTq
    public void setTq(String monTienQuyet)
    {
        this.monTienQuyet = monTienQuyet;
    }
    //method getTq
    public String getTq()
    {
        return monTienQuyet;
    }//end method
    
    //method checkNumber ( kiểm tra hợp lệ của các đối )
    public boolean checkNumber(int soTinChi,int gioLyThuyet,int gioThucHanh,int gioTuHoc)
    {
        if(soTinChi*15 == gioLyThuyet + gioThucHanh + gioTuHoc)
            return true;
        else 
            return false;
    }
    
    //Overriding toString
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n");
        buffer.append(tenMonHoc);
        buffer.append("\t");
        buffer.append(maMonHoc);
        buffer.append("\t");
        buffer.append(soTinChi);
        buffer.append("\t");
        buffer.append(gioLyThuyet);
        buffer.append("\t");
        buffer.append(gioThucHanh);
        buffer.append("\t");
        buffer.append(gioTuHoc);
        buffer.append("\t");
        buffer.append(loaiMonHoc);
        buffer.append("\t");
        buffer.append(monTienQuyet);
        buffer.append("\t");
        buffer.append(dieuKien);
        buffer.append("\t");
        
        return buffer.toString();
    }
}
