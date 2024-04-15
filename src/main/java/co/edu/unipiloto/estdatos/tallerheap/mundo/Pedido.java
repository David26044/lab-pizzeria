package co.edu.unipiloto.estdatos.tallerheap.mundo;

public class Pedido implements Comparable<Pedido> {

    // ----------------------------------
    // Atributos
    // ----------------------------------
    /**
     * Precio del pedido
     */
    private double precio;

    /**
     * Autor del pedido
     */
    private String autorPedido;

    /**
     * Cercania del pedido
     */
    private int cercania;
    
    private boolean despachar;

    // ----------------------------------
    // Constructor
    // ----------------------------------
    /**
     * Constructor del pedido TODO Defina el constructor de la clase
     */
    public Pedido(String autorPedido, double precio, int cercania) {
        this.autorPedido = autorPedido;
        this.precio = precio;
        this.cercania = cercania;
        despachar = false;
    }

    // ----------------------------------
    // Métodos
    // ----------------------------------
    /**
     * Getter del precio del pedido
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Getter del autor del pedido
     */
    public String getAutorPedido() {
        return autorPedido;
    }

    /**
     * Getter de la cercania del pedido
     */
    public int getCercania() {
        return cercania;
    }

    // TODO 
    public void setDespachar() {
        despachar = true;
    }
    
    @Override
    public int compareTo(Pedido o) {
        if (!despachar) {
            if (this.precio > o.precio) {
                return 1;
            }
            if (this.precio < o.precio) {
                return -1;
            }
            if (this.precio == o.precio) {
                return 0;
            }
        }
        if (this.cercania > o.cercania) {
            return -1;
        }
        if (this.cercania < o.cercania) {
            return 1;
        }
        return 0;
    }
}
