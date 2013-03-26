/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.util.ArrayList;

/**
 *
 * @author i255
 */
public class GiangVien {
    private String hoTen;
    private String chucDanh;
    private String chuyenNganh;
    private String donVi;
    private ArrayList<MonHoc> monGiangDay;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public void setMonGiangDay(ArrayList<MonHoc> monGiangDay) {
        this.monGiangDay = monGiangDay;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public String getDonVi() {
        return donVi;
    }

    public ArrayList<MonHoc> getMonGiangDay() {
        return monGiangDay;
    }
    
    
}
