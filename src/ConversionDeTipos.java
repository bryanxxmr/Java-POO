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

        // Conversión de tipos primitivos a String

        int numero = 456; // Un número entero
        String numeroComoString = Integer.toString(numero); // Conversión de int a String
        System.out.println("numeroComoString = " + numeroComoString); // Imprime: numeroComoString = 456

        numeroComoString = String.valueOf(numero + 10); // Otra forma de convertir int a String
        System.out.println("numeroComoString = " + numeroComoString); // Imprime: numeroComoString = 456

        double decimal = 78.9; // Un número decimal
        String decimalComoString = Double.toString(decimal); // Conversión de double a String
        System.out.println("decimalComoString = " + decimalComoString); // Imprime: decimalComoString = 78.9
        decimalComoString = String.valueOf(decimal + 1.1); // Otra forma de convertir double a String
        System.out.println("decimalComoString = " + decimalComoString); // Imprime: decimalComoString = 80.0
        boolean booleano = true; // Un valor booleano
        String booleanoComoString = Boolean.toString(booleano); // Conversión de boolean a String
        System.out.println("booleanoComoString = " + booleanoComoString); // Imprime: booleanoComoString = true


        int i=10000; // Un número entero
        short s = (short) i; // Conversión de int a short
        System.out.println("s = " + s); // Imprime: s = -15536 (debido a la pérdida de datos)
        long l = i; // Un número largo
        System.out.println("l = " + l); // Imprime: l = 10000
        System.out.println(Short.MAX_VALUE);

    }
}