package se;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static ArrayList<MonHoc> arrayMonHocs; //List chua cac MonHoc da duoc nhap
    private static ArrayList<GiangVien> arrayGiangViens; //List chua cac GiangVien da duoc nhap
    private static ArrayList<String> arrayTenMonHocs; //List chua ten cac MonHoc da duoc nhap
    private static ArrayList<String> arrayMaMonHocs; //List chua cac ma MonHoc da duoc nhap
    private static ArrayList<String> arrayTenGiangViens; //List chua ten cac GiangVien da duoc nhap
    private static ArrayList<User> arrayUserNames; //List chua cac User da duoc nhap
    private static Hashtable<String, MonHoc> htMaMonHoc; //Hash Table key la ma MonHoc, value la MonHoc
    private static Hashtable<String, MonHoc> htTenMonHoc; //Hash Table key la ten MonHoc, value la MonHoc
    private static Hashtable<String, GiangVien> htTenGiangVien; //Hash Table key la ten GiangVien, value la GiangVien

    /**
     * @param args the command line arguments
     */
    //Ham saveToFile ghi arrayMonHocs ra file dataMonHoc, arrayGiangViens ra file dataGiangVien, arrayUserNames ra file dataUser
    public static void saveToFile() {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            //Ghi arrayMonHocs ra file dataMonHoc
            File file = new File("dataMonHoc");
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeInt(arrayMonHocs.size());
            for (MonHoc temp : arrayMonHocs) {
                objectOutputStream.writeObject(temp);
            }
            objectOutputStream.close();

            //Ghi arrayGiangViens ra file dataGiangVien
            file = new File("dataGiangVien");
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeInt(arrayGiangViens.size());
            for (GiangVien temp : arrayGiangViens) {
                objectOutputStream.writeObject(temp);
            }
            objectOutputStream.close();

            //Ghi arrayUserNames ra file dataUser
            file = new File("dataUser");
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.write(arrayUserNames.size());
            for (User temp : arrayUserNames) {
                objectOutputStream.writeObject(temp);
            }
            objectOutputStream.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    //Ham loadFromFile doc arrayMonHocs tu file dataMonHoc, arrayGiangViens tu file dataGiangVien, arrayUserNames tu file dataUser
    public static void loadFromFIle() {
        newData();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {

            // doc arrayMonHocs tu file dataMonHoc
            // add arrayTenMonHocs
            // add arrayMaMonHocs
            // add htMaMonHoc
            // add htTenMonHoc
            File file = new File("dataMonHoc");
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object obj = null;

            String maMonHoc = null;
            String tenMonHoc = null;
            int size = objectInputStream.readInt();
            for (int i = 0; i < size; i++) {
                obj = objectInputStream.readObject();
                if (obj instanceof MonHoc) {
                    MonHoc objMonHoc = (MonHoc) obj;
                    maMonHoc = objMonHoc.getMaMonHoc();
                    tenMonHoc = objMonHoc.getTenMonHoc();

                    arrayMonHocs.add(objMonHoc);
                    arrayTenMonHocs.add(tenMonHoc);
                    arrayMaMonHocs.add(maMonHoc);
                    htMaMonHoc.put(maMonHoc, objMonHoc);
                    htTenMonHoc.put(tenMonHoc, objMonHoc);
                }
            }
            objectInputStream.close();

            //-----------------------------------------------------------------


            //doc arrayGiangViens tu file dataGiangVien
            //add arrayTenGiangVien
            //add htTenGiangVien


            file = new File("dataGiangVien");
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            obj = null;
            String tenGiangVien = null;

            size = objectInputStream.readInt();
            for (int i = 0; i < size; i++) {
                obj = objectInputStream.readObject();
                if (obj instanceof GiangVien) {
                    GiangVien objGiangVien = (GiangVien) obj;
                    tenGiangVien = objGiangVien.getHoTen();

                    arrayGiangViens.add(objGiangVien);
                    arrayTenGiangViens.add(tenGiangVien);
                    htTenGiangVien.put(tenGiangVien, objGiangVien);
                }
            }
            objectInputStream.close();

            //-----------------------------------------------------------------------------

            //doc arrayUserNames tu file dataUser
            file = new File("dataUser");
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            obj = null;
            size = objectInputStream.readInt();
            for (int i = 0; i < size; i++) {
                obj = objectInputStream.readObject();
                if (obj instanceof User) {
                    arrayUserNames.add((User) obj);
                }
            }
            objectInputStream.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                objectInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void newData() {
        arrayMonHocs = new ArrayList<MonHoc>();
        arrayTenMonHocs = new ArrayList<String>();
        arrayMaMonHocs = new ArrayList<String>();
        htMaMonHoc = new Hashtable<String, MonHoc>();
        htTenMonHoc = new Hashtable<String, MonHoc>();
        arrayGiangViens = new ArrayList<GiangVien>();
        arrayTenGiangViens = new ArrayList<String>();
        htTenGiangVien = new Hashtable<String, GiangVien>();
        arrayUserNames = new ArrayList<User>();
    }

    public static void main(String[] args) {
    }
}