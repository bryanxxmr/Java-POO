public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7; //soportado -128 a 127, si colocamos un valor mayor, nos dará un error de compilación
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo de byte corresponde en bytes a " + Byte.BYTES); //imprime el tamaño en bytes del tipo byte
        System.out.println("tipo de byte corresponde en bytes a " + Byte.SIZE); //imprime el tamaño en bits del tipo byte
        System.out.println("valor máximo de byte = " + Byte.MAX_VALUE); //imprime el valor máximo que puede almacenar un byte
        System.out.println("valor mínimo de byte = " + Byte.MIN_VALUE); //imprime el valor mínimo que puede almacenar un byte

        short numeroShort = 30000; //soportado -32768 a 32767
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("tipo de short corresponde en bytes a " + Short.BYTES); //imprime el tamaño en bytes del tipo short
        System.out.println("tipo de short corresponde en bits a " + Short.SIZE); //imprime el tamaño en bits del tipo short
        System.out.println("valor máximo de short = " + Short.MAX_VALUE); //imprime el valor máximo que puede almacenar un short
        System.out.println("valor mínimo de short = " + Short.MIN_VALUE); //imprime el valor mínimo que puede almacenar un short

        int numeroInt = 100000; //soportado -2147483648 a 2147483647
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("tipo de int corresponde en bytes a " + Integer.BYTES); //imprime el tamaño en bytes del tipo int
        System.out.println("tipo de int corresponde en bits a " + Integer.SIZE); //imprime el tamaño en bits del tipo int
        System.out.println("valor máximo de int = " + Integer.MAX_VALUE); //imprime el valor máximo que puede almacenar un int
        System.out.println("valor mínimo de int = " + Integer.MIN_VALUE); //imprime el valor mínimo que puede almacenar un int

        long numeroLong = 100000000000L; //soportado -9223372036854775808 a 9223372036854775807, se usa L al final para indicar que es un long
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("tipo de long corresponde en bytes a " + Long.BYTES); //imprime el tamaño en bytes del tipo long
        System.out.println("tipo de long corresponde en bits a " + Long.SIZE); //imprime el tamaño en bits del tipo long
        System.out.println("valor máximo de long = " + Long.MAX_VALUE); //imprime el valor máximo que puede almacenar un long
        System.out.println("valor mínimo de long = " + Long.MIN_VALUE); //imprime el valor mínimo que puede almacenar un long

        var numeroVar = 9223372036854775808f; //var permite declarar una variable sin especificar el tipo, el compilador lo infiere como int

    }
}
