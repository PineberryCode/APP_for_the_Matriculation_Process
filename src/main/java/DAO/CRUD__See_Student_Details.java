/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Student;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD__See_Student_Details extends Conexión__Data_Base{
    JTextArea txtA;
    
    public void Show_Student_List (JTextArea textArea) {
        txtA = textArea;
        Student student = new Student();
        
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT dni, nombres, apellidos FROM ALUMNO ORDER BY apellidos;");
            
            while (result_set.next()) {
                student.setDni(result_set.getInt(1));
                student.setName(result_set.getString(2));
                student.setLastname(result_set.getString(3));
                
                txtA.append(student.Show_Student_Details());
            }
            connect.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Could not loaded the student list."+e);
        }
    }
}
