public class PrimitivosFloat {

    public static void main(String[] args) {
        float realFloat = 0.000000000015f; //soportado -3.4028235E38 a 3.4028235E38, se usa f al final para indicar que es un float
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en bytes a " + Float.BYTES); //imprime el tamaño en bytes del tipo float
        System.out.println("float corresponde en bits a " + Float.SIZE); //imprime el tamaño en bits del tipo float
        System.out.println("valor máximo de float = " + Float.MAX_VALUE); //imprime el valor máximo que puede almacenar un float
        System.out.println("valor mínimo de float = " + Float.MIN_VALUE); //imprime el valor mínimo que puede almacenar un float

        double realDouble = 3.4028235E38; //soportado -1.7976931348623157E308 a 1.7976931348623157E308, no se usa sufijo al final
        System.out.println("\nrealDouble = " + realDouble);
        System.out.println("double corresponde en bytes a " + Double.BYTES); //imprime el tamaño en bytes del tipo double
        System.out.println("double corresponde en bits a " + Double.SIZE); //imprime el tamaño en bits del tipo double
        System.out.println("valor máximo de double = " + Double.MAX_VALUE); //imprime el valor máximo que puede almacenar un double
        System.out.println("valor mínimo de double = " + Double.MIN_VALUE); //imprime el valor mínimo que puede almacenar un double

        var varFlotante = 3.1416; //var permite declarar una variable sin especificar el tipo, el compilador lo infiere como double
        System.out.println("\nvarFlotante = " + varFlotante);
        // Si se quiere usar un float, se debe especificar el sufijo 'f' al final del número

    }
}
