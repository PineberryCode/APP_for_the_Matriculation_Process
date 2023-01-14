/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MINDLUNNY
 */
public class Course {
    private String id;
    private String course_name;
    private Professor professor;
    
    public String getId() {return id;}

    public void setId(String id) {this.id = id;}

    public String getCourse_name() {return course_name;}

    public void setCourse_name(String course_name) {this.course_name = course_name;}

    public Professor getProfessor() {return professor;}

    public void setProfessor(Professor professor) {this.professor = professor;}

    
    public Object[] Registration(){
        Object fila[] = {this.id, this.course_name, this.professor.getDni(), this.professor.getName(),
                        this.professor.getLastname()};
        
        return fila;
    }
    
    public String Show_Course_Details () {
        return  "\n***********************************************************************"+
                "\nCódigo del curso:  "+this.id+
                "\nNombre del curso: "+this.course_name+
                "\n***********************************************************************\n";
    }

}
