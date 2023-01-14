/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Student;
import javax.swing.JTextArea;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD_Ver_Detalle_Matrícula extends Conexión__Data_Base{
    
    JTextArea txA;
    
    public void Show_Matrícula (JTextArea jtextarea){
        txA = jtextarea;
        Student matrícula = new Student();
        
        try {
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("");
        }catch (Exception e){
            
        }
    }
    
}
