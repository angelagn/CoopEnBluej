
/**
 * Write a description of class Productor here.
 * 
 * @author (Angela Guzman) 
 * @version (a version number or a date)
 */
public class Productor extends Usuario
{
    // instance variables - replace the example below with your own
    //private String nombreProductor;
    private String producto;
    private double hectareas;
    private int cantidadProductos;

    /** Constructor para objetos de la clase Productor
     */
    public Productor(String nombreUsuario, String nombreArticulo, double hectareas, int cantidadTon)
    {
        // initialise instance variables
        //this.nombreProductor = nombreProd;
        super(nombreUsuario);
        this.producto = nombreArticulo;
        this.hectareas = hectareas;
        this.cantidadProductos = cantidadTon;
       
    }
   

    
}
