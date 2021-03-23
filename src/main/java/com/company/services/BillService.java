package com.company.services;

import com.company.domain.Consumo;
import com.company.domain.Electrodomestico;
import com.company.domain.Procedencia;
import com.company.domain.productos.Nevera;

import java.util.ArrayList;
import java.util.List;

public class BillService {
    private static final  Integer RANGE_CODE_INIT = 1000;
    private final List<Electrodomestico> electrodomesticos;
    public BillService(){
        electrodomesticos = new ArrayList<>();
    }

    public void nuevaNevera(Integer code, Consumo consumo, Procedencia procedencia, Integer capacidad){
        if(code < RANGE_CODE_INIT){
            throw new IllegalArgumentException("El código debe estar en el rango inicial de 1000");
        }

        if(capacidad < 0){
            throw new IllegalArgumentException("La capacidad no puede ser negativa o cero");
        }
        electrodomesticos.add(new Nevera(code, consumo, procedencia, capacidad));
    }

    public void nuevoElectrodomestico(Electrodomestico electrodomestico){
        electrodomesticos.add(electrodomestico);
    }

    public void definirPreciosDeLosElectrodomesticos(){
        for(Electrodomestico electrodomestico :  electrodomesticos){
            electrodomestico.definirPrecio();
        }
    }


    public List<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }
}
