/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Format.Image_Format;
import Format.Text_Format;
import Model.Course;
import Model.Data_CMBX;
import Model.Professor;
import View.frm_Course;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author MINDLUNNY
 */

public class P__frm_Course extends Course implements Data_CMBX, Interface_PlaceHolder{
    
    public static void ImageFrame(frm_Course frm_course) {
        Image_Format.Set_Size_Image_Button(frm_course.btn_come_back, "src/main/java/Image/arrow_back.png");
    }
    
    public static void Clean_Course_Input(frm_Course frm_course){
        frm_course.txt_cod_course.setText("");
        frm_course.cmbx_course_name.setSelectedIndex(0);
        frm_course.txt_docente.setText("");
        frm_course.cmbx_course_name.requestFocus();
    }
    
    public static void Complete_CMBX (frm_Course frm_course) {
        frm_course.cmbx_course_name.removeAllItems();
        
        for (int i=0;i<LIST_COURSES.length;i++){
            frm_course.cmbx_course_name.addItem(LIST_COURSES[i]);
        }
    }
    
    public static void Bloq_Components_Init ( frm_Course frm_course ) {
        frm_course.btn_register.setEnabled(true);
        frm_course.btn_search.setEnabled(true);
        frm_course.btn_modify.setEnabled(false);
        frm_course.btn_eliminate.setEnabled(false);
        frm_course.txt_cod_course.setEnabled(false);
    }
    
    public static void Bloq_Components_Searching ( frm_Course frm_course) {
        frm_course.btn_register.setEnabled(false);
        frm_course.btn_search.setEnabled(true);
        frm_course.btn_modify.setEnabled(true);
        frm_course.btn_eliminate.setEnabled(true);
        frm_course.txt_cod_course.setEnabled(false);
    }
    
    public static Course Register_Course_Data(frm_Course frm_course){
        
        int quantity = frm_course.jTable_course.getRowCount();
        String quantityConverted = String.valueOf(quantity);
        
        Professor professor = new Professor();
        professor.setDni(Integer.parseInt(frm_course.txt_docente.getText()));
        
        Course course = new Course();
        course.setId(Text_Format.Generate_Course_Cod((frm_course.cmbx_course_name.getSelectedItem().toString()).substring(0,2),quantityConverted));
        course.setCourse_name(frm_course.cmbx_course_name.getSelectedItem().toString());
        course.setProfessor(professor);
        
        Clean_Course_Input(frm_course);
        
        return course;
        
    }
    
    public static Course Read_Course_Input (frm_Course frm_course){
        Professor professor = new Professor();
        professor.setDni(Integer.parseInt(frm_course.txt_docente.getText()));
        
        Course course = new Course();
        course.setId(frm_course.txt_cod_course.getText());
        course.setCourse_name(frm_course.cmbx_course_name.getSelectedItem().toString());
        course.setProfessor(professor);
        
        Clean_Course_Input(frm_course);
        
        return course;
    }
    
    public static void PlaceHolder (frm_Course frm_course) {
        TextPrompt txt_cod_course = new TextPrompt(input__frm_course__cod_course, frm_course.txt_cod_course, Color.WHITE);
        TextPrompt txt_professor_dni = new TextPrompt(input__frm_course__professor_dni, frm_course.txt_docente, Color.GRAY);
    }
    
    public static void Presentar__frm_course (frm_Course frm_course){
        String str = "Microsoft YaHei UI-Plain-14";
        String str_bold = "Microsoft YaHei UI-Bold-14";
        frm_course.getContentPane().setBackground(new java.awt.Color(182,0,230));
        frm_course.jMenuBar.setBorder(null);
        frm_course.jMenuBar.setBackground(Color.BLACK);
        frm_course.jMenu_see_details.setForeground(Color.WHITE);
        frm_course.jMenuItem_professor.setForeground(Color.WHITE);
        frm_course.jMenuItem_professor.setBackground(Color.BLACK);
        frm_course.line_top.setBackground(Color.BLACK);
        frm_course.line_left.setBackground(Color.BLACK);
        frm_course.line_right.setBackground(Color.BLACK);
        frm_course.line_bottom.setBackground(Color.BLACK);
        frm_course.jLabel_title.setFont(Font.decode(str_bold));
        frm_course.jLabel_course_name.setFont(Font.decode(str));
        frm_course.txt_cod_course.setBorder(null);
        frm_course.txt_cod_course.setFont(Font.decode(str));
        frm_course.txt_cod_course.setForeground(Color.WHITE);
        frm_course.txt_cod_course.setBackground(Color.BLACK);
        frm_course.cmbx_course_name.setBorder(null);
        frm_course.cmbx_course_name.setFont(Font.decode(str));
        frm_course.cmbx_course_name.setForeground(Color.WHITE);
        frm_course.cmbx_course_name.setBackground(Color.BLACK);
        frm_course.txt_docente.setBorder(null);
        frm_course.txt_docente.setFont(Font.decode(str));
        frm_course.txt_docente.setForeground(Color.WHITE);
        frm_course.txt_docente.setBackground(Color.BLACK);
        frm_course.btn_register.setBorder(null);
        frm_course.btn_register.setFont(Font.decode(str_bold));
        frm_course.btn_register.setForeground(Color.WHITE);
        frm_course.btn_register.setBackground(Color.BLACK);
        frm_course.btn_search.setBorder(null);
        frm_course.btn_search.setFont(Font.decode(str_bold));
        frm_course.btn_search.setForeground(Color.WHITE);
        frm_course.btn_search.setBackground(Color.BLACK);
        frm_course.btn_modify.setBorder(null);
        frm_course.btn_modify.setFont(Font.decode(str_bold));
        frm_course.btn_modify.setForeground(Color.WHITE);
        frm_course.btn_modify.setBackground(Color.BLACK);
        frm_course.btn_eliminate.setBorder(null);
        frm_course.btn_eliminate.setFont(Font.decode(str_bold));
        frm_course.btn_eliminate.setForeground(Color.WHITE);
        frm_course.btn_eliminate.setBackground(Color.BLACK);
        frm_course.btn_come_back.setBorder(null);
        frm_course.btn_come_back.setForeground(Color.WHITE);
        frm_course.btn_come_back.setBackground(Color.BLUE);
        frm_course.jTable_course.setBorder(null);
        frm_course.jTable_course.setFont(Font.decode(str_bold));
        frm_course.jTable_course.setForeground(Color.WHITE);
        frm_course.jTable_course.setBackground(Color.BLACK);
        frm_course.setLocationRelativeTo(null);
        frm_course.setResizable(false);
        frm_course.setVisible(true);
    }
}
