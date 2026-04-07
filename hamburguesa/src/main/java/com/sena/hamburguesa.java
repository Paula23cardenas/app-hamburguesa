package com.sena;

public class Hamburguesa {

    private String tipoPan;
    private boolean dobleCarne;
    private boolean conSalsas;

    public Hamburguesa(String tipoPan, boolean dobleCarne, boolean conSalsas) {
        this.tipoPan = tipoPan;
        this.dobleCarne = dobleCarne;
        this.conSalsas = conSalsas;
    }

    public String mostrarPedido() {
        String pedido = "Hamburguesa con pan " + tipoPan;

        if (dobleCarne) {
            pedido += ", doble carne";
        } else {
            pedido += ", carne sencilla";
        }

        if (conSalsas) {
            pedido += ", con salsas";
        } else {
            pedido += ", sin salsas";
        }

        return pedido;
    }
}
