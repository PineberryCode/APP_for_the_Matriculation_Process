/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 * 
 * @author MINDLUNNY
 */

public class Matrícula {
    private String cod_matrícula;
    private Course course;
    private Student student;
    private Date local_date;
    public static int cont = 0;
    
    public String getCod_matrícula() {
        return cod_matrícula;
    }

    public void setCod_matrícula(String cod_matrícula) {
        this.cod_matrícula = cod_matrícula;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getLocal_date() {
        return local_date;
    }

    public void setLocal_date(Date local_date) {
        this.local_date = local_date;
    }
    
    public Object[] Registro(){
        Object[] fila = {this.cod_matrícula,this.course.getCourse_name(),this.student.getDni(),
                        this.student.getName(), this.student.getLastname(),this.local_date};
        return fila;
    }

}
