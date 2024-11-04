/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.vo.Trabajador;
import repositorio.RepositorioTrabajadores;

public class GestionTrabajadores {
    private RepositorioTrabajadores rt = new RepositorioTrabajadores();
    
    public GestionTrabajadores() {
        
    }
    
    public void agregarTrabajador() {
        Trabajador trabajador = capturaDatos();
        if(rt.addTrabajador(trabajador)) {
            JOptionPane.showMessageDialog(null, "EXITO, TRABAJADOR AGREGADO",
                    "GESTION DE TRABAJADORES", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "ES TRABAJADOR YA EXISTENTE",
                    "GESTION DE TRABAJADORES", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void modificarTrabajador(){
        Trabajador trabajador = capturaDatos();
        if(rt.modificarTrabajador(trabajador)) {
            JOptionPane.showMessageDialog(null, "EXITO, DATOS MODIFICADOS",
                    "GESTION DE TRABAJADORES", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "ES ALUMNO NO EXISTENTE",
                    "GESTION DE TRABAJADORES", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarTrabajador() {
        Trabajador trabajador = buscarTrabajador();
        if(rt.eliminarTrabajador(trabajador)) {
            JOptionPane.showMessageDialog(null, "EXITO, TRABAJADOR ELIMINADO",
                    "GESTION DE ALUMNOS", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "ES ALUMNO NO EXISTENTE",
                    "GESTION DE ALUMNOS", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void consultarTrabajador() {
        Trabajador trabajador = buscarTrabajador();
        if(trabajador != null) {
            String datos = trabajador.toString();
            JOptionPane.showMessageDialog(null, datos,
                    "GETSION DE ALUMNOS", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void listarTrabajadores() {
        List<Trabajador> trabajadores = RepositorioTrabajadores.getRepositorioDeTrabajadores();
        
        String cadenaTrabajadores = "";
        for(Trabajador t : trabajadores) {
            cadenaTrabajadores += t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, cadenaTrabajadores,
                "GESTION DE TRABJADORES", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private Trabajador buscarTrabajador() {
        String curp = capturaCurp();
        Trabajador trabajador = rt.buscarTrabajador(curp);
        return trabajador;
    }
    
    private static String capturaCurp() {
        Scanner captura = new Scanner(System.in);
        System.out.println("CAPTURA DE DATOS DE TRABAJADORES");
        System.out.println("CURP: ");
        String curp = captura.nextLine();
        return curp;
    }
    
    private static Trabajador capturaDatos() {
        Scanner captura = new Scanner(System.in);
        System.out.println("CAPTURA DE DATOS DE TRABAJADORES");
        System.out.println("Curp: ");
        String curp = captura.nextLine();
        System.out.println("NOMBRE: ");
        String nombre = captura.nextLine();
        System.out.println("RFC: ");
        String rfc = captura.nextLine();
        System.out.println("SUELDO: ");
        int sueldo = captura.nextInt();
        
        Trabajador trabajador = new Trabajador(curp, nombre, rfc, sueldo);
        
        return trabajador;
    }
}
