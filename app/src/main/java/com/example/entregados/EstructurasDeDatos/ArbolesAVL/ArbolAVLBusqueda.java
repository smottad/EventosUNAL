package com.example.entregados.EstructurasDeDatos.ArbolesAVL;

public class ArbolAVLBusqueda {
    private ArbolAVL arbolBusqueda;

    public void ArbolAVLBusqueda(){
        ArbolAVL arbolBusqueda = new ArbolAVL();
    }

    public void setValor(ArbolAVL valor) {
        this.arbolBusqueda = valor;
    }

    ArbolAVL retornar(){
        return this.arbolBusqueda;
    }
}
