
/**
 * Write a description of class PequenaLogistica here.
 */
public class PequenaLogistica extends Logistica
{
    // instance variables - replace the example below with your own
       private int distanciaKm;
       private boolean esPerecedero;
       private double costeFijoKm = 0.3; 
       private double coste;
       
    /** Constructor
     */
    public PequenaLogistica(int distanciaKm, boolean esPerecedero, double pesoPedido)
    {
        // initialise instance variables
       super(distanciaKm, esPerecedero, pesoPedido);
       this.distanciaKm = getDistancia();
       this.esPerecedero = getPerecedero();
       Producto producto = new Producto("nombre", 0.0, 0.0, true);
    }
    
    /**Se sobrescribe el metodo transportar 
     * para ajustar a la pequeña logistica
     */
       @Override
    public String transportar(){
        Producto producto = new Producto("nombre", 0.0, 0.0, esPerecedero);
        if(esPerecedero == true && distanciaKm <= 100 ){
                System.out.println("Enviando producto a traves de pequeña logistica. \n");
    }
        return "Distancia a recorrer:  " + distanciaKm + " Kilometros.";
    }
    
        @Override
    public double calcularCosteLogistica(){
        coste = costeFijoKm * distanciaKm; 
        return coste;
        
    }
}
