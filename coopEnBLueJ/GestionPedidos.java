import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase ProductosPedido que contiene una array de productos
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class GestionPedidos
{
    /**
     */
    public void ProductosPedido()
    {
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("Algodon", 0.90, 3, false);
        productos[1] = new Producto("Naranjos", 0.70, 1.5, true);
        productos[2] = new Producto("Meloconton", 1.20, 2, true);
        
        Pedido pedido = new Pedido(productos);
        
        Producto[] productosPedido = pedido.getProductos();
        
        for (int i = 0; i < productosPedido.length; i++ ){
            System.out.println("Producto: " + (i+1) + ":");
            System.out.println("Nombre: " + productosPedido[i].getNombreProducto());
            System.out.println("Precio: " + productosPedido[i].getPrecioProducto());
            System.out.println("Peso por kilogramo: " + productosPedido[i].getPesoEnKg());
            System.out.println("Producto perecedero: " + productosPedido[i].getEsPerecederoProducto());
            
        }
    }
    // public void ListaProductos(){
        // List<String> listaProductos = new ArrayList<String>();
        
        // listaProductos.add("Maiz");
        // listaProductos.add("Algodon");
        // listaProductos.add("Arroz");
        // listaProductos.add("Pimiento");
        
            // if (nuevoProd == "x"){
            // System.out.println("Los productos que ha elegido son: " + listaProductos);
        // }else{
            // for (int i=0; i < listaProductos.size()+1; i++){
                // listaProductos.add(nuevoProd);
            // }
        // }
        
        // System.out.println("Los productos agregados a su compra son: \n" + listaProductos);
        
        
        
    // } 
}
