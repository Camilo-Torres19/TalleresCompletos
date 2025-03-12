package polimorfismo;
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche está conduciendo por la carretera.");
    }
}
class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta está pedaleando por el Bicicarril.");
    }
}
 class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Coche();
        Vehiculo vehiculo2 = new Bicicleta();

        vehiculo1.mover(); 
        vehiculo2.mover(); 
    }
}

