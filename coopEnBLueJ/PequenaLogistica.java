/**
 * Clase PequenaLogistica que hereda los metodos Transportar y calcularCosteLogistica de la 
 * clase logistica, aplica polimorfismosobreescribiendo los metodos para ajustar a las caracteristicas 
 * particulares de la gran logistica.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class PequenaLogistica extends Logistica
{
    // variables de instancia
       private int distanciaKm;
       private boolean esPerecedero;
       private double costeFijoKm = 0.3; 
       private double coste;
       private String distanciaString;
    /** Constructor inicializa las variables
     */
    public PequenaLogistica( int distanciaKm)
    {
        // inicializa variables
       super(distanciaKm);
       this.distanciaKm = distanciaKm;
    }
    
    /**Se sobrescribe el metodo transportar para ajustar a la pequeña logistica
     */
    @Override
    public String Transportar(){
        if(distanciaKm <= 100 ){
            System.out.println("------------------------------------------------");
            System.out.println("Enviando producto a traves de pequeña logistica.\n");
            System.out.println("------------------------------------------------");
    }
    String distanciaString =Integer.toString(distanciaKm); 
        return "Distancia a recorrer:  " + distanciaString + " Kilometros.";
    }
    /**Se sobrescribe el metodo calcularCosteLogistica para ajustar a Gran Logistica
     */
    @Override
    public String calcularCosteLogistica(){
        costeFijoKm = 0.3 ;
        coste = costeFijoKm * distanciaKm; 
        return "Coste Pequeña Logistica: " + coste + " Euros.";
    }
    int totalPLogistica = 6000;
    public void TotalLogistica(){
        System.out.println("------------------------------------------------");
        System.out.println("El precio total de la pequeña logistica el ultimo\naño fue: " + totalPLogistica + " euros");
    }
}
