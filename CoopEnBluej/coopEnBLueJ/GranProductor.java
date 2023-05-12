/**
 * Clase GranProductor que hereda de productor y cuenta con el constructor de la clase para ser heredada
 * por otras clases.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class GranProductor extends Productor
{
    /**
     * Constructor for objects of class GranProductor
     */
    public GranProductor(String nombre, String producto, int hectareas, int toneladas, String categoria) {
        super(nombre, producto, hectareas, toneladas);
        
    }
}
