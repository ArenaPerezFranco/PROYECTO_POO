/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.vo.Trabajador;

public class RepositorioTrabajadores {
    private static List<Trabajador> repositorioDeTrabajadores = new ArrayList<>();
    
    public RepositorioTrabajadores(){}
    
    /**
     * Agregar un Trabajador al Repositorio
     * 
     * @param trabajador
     * @return un boolean
     */
    public boolean addTrabajador(Trabajador trabajador) {
        int posicion = repositorioDeTrabajadores.indexOf(trabajador);
        if(posicion < 0) {
            repositorioDeTrabajadores.add(trabajador);
            return true;
        }
        return false;
    }
    
    /**
     * Modificar Datos del trabajador indicado en el parametro
     * @param trabajador
     * @return boolean
     */
    public boolean modificarTrabajador(Trabajador trabajador) {
        for(Trabajador trabajadorRepositorio : repositorioDeTrabajadores) {
            if (trabajador.equals(trabajadorRepositorio)) {
                int posicion =
                        repositorioDeTrabajadores.indexOf(trabajadorRepositorio);
                repositorioDeTrabajadores.set(posicion, trabajador);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Eliminar a el trabajador indicado en el parametro
     * @param trabajador
     * @return boolean
     */
    public boolean eliminarTrabajador(Trabajador trabajador) {
        int posicion = -1;
        for (Trabajador trabajadorRepositorio : repositorioDeTrabajadores) {
            if (trabajador.equals(trabajadorRepositorio)) {
                posicion = repositorioDeTrabajadores.indexOf(trabajadorRepositorio);
                break;
            }
        }
        if (posicion > -1) {
            repositorioDeTrabajadores.remove(posicion);
            return true;
        }
        return false;
    }
    
    /**
     * Busca un trabajador en el ArrayList si lo encuentra lo regresa
     * de lo contrario regresa null
     * @param curp
     * @return Regresa al alumno del ArrayList que tenga la curp indicada
     */
    public Trabajador buscarTrabajador(String curp) {
        for (Trabajador trabajador : repositorioDeTrabajadores) {
            if (curp.equals(trabajador.getCurp())) {
                return trabajador;
            }
        }
        return null;
    }
    
    /**
     * Regresa el ArrayList de trabajadores
     * @return
     */
    public static List<Trabajador> getRepositorioDeTrabajadores() {
        return repositorioDeTrabajadores;
    }
    
    /**
     * Recorre el ArrayList de Trabajadores y cada elemento lo agrega a un arreglo
     * @return Un arreglo de tipo trabjador
     */
    public static Trabajador[] getArregloDeTrabajadores() {
        Trabajador trabajadores[] = new Trabajador[repositorioDeTrabajadores.size()];
        int indice = 0;
        for(Trabajador trabajador : repositorioDeTrabajadores) {
            trabajadores[indice] = trabajador;
            indice++;
        }
        return trabajadores;
    }
}
