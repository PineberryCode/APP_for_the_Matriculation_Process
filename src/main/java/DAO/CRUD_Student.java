/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Student;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD_Student extends Conexión__Data_Base{
    public CRUD_Student(){}
    
    public void Show_Student_Table(JTable table){
        
        String[] titles = {"DNI","Name","Lastname","Birthday","Sección","Celphone 01","Celphone 02","Active"};
        
        DefaultTableModel model = new DefaultTableModel(null, titles);
        table.setModel(model);
        
        Student student = new Student();
        
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT * FROM ALUMNO WHERE activo=true ORDER BY apellidos;");
            while (result_set.next()){
                student.setDni(result_set.getInt(1));
                student.setName(result_set.getString(2));
                student.setLastname(result_set.getString(3));
                student.setBirthday(result_set.getDate(4));
                student.setSección(result_set.getString(5));
                student.setEmergency_cel_01(result_set.getInt(6));
                student.setEmergency_cel_02(result_set.getInt(7));
                student.setActive(result_set.getBoolean(8));
                
                model.addRow(student.Registration());
            }
            connect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Couldn't load the data table. Error: "+e);
        }
       
    }
    
    public void Register_Student(Student student){
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?,?);");
            
            prepared_statement.setInt(1, student.getDni());
            prepared_statement.setString(2, student.getName());
            prepared_statement.setString(3, student.getLastname());
            prepared_statement.setDate(4, new java.sql.Date (((Date) student.getBirthday()).getTime()));
            prepared_statement.setString(5, student.getSección());
            prepared_statement.setInt(6, student.getEmergency_cel_01());
            prepared_statement.setInt(7, student.getEmergency_cel_02());
            prepared_statement.setBoolean(8, student.isActive());
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully registered Student data.");
            connect.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Cannot register the student data. Error: "+ex);
        }
    }
    
    public Student Search_Student_Data (int DNI){
        Student student = null;
        
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT * FROM ALUMNO WHERE dni="+DNI+";");
            
            if (result_set.next()){
                student = new Student();
                student.setDni(result_set.getInt(1));
                student.setName(result_set.getString(2));
                student.setLastname(result_set.getString(3));
                student.setBirthday(result_set.getDate(4));
                student.setSección(result_set.getString(5));
                student.setEmergency_cel_01(result_set.getInt(6));
                student.setEmergency_cel_02(result_set.getInt(7));
                student.setActive(result_set.getBoolean(8));
            }
            connect.close();
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "ERROR: "+exc);
        }
        return student;
    }
    
    public void Modify_Student_Data (Student student){
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("UPDATE ALUMNO SET nombres=?,apellidos=?, fecha_nacimiento=?, sección=?, teléfono_emer_01=?, teléfono_emer_02=?, activo=? WHERE dni=?;");
        
            prepared_statement.setString(1, student.getName());
            prepared_statement.setString(2, student.getLastname());
            prepared_statement.setDate(3, new java.sql.Date (((Date) student.getBirthday()).getTime()));
            prepared_statement.setString(4, student.getSección());
            prepared_statement.setInt(5, student.getEmergency_cel_01());
            prepared_statement.setInt(6, student.getEmergency_cel_02());
            prepared_statement.setBoolean(7, student.isActive());
            prepared_statement.setInt(8, student.getDni());
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student data have been modified.");
            connect.close();
        }catch(SQLException exce){
            JOptionPane.showMessageDialog(null, "Error: "+exce.toString());
        }
    }
}
