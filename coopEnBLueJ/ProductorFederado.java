
/**
 * Clase ProductorFederado que extiende de productor y contiene el constructor de la clase
 * para que pueda ser heredado por otras clses.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class ProductorFederado extends Productor
{
    

    /**
     * Constructor for objects of class ProductorFederado
     */
    public ProductorFederado(String nombre, String producto, int hectareas, int toneladas, String categoria) {
        super(nombre, producto, hectareas, toneladas);
        
    }
}
