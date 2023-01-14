/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Professor;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD_Professor extends Conexión__Data_Base {
    
    public CRUD_Professor(){}
    
    public void Show_Professor_Table (JTable table){
        
        String[] title = {"DNI","Name","Lastname","Birthday","Celphone","E-mail","Active"};

        DefaultTableModel model = new DefaultTableModel(null, title);
        table.setModel(model);
        
        Professor professor = new Professor();
        
        try{
            statement = StayConnection().createStatement(); //always
            result_set = statement.executeQuery("SELECT * FROM DOCENTE WHERE activo=true ORDER BY apellidos;");
            while(result_set.next()){
                professor.setDni(result_set.getInt(1));
                professor.setName(result_set.getString(2));
                professor.setLastname(result_set.getString(3));
                professor.setBirthday(result_set.getDate(4));
                professor.setCelphone(result_set.getInt(5));
                professor.setE_mail(result_set.getString(6));
                professor.setActive(result_set.getBoolean(7));
                
                model.addRow(professor.Registration());
            }
            connect.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
    }
    
    public void Register_Professor (Professor professor){
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("INSERT INTO DOCENTE VALUES(?,?,?,?,?,?,?);");
            
            prepared_statement.setInt(1, professor.getDni());
            prepared_statement.setString(2, professor.getName());
            prepared_statement.setString(3, professor.getLastname());
            prepared_statement.setDate(4, new java.sql.Date (((Date) professor.getBirthday()).getTime()));
            prepared_statement.setInt(5, professor.getCelphone());
            prepared_statement.setString(6, professor.getE_mail());
            prepared_statement.setBoolean(7, professor.isActive());
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully registered professor data.");
            connect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "The professor data have not been registered. Error: "+e);
        }
    }
    
    public Professor Search_Professor_Data (int DNI){
        Professor professor = null;
        
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT * FROM DOCENTE WHERE dni="+DNI+";");
            
            if (result_set.next()){
                professor = new Professor();
                professor.setDni(result_set.getInt(1));
                professor.setName(result_set.getString(2));
                professor.setLastname(result_set.getString(3));
                professor.setBirthday(result_set.getDate(4));
                professor.setCelphone(result_set.getInt(5));
                professor.setE_mail(result_set.getString(6));
                professor.setActive(result_set.getBoolean(7));
            }
            connect.close();
        }catch (Exception exc){
            JOptionPane.showMessageDialog(null, "ERROR: "+exc);
        }
        
        return professor;
    }
    
    public void Modify_Professor_Data (Professor professor){
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("UPDATE DOCENTE SET nombres=?, apellidos=?, fecha_nacimiento=?, teléfono=?, e_mail=?, activo=? WHERE dni=?;");
            
            prepared_statement.setString(1, professor.getName());
            prepared_statement.setString(2, professor.getLastname());
            prepared_statement.setDate(3, new java.sql.Date (((Date) professor.getBirthday()).getTime()));
            prepared_statement.setInt(4, professor.getCelphone());
            prepared_statement.setString(5, professor.getE_mail());
            prepared_statement.setBoolean(6, professor.isActive());
            prepared_statement.setInt(7, professor.getDni());

            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Professor data have been modified.");
            connect.close();
        }catch(SQLException exce){
            JOptionPane.showMessageDialog(null,"Error: "+exce.toString());
        }
    }

}
