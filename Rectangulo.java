/**
 *
 * @author Yessenia I. Martínez
 */
import java.util.Scanner;
public class Rectangulo {
    public static void main(String args[])
    {
        Scanner leerTeclado=new Scanner(System.in);
        int alto;
        int ancho;
        int area;
        int perimetro;
        System.out.print("Proporciona el alto: ");
        alto=leerTeclado.nextInt();
        System.out.print("Proporciona el ancho: ");
        ancho=leerTeclado.nextInt();
        area=alto*ancho;
        perimetro=(alto+ancho)*2;
        System.out.println("Área: "+area);
        System.out.println("Perímetro: "+perimetro);
    }
}
