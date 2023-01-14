/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Course;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD__See_Course_Details extends Conexión__Data_Base{
    
    JTextArea txtA;
    
    public void Show_Course_List (JTextArea textArea) {
        
        txtA = textArea;
        Course course = new Course();
        
        try {
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT id, nombre FROM CURSO ORDER BY CAST(SUBSTRING(id,4,2) AS UNSIGNED INT);;");
            
            while (result_set.next()){
                course.setId(result_set.getString(1));
                course.setCourse_name(result_set.getString(2));
                
                txtA.append(course.Show_Course_Details());
            }
            connect.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Could not loaded the course list."+e);
        }
    }
    
}
