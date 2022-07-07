


/*Problema resuelto en NETBeans IDE
*por: Yessenia Martínez
Manejo de cadenas simple
*_____________________________

*/
import java.util.Scanner;
public class ManejoCadenas 
{
  public static void main(String args[])
  {
      String titulo;
      String autor;
      Scanner leerTeclado=new Scanner (System.in);
      System.out.print("Proporciona el título del libro: ");
      titulo=leerTeclado.nextLine();
      System.out.print("Proporciona el autor de libro: ");
      autor=leerTeclado.nextLine();
      System.out.println("\'"+titulo+"\' fue escrito por "+autor);
  }
}
