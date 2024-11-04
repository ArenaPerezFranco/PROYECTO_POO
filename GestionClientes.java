/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import clientes.Clientes;
import Repositorio.RepositorioClientes;
/**
 *
 * @author DELL
 */
public class GestionClientes {

    private final RepositorioClientes ra = new RepositorioClientes();
    
    public GestionClientes(){
        
    }
    
    public void agregarCliente(){
        Clientes clientes = capturaDatos();
        if(ra.addClientes(clientes)){
            JOptionPane.showMessageDialog(null, "EXITO, CLIENTE AGREGADO", "GESTION DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "CLIENTE YA EXISTE", "GESTION DE CLIENTES", JOptionPane.ERROR_MESSAGE);
        }
        }
    
    public void modificarCliente(){
        Clientes clientes = capturaDatos();
        if(ra.modificarClientes(clientes)){
            JOptionPane.showMessageDialog(null,"EXITO, DATOS MODIFICADOS", "GESTION DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "EL ALUMNO NO EXISTE", "GESTION DE CLIENTES", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void eliminarClientes(){
        Clientes clientes = buscarClientes();
        if(ra.eliminarCliente(clientes)){
            JOptionPane.showMessageDialog(null, "EXITO, CLIENTE ELIMINADO","GESTION DE CLIENTE", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(null, "EL CLIENTE NO EXISTE", "GESTION DE CLIENTE", JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void consultarCliente(){
            Clientes clientes = buscarClientes();
            if(clientes != null){
                String datos = clientes.toString();
                JOptionPane.showMessageDialog(null, datos,"GESTION DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "EL CLIENTE NO EXISTE", "GESTION DE CLIENTE", JOptionPane.ERROR_MESSAGE);
            }
        }
    public void listarclientes(){
        List<Clientes> clientes = RepositorioClientes.getRepositorioDeClientes();
        
        String cadenaClientes = "";
        for(Clientes a: clientes){
            cadenaClientes += a.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, cadenaClientes,"GESTION DE CLIENTES", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private Clientes buscarClientes(){
        String Curp = capturaCurp();
        Clientes clientes = ra.buscarClientes(Curp);
        return clientes;
    }
    
    private static String capturaCurp(){
        Scanner captura = new Scanner(System.in);
        System.out.println("CAPTURA DE DATOS DE CLIENTES");
        System.out.println("Curp: ");
        String Curp = captura.nextLine();
        return Curp;   
    }
    private static Clientes capturaDatos(){
        Scanner captura = new Scanner(System.in);
        System.out.println("CAPTURA DE DATOS DE CLIENTES");
        System.out.println("CURP: ");
        String Curp = captura.nextLine();
        System.out.println("NOMBRE: ");
        String Nombre = captura.nextLine();
        System.out.println("APELLIDO");
        String Apellido = captura.nextLine();
        System.out.println("CORREO: ");
        String Correo = captura.nextLine();
        System.out.println("TELEFONO: ");
        String Telefono = captura.nextLine();
        
        Clientes clientes = new Clientes(Nombre, Apellido, Telefono,Curp, Correo);
        return clientes;
    }
    }



