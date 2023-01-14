/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Format.Image_Format;
import Format.Text_Format;
import Model.Student;
import Model.Course;
import Model.Matrícula;
import View.frm_Matrícula;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MINDLUNNY
 */
public class P__frm_Matrícula implements Interface_PlaceHolder{
    
    public static void ImageFrame(frm_Matrícula frm_matrícula) {
        Image_Format.Set_Size_Image_Button(frm_matrícula.btn_come_back, "src/main/java/Image/arrow_back.png");
    }
    
    public static void Limpiar_Input_Matrícula(frm_Matrícula frmMatrícula){
        frmMatrícula.txt_código_matrícula.setText("");
        frmMatrícula.txt_id_curso.setText("");
        frmMatrícula.txt_student_dni.setText("");
        frmMatrícula.jDateChooser_Register.setCalendar(null);
        frmMatrícula.txt_código_matrícula.requestFocus();
    }
    
    public static void Bloq_Init (frm_Matrícula frmMatrícula){
        frmMatrícula.txt_código_matrícula.setEnabled(false);
        frmMatrícula.jDateChooser_Register.setEnabled(false);
        frmMatrícula.btn_register.setEnabled(true);
        frmMatrícula.btn_search.setEnabled(true);
        frmMatrícula.btn_modify.setEnabled(false);
    }
    
    public static void Bloq_Second (frm_Matrícula frmMatrícula){
        frmMatrícula.txt_código_matrícula.setEnabled(false);
        frmMatrícula.jDateChooser_Register.setEnabled(false);
        frmMatrícula.btn_register.setEnabled(false);
        frmMatrícula.btn_search.setEnabled(true);
        frmMatrícula.btn_modify.setEnabled(true);
    }
    
    public static String today_date () {
        Date date = new Date();
        SimpleDateFormat simple_date_format = new SimpleDateFormat("yyyy-MM-dd");
        
        return simple_date_format.format(date);
    }
    
    public static Matrícula Registrar_Input_Matrícula(frm_Matrícula frmMatrícula){
        
        int quantity_filas = frmMatrícula.jTable_Matriculados.getRowCount();
        
        Course curso = new Course();
        curso.setId(frmMatrícula.txt_id_curso.getText());
        
        Student alumno = new Student();
        alumno.setDni(Integer.parseInt(frmMatrícula.txt_student_dni.getText()));
        
        Matrícula matrícula = new Matrícula();
        matrícula.setCod_matrícula(Text_Format.Generate_Matrícula_Cod(quantity_filas));
        matrícula.setCourse(curso);
        matrícula.setStudent(alumno);
        matrícula.setLocal_date( (Date) frmMatrícula.jDateChooser_Register.getDate());
        
        Limpiar_Input_Matrícula(frmMatrícula);
        return matrícula;
    }
    
    public static void PlaceHolder (frm_Matrícula frmMatrícula) {
        TextPrompt txt__cod_matrícula = new TextPrompt (input__frm_matrícula__cod_matrícula, frmMatrícula.txt_código_matrícula, Color.WHITE);
        TextPrompt txt__cod_course = new TextPrompt (input__frm_matrícula__cod_course, frmMatrícula.txt_id_curso, Color.GRAY);
        TextPrompt txt__dni_student = new TextPrompt (input__frm_matrícula__dni_student, frmMatrícula.txt_student_dni, Color.GRAY);
    }
    
    public static void Presentar__frm_Matrícula(frm_Matrícula frmMatrícula){
        String str = "Microsoft YaHei UI-Plain-14";
        String str_bold = "Microsoft YaHei UI-Bold-14";
        frmMatrícula.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frmMatrícula.jMenuBar.setBorder(null);
        frmMatrícula.jMenuBar.setBackground(Color.BLACK);
        frmMatrícula.jMenu.setForeground(Color.WHITE);
        frmMatrícula.line_top.setBackground(Color.BLACK);
        frmMatrícula.line_left.setBackground(Color.BLACK);
        frmMatrícula.line_right.setBackground(Color.BLACK);
        frmMatrícula.line_bottom.setBackground(Color.BLACK);
        frmMatrícula.jMenuItem_course.setForeground(Color.WHITE);
        frmMatrícula.jMenuItem_course.setBackground(Color.BLACK);
        frmMatrícula.jMenuItem_student.setForeground(Color.WHITE);
        frmMatrícula.jMenuItem_student.setBackground(Color.BLACK);
        frmMatrícula.jMenuItem_file_matrícula.setForeground(Color.WHITE);
        frmMatrícula.jMenuItem_file_matrícula.setBackground(Color.BLACK);
        frmMatrícula.jLabel_title.setFont(Font.decode(str_bold));
        frmMatrícula.btn_register.setBorder(null);
        frmMatrícula.btn_register.setFont(Font.decode(str_bold));
        frmMatrícula.btn_register.setForeground(Color.WHITE);
        frmMatrícula.btn_register.setBackground(Color.BLACK);
        frmMatrícula.btn_search.setBorder(null);
        frmMatrícula.btn_search.setFont(Font.decode(str_bold));
        frmMatrícula.btn_search.setForeground(Color.WHITE);
        frmMatrícula.btn_search.setBackground(Color.BLACK);
        frmMatrícula.btn_modify.setBorder(null);
        frmMatrícula.btn_modify.setFont(Font.decode(str_bold));
        frmMatrícula.btn_modify.setForeground(Color.WHITE);
        frmMatrícula.btn_modify.setBackground(Color.BLACK);
        frmMatrícula.btn_come_back.setBorder(null);
        frmMatrícula.btn_come_back.setBackground(Color.BLUE);
        frmMatrícula.txt_código_matrícula.setBorder(null);
        frmMatrícula.txt_código_matrícula.setFont(Font.decode(str));
        frmMatrícula.txt_código_matrícula.setForeground(Color.WHITE);
        frmMatrícula.txt_código_matrícula.setBackground(Color.BLACK);
        frmMatrícula.txt_id_curso.setBorder(null);
        frmMatrícula.txt_id_curso.setFont(Font.decode(str));
        frmMatrícula.txt_id_curso.setForeground(Color.WHITE);
        frmMatrícula.txt_id_curso.setBackground(Color.BLACK);
        frmMatrícula.txt_student_dni.setBorder(null);
        frmMatrícula.txt_student_dni.setFont(Font.decode(str));
        frmMatrícula.txt_student_dni.setForeground(Color.WHITE);
        frmMatrícula.txt_student_dni.setBackground(Color.BLACK);
        frmMatrícula.jDateChooser_Register.setDateFormatString("yyyy-MM-dd");
        Calendar clndr = Calendar.getInstance();
        frmMatrícula.jDateChooser_Register.setCalendar(clndr);
        frmMatrícula.jTable_Matriculados.setBorder(null);
        frmMatrícula.jTable_Matriculados.setFont(Font.decode(str_bold));
        frmMatrícula.jTable_Matriculados.setForeground(Color.WHITE);
        frmMatrícula.jTable_Matriculados.setBackground(Color.BLACK);
        frmMatrícula.setLocationRelativeTo(null);
        frmMatrícula.setResizable(false);
        frmMatrícula.setVisible(true);
    }
    
}
