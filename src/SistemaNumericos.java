public class SistemaNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; //con el 0b se indica que es un numero binario
        System.out.println("\nnumeroBinario = " + numeroBinario);

        System.out.println("numero octal de = " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764; //con el 0 antes del numero se indica que es un numero octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4; //con el 0x se indica que es un numero hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);
    }
}
