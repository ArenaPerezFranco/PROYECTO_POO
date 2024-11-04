/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientes;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Clientes {
  private String Nombre;
  private String Apellido;
    private int Telefono;
    private String Curp;
    private String Correo;

    
    
    public Clientes (String Nombre,String Apellido, int Telefono, String Curp, String Correo){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Curp = Curp;
        this.Correo = Correo;
    }
     public String getNombre(){
        return Nombre;
  
}
       public void setNombre(String Nombre){
        this.Nombre = Nombre;
       }
        
     public String getApellido(){
        return Apellido;
  
}
       public void setApellido(String Apellido){
        this.Apellido = Apellido;
       }

       public int getTelefono(){
        return Telefono;
  
}
       public void setTelefono(int Telefono){
        this.Telefono = Telefono;
       }
       public String getCurp(){
        return Curp;
  
}
       public void setCutp(String Curp){
        this.Curp = Curp;
       }
        
     public String getCorreo(){
        return Correo;
  
}
       public void setCorreo(String Correo){
        this.Correo = Correo;
       }
@Override
       public String toString(){
       return "El nombre del cliente es: " + Nombre + "Su apellido es: " + Apellido + "su telefono es:" + Telefono + " y su curp es: " + Curp + "Su correo es: " + Correo;
       }
  @Override
       public boolean equals(Object obj){
       if(this == obj) return true;
       if(obj == null || getClass() != obj.getClass()) return false;
       Clientes clien = (Clientes)obj;
       return Nombre.equals(clien.Nombre) && Apellido.equals(clien.Apellido) &&  Curp.equals(clien.Curp) && Correo.equals(clien.Correo);
       }
  @Override
       public int hashCode(){
       return Objects.hash(Nombre, Apellido, Curp, Correo);
       }


}