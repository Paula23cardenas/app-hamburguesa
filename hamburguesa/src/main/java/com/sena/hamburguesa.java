package com.sena;

public class Hamburguesa {

    private String tipoPan;
    private boolean dobleCarne;
    private boolean conSalsas;
    private boolean conQueso;
    private boolean conTocineta;
    private boolean conVerduras;
    private String tamano;

    public Hamburguesa(String tipoPan, boolean dobleCarne, boolean conSalsas,
                       boolean conQueso, boolean conTocineta, boolean conVerduras, String tamano) {
        this.tipoPan = tipoPan;
        this.dobleCarne = dobleCarne;
        this.conSalsas = conSalsas;
        this.conQueso = conQueso;
        this.conTocineta = conTocineta;
        this.conVerduras = conVerduras;
        this.tamano = tamano;
    }

    public String mostrarPedido() {
        String pedido = "Hamburguesa " + tamano + " con pan " + tipoPan;

        if (dobleCarne) {
            pedido += ", doble carne";
        } else {
            pedido += ", carne sencilla";
        }

        if (conQueso) {
            pedido += ", con queso";
        }

        if (conTocineta) {
            pedido += ", con tocineta";
        }

        if (conVerduras) {
            pedido += ", con verduras";
        } else {
            pedido += ", sin verduras";
        }

        if (conSalsas) {
            pedido += ", con salsas";
        } else {
            pedido += ", sin salsas";
        }

        return pedido;
        }
}
