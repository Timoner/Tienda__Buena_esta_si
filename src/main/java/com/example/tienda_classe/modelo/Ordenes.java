package com.example.tienda_classe.modelo;

import java.util.Date;

public class Ordenes {
    private int idOrden;
    private int idCliente;
    private Date fecha;
    private double total;

    public Ordenes(int idOrden, int idCliente, Date fecha, double total) {
        this.idOrden = idOrden;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.total = total;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}