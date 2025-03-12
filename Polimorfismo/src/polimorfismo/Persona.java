package polimorfismo;
class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}
class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante y estoy aprendiendo.");
    }
}
class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor y me encanta enseñar.");
    }
}
class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona estudiante1 = new Estudiante();
        Persona profesor1 = new Profesor();

        persona1.presentarse();  
        estudiante1.presentarse(); 
        profesor1.presentarse(); 
    }
}

