
import java.util.Scanner;
class Division{
public static void main(String args[]) {
      Scanner numeros  = new Scanner(System.in);
      int dividendo, divisor;
      System.out.println("Ingrese el dividendo:");    
      dividendo = Integer.parseInt(numeros.nextLine());
      System.out.println("Ingrese el divisor:");    
      divisor = Integer.parseInt(numeros.nextLine());
      int respuesta = dividendo / divisor;
      System.out.println("Resultado = " + respuesta);
   
}
}