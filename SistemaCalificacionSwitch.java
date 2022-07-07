/**
 *
 * @author Yessenia I. Martínez
 */
import java.util.Scanner;
public class SistemaCalificacionSwitch {
    public static void main (String args[])
    {
        Scanner leerTeclado=new Scanner(System.in);
        int calificacion;
        System.out.print("Introduzca un número entre el 0 y el 10: ");
        calificacion=leerTeclado.nextInt();
        if(calificacion>=0 && calificacion<=10)
        {
              switch (calificacion)
              {
                   case 0: case 1: case 2: case 3: case 4: case 5:
                        System.out.println("F");
                        break;
                    case 6:
                        System.out.println("D");
                        break;  
                    case 7:
                        System.out.println("C");
                        break;
                    case 8:
                        System.out.println("B");
                        break; 
                    case 9: case 10:
                        System.out.println("A");
                        break;
              }         
        }
        else
        {
            System.out.println("Valor desconocido");
        }
    }
}
