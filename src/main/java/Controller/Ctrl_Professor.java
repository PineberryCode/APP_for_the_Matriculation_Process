/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD_Professor;
import Model.Professor;
import Process.P__frm_Professor;
import View.frm_Professor;
import View.frm_Menú;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author MINDLUNNY
 */
public class Ctrl_Professor implements ActionListener, MouseListener, MouseMotionListener{
    frm_Professor frm_professor;
    frm_Menú menú;
    Ctrl_Menú ctrl_menú;
    CRUD_Professor crud_professor;
    Professor professor;
    int x,y;
    
    public Ctrl_Professor(frm_Professor frm_p){
        frm_professor = frm_p;
        P__frm_Professor.Presentar_frm_Professor(frm_professor);
        P__frm_Professor.Init_Bloq_Components(frm_professor);
        P__frm_Professor.ImageFrame(frm_professor);
        P__frm_Professor.PlaceHolder(frm_professor);
        Update_Table();
        frm_professor.btn_Group_Activo.add(frm_professor.rb_yes);
        frm_professor.btn_Group_Activo.add(frm_professor.rb_no);
        frm_professor.btn_register.addActionListener(this);
        frm_professor.btn_search.addActionListener(this);
        frm_professor.btn_modify.addActionListener(this);
        frm_professor.btn_come_back.addActionListener(this);
        frm_professor.line_top.addMouseListener(this);
        frm_professor.line_top.addMouseMotionListener(this);
    }
    
    void Update_Table(){
        crud_professor = new CRUD_Professor();
        crud_professor.Show_Professor_Table(frm_professor.jTable_professor);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_professor.btn_register){
            professor = P__frm_Professor.Read_Input(frm_professor);
            crud_professor = new CRUD_Professor();
            crud_professor.Register_Professor(professor);
            Update_Table();
        }
        if (e.getSource() == frm_professor.btn_search){
            int DNI = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the DNI:"));
            crud_professor = new CRUD_Professor();
            professor = crud_professor.Search_Professor_Data(DNI);
            
            if (professor == null){
                JOptionPane.showMessageDialog(null, "El dni: "+DNI+ " not exist");
            }else{
                frm_professor.txt_DNI.setText(Integer.toString(professor.getDni()));
                frm_professor.txt_name.setText(professor.getName());
                frm_professor.txt_lastname.setText(professor.getLastname());
                frm_professor.jFormatted_birthday.setDate(professor.getBirthday());
                frm_professor.txt_cel.setText(Integer.toString(professor.getCelphone()));
                frm_professor.txt_email.setText(professor.getE_mail());
                
                if (professor.isActive()){frm_professor.rb_yes.setSelected(true);}
                else if (professor.isActive()==false){frm_professor.rb_no.setSelected(true);}
                
                frm_professor.txt_DNI.requestFocus();
                
                P__frm_Professor.Second_Bloq_Components(frm_professor);
            }
        }
        if (e.getSource() == frm_professor.btn_modify){
            professor = P__frm_Professor.Read_Input(frm_professor);
            crud_professor = new CRUD_Professor();
            crud_professor.Modify_Professor_Data(professor);
            P__frm_Professor.Init_Bloq_Components(frm_professor);
            Update_Table();
        }
        if (e.getSource() == frm_professor.btn_come_back){
            menú = new frm_Menú();
            ctrl_menú = new Ctrl_Menú(menú);
            frm_professor.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == frm_professor.line_top){
            x = e.getX();
            y = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == frm_professor.line_top){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
            
            frm_professor.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
