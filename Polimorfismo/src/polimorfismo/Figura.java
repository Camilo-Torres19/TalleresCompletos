package polimorfismo;
class Figura {
    public void calcularArea() {
        System.out.println("Calculando área de una figura...");
    }
}
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);
    }
}
class Rectangulo extends Figura {
    private double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        double area = ancho * alto;
        System.out.println("Área del rectángulo: " + area);
    }
}
class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        figura1.calcularArea(); 
        figura2.calcularArea(); 
    }
}
