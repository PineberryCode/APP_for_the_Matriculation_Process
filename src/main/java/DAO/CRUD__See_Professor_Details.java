/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Professor;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD__See_Professor_Details extends Conexión__Data_Base{
    
    JTextArea txtA;
    
    public void Show_Professor_List (JTextArea textArea) {
        
        txtA = textArea;
        Professor professor = new Professor();
        
        try {
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT dni, nombres, apellidos FROM DOCENTE WHERE activo=true ORDER BY apellidos;");
            
            while (result_set.next()) { 
                professor.setDni(result_set.getInt(1));
                professor.setName(result_set.getString(2));
                professor.setLastname(result_set.getString(3));
                
                txtA.append(professor.Show_Some_Data());
            }
            connect.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Could not loaded the professor list.");
        }
    }
}
