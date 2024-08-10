/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Enrique
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private boolean borrado;
    
    public Persona (String nombre, String apellido, boolean borrado){
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }
        public String getNombre(){
        return this.nombre;
    }
        public void setNombre(String nombre){
        this.nombre = nombre;
    }
        public String getApellido(){
        return this.apellido;
    }
        public void setApellido(String apellido){
        this.apellido = apellido;
    }
        public boolean isBorrado(){
        return this.borrado;
    }
        public void setBorrado(boolean borrado){
        this.borrado = borrado;
    }
        public String toString(){
        return "Persona { Nombre: " + nombre + ", Apellido: " + apellido + ", Borrado: " + borrado + '}';
    }
}
