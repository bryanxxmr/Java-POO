public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroString = "123"; // Cadena que representa un número
        int numeroEntero = Integer.parseInt(numeroString); // Conversión de String a int
        System.out.println("numeroEntero = " + numeroEntero); // Imprime: numeroEntero = 123

        String numeroDecimalString = "123.45"; // Cadena que representa un número decimal
        double numeroDecimal = Double.parseDouble(numeroDecimalString); // Conversión de String a double
        System.out.println("numeroDecimal = " + numeroDecimal); // Imprime: numeroDecimal = 123.45

        String booleanString = "false"; // Cadena que representa un booleano
        boolean valorBooleano = Boolean.parseBoolean(booleanString); // Conversión de String a boolean
        System.out.println("valorBooleano = " + valorBooleano); // Imprime: valorBooleano = true

    }
