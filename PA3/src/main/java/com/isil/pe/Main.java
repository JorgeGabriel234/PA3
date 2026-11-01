package com.isil.pe;

public class Main {
    public static void main(String[] args) {

        Pila pila = new Pila(5);

        // Agregar elementos
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);

        // Mostrar la pila
        pila.mostrar();

        // Consultar el tope
        System.out.println("Elemento del tope: "
                + pila.verTope());

        // Retirar un elemento
        pila.desapilar();

        // Mostrar la pila después de retirar
        pila.mostrar();

        // Verificar si está vacía
        System.out.println("¿La pila está vacía? "
                + pila.estaVacia());
    }
}
