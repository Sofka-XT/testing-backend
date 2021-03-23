package com.company.domain.productos;

import com.company.domain.Consumo;
import com.company.domain.Electrodomestico;
import com.company.domain.Procedencia;

public class Televisor extends Electrodomestico {
    private final Integer codigo;
    private final Consumo consumo;
    private final Procedencia procedencia;
    private final Double tamanno;
    private final Boolean isTDT;

    public Televisor(Integer codigo, Consumo consumo, Procedencia procedencia, Double tamanno, Boolean isTDT) {
        this.codigo = codigo;
        this.consumo = consumo;
        this.procedencia = procedencia;
        this.tamanno = tamanno;
        this.isTDT = isTDT;
    }

    @Override
    public Double calcularPrecio() {
        if (tamanno > 40) {
            return getPrecio() + (getPrecio() * 0.3);
        }
        if (isTDT.equals(Boolean.TRUE)) {
            return getPrecio() + 250000;
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
