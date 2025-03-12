
package polimorfismo;

class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Estudiante extends Persona {
    public void estudiar() {
        System.out.println("Estoy estudiando para los exámenes.");
    }
}
 class Main {
    public static void main(String[] args) {
        Persona persona = new Estudiante(); 
        persona.presentarse();  

        if (persona instanceof Estudiante) {
            ((Estudiante) persona).estudiar(); 
        }
    }
}
