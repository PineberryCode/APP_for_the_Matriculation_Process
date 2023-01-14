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
public class Professor{
    private int dni;
    private String name;
    private String lastname;
    private Date birthday;
    private int celphone;
    private String e_mail;
    private boolean active;

    public Professor(){}
    
    public int getDni() {return dni;}

    public void setDni(int dni) {this.dni = dni;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public Date getBirthday() {return birthday;}

    public void setBirthday(Date birthday) {this.birthday = birthday;}

    public int getCelphone() {return celphone;}

    public void setCelphone(int celphone) {this.celphone = celphone;}

    public String getE_mail() {return e_mail;}

    public void setE_mail(String e_mail) {this.e_mail = e_mail;}

    public boolean isActive() {return active;}

    public void setActive(boolean active) {this.active = active;}
    
    public Object[] Registration(){
        Object[] fila = {this.dni,this.name,this.lastname,this.birthday,
                        this.celphone,this.e_mail,this.active};
        
        return fila;
    }
    
    public String Show_Some_Data () {
        return  "\n***********************************************************************"+
                "\nDni: "+this.dni+
                "\nNombres: "+this.name+
                "\nApellidos:   "+this.lastname+
                "\n***********************************************************************\n";
    }
    
}
