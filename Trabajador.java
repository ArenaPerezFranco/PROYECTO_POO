/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

/**
 *
 * @author jealt
 */
public class Trabajador {
    private String nombre;
    private String curp;
    private String RFC;
    private int sueldo;
    
    
    public Trabajador(String nombre, String curp, String RFC, int sueldo){
        this.nombre = nombre;
        this.curp = curp;
        this.RFC = RFC;
        this.sueldo = sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;    
    }
    
    public String getCurp(){
        return curp;
        
    }
    
    public void setCurp(String curp){
        this.curp = curp;
        
    }
    public String getRFC(){
        return RFC;
        
    }
    
    public void setRFC(String RFC){
        this.RFC = RFC;
    }
    
    public int getSueldo(){
       return sueldo;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    
    
}
