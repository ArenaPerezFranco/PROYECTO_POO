/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.ArrayList;
import java.util.List;
import clientes.Clientes;
/**
 *
 * @author DELL
 */
public class RepositorioClientes {
    private static final List<Clientes> RepositorioDeClientes = new ArrayList<>();
    
    public RepositorioClientes(){}
    
    public boolean addClientes(Clientes clientes){
        int posicion = RepositorioDeClientes.indexOf(clientes);
        if( posicion < 0){
            RepositorioDeClientes.add(clientes);
            return true;
        }
        return false;
    }
    
    public boolean modificarClientes(Clientes clientes){
        for(Clientes clientesRepositorio: RepositorioDeClientes){
            if(clientes.equals(clientesRepositorio)){
                int posicion = RepositorioDeClientes.indexOf(clientesRepositorio);
                RepositorioDeClientes.set(posicion, clientes);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarCliente(Clientes clientes){
        int posicion = -1;
        for(Clientes clientesRepositorio: RepositorioDeClientes){
            if(clientes.equals(clientesRepositorio)){
                posicion = RepositorioDeClientes.indexOf(clientesRepositorio);
                        break;
            }
        }
        if(posicion >-1){
            RepositorioDeClientes.remove(posicion);
            return true;
        }
        return false;
    }
    
    public Clientes buscarClientes(String Curp){
        for (Clientes clientes: RepositorioDeClientes){
            if(Curp.equals(clientes.getCurp())){
                return clientes;
            }
        }
        return null;
    }
    
    public static List<Clientes> getRepositorioDeClientes(){
        return RepositorioDeClientes;
    }
    
    public static Clientes[] getArregloDeClientes(){
        Clientes clientes[] = new Clientes[RepositorioDeClientes.size()];
        int indice = 0;
        for( Clientes Clientes: RepositorioDeClientes){
            clientes[indice] = Clientes;
            indice++;
        }
        return clientes;
    }

    public boolean EliminarClientes(Clientes clientes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


