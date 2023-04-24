package com.example.tienda_classe.modelo;

public class DetalleOrden {
    private int Cantidad;
    private double precioUnitario;
    private double total;

    public DetalleOrden(int cantidad, double precioUnitario, double total) {
        Cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.total = total;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}