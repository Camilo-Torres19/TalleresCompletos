package principioderesponsabilidadúnica;
// Clase representa un Producto
class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public Producto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getImpuesto() {
        return impuesto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", impuesto=" + impuesto +
                '}';
    }
}
class CalculadorPrecio {
    public double calcularPrecioFinal(Producto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto() / 100);
    }
}
class GeneradorEtiquetas {
    public void generarEtiqueta(Producto producto, double precioFinal) {
        System.out.println("  El Producto  :");
        System.out.println("----------------------");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecioBase());
        System.out.println("Impuesto: " + producto.getImpuesto() + "%");
        System.out.println("Precio : $" + precioFinal);
        System.out.println("----------------------");
    }
}
 class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Avanico", 1000.0, 21.0);

        CalculadorPrecio calculador = new CalculadorPrecio();
        double precioFinal = calculador.calcularPrecioFinal(producto);

        GeneradorEtiquetas generadorEtiquetas = new GeneradorEtiquetas();
        generadorEtiquetas.generarEtiqueta(producto, precioFinal);
    }
}



