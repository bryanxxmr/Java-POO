public class PrimitivosCaracteres {
    public static void main(String[] args) {
        // Caracteres especiales
        var caracter = '\u0040'; // Caracter normal, solo un caracter no más
        var decimal = 64; // Representación decimal del caracter 'A'
        System.out.println("letra = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal==caracter));

        char simbolo = '@'; // Representación del símbolo '$'
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo==caracter));

        char espacio = ' '; // Representación del espacio o unicode 32 es '\u0020'
        char retroceso = '\b'; // Representación del retroceso o unicode 8 es '\u0008'
        char tabulador = '\t'; // Representación de la tabulación o unicode 9 es '\u0009'
        char nuevaLinea = '\n'; // Representación de la nueva línea
        char retornoCarro = '\r'; // Representación del retorno de carro

        System.out.println("char corresponde en byte:" + System.lineSeparator() +Character.BYTES);
        System.out.println("char corresponde en bits = " + Character.SIZE);
        System.out.println("Valor mínimo de char = " + Character.MIN_VALUE);
        System.out.println("Valor máximo de char = " + Character.MAX_VALUE);
    }
}
