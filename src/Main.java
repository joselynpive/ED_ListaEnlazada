/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Alex Pyve
 */
public class Main {
     public static void main(String[] args) {

        mostrarMenu();
    }

    public static void mostrarMenu() {

        int opcion = 0;

        ListaEnlazada lista = new ListaEnlazada();

        do {

            try {

                String respuesta = JOptionPane.showInputDialog(
                        null,
                        "===== LISTA ENLAZADA =====\n\n"
                        + "1.- Agregar al inicio\n"
                        + "2.- Agregar al final\n"
                        + "3.- Buscar un dato\n"
                        + "4.- Saber la cantidad de nodos\n"
                        + "5.- Primer elemento de la lista\n"
                        + "6.- Ultimo elemento de la lista\n"
                        + "7.- Eliminar del inicio\n"
                        + "8.- Eliminar del final\n"
                        + "9.- Saber si la lista esta vacia\n"
                        + "10.- Mostrar la lista\n"
                        + "11.- Salir\n\n"
                        + "Ingrese una opcion:"
                );

                if (respuesta == null) {

                    opcion = 11;

                    continue;
                }

                opcion = Integer.parseInt(respuesta);

                switch (opcion) {

                    case 1:

                        String datoInicio = JOptionPane.showInputDialog(
                                null,
                                "Ingresa el nombre:"
                        );

                        if (datoInicio != null) {

                            lista.agregarAlInicio(datoInicio);

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Dato agregado correctamente al inicio."
                            );
                        }

                        break;

                    case 2:

                        String datoFinal = JOptionPane.showInputDialog(
                                null,
                                "Ingresa el nombre:"
                        );

                        if (datoFinal != null) {

                            lista.agregarAlFinal(datoFinal);

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Dato agregado correctamente al final."
                            );
                        }

                        break;

                    case 3:

                        String buscarDato = JOptionPane.showInputDialog(
                                null,
                                "Que quieres buscar?"
                        );

                        if (buscarDato != null) {

                            if (lista.buscarDato(buscarDato)) {

                                JOptionPane.showMessageDialog(
                                        null,
                                        "Dato ENCONTRADO en la lista."
                                );

                            } else {

                                JOptionPane.showMessageDialog(
                                        null,
                                        "Dato NO ENCONTRADO en la lista."
                                );
                            }
                        }

                        break;

                    case 4:

                        JOptionPane.showMessageDialog(
                                null,
                                "Cantidad de nodos en la lista: "
                                + lista.cantidadNodos()
                        );

                        break;

                    case 5:

                        if (lista.estaVacia()) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "La lista esta vacia."
                            );

                        } else {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "El primer elemento de la lista es: "
                                    + lista.PrimerElemento()
                            );
                        }

                        break;

                    case 6:

                        if (lista.estaVacia()) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "La lista esta vacia."
                            );

                        } else {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "El ultimo elemento de la lista es: "
                                    + lista.UltimoElemento()
                            );
                        }

                        break;

                    case 7:

                        if (lista.estaVacia()) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "No se puede eliminar. La lista esta vacia."
                            );

                        } else {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Dato eliminado del inicio: "
                                    + lista.eliminarDatoInicio()
                            );
                        }

                        break;

                    case 8:

                        if (lista.estaVacia()) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "No se puede eliminar. La lista esta vacia."
                            );

                        } else {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "Dato eliminado del final: "
                                    + lista.eliminarDatoFinal()
                            );
                        }

                        break;

                    case 9:

                        if (lista.estaVacia()) {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "La lista ESTA vacia."
                            );

                        } else {

                            JOptionPane.showMessageDialog(
                                    null,
                                    "La lista NO ESTA vacia."
                            );
                        }

                        break;

                    case 10:

                        lista.mostrarLista();

                        break;

                    case 11:

                        JOptionPane.showMessageDialog(
                                null,
                                "Programa finalizado."
                        );

                        break;

                    default:

                        JOptionPane.showMessageDialog(
                                null,
                                "Opcion no valida. Ingresa un numero del 1 al 11."
                        );

                        break;
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Error: debes ingresar un numero valido."
                );

            } catch (Exception e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Ocurrio un error: " + e.getMessage()
                );
            }

        } while (opcion != 11);
    }   
}
