package com.company.domain.productos;

import com.company.domain.Consumo;
import com.company.domain.Procedencia;

public interface Producto {
    Integer codigo();

    Procedencia procedencia();

    Consumo consumo();
}
