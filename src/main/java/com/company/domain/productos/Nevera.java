package com.company.domain.productos;

import com.company.domain.Consumo;
import com.company.domain.Electrodomestico;
import com.company.domain.Procedencia;

public class Nevera extends Electrodomestico {

    private final Integer codigo;
    private final Consumo consumo;
    private final Procedencia procedencia;
    private final Integer capacidad;

    public Nevera(Integer codigo, Consumo consumo, Procedencia procedencia, Integer capacidad) {
        this.codigo = codigo;
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.capacidad = capacidad;
    }

    @Override
    public Double calcularPrecio() {
        if (capacidad > 120) {
            int litrosAdicionales = capacidad - 120;
            float fraccion = litrosAdicionales / 10;
            double incremento = fraccion * 0.05;
            return getPrecio() + getPrecio() * incremento;
        }
        return getPrecio();
    }


    @Override
    public Integer codigo() {
        return codigo;
    }

    @Override
    public Procedencia procedencia() {
        return procedencia;
    }

    @Override
    public Consumo consumo() {
        return consumo;
    }
}
