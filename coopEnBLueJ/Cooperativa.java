import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir numero: ");
        int opcion = scanner.nextInt();
        
        switch(opcion){
            case 1:
                menu.MenuVender();
                Pedido pedido1 = new Pedido(new ArrayList<Producto>());
                
                pedido1.ListaProductosAdd();
                System.out.println("----Lista de productos agregados----");
                pedido1.ListaPedido();
                break;
            case 2:
                menu.MenuComprar();
                scanner.nextLine();
                System.out.println("----Lista de productos disponibles----");
                GestionPedidos pedido2 = new GestionPedidos();
                pedido2.ListaProductos();
                
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
