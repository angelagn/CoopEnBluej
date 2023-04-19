import java.util.Scanner;
import java.util.ArrayList;


/**
 * Clase Cooperativa que contiene el metodo main y las acciones que realiza el usuario al interactuar con la aplicacion.
 * @author (Angela Alexandra Guzman Garcia) 
 * @version (001)
 */
public class Cooperativa
{
    public static void main(String[] args){
        //GestionPedidos pedido1 = new GestionPedidos();
        boolean quiereSalir = false;
    
        do{
        ImprimirMenu menu = new ImprimirMenu();
        menu.MenuBienvenido();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir numero: ");
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                menu.MenuVender();
                Pedido pedido1 = new Pedido(new ArrayList<Producto>());
                pedido1.ListaProductosAdd();
                System.out.println("----Lista de productos agregados------");
                pedido1.ListaPedido();
                Coste costePedido = new Coste(50); //Objeto tipo coste, parametro kilometros
                double precioArticulo = 1.5; // Precio del articulo 
                double pesoArticulo = 0.5; //Precio del articulo en toneladas
                String resultadoPago = costePedido.PagarProveedor(precioArticulo, pesoArticulo);
                System.out.println(resultadoPago); //IMprime el total en euros a pagar al proveedor
                break;
            case 2:
                menu.MenuComprar();
                sc.nextLine();
                System.out.println("----Lista de productos disponibles----");
                GestionPedidos pedido2 = new GestionPedidos();
                pedido2.ListaProductos();
                pedido2.Cesta();
                
                //Envia los productos 
                //Pide por consola la ciudad y distancia en kilometros
                System.out.println("A que ciudad desea enviar sus productos?");
                String ciudad = sc.nextLine();
                System.out.println("Ingrese distancia en kilometros para su envio.");
                int km = sc.nextInt();
                PequenaLogistica pLogistica1 = new PequenaLogistica(km);//Crea objeto pequeña logistica
                GranLogistica gLogistica1 = new GranLogistica(ciudad, km); //Crea objeto gran logistica
                //Elige el tipo de logistica segun numero de kilometros
                if(km <= 100){
                    System.out.println(pLogistica1.Transportar());
                    System.out.println(pLogistica1.calcularCosteLogistica());
                }else{
                    System.out.println(gLogistica1.Transportar());
                    System.out.println(gLogistica1.calcularCosteLogistica());
                }    
                break;
            case 3:
                // informes
                menu.MenuInformes();
                break;
            case 4:
                quiereSalir = true;
                System.out.println("Hasta Pronto");
                break;
            default:
                menu.MenuBienvenido();
                break;
            }
        
    }while(quiereSalir != true);  
    }
}
