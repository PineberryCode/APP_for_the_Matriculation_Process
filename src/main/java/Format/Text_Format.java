/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Format;


/**
 *
 * @author MINDLUNNY
 */
public class Text_Format {
    public static String Generate_Course_Cod(String string, String s_string){
        String semi_cod = "COU";
        
        return semi_cod.concat(string).concat(s_string);
    }
    
    public static String Generate_Matrícula_Cod (int num) {
        String semi_cod = "MA2023_";
        String converted_num = String.valueOf(num);
        
        return semi_cod.concat(converted_num);
    }
}
