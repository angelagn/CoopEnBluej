
/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido
{
     private Producto[] productos;

    /**
     * Constructor for objects of class GestionPedidos
     */
    public Pedido(Producto[] productos)
    {
       
        this.productos = productos;
        
    }

    /**
     */
    public Producto[] getProductos()
    {
        return productos;
    }
    /**
     */
    public void setProductos(Producto [] productos)
    {
        this.productos = productos;
    }
}
