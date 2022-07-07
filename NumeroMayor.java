/**
 *
 * @author Yessenia I. Martínez
 */
import java.util.Scanner;
public class NumeroMayor {
    public static void main(String args[])
    {
        Scanner leerTeclado=new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Proporciona el numero 1: ");
        numero1=leerTeclado.nextInt();
        System.out.print("Proporciona el numero 2: ");
        numero2=leerTeclado.nextInt();
        System.out.print("El número mayor es: ");
        System.out.println(numero1>numero2?numero1:numero2);
    }
}
