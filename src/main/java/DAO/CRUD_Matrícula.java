/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Student;
import Model.Course;
import Model.Matrícula;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINDLUNNY
 */
public class CRUD_Matrícula extends Conexión__Data_Base{
    public CRUD_Matrícula(){}
    
    public void Show_Table(JTable table){
        String[] títulos = {"COD","Course name","DNI student","Student names","Student lastname","Registration Date"};
        
        DefaultTableModel model = new DefaultTableModel(null, títulos);
        table.setModel(model);
        
        Course curso = new Course();
        Student alumno = new Student();
        Matrícula matrícula = new Matrícula();
        
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT m.cod, c.nombre, a.dni, a.nombres, a.apellidos, m.local_date" + "\n"+
                                                "FROM MATRÍCULA m" + "\n"+
                                                "INNER JOIN CURSO c" + "\n"+
                                                "ON m.cod_curso = c.id" + "\n"+
                                                "INNER JOIN ALUMNO a" + "\n"+
                                                "ON m.dni_alumno = a.dni;");
            
            while (result_set.next()){
                matrícula.setCod_matrícula(result_set.getString(1));
                curso.setCourse_name(result_set.getString(2));
                matrícula.setCourse(curso);
                alumno.setDni(result_set.getInt(3));
                alumno.setName(result_set.getString(4));
                alumno.setLastname(result_set.getString(5));
                matrícula.setStudent(alumno);
                matrícula.setLocal_date(result_set.getDate(6));
                        
                model.addRow(matrícula.Registro());
            }
            connect.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
    
    public void Register_Matrícula (Matrícula matrícula){
        
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("INSERT INTO MATRÍCULA VALUES(?,?,?,?);");
            
            prepared_statement.setString(1, matrícula.getCod_matrícula());
            prepared_statement.setString(2, matrícula.getCourse().getId());
            prepared_statement.setInt(3, matrícula.getStudent().getDni());
            prepared_statement.setDate(4, new java.sql.Date (((Date) matrícula.getLocal_date()).getTime()));
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully registration.");
            connect.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Could not register the matrícula data. Error: " +ex);
        }
    }
    
    public Matrícula Search_Matrícula (int DNI){
        Course curso;
        Student alumno;
        Matrícula matrícula = null;
        
        try{
            statement = StayConnection().createStatement();
            result_set = statement.executeQuery("SELECT m.cod, m.cod_curso, c.nombre, a.dni, a.nombres, a.apellidos, m.local_date" + "\n"+
                                                "FROM MATRÍCULA m" + "\n"+
                                                "INNER JOIN CURSO c" + "\n"+
                                                "ON m.cod_curso = c.id" + "\n"+
                                                "INNER JOIN ALUMNO a" + "\n"+
                                                "ON m.dni_alumno = a.dni"+"\n"+
                                                "WHERE a.dni='"+DNI+"';");
            
            if (result_set.next()){
                curso = new Course();
                alumno = new Student();
                matrícula = new Matrícula();
                matrícula.setCod_matrícula(result_set.getString(1));
                curso.setId(result_set.getString(2));
                matrícula.setCourse(curso);
                alumno.setDni(result_set.getInt(4));
                matrícula.setStudent(alumno);
                matrícula.setLocal_date(result_set.getDate(7));
            }
            connect.close();
        }catch(Exception exc){
            JOptionPane.showMessageDialog(null, "ERROR: "+exc);
        }
        return matrícula;
    }
    
    public void Update_Matrícula_Data(Matrícula matrícula){
        
        try{
            connect = StayConnection();
            prepared_statement = connect.prepareStatement("UPDATE MATRÍCULA SET cod_curso=?, dni_alumno=?, local_date=? WHERE cod=?;");
            
            prepared_statement.setString(1, matrícula.getCourse().getId());
            prepared_statement.setInt(2, matrícula.getStudent().getDni());
            prepared_statement.setDate(3, new java.sql.Date (((Date) matrícula.getLocal_date()).getTime()));
            prepared_statement.setString(4, matrícula.getCod_matrícula());
            
            prepared_statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "It is updated the matrícula data.");
            connect.close();
        }catch(SQLException excep){
            JOptionPane.showMessageDialog(null, "ERROR: " +excep.toString());
        }
    }
}
