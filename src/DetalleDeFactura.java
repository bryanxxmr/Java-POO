import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la Factura: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del Primer Producto: ");
        double precioProducto1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del Segundo Producto: ");
        double precioProducto2 = scanner.nextDouble();

        double sumaProductos = precioProducto1 + precioProducto2;
        double impuesto = sumaProductos * 0.19; // 19% de impuesto
        double netoPagar = sumaProductos + impuesto;

        String mensaje = "La factura "+ nombreFactura + " Tiene un Total de: " + sumaProductos + " Impuestos de " +impuesto
                        + " Monto despues del impuesto " + netoPagar;
        System.out.println(mensaje);



    }
}
