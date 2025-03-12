
package principiodeabiertocerrado;
abstract class Descuento {
    public abstract double aplicarDescuento(double precio);
}
class DescuentoPorcentaje extends Descuento {
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - (precio * (porcentaje / 100));
    }
}
class DescuentoFijo extends Descuento {
    private double cantidadDescuento;

    public DescuentoFijo(double cantidadDescuento) {
        this.cantidadDescuento = cantidadDescuento;
    }
    @Override
    public double aplicarDescuento(double precio) {
        return Math.max(0, precio - cantidadDescuento); 
    }
}
class Producto {
    private String nombre;
    private double precio;
    private Descuento descuento;

    public Producto(String nombre, double precio, Descuento descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return descuento.aplicarDescuento(precio);
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio original: $" + precio);
        System.out.println("Precio con descuento: $" + getPrecioFinal());
    }
}
 class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("zapatos", 100, new DescuentoPorcentaje(10)); 
        Producto producto2 = new Producto("Bolso", 50, new DescuentoFijo(15)); 

        producto1.mostrarInfo();
        System.out.println();
        producto2.mostrarInfo();
    }
}


