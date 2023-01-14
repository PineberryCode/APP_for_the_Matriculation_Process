/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MINDLUNNY
 */
public class Conexión__Data_Base implements Parameters{
    public Connection connect = null;
    public Statement statement;
    public ResultSet result_set;
    public PreparedStatement prepared_statement;
    public ResultSetMetaData meta_data;
    
    
    public Connection StayConnection(){
        try{
            Class.forName(driver);
            connect=DriverManager.getConnection(cadena,user,clave);
            statement = connect.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Could not connect to the database: " + e.toString());
        }
        return connect;
    }
}
