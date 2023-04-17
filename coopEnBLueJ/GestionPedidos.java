import java.util.List;
import java.util.ArrayList;
/**
 * Clase GestionPedidos que contiene una lista de productos 
 * disponibles en la cooperativa para comprar.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class GestionPedidos
{
    /**La clase ListaProductos, crea elementos tipo Producto y luego los 
     * añade a una lista, para finalmente mostrar la lista al usuario.
     */
    public void ListaProductos(){
        //Crea elementos tipo Producto
        Producto manzana = new Producto("Manzana", 3.4, 2, true);
        Producto pera = new Producto("Pera", 2, 1.5, true);
        Producto algodon = new Producto("Algodon", 4, 6, false);
        Producto pimiento = new Producto("Pimiento", 7, 3, true);
        Producto arroz = new Producto("Arroz", 1.4, 2.2, true);
        
        //Declara una lista de productos
        List<Producto> listaProductos = new ArrayList<>();
        
        //Añade elementos a la lista
        listaProductos.add(manzana);
        listaProductos.add(pera);
        listaProductos.add(algodon);
        listaProductos.add(pimiento);
        listaProductos.add(arroz);
        
        //Imprime la lista de productos disponibles
        for(Producto producto : listaProductos){
            System.out.println(producto.toString());
        }   
    } 
}
