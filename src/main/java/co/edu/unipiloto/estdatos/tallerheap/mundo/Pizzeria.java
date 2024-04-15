package co.edu.unipiloto.estdatos.tallerheap.mundo;

import co.edu.unipiloto.estdatos.tallerheap.estructuras.MAXpQ;
import java.util.ArrayList;

public class Pizzeria {
    // ----------------------------------
    // Constantes
    // ----------------------------------

    /**
     * Constante que define la accion de recibir un pedido
     */
    public final static String RECIBIR_PEDIDO = "RECIBIR";
    /**
     * Constante que define la accion de atender un pedido
     */
    public final static String ATENDER_PEDIDO = "ATENDER";
    /**
     * Constante que define la accion de despachar un pedido
     */
    public final static String DESPACHAR_PEDIDO = "DESPACHAR";
    /**
     * Constante que define la accion de finalizar la secuencia de acciones
     */
    public final static String FIN = "FIN";

    // ----------------------------------
    // Atributos

    // ----------------------------------
    /**
     * Heap que almacena los pedidos recibidos
     */
    MAXpQ<Pedido> colaRecibidos;

    /**
     * Getter de pedidos recibidos
     */
    // TODO 
    /**
     * Cola de elementos por despachar
     */
    MAXpQ<Pedido> colaDespachar;
    
    /**
     * Getter de elementos por despachar
     */
    // TODO 
    // ----------------------------------
    // Constructor
    // ----------------------------------
    /**
     * Constructor de la case Pizzeria
     */
    public Pizzeria() {
        colaRecibidos = new MAXpQ();
        colaDespachar = new MAXpQ();
        // TODO 
    }

    // ----------------------------------
    // Métodos
    // ----------------------------------
    /**
     * Agrega un pedido a la cola de prioridad de pedidos recibidos
     *
     * @param nombreAutor nombre del autor del pedido
     * @param precio precio del pedido
     * @param cercania cercania del autor del pedido
     */
    public void agregarPedido(String nombreAutor, double precio, int cercania) {
        Pedido temp = new Pedido(nombreAutor, precio, cercania);

        colaRecibidos.add(temp);
        // TODO 
    }

    // Atender al pedido más importante de la cola
    /**
     * Retorna el proximo pedido en la cola de prioridad o null si no existe.
     *
     * @return p El pedido proximo en la cola de prioridad
     */
    public Pedido atenderPedido() {
        Pedido temp = colaRecibidos.poll();
        temp.setDespachar();
        colaDespachar.add(temp);
        return temp;
    }

    /**
     * Despacha al pedido proximo a ser despachado.
     *
     * @return Pedido proximo pedido a despachar
     */
    public Pedido despacharPedido() {
        return colaDespachar.poll();
    }

    /**
     * Retorna la cola de prioridad de pedidos recibidos como una lista.
     *
     * @return list lista de pedidos recibidos.
     */
    public ArrayList<Pedido> pedidosRecibidosList() {
        return colaRecibidos.arraylist();
    }

    /**
     * Retorna la cola de prioridad de despachos como una lista.
     *
     * @return list cola de prioridad de despachos.
     */
    public ArrayList<Pedido> colaDespachosList() {
        return colaDespachar.arraylist();

    }
}
