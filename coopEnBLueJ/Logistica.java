
/**
 * Clase Producto que contiene las caracteristicas necesarias de cada producto para que pueda ser gestionado en la cooperativa.
 * 
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Logistica
{
    // instance variables - replace the example below with your own
    private int distanciaKm;
    private boolean esPerecedero;
    private String tipoLogistica;
    private double pesoPedido;

    /**
     * Constructor for objects of class Logistica
     */
    public Logistica(int distanciaKm, boolean esPerecedero, double pesoPedido)
    {
        // initialise instance variables
         this.distanciaKm = distanciaKm;
         this.esPerecedero = esPerecedero;
         this.pesoPedido = pesoPedido;
    }
    
     public int getDistancia()
    {
        return  this.distanciaKm;
        
    }
     public void setDistancia(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }
     public boolean getPerecedero()
    {
        return  this.esPerecedero;
        
    }
     public void setEsPerecedero(boolean esPerecedero) {
        this.esPerecedero = esPerecedero;
    }
    
     public String transportar(){
         return "";
        
    }
    public  double calcularCosteLogistica(){
         return 0;
        
    }
    
}
