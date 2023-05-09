
/**
 * Clase Productor, contiene los detalles de cada producto y los métodos set y get.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Productor
{
    // Variables
    private String nombre;
    private String producto;
    private int hectareas;
    private int toneladas;
    
    public Productor(String nombre, String producto, int hectareas, int toneladas) {
        this.nombre = nombre;
        this.producto = producto;
        this.hectareas = hectareas;
        this.toneladas = toneladas;
    }
    
    // Métodos getter y setter para acceder a los atributos
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getProducto() {
        return producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public int getHectareas() {
        return hectareas;
    }
    
    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }
    
    public int getToneladas() {
        return toneladas;
    }
    
    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
}
