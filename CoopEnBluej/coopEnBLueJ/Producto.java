import java.util.ArrayList;
import java.util.Date;

/**
 * Clase Producto gestiona los productos 
 * en la cooperativa.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Producto
{
    // Declarar variables
    private String nombre;
    static double precioReferenciaKg;
    private double pesoToneladas;
    private boolean esPerecedero;
    private double pesoEnKg;
    public Date fechaCompra;
    
    private ArrayList<String> arrayProductos;
    

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String nombreArticulo, double precioArticulo, 
                    double pesoArticulo, boolean esPerecederoArticulo )
    {
        // initialise instance variables
        this.nombre = nombreArticulo;
        this.precioReferenciaKg = precioArticulo;
        this.pesoToneladas = pesoArticulo;
        this.esPerecedero = esPerecederoArticulo;
    }
    public Producto(double precioArticulo, double pesoArticulo)
    {
        // initialise instance variables
        this.precioReferenciaKg = precioArticulo;
        this.pesoToneladas = pesoArticulo;

    }

    /**Metodos get
     */
    public String getNombreProducto()
    {
        return this.nombre;
    }
    public double getPrecioProducto()
    {
        return  this.precioReferenciaKg;
    }
    public double getPesoProducto()
    {
        return  this.pesoToneladas;
    }
     public boolean getEsPerecederoProducto()
    {
        return  this.esPerecedero;
    }
    public Date getFechaCompra(){
        return this.fechaCompra;
    }
    
    /**Metodos set
     */
    public void setFechaCompra(Date fechaCompra){
        this.fechaCompra = fechaCompra;
    }
    /**Convierte las toneladas a kilogramos
     */

    public double getPesoEnKg(){
        pesoEnKg = pesoToneladas * 1000;
        return this.pesoEnKg;
    }
    @Override
    public String toString(){
        return "Producto: " + nombre + ", precio: " + precioReferenciaKg
                + " €.";
    }  
}
