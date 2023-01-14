/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD__See_Professor_Details;
import Process.P__frm_Overview_Professor;
import View.frm_Course;
import View.frm_Overview_Professor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author MINDLUNNY
 */
public class Ctrl_Overview_Professor implements ActionListener, MouseListener, MouseMotionListener{
    
    frm_Overview_Professor frm_overview_professor;
    frm_Course frm_course;
    CRUD__See_Professor_Details crud_see_professor_details;
    int x, y;
    
    public Ctrl_Overview_Professor (frm_Overview_Professor frm_o_c, frm_Course frm_c) {
        frm_overview_professor = frm_o_c;
        frm_course = frm_c;
        P__frm_Overview_Professor.To_present_Professor(frm_overview_professor);
        Update_TextArea();
        frm_overview_professor.btn_exit.addActionListener(this);
        frm_overview_professor.bloq_top.addMouseListener(this);
        frm_overview_professor.bloq_top.addMouseMotionListener(this);
        frm_course.btn_come_back.addActionListener(this);
    }
    
    void Update_TextArea(){
        crud_see_professor_details = new CRUD__See_Professor_Details();
        crud_see_professor_details.Show_Professor_List(frm_overview_professor.jTextArea_list_professors);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_course.btn_come_back || e.getSource() == frm_overview_professor.btn_exit) {
            frm_overview_professor.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        if (e.getSource() == frm_overview_professor.bloq_top){
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
        
        if (e.getSource() == frm_overview_professor.bloq_top){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
        
            frm_overview_professor.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
