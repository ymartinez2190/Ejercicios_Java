/**
 *
 * @author Yessenia I. Martínez
 */
import java.util.Scanner;
public class UsoVariables {
    public static void main(String args[])
    {
        Scanner leerTeclado=new Scanner(System.in);
        String nombre;
        int id;
        double precio;
        boolean envioGratuito;
        System.out.print("Proporciona el nombre del libro: ");
        nombre=leerTeclado.nextLine();
        System.out.print("Proporciona el identificador de libro: ");
        id=leerTeclado.nextInt();
        System.out.print("Proporciona el precio del libro: ");
        precio=leerTeclado.nextDouble();
        System.out.print("Proporcione si desea envío gratuito: ");
        envioGratuito=leerTeclado.nextBoolean();
        System.out.println("Los datos ingresados fueron: ");
        System.out.println(nombre+ " #"+id);
        System.out.println("Precio: "+ "$"+precio);
        System.out.println("Envío gratuito: "+envioGratuito);
    }
}
