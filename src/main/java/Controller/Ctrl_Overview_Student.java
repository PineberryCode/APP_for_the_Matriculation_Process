/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD__See_Student_Details;
import Process.P__frm_Overview_Student;
import View.frm_Matrícula;
import View.frm_Overview_Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author MINDLUNNY
 */
public class Ctrl_Overview_Student implements ActionListener, MouseListener, MouseMotionListener{
    
    frm_Overview_Student frm_see_student_details;
    frm_Matrícula frm_matrícula;
    CRUD__See_Student_Details crud_see_student_details;
    int x,y;
    
    public Ctrl_Overview_Student (frm_Overview_Student frm_o_s, frm_Matrícula frm_M) {
        frm_see_student_details = frm_o_s;
        frm_matrícula = frm_M;
        P__frm_Overview_Student.To_Present_Student(frm_see_student_details);
        Update_TextArea();
        frm_see_student_details.btn_exit.addActionListener(this);
        frm_see_student_details.bloq_top.addMouseListener(this);
        frm_see_student_details.bloq_top.addMouseMotionListener(this);
        frm_matrícula.btn_come_back.addActionListener(this);
    }

    void Update_TextArea (){
        crud_see_student_details = new CRUD__See_Student_Details();
        crud_see_student_details.Show_Student_List(frm_see_student_details.jTextArea_list_students);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_see_student_details.btn_exit || e.getSource() == frm_matrícula.btn_come_back){
            frm_see_student_details.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == frm_see_student_details.bloq_top){
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
        if (e.getSource() == frm_see_student_details.bloq_top){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
            
            frm_see_student_details.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
