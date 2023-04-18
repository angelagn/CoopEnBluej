import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Pedido que pide al proveedor que ingrese los productos 
 * y los pone en una lista.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Pedido
{
    //Crea un array de productos tipo producto
    private ArrayList<Producto> listaProductos;
    //Declara el constructor
    public Pedido(ArrayList<Producto> listaProductos)
    {
        this.listaProductos = listaProductos;
        
    }
    
    // public void agregarProducto(Producto producto)
    // {
        // listaProductos.add(producto);
    // }
    //Metodo que añade un producto a la lista
    public void ListaProductosAdd(){
        Scanner sc = new Scanner(System.in);
        String agregar = "si";
        
        do{
            System.out.println("---------------------------------------");
            System.out.println("Ingrese el producto a añadir");
            System.out.println("---------------------------------------");
            
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            while(!sc.hasNextDouble()){
                System.out.println("El valor ingresado no es valido, intente nuevamente: ");
                sc.next();
            }
            double precio = sc.nextDouble();
            System.out.println("Ingrese cantidad del producto: ");
            double cantidad = sc.nextDouble();
            System.out.println("¿Es perecedero?: ");
            boolean perecedero = sc.nextBoolean();
            System.out.println("---------------------------------------");
            System.out.println("¿Desea agregar mas productos?: si/no");
            System.out.println("---------------------------------------");
            String teclado = sc.nextLine();
            
            Producto producto1 = new Producto(nombre, precio, cantidad, perecedero);
            this.listaProductos.add(producto1);
            
            agregar = sc.nextLine();
        }while(agregar.equalsIgnoreCase("si"));
        
    }
    
     public void ListaPedido(){
    for (Producto producto : listaProductos){
        System.out.println(producto.getNombreProducto());
    }
    }
}
