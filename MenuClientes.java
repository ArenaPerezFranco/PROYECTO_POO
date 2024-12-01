/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menus;

import javax.swing.JOptionPane;
import Gestion.GestionClientes;
import clientes.Clientes;
import Repositorio.RepositorioClientes;
import java.awt.Menu;
/**
 *
 * @author DELL
 */

/**
 *
 * @author DELL
 */

    public class MenuClientes {
    private static MenuClientes instancia;
    private MenuClientes(){}

    public static MenuClientes menuClientes(){
        if(instancia == null){
            return new MenuClientes();
        }else{
            return instancia;
        }
    }

    public void opciones(){
        GestionClientes gc = new GestionClientes();
        String mensaje = "SELECCIONA UNA OPCION DE CLIENTES \n" +
                "1 CREAR \n" +
                "2 MODIFICAR \n" +
                "3 ELIMINAR \n" +
                "4 CONSULTAR \n" +
                "5 LISTAR \n" +
                "6 REGRESAR \n";
        String opcionCadena = JOptionPane.showInputDialog(null, mensaje, "MENU CLIENTES", JOptionPane.QUESTION_MESSAGE);
        int opcion = Integer.parseInt(opcionCadena);
        switch(opcion){
            case 1: {
                gc.agregarCliente();
                opciones();
                break;
            }
            case 2: {
                gc.modificarCliente();
                opciones();
                break;
            }
            case 3: {
                gc.eliminarClientes();
                opciones();
                break;
            }
            case 4: {
                gc.consultarCliente();
                opciones();
                break;
            }
            case 5: {
                gc.listarclientes();
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

