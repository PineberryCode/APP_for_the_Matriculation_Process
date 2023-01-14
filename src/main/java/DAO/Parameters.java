/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author MINDLUNNY
 */
public interface Parameters {
    final String driver = "com.mysql.cj.jdbc.Driver";
    final String user = "root";
    final String clave = "123456789";
    final String data_base = "DB_Intitu_SA";
    final String ip = "localhost";
    final String port = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+port+"/"+data_base;
}
