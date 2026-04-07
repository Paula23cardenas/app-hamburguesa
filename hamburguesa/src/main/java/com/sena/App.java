package com.hamburguesa;

public class App {

    public static void main(String[] args) {

        Hamburguesa h1 = new Hamburguesa("integral", true, true, true, true, true, "grande");
        Hamburguesa h2 = new Hamburguesa("blanco", false, false, false, false, false, "mediano");

        System.out.println(h1.mostrarPedido());
        System.out.println(h2.mostrarPedido());
    }
}
