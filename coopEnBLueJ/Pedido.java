import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido
{
    private ArrayList<Producto> listaProductos;
    
    public Pedido(ArrayList<Producto> listaProductos)
    {
        this.listaProductos = listaProductos;
        
    }
    public void agregarProducto(Producto producto)
    {
        listaProductos.add(producto);
        
    }
        // this.productos = productos;
   
    public void ListaProductosAdd(){
        Scanner sc = new Scanner(System.in);
        String agregar = "si";
        //ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        do{
            System.out.println("Ingrese el producto a añadir");
            
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
            System.out.println("¿Desea agregar mas productos?: si/no");
            String teclado = sc.nextLine();
            
            
            Producto producto1 = new Producto(nombre, precio, cantidad, perecedero);
            this.listaProductos.add(producto1);
            //listaPedidos.add(producto);
            sc.nextLine();
            
            System.out.println("¿Desea agregar mas productos?: si/no");
            agregar = sc.nextLine();
        }while(agregar.equalsIgnoreCase("si"));
        
    
    }
    
     public void ListaPedido(){
    for (Producto producto : listaProductos){
        System.out.println(producto.getNombreProducto());
    }
}
    
    // private Producto[] productos;
     

    // /**
     // * Constructor for objects of class GestionPedidos
     // */
    // public Pedido(Producto[] productos)
    // {
        // this.productos = productos;
    // }

    // /**
     // */
    // public Producto[] getProductos() //no seria mas facil con una lista????
    // {
        // return productos;
    // }
    // /**
     // */
    // public void setProductos(Producto [] productos)
    // {
        // this.productos = productos;
    // }
}
