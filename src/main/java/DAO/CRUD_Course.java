/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Course;
import Model.Professor;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD_Course extends Conexión__Data_Base{
    
    public CRUD_Course(){}
    
    public void Show_Course_Table(JTable table){
        
        String[] titles = {"Course ID", "Course name", "Professor DNI","Professor name","Professor lastname"};
        
        DefaultTableModel model = new DefaultTableModel(null, titles);
        table.setModel(model);
        
        Professor professor = new Professor();
        Course course = new Course();
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT c.id, c.nombre, c._dni, d.nombres, d.apellidos "+"\n"+
                                                "FROM CURSO c "+"\n"+
                                                "INNER JOIN DOCENTE d "+"\n"+
                                                "ON c._dni = d.dni" +"\n"+
                                                "ORDER BY CAST(SUBSTRING(id,4,2) AS UNSIGNED INT);");
            
            while (result_set.next()){
                course.setId(result_set.getString(1));
                course.setCourse_name(result_set.getString(2));
                professor.setDni(result_set.getInt(3));
                professor.setName(result_set.getString(4));
                professor.setLastname(result_set.getString(5));
                course.setProfessor(professor);
                
                model.addRow(course.Registration());
            }
            connect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public void Register_course (Course course){
        
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("INSERT INTO CURSO VALUES (?,?,?);");
            
            prepared_statement.setString(1, course.getId());
            prepared_statement.setString(2, course.getCourse_name());
            prepared_statement.setInt(3, course.getProfessor().getDni());
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully registered data.");
            connect.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
    }
    
    public Course Search_Course_Data (String course_name){
        Professor professor;
        Course course = null;
        
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT * FROM CURSO HAVING nombre='"+course_name+"';");
            
            if (result_set.next()){
                professor = new Professor();
                course = new Course();
                course.setId(result_set.getString(1));
                course.setCourse_name(result_set.getString(2));
                professor.setDni(result_set.getInt(3));
                course.setProfessor(professor);
            }
            connect.close();
        }catch(Exception exe){
            JOptionPane.showMessageDialog(null, "ERROR: "+exe);
        }
        return course;
    }
    
    public void Modify_Course_Data (Course course){
        
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("UPDATE CURSO SET nombre=?, _dni=? WHERE id=?;");
            
            prepared_statement.setString(1, course.getCourse_name());
            prepared_statement.setInt(2, course.getProfessor().getDni());
            prepared_statement.setString(3, course.getId());
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Course data have been modified.");
            connect.close();
        }catch(SQLException excep){
            JOptionPane.showMessageDialog(null, "ERROR: "+excep.toString());
        }
    }
    
    public void Eliminate_Course_Data (Course course) {
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("DELETE FROM CURSO WHERE id=?;");
            
            prepared_statement.setString(1, course.getId());
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "COD course have been eliminated.");
            connect.close();
        }catch (SQLException error){
            JOptionPane.showMessageDialog(null, "ERROR: "+error.toString());
        }
    }
}
