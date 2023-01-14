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
public class Student{
    private int dni;
    private String name;
    private String lastname;
    private Date birthday;
    private String sección;
    private int emergency_cel_01;
    private int emergency_cel_02;
    private boolean active;

    public int getDni() {return dni;}

    public void setDni(int dni) {this.dni = dni;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public Date getBirthday() {return birthday;}

    public void setBirthday(Date birthday) {this.birthday = birthday;}

    public String getSección() {return sección;}

    public void setSección(String sección) {this.sección = sección;}

    public int getEmergency_cel_01() {return emergency_cel_01;}

    public void setEmergency_cel_01(int emergency_cel_01) {this.emergency_cel_01 = emergency_cel_01;}

    public int getEmergency_cel_02() {return emergency_cel_02;}

    public void setEmergency_cel_02(int emergency_cel_02) {this.emergency_cel_02 = emergency_cel_02;}

    public boolean isActive() {return active;}

    public void setActive(boolean active) {this.active = active;}
    
    public Object[] Registration(){
        Object[] fila = {this.dni,this.name,this.lastname,this.birthday,this.sección,this.emergency_cel_01,
                        this.emergency_cel_02,this.active};
        return fila;
    }
    
    public String Show_Student_Details () {
        return  "\n***********************************************************************"+
                "\nDNI:  "+this.dni+
                "\nNombres: "+this.name+
                "\nApellidos:   "+this.lastname+
                "\n***********************************************************************\n";
    }
}
