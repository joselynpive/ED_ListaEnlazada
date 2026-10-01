/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Pyve
 */
public class ListaEnlazada {
        private Nodo inicio;
    private Nodo fin;

    // Constructor
    public ListaEnlazada() {
        this.inicio = null;
        this.fin = null;
    }

    // Saber si la lista esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    // Agregar un elemento al inicio
    public void agregarAlInicio(String val) {

        if (estaVacia()) {
            inicio = new Nodo(val);
            fin = inicio;
        } else {
            inicio = new Nodo(val, inicio);
        }
    }

    // Agregar un elemento al final
    public void agregarAlFinal(String val) {

        if (estaVacia()) {
            inicio = new Nodo(val);
            fin = inicio;
        } else {
            fin.setSiguiente(new Nodo(val));
            fin = fin.getSiguiente();
        }
    }

    // Obtener el primer elemento
    public String PrimerElemento() {

        if (estaVacia()) {
            return null;
        }

        return inicio.getValor();
    }

    // Obtener el ultimo elemento
    public String UltimoElemento() {

        if (estaVacia()) {
            return null;
        }

        return fin.getValor();
    }

    // Mostrar todos los elementos
    public void mostrarLista() {

        Nodo aux = inicio;

        if (estaVacia()) {
            System.out.println("La lista esta vacia.");
            return;
        }

        while (aux != null) {

            System.out.print("[" + aux.getValor() + "] ---> ");

            aux = aux.getSiguiente();
        }

        System.out.println("null");
    }

    // Contar los nodos
    public int cantidadNodos() {

        Nodo aux = inicio;
        int contador = 0;

        while (aux != null) {

            contador++;

            aux = aux.getSiguiente();
        }

        return contador;
    }

    // Buscar un dato
    public boolean buscarDato(String buscar) {

        Nodo aux = inicio;

        while (aux != null) {

            if (aux.getValor().equals(buscar)) {
                return true;
            }

            aux = aux.getSiguiente();
        }

        return false;
    }

    // Eliminar el primer elemento
    public String eliminarDatoInicio() {

        if (estaVacia()) {
            return null;
        }

        String eliminado = inicio.getValor();

        inicio = inicio.getSiguiente();

        if (inicio == null) {
            fin = null;
        }

        return eliminado;
    }

    // Eliminar el ultimo elemento
    public String eliminarDatoFinal() {

        if (estaVacia()) {
            return null;
        }

        String eliminado = fin.getValor();

        // Si solo existe un elemento
        if (inicio == fin) {

            inicio = null;
            fin = null;

            return eliminado;
        }

        // Buscar el nodo anterior al ultimo
        Nodo aux = inicio;

        while (aux.getSiguiente() != fin) {

            aux = aux.getSiguiente();
        }

        fin = aux;
        fin.setSiguiente(null);

        return eliminado;
    }

    // Getter de inicio
    public Nodo getInicio() {
        return inicio;
    }

    // Setter de inicio
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    // Getter de fin
    public Nodo getFin() {
        return fin;
    }

    // Setter de fin
    public void setFin(Nodo fin) {
        this.fin = fin;
    }

}
