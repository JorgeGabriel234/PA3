package com.isil.pe;


public class Pila {

    private int[] elementos;
    private int tope;
    private int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        elementos = new int[capacidad];
        tope = -1;
    }

    // Apilar: agregar un elemento
    public void apilar(int elemento) {
        if (tope == capacidad - 1) {
            System.out.println("La pila está llena.");
        } else {
            tope++;
            elementos[tope] = elemento;
            System.out.println("Elemento apilado: " + elemento);
        }
    }

    // Desapilar: retirar el elemento del tope
    public int desapilar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return -1;
        }

        int elemento = elementos[tope];
        tope--;

        System.out.println("Elemento desapilado: " + elemento);
        return elemento;
    }

    // Consultar el elemento del tope
    public int verTope() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return -1;
        }

        return elementos[tope];
    }

    // Verificar si la pila está vacía
    public boolean estaVacia() {
        return tope == -1;
    }

    // Mostrar todos los elementos de arriba hacia abajo
    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Elementos de la pila:");
        for (int i = tope; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}

