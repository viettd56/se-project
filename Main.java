/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author i255
 */
public class Main {

    private ArrayList<MonHoc> arrayMonHocs; //List chua cac MonHoc da duoc nhap
    private ArrayList<GiangVien> arrayGiangViens; //List chua cac GiangVien da duoc nhap
    private ArrayList<String> arrayTenMonHocs; //List chua ten cac MonHoc da duoc nhap
    private ArrayList<String> arrayMaMonHocs; //List chua cac ma MonHoc da duoc nhap
    private ArrayList<String> arrayTenGiangViens; //List chua ten cac GiangVien da duoc nhap
    private ArrayList<User> arrayUserNames; //List chua cac User da duoc nhap
    
    private Hashtable<String, MonHoc> htMaMonHoc; //Hash Table key la ma MonHoc, value la MonHoc
    private Hashtable<String, MonHoc> htTenMonHoc; //Hash Table key la ten MonHoc, value la MonHoc
    private Hashtable<String, GiangVien> htTenGiangVien; //Hash Table key la ten GiangVien, value la GiangVien
    
    /**
     * @param args the command line arguments
     */
    
   
     
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "ta DUC VIet";
        String nm = Main.chuanHoaTenGV(name);
        System.out.println(nm);
    }

}