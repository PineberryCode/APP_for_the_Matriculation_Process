/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.Conexión__Data_Base;
import Process.P__frm_Log_In;
import View.frm_Log_In;
import View.frm_Menú;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author MINDLUNNY
 */

public class Ctrl_Log_In implements ActionListener{
    frm_Log_In Log_In;
    frm_Menú menú;
    Ctrl_Menú ctrl_menú;
    
    Conexión__Data_Base connect = new Conexión__Data_Base();
    
    public Ctrl_Log_In(frm_Log_In frmLogIn){
        Log_In = frmLogIn;
        P__frm_Log_In.Presentar__frm_Log_In(Log_In);
        P__frm_Log_In.PlaceHolder(Log_In);
        P__frm_Log_In.Match_Image_Label(Log_In);
        Log_In.btn_log_in.addActionListener(this);
        Log_In.btn_exit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ResultSet result_set = null;
        String usuario = Log_In.txt_user.getText();
        String password = new String(Log_In.jPassword.getPassword());
        
        String selectSQL = "SELECT * FROM USUARIO WHERE usuario='"+usuario+"'AND clave='"+password+"'";
        Statement ST = null;
        
        if (e.getSource() == Log_In.btn_log_in ){
            
            try {
                ST = connect.StayConnection().createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_Log_In.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                result_set = ST.executeQuery(selectSQL);
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_Log_In.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (result_set.next()){
                    menú = new frm_Menú();
                    ctrl_menú = new Ctrl_Menú(menú);
                    Log_In.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Ctrl_Log_In.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (e.getSource() == Log_In.btn_exit){
            System.exit(0);
        }
    }
    
}
