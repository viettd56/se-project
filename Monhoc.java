/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se;


/**
 *
 * 
 */
public class MonHoc{
    private String tenMonHoc;   //ten mon hoc
    private String maMonHoc;    //ma mon hoc
    private int soTinChi, gioLyThuyet, gioThucHanh, gioTuHoc;       //so tin chi cua mon hoc
    private String loaiMonHoc;    //loai cua mon hoc
    private String monTienQuyet;  //ma mon hoc dieu kien tien quyet
    private boolean dieuKien;     //kiem tra dieu kien bat buoc hay tu chon cua mon hoc       
    
	//constructor non arguments
    public MonHoc()
    {
        tenMonHoc = "";
        maMonHoc = "";
        soTinChi = gioLyThuyet = gioThucHanh = gioTuHoc = 0;
        loaiMonHoc = "";
        monTienQuyet = "";
    }//end method
    
    //constructor with arguments
    public MonHoc(String tenMonHoc,String maMonHoc,int soTinChi,int gioLyThuyet,int gioThucHanh,
                int gioTuHoc,String loaiMonHoc,String monTienQuyet)
    {
        this.tenMonHoc = tenMonHoc;
        this.maMonHoc = maMonHoc;
        this.soTinChi = soTinChi;
        this.gioThucHanh = gioThucHanh;
        this.gioLyThuyet = gioLyThuyet;
        this.gioTuHoc = gioTuHoc;
        this.loaiMonHoc = loaiMonHoc;
        this.monTienQuyet = monTienQuyet;
        
    }//end constructor
    
    //method setTenMonHoc
    public void setTenMonHoc(String tenMonHoc)
    {
        this.tenMonHoc = tenMonHoc;
    }//end method
    
    //method getTenMonHoc 
    public String getTenMonHoc()
    {
        return tenMonHoc;
    }//end method
    
    //method setMaMonHoc
    public void setMaMonHoc(String maMonHoc)
    {
        this.maMonHoc = maMonHoc; 
    }//end method
    
    //method getMaMonHoc
    public String getMaMonHoc()
    {
        return maMonHoc;
    }//end method
    
    //method setTinChi
    public void setTinChi(int soTinChi,int gioLyThuyet,int gioThucHanh,int gioTuHoc)
    {
        if(checkTinChi(soTinChi, gioLyThuyet, gioThucHanh, gioTuHoc) == true)
        {
            this.soTinChi = soTinChi;
            this.gioLyThuyet = gioLyThuyet;
            this.gioThucHanh = gioThucHanh;
            this.gioTuHoc = gioTuHoc;
        }
    }//end method
    
    //method getSoTinChi
    public int getSoTinChi()
    {
        return soTinChi;
    }//end method
    
    //method getLyThuyet
    public int getLyThuyet()
    {
        return gioLyThuyet;
    }//end method
    
    //method getThucHanh
    public int getThucHanh()
    {
        return gioThucHanh;
    }//end method
    
    //method getTuHoc
    public int getTuHoc()
    {
        return gioTuHoc;
    }//end method
    //method setLoaiMonHoc
    public void setLoaiMonHoc(String loaiMonHoc)
    {
        this.loaiMonHoc = loaiMonHoc;
    }
    //method getLoaiMonHoc
    public String getLoaiMonHoc()
    {
        return loaiMonHoc;
    }//end method
    
    //method setMonTienQuyet
    public void setMonTienQuyet(String monTienQuyet)
    {
        this.monTienQuyet = monTienQuyet;
    }
    //method getMonTienQuyet
    public String getMonTienQuyet()
    {
        return monTienQuyet;
    }//end method
    
    //method checkTinChi ( kiểm tra hợp lệ của các đối )
    public boolean checkTinChi(int soTinChi,int gioLyThuyet,int gioThucHanh,int gioTuHoc)
    {
        if(soTinChi*15 == gioLyThuyet + gioThucHanh + gioTuHoc)
            return true;
        else 
            return false;
    }//end method
	
	//method setDieuKien ( true = bat buoc; false = tu chon )
	public void setDieuKien(boolean dieuKien)
	{
		this.dieuKien = dieuKien;
	}//end method
	
	//method getDieuKien
	public boolean getDieuKien()
	{
		return dieuKien;
	}//end method
}

