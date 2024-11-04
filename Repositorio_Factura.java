
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jairl
 */
public class Repositorio_Factura {
    
    private static List<Factura> repositorioDeFacturas = new ArrayList<>();

         public boolean agregarFactura(Factura factura) {
        if (!repositorioDeFacturas.contains(factura)) {
            repositorioDeFacturas.add(factura);
            return true;
        } else{
        return false;
        }
    }
         public boolean modificarFactura(Factura facturaM){
    Factura facturaA;
        for(int i = 0; i < repositorioDeFacturas.size(); i++){
       facturaA = repositorioDeFacturas.get(i);
    if(facturaA.equals(facturaM)){
    facturaA.setCliente(facturaM.getCliente());
    facturaA.setEstadoPago(facturaM.getEstadoPago());
    facturaA.setMontoTotal(facturaM.getMontoTotal());
    facturaA.setNumeroFactura(facturaM.getNumeroFactura());
    return true;
    } 
    }
        return false;
    }
         public Factura NumeroDeFactura(int numeroFactura) {
        for (Factura fac : repositorioDeFacturas) {
            if (numeroFactura == fac.getNumeroFactura()) {
                return fac;
            }
        }
        return null;
    }
    public Factura buscarFactura(int numeroFactura) {
        for (Factura fac : repositorioDeFacturas) {
            if (numeroFactura == fac.getNumeroFactura()) {
                return fac;
            }
        }
        return null;
    }
         public boolean eliminarFactura(Factura factura){
        if(repositorioDeFacturas.contains(factura)){
    repositorioDeFacturas.remove(factura);
    return true;    
        }else {
        return false;
        }
        
    }
         public static List<Factura> getRepositordeFactura(){
    return repositorioDeFacturas;
    }
    public static Factura[] getArreglodeFacturas(){
    Factura facturas[] = new Factura[repositorioDeFacturas.size()];
    int indice = 0;
    for(Factura fac: getRepositordeFactura()){
    facturas[indice] = fac;
    indice++;
    }
    return facturas;
    }
}
