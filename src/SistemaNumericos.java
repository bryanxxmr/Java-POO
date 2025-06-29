import javax.swing.*;

public class SistemaNumericos {
    public static void main(String[] args) {

        String numeroStr=JOptionPane.showInputDialog(null,"Ingrese un numero entero:");
        int numeroDecimal = Integer.parseInt(numeroStr); //convertir de String a int
        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        int numeroBinario = 0b111110100; //con el 0b se indica que es un numero binario
        System.out.println("\nnumeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 0764; //con el 0 antes del numero se indica que es un numero octal
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);
        int numeroHexadecimal = 0x1f4; //con el 0x se indica que es un numero hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        String mensaje = mensajeBinario;
        mensaje += "\n"+mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
