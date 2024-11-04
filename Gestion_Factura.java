import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jairl
 */
public class Gestion_Factura {
 
    private final Repositorio_Factura rf = new Repositorio_Factura();


    public void agregarFactura() {
        Factura factura = capturaDatos();
        if (rf.agregarFactura(factura)) {
            JOptionPane.showMessageDialog(null, "EXITO, FACTURA AGREGADO", 
                "GESTION DE FACTURAS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ESA FACTURA YA EXISTE", 
                "GESTION DE FACTURAS", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void modificarFactura() {
        Factura factura = capturaDatos();
        if (rf.modificarFactura(factura)) {
            JOptionPane.showMessageDialog(null, "EXITO, DATOS MODIFICADOS", 
                "GESTION DE FACTURAS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ESA FACTURA NO EXISTE", 
                "GESTION DE FACTURAS", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarFactura() {
        Factura factura = buscarFactura();
        if (rf.eliminarFactura(factura)) {
            JOptionPane.showMessageDialog(null, "EXITO, FACTURA ELIMINADO", 
                "GESTION DE FACTURAS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ESA FACTURA NO EXISTE", 
                "GESTION DE FACTURAS", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void consultarFactura() {
        Factura factura = buscarFactura();
        if (factura != null) {
            String datos = factura.toString();
            JOptionPane.showMessageDialog(null, datos, 
                "GESTION DE FACTURAS", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "ESA FACTURA NO EXISTE", 
                "GESTION DE FACTURAS", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void listarFacturas(){
    List <Factura> facturas = Repositorio_Factura.getRepositordeFactura();
    
    String cadenaFacturas = "";
    for(Factura fac: facturas){
    cadenaFacturas += fac.toString() + "/n";
    }
    JOptionPane.showMessageDialog(null, cadenaFacturas, 
                "GESTION DE FACTURAS", JOptionPane.INFORMATION_MESSAGE);
    }
    private Factura buscarFactura(){
    int numero = capturaNumero();
    Factura factura = rf.NumeroDeFactura(numero);
    return factura;
    }
    private static int capturaNumero(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Captura de datos de Factura");
    System.out.println("Numero de Factura: ");
    int NumFac = scan.nextInt();
    return NumFac;
    }
    private static Clientes capturarCliente(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Captura el curp del cliente: ");
        String curp = scan.nextLine();
        return buscarCliente(curp);
    }
    private static Factura capturaDatos(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Captura datos de Factura");
            System.out.print("Numero de Factura: : ");
            int NumFac = scan.nextInt();
            System.out.println("Introduce el monto total de la factura: ");
            double Monto = scan.nextDouble();
            System.out.println("Introduce el estado de pago: ");
            String Estado = scan.nextLine();
            
            Clientes c = capturarCliente();
            
            Factura factura = new Factura(NumFac,c,Monto,Estado);
            return factura;

    }
    private static Clientes buscarCliente(String Curp){
    Repositorio_Clientes rc = new Repositorio_Clientes();
    return rc.buscarFactura(Curp);
}
}