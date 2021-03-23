package com.company.domain;

import com.company.domain.productos.Producto;


public abstract class Electrodomestico implements Producto {
    private Double precio;

    protected Electrodomestico() {
        this.precio = 0.0;
    }

    public void definirPrecio() {
        precio = consumo().getConsumo() + calcularPrecio();
        precio = precio + procedencia().getRecargo();
    }

    public abstract Double calcularPrecio();

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "{" +
                "codigo=" + codigo() +
                ", consumo='" + consumo() + '\'' +
                ", procedencia='" + procedencia() + '\'' +
                ", precio=" + precio +
                '}';
    }
}
