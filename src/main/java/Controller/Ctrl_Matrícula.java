/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD_Matrícula;
import DAO.Conexión__Data_Base;
import Model.Course;
import Model.Matrícula;
import Process.P__frm_Matrícula;
import View.frm_Student;
import View.frm_Matrícula;
import View.frm_Overview_Student;
import View.frm_Overview_Course;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author MINDLUNNY
 */

public class Ctrl_Matrícula extends Conexión__Data_Base implements ActionListener, MouseListener, MouseMotionListener{
    frm_Matrícula frm_matrícula;
    frm_Student frm_student;
    frm_Overview_Course frm_overview_course;
    frm_Overview_Student frm_overview_student;
    Ctrl_Student ctrl_student;
    Ctrl_Overview_Course ctrl_overview_course;
    Ctrl_Overview_Student ctrl_overview_student;
    CRUD_Matrícula crud_matrícula;
    Matrícula matrícula;
    Course course;
    int x,y;
    int parameter_dni;
    
    public Ctrl_Matrícula(frm_Matrícula frm_M, frm_Student frm_A){
        frm_matrícula = frm_M;
        frm_student = frm_A;
        P__frm_Matrícula.Presentar__frm_Matrícula(frm_matrícula);
        P__frm_Matrícula.Bloq_Init(frm_matrícula);
        P__frm_Matrícula.ImageFrame(frm_matrícula);
        P__frm_Matrícula.PlaceHolder(frm_matrícula);
        Update_Table();
        frm_matrícula.btn_register.addActionListener(this);
        frm_matrícula.btn_search.addActionListener(this);
        frm_matrícula.btn_modify.addActionListener(this);
        frm_matrícula.jMenuItem_course.addActionListener(this);
        frm_matrícula.jMenuItem_student.addActionListener(this);
        frm_matrícula.jMenuItem_file_matrícula.addActionListener(this);
        frm_matrícula.btn_come_back.addActionListener(this);
        frm_matrícula.jMenuBar.addMouseListener(this);
        frm_matrícula.jMenuBar.addMouseMotionListener(this);
        frm_student.btn_come_back.addActionListener(this);
    }
    
    void Update_Table(){
        crud_matrícula = new CRUD_Matrícula();
        crud_matrícula.Show_Table(frm_matrícula.jTable_Matriculados);
    }
    
    void Present_Matrícula (){
        String path_report = "C:\\Users\\MINDLUNNY\\Desktop\\Proyecto_POO_Java\\Project_POO\\src\\main\\java\\Report\\M_Report.jasper";
        
        try {
            Map parameter = new HashMap();
            parameter.put("DNI",parameter_dni);
            JasperPrint jasperprint = JasperFillManager.fillReport(path_report, parameter, StayConnection());
            JasperViewer jasperviewer = new JasperViewer(jasperprint,false);
            jasperviewer.setVisible(true);
        }catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Could not load the report. " + error);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm_matrícula.btn_register){
            matrícula = P__frm_Matrícula.Registrar_Input_Matrícula(frm_matrícula);
            crud_matrícula = new CRUD_Matrícula();
            crud_matrícula.Register_Matrícula(matrícula);
            Update_Table();
        }
        if (e.getSource() == frm_matrícula.btn_search){
            int DNI = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the DNI:"));
            crud_matrícula = new CRUD_Matrícula();
            matrícula = crud_matrícula.Search_Matrícula(DNI);
            
            if (matrícula == null){
                JOptionPane.showMessageDialog(null, "DNI: "+DNI+" not exist.");
            }else{
                frm_matrícula.txt_código_matrícula.setText(matrícula.getCod_matrícula());
                frm_matrícula.txt_id_curso.setText(matrícula.getCourse().getId());
                frm_matrícula.txt_student_dni.setText(Integer.toString(matrícula.getStudent().getDni()));
                frm_matrícula.jDateChooser_Register.setDate(matrícula.getLocal_date());
                
                frm_matrícula.txt_código_matrícula.requestFocus();
                
                P__frm_Matrícula.Bloq_Second(frm_matrícula);
            }
        }
        if (e.getSource() == frm_matrícula.btn_modify){
            matrícula = P__frm_Matrícula.Registrar_Input_Matrícula(frm_matrícula);
            
            crud_matrícula = new CRUD_Matrícula();
            crud_matrícula.Update_Matrícula_Data(matrícula);
            P__frm_Matrícula.Bloq_Init(frm_matrícula);
            Update_Table();
        }
        if (e.getSource() == frm_matrícula.jMenuItem_course){
            frm_overview_course = new frm_Overview_Course();
            ctrl_overview_course = new Ctrl_Overview_Course(frm_overview_course, frm_matrícula);
        }
        if (e.getSource() == frm_matrícula.jMenuItem_student){
            frm_overview_student = new frm_Overview_Student();
            ctrl_overview_student = new Ctrl_Overview_Student(frm_overview_student,frm_matrícula);
        }
        if (e.getSource() == frm_matrícula.jMenuItem_file_matrícula){
            parameter_dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the DNI:"));
            crud_matrícula = new CRUD_Matrícula();
            matrícula = crud_matrícula.Search_Matrícula(parameter_dni);
            if (matrícula == null){
                JOptionPane.showMessageDialog(null, "DNI: "+parameter_dni+" not exist");
            }
            else{
                Present_Matrícula();
            }
        }
        if (e.getSource() == frm_matrícula.btn_come_back || e.getSource() == frm_student.btn_come_back){
            frm_matrícula.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == frm_matrícula.jMenuBar){
            x = e.getX();
            y = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == frm_matrícula.jMenuBar){
            int xx = e.getXOnScreen();
            int yy = e.getYOnScreen();
            
            frm_matrícula.setLocation(xx-x,yy-y);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}
