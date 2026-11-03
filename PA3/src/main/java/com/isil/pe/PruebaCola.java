package com.isil.pe;

public class PruebaCola {
    public static void main(String[] args) {

        Cola cola = new Cola(5);

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        cola.mostrar();

        System.out.println("Frente: " + cola.verFrente());

        cola.desencolar();

        cola.mostrar();

        System.out.println("¿Está vacía?: " + cola.estaVacia());
    }
}
