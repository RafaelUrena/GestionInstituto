/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author rafa
 */
public class Usuario {
    private int ID_user;
    private String email;
    private String nombre;
    private String clave;
    private int ID_depart;

    public Usuario() {
    }

    public Usuario(int ID_user, String email, String nombre, String clave, int ID_depart) {
        this.ID_user = ID_user;
        this.email = email;
        this.nombre = nombre;
        this.clave = clave;
        this.ID_depart = ID_depart;
    }

    public int getID_user() {
        return ID_user;
    }

    public void setID_user(int ID_user) {
        this.ID_user = ID_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getID_depart() {
        return ID_depart;
    }

    public void setID_depart(int ID_depart) {
        this.ID_depart = ID_depart;
    }

    @Override
    public String toString() {
        return "Usuario{" + "ID_user=" + ID_user + ", email=" + email + ", nombre=" + nombre + ", clave=" + clave + ", ID_depart=" + ID_depart + '}';
    }
    
    
}
