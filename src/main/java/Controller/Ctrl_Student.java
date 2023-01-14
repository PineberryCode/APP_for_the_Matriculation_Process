/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD_Student;
import Model.Student;
import Process.P__frm_Student;
import View.frm_Student;
import View.frm_Matrícula;
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
public class Ctrl_Student implements ActionListener, MouseListener, MouseMotionListener{
    
    frm_Student frm_student;
    frm_Matrícula frmMatrícula;
    frm_Menú menú;
    Ctrl_Matrícula ctrl_matrícula;
    Ctrl_Menú ctrl_menú;
    CRUD_Student crud_student;
    Student student;
    int x,y;
    
    public Ctrl_Student(frm_Student frm_S){
        frm_student = frm_S;
        P__frm_Student.Presentar_frm_Student(frm_student);
        P__frm_Student.Bloq_Init(frm_student);
        P__frm_Student.Complete_CMBX(frm_student);
        P__frm_Student.ImageFrame(frm_student);
        P__frm_Student.PlaceHolder(frm_student);
        Update_Table();
        frm_student.btn_Group_Activo.add(frm_student.rb_yes);
        frm_student.btn_Group_Activo.add(frm_student.rb_no);
        frm_student.jMenuItem_matrícula_del_alumno.addActionListener(this);
        frm_student.btn_register.addActionListener(this);
        frm_student.btn_search.addActionListener(this);
        frm_student.btn_modify.addActionListener(this);
        frm_student.btn_come_back.addActionListener(this);
        frm_student.jMenuBar.addMouseListener(this);
        frm_student.jMenuBar.addMouseMotionListener(this);
    }
    
    void Update_Table(){
        crud_student = new CRUD_Student();
        crud_student.Show_Student_Table(frm_student.jTable_student);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_student.jMenuItem_matrícula_del_alumno){
            frmMatrícula = new frm_Matrícula();
            ctrl_matrícula = new Ctrl_Matrícula(frmMatrícula, frm_student);
        }
        if (e.getSource() == frm_student.btn_register){
            student = P__frm_Student.Read_Input(frm_student);
            crud_student = new CRUD_Student();
            crud_student.Register_Student(student);
            Update_Table();
        }
        if (e.getSource() == frm_student.btn_search){
            int DNI = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the DNI:"));
            crud_student = new CRUD_Student();
            student = crud_student.Search_Student_Data(DNI);
            
            if (student == null){
                JOptionPane.showMessageDialog(null, "DNI: "+DNI+" not exist.");
            }else{
                frm_student.txt_DNI.setText(Integer.toString(student.getDni()));
                frm_student.txt_name.setText(student.getName());
                frm_student.txt_lastname.setText(student.getLastname());
                frm_student.jFormatted_birthday.setDate(student.getBirthday());
                frm_student.cmbx_sección.setSelectedItem(student.getSección());
                frm_student.txt_emergency_cel_01.setText(Integer.toString(student.getEmergency_cel_01()));
                frm_student.txt_emergency_cel_02.setText(Integer.toString(student.getEmergency_cel_02()));
                
                if (student.isActive()){frm_student.rb_yes.setSelected(true);}
                else if (student.isActive() == false){frm_student.rb_no.setSelected(true);}
                frm_student.txt_DNI.requestFocus();
                
                P__frm_Student.Bloq_Second(frm_student);
            }
        }
        if (e.getSource() == frm_student.btn_modify){
            student = P__frm_Student.Read_Input(frm_student);
            crud_student = new CRUD_Student();
            crud_student.Modify_Student_Data(student);
            P__frm_Student.Bloq_Init(frm_student);
            Update_Table();
        }
        if (e.getSource() == frm_student.btn_come_back){
            menú = new frm_Menú();
            ctrl_menú = new Ctrl_Menú(menú);
            frm_student.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == frm_student.jMenuBar){
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
        if (e.getSource() == frm_student.jMenuBar){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
            
            frm_student.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
