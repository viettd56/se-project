
package se;

public class GiangVien {
    private String hoTen;
    private String chucDanh;
    private String chuyenNganh;
    private String donVi;

    public GiangVien(String hoTen, String chucDanh, String chuyenNganh, String donVi) {
        this.hoTen = Util.chuanHoaTenGV(hoTen);
        this.chucDanh = chucDanh;
        this.chuyenNganh = chuyenNganh;
        this.donVi = donVi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = Util.chuanHoaTenGV(hoTen);
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
   
}
