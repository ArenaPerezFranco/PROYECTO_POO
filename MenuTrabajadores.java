/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.menus;

import javax.swing.JOptionPane;
import vista.GestionTrabajadores;

public class MenuTrabajadores {
    
    private static MenuTrabajadores instancia;
    
    private MenuTrabajadores(){}
    
    public static MenuTrabajadores menuTrabajadores(){
        if(instancia == null){
            return new MenuTrabajadores();
        }else{
            return instancia;
        }
    }
    
    public void opciones(){
        GestionTrabajadores gt = new GestionTrabajadores();
        String mensaje = "SELECCIONA UNA OPCION DE TRABAJADORES \n"
                + "1 CREAR \n"
                + "2 MODIFICAR \n"
                + "3 ELIMINAR \n"
                + "4 CONSULTAR \n"
                + "5 LISTAR \n"
                + "6 REGRESAR \n";
        
        String opcionCadena = JOptionPane.showInputDialog(null, mensaje,
                
                "MENU TRABAJADORES", JOptionPane.QUESTION_MESSAGE);
        int opcion = Integer.parseInt(opcionCadena);
        
        switch(opcion){
            case 1: {
                gt.agregarTrabajador();
                opciones();
                //JOptionPane.showMessageDialog(null, "SELECCIONO LA OPCION 1");
                break;
            }
            case 2: {
                gt.modificarTrabajador();
                opciones();
                
                break;
            }
            
            case 3: {
                gt.eliminarTrabajador();
                opciones();
                
                break;
            }
            
            case 4: {
                gt.consultarTrabajador();
                opciones();
                
                break;
            }
            
            case 5: {
                gt.listarTrabajadores();
                opciones();
                
                break;
            }
            
            case 6: {
                Menu ppal = Menu.MenuPrincipal();
                ppal.opciones();
            }
            default:{
       
            }
        }
    }
    
}
