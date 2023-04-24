package com.example.tienda_classe.modelo;

public class Inventario {
    private int cantidad;

    public Inventario(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
