import java.util.Scanner;

public class MathFunctions {
	
	  public static int multiply(int a, int b) {
		    return a*b;
	  }

    public static int subtractionNumber(int  numberA, int numberB) {
        return numberA - numberB;
    }
	
	  public static int squaring(int a) {
        return a*a;
	  }
    
    public static double Sqrt(double num) {
        return Math.sqrt(num);
    }
    
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static int plus(int numA, int numB){
        return numA + numB;
    }
    
    public static void division(String args[]) {
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