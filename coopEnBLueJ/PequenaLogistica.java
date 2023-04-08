
/**
 * Write a description of class PequenaLogistica here.
 */
public class PequenaLogistica extends Logistica
{
    // instance variables - replace the example below with your own
       private int distanciaKm;
       private boolean esPerecedero;
       
    /** Constructor
     */
    public PequenaLogistica(int distanciaKm,boolean esPerecedero)
    {
        // initialise instance variables
        super(distanciaKm, esPerecedero);
       this.distanciaKm = getDistancia();
       this.esPerecedero = getPerecedero();
       
    }
    
    /**Se sobreescribe el metodo transportar 
     * para ajustar a la pequeña logistica
     */
       @Override
    public int transportar(){
        if (distanciaKm <= 100){
            
        }
        return 0;
    }
    
        @Override
    public int calcularCoste(){
         return 0;
        
    }
    
    // public void transportarGran(){
        // if (distanciaKm > 100){
            
        // }
    // }

    
}
