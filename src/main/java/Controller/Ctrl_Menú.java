/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Process.P__frm_Menú;
import View.frm_Student;
import View.frm_Course;
import View.frm_Professor;
import View.frm_Log_In;
import View.frm_Menú;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author MINDLUNNY
 */

public class Ctrl_Menú implements ActionListener, MouseListener, MouseMotionListener{
    frm_Menú menú;
    frm_Professor frm_professor;
    frm_Course frm_course;
    frm_Student frm_student;
    frm_Log_In frm_log_in;
    Ctrl_Professor ctrl_professor;
    Ctrl_Course ctrl_course;
    Ctrl_Student ctrl_student;
    Ctrl_Log_In ctrl_log_in;
    int x,y;
    
    public Ctrl_Menú(frm_Menú frmMenú){
        menú = frmMenú;
        P__frm_Menú.Presentar__frm_Menú(menú);
        P__frm_Menú.Image_Frame(menú);
        menú.btn_student.addActionListener(this);
        menú.btn_professor.addActionListener(this);
        menú.btn_course.addActionListener(this);
        menú.btn_exit.addActionListener(this);
        menú.btn_change_user.addActionListener(this);
        menú.line_top.addMouseListener(this);
        menú.line_top.addMouseMotionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menú.btn_student){
            menú.dispose();
            frm_student = new frm_Student();
            ctrl_student = new Ctrl_Student(frm_student);
        }else if (e.getSource() == menú.btn_professor) {
            menú.dispose();
            frm_professor = new frm_Professor();
            ctrl_professor = new Ctrl_Professor(frm_professor);
        }else if (e.getSource() == menú.btn_course){
            menú.dispose();
            frm_course = new frm_Course();
            ctrl_course = new Ctrl_Course(frm_course);
        }else if (e.getSource() == menú.btn_change_user) {
            menú.dispose();
            frm_log_in = new frm_Log_In();
            ctrl_log_in = new Ctrl_Log_In(frm_log_in);
        }else if (e.getSource() == menú.btn_exit){
            System.exit(0);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == menú.line_top){
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
        if (e.getSource() == menú.line_top){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
            
            menú.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
