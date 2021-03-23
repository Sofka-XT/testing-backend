package com.company.services;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class BillServiceTest {

    private BillService billService;

    @BeforeEach
    public void setup(){
        billService = new BillService();
    }

    @ParameterizedTest
    @DisplayName("Crear una nueva nevera con las cantidades {0}")
    @ValueSource(ints = { 10, 23, 100, 500 })
    void nuevaNevera(Integer cantidades) {
        //TODO: verificaciones
    }

    @Test
    @DisplayName("Intento de crear nevera - validaciones de errores")
    void nuevaNeveraConArgumentosInvalidos() {
        //TODO: verificaciones
    }

    @Test
    @DisplayName("Creación de nuevo electrodomestico - televisor")
    void nuevoTelevisor() {
        //TODO: verificaciones
    }

    @Test
    @DisplayName("Definir 10 nuevos electrodomesticos (televisor y nevera) y definir el total acumulado de las neveras y televisores")
    void definirPreciosDeLosElectrodomesticos() {
       //TODO: verificaciones
    }

    @Test
    @DisplayName("Consultar los precios acumulados de las procedencias NACIONAL")
    void consultarLosPrecioPorPorcedenciaNACIONAL() {
        //TODO: verificaciones
    }


}