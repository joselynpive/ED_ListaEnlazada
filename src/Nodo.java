/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Pyve
 */
public class Nodo {
 private String valor;
    private Nodo siguiente;

    // Constructor con valor y siguiente
    public Nodo(String valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    // Constructor solo con valor
    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    // Getter de valor
    public String getValor() {
        return valor;
    }

    // Setter de valor
    public void setValor(String valor) {
        this.valor = valor;
    }

    // Getter de siguiente
    public Nodo getSiguiente() {
        return siguiente;
    }

    // Setter de siguiente
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
