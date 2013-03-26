/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package se;

/**
 *
 * @author 25512345
 */
public class Util {

      public static String chuanHoaTenGV(String name){
        String nameChuanHoa = "";
        if (!name.isEmpty()) {
            nameChuanHoa = name.trim().toLowerCase();
            char c = nameChuanHoa.charAt(0);
            nameChuanHoa = Character.toUpperCase(c) + nameChuanHoa.substring(1);
            for (int i = 0; i < nameChuanHoa.length(); i++){
               String s = "" + nameChuanHoa.charAt(i);
                if (s.equals(" ")){
                    nameChuanHoa = nameChuanHoa.substring(0, i) + " " + Character.toUpperCase(nameChuanHoa.charAt(i + 1)) + nameChuanHoa.substring(i + 2, nameChuanHoa.length());
                }
            }
        }
         
        return nameChuanHoa;
    } // Chuan hoa Ten GV

}
