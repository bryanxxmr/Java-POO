public class HolaMundo {
    //public es el modificador de acceso
    //static indica que el método pertenece a la clase, no a una instancia
    //void indica que el método no devuelve ningún valor
    //main es el nombre del método al que se llama al iniciar el programa
    public static void main(String[] args) {
        //hemos creado una variable de tipo String
        String saludar="Hola Mundo desde Java";
        System.out.println(saludar);    //imprimimos el contenido de la variable en la consola
        //también podemos imprimir directamente el texto sin usar una variable
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;//declaramos una variable de tipo entero
        System.out.println("numero = " + numero);

        boolean valor= true;    //declaramos una variable de tipo boolean, boolean puede ser true o false
        int numero2 = 20;
        if(valor)
        {
            System.out.println("numero = " + numero);   //si valor es true, se ejecuta este bloque de código
            numero2 = 30;   //cambiamos el valor de numero2
        }
        System.out.println("numero2 = " + numero2);//imprimimos el valor de numero2 que ha sido modificado si valor era true

        var numero3 = "15"; //var permite declarar una variable sin especificar el tipo (entero o string), el compilador lo infiere

        String nombre; //declaramos una variable de tipo String sin inicializarla
        nombre = "Andres"; //asignamos un valor a la variable nombre

        if(numero>9)
        {
            nombre="Juan"; //cambiamos el valor de nombre si numero es mayor que 10
        }
        System.out.println("nombre = " + nombre); //imprimimos el valor de nombre

    }
}
