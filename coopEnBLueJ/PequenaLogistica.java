
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
       private String distanciaString;
    /** Constructor
     */
    public PequenaLogistica(int distanciaKm)
    {
        // initialise instance variables
       super(distanciaKm);
       this.distanciaKm = distanciaKm;
    }
    
    /**Se sobrescribe el metodo transportar 
     * para ajustar a la pequeña logistica
     */
    @Override
    public String Transportar(){
        if(distanciaKm <= 100 ){
            System.out.println("------------------------------------------------");
            System.out.println("Enviando producto a traves de pequeña logistica. \n");
            System.out.println("------------------------------------------------");
    }
    String distanciaString =Integer.toString(distanciaKm); 
        return "Distancia a recorrer:  " + distanciaString + " Kilometros.";
    }
    
    @Override
    public String calcularCosteLogistica(){
        costeFijoKm = 0.3 ;
        coste = costeFijoKm * distanciaKm; 
        return "Coste Pequeña Logistica: " + coste + " Euros.";
        
    }
}
