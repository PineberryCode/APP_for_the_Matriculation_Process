/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD__See_Course_Details;
import Process.P__frm_Overview_Course;
import View.frm_Matrícula;
import View.frm_Overview_Course;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author MINDLUNNY
 */
public class Ctrl_Overview_Course implements ActionListener, MouseListener, MouseMotionListener{
    
    frm_Overview_Course frm_overview_course;
    frm_Matrícula frm_matrícula;
    CRUD__See_Course_Details crud_see_course_details;
    int x,y;
    
    public Ctrl_Overview_Course (frm_Overview_Course frm_o_c, frm_Matrícula frm_M) {
        frm_overview_course = frm_o_c;
        frm_matrícula = frm_M;
        P__frm_Overview_Course.To_Details_Course(frm_overview_course);
        Update_TextArea();
        frm_overview_course.btn_exit.addActionListener(this);
        frm_overview_course.jPanel_top.addMouseListener(this);
        frm_overview_course.jPanel_top.addMouseMotionListener(this);
        frm_matrícula.btn_come_back.addActionListener(this);
    }
    
    void Update_TextArea(){
        crud_see_course_details = new CRUD__See_Course_Details();
        crud_see_course_details.Show_Course_List(frm_overview_course.jTextArea_list_courses);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_overview_course.btn_exit || e.getSource() == frm_matrícula.btn_come_back){
            frm_overview_course.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == frm_overview_course.jPanel_top){
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
        if (e.getSource() == frm_overview_course.jPanel_top){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
            
            frm_overview_course.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
