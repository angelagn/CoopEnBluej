import java.util.Scanner;

/**
 * Write a description of class Cooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
                break;
            case 2:
                menu.MenuComprar();
                break;
            case 3:
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
