
/**
 * Write a description of class GestionPedidos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionPedidos
{
    /**
     */
    public void ImprimirListado()
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
            System.out.println("Peso por kilogramo: " + productosPedido[i].getTotalKg());
            System.out.println("Producto perecedero: " + productosPedido[i].getEsPerecederoProducto());
            
        }
    }
   
    
}
