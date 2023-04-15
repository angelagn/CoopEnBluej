
/**
 * Write a description of class ClienteFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClienteFinal extends Usuario
{
    // instance variables - replace the example below with your own
    private String nombreUsuario;
    private int x;

    /**
     * Constructor for objects of class ClienteFinal
     */
    public ClienteFinal(String nombreUsuario)
    {
        super(nombreUsuario);
        this.nombreUsuario = nombreUsuario;
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
