import javax.swing.*;
import java.util.Scanner;

public class SistemaNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:"); //mensaje por consola
        String numeroStr= scanner.nextLine(); //leer un numero entero como String
        int numeroDecimal = 0; //convertir de String a int
        try {
            numeroDecimal = Integer.parseInt(numeroStr); //convertir de String a int
        } catch (NumberFormatException e) {
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(1); //salir del programa si el valor no es valido
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;

        System.out.println(mensaje);
    }
}
