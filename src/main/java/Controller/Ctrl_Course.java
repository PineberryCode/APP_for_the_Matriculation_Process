/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD_Course;
import DAO.Conexión__Data_Base;
import Model.Course;
import Model.Professor;
import Process.Interface_PlaceHolder;
import Process.P__frm_Course;
import View.frm_Course;
import View.frm_Menú;
import View.frm_Overview_Professor;
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

public class Ctrl_Course extends Conexión__Data_Base implements ActionListener, MouseListener, MouseMotionListener, Interface_PlaceHolder{
    
    frm_Course frm_course;
    frm_Overview_Professor frm_ver_docente;
    frm_Menú menú;
    Ctrl_Menú ctrl_menú;
    Ctrl_Overview_Professor ctrl_overview_professor;
    CRUD_Course crud_course;
    Course course;
    Professor professor;
    int x,y;
    
    public Ctrl_Course(frm_Course frm_c){
        frm_course = frm_c;
        P__frm_Course.Presentar__frm_course(frm_course);
        P__frm_Course.Bloq_Components_Init(frm_course);
        P__frm_Course.Complete_CMBX(frm_course);
        P__frm_Course.ImageFrame(frm_course);
        P__frm_Course.PlaceHolder(frm_course);
        Update_Table();
        frm_course.btn_register.addActionListener(this);
        frm_course.btn_search.addActionListener(this);
        frm_course.btn_modify.addActionListener(this);
        frm_course.btn_eliminate.addActionListener(this);
        frm_course.jMenuItem_professor.addActionListener(this);
        frm_course.btn_come_back.addActionListener(this);
        frm_course.jMenuBar.addMouseListener(this);
        frm_course.jMenuBar.addMouseMotionListener(this);
    }
    
    void Update_Table(){
        crud_course = new CRUD_Course();
        crud_course.Show_Course_Table(frm_course.jTable_course);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_course.btn_register){
            course = P__frm_Course.Register_Course_Data(frm_course);
            crud_course = new CRUD_Course();
            crud_course.Register_course(course);
            Update_Table();
        }
        if (e.getSource() == frm_course.btn_search){
            String nombre_curso = JOptionPane.showInputDialog(null, "Type the course name:");
            crud_course = new CRUD_Course();
            course = crud_course.Search_Course_Data(nombre_curso);
            
            if (course == null){
                JOptionPane.showMessageDialog(null, "Course name: "+nombre_curso+" not exist.");
            }else{
                P__frm_Course.Bloq_Components_Searching(frm_course);
                frm_course.txt_cod_course.setText(course.getId());
                frm_course.cmbx_course_name.setSelectedItem(course.getCourse_name());
                frm_course.txt_docente.setText(Integer.toString(course.getProfessor().getDni()));
                
                frm_course.cmbx_course_name.requestFocus();
            }
        }
        if (e.getSource() == frm_course.btn_modify){
            course = P__frm_Course.Read_Course_Input(frm_course);       
            crud_course = new CRUD_Course();
            crud_course.Modify_Course_Data(course);
            P__frm_Course.Bloq_Components_Init(frm_course);
            Update_Table();
        }
        if (e.getSource() == frm_course.btn_eliminate){
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (confirm == 0){
                crud_course = new CRUD_Course();
                crud_course.Eliminate_Course_Data(course);
                P__frm_Course.Bloq_Components_Init(frm_course);
                P__frm_Course.Clean_Course_Input(frm_course);
                Update_Table();
            }
        }
        if (e.getSource() == frm_course.jMenuItem_professor) {
            frm_ver_docente = new frm_Overview_Professor();
            ctrl_overview_professor = new Ctrl_Overview_Professor(frm_ver_docente, frm_course);
        }
        if (e.getSource() == frm_course.btn_come_back){
            menú = new frm_Menú();
            ctrl_menú = new Ctrl_Menú(menú);
            frm_course.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == frm_course.jMenuBar){
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
        if (e.getSource() == frm_course.jMenuBar){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
            
            frm_course.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
