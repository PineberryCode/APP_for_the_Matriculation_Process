/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Ctrl_Log_In;
import View.frm_Log_In;


/**
 *
 * @author MINDLUNNY
 */
public class Main {

    /**
    */
    
    public static frm_Log_In frmLogIn;
    public static Ctrl_Log_In ctrlLogIn;
    //public static frm_Menú menú;
    //public static Ctrl_Menú m;
    
    public static void main(String[] args) {
        frmLogIn = new frm_Log_In();
        ctrlLogIn = new Ctrl_Log_In(frmLogIn);
        /*menú = new frm_Menú();
        m = new Ctrl_Menú(menú)*/
        /*Conexión__Data_Base obj = new Conexión__Data_Base();
        obj.StayConnection();*/
    }
}
