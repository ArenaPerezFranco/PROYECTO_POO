
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jairl
 */
public class Factura {
 
    private int numeroFactura;
    private Clientes cliente;
    private double montoTotal;
    private String estadoPago;

    public Factura(int numeroFactura, Clientes cliente, double montoTotal, String estadoPago) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        this.estadoPago = estadoPago;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    @Override
    public String toString() {
        return "Factura{" +"numeroFactura=" + numeroFactura +", cliente=" + cliente +", montoTotal=" + montoTotal +", estadoPago='" + estadoPago + '\'' +'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura factura = (Factura) obj;

        return numeroFactura == factura.numeroFactura && cliente.equals(factura.cliente) && estadoPago.equals(factura.estadoPago);
    }

    @Override
    public int hashCode() {
    return Objects.hash(numeroFactura, cliente, estadoPago);
    }
}

