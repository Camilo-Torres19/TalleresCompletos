
package principioderesponsabilidadúnica;
class Usuario {
    private String nombre;
    private String email;
    private String contraseña;

    public Usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }
}
class AutenticacionServicio {
    public boolean autenticar(Usuario usuario, String email, String contraseña) {
        return usuario.getEmail().equals(email) && usuario.getContraseña().equals(contraseña);
    }
}
class ValidacionServicio {
    public boolean validarEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public boolean validarContraseña(String contraseña) {
        return contraseña.length() >= 8;
    }
}
 class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan Tremendo", "juan@treme.com", "123");

        ValidacionServicio validador = new ValidacionServicio();
        if (validador.validarEmail(usuario.getEmail()) && validador.validarContraseña(usuario.getContraseña())) {
            System.out.println("Usuario válido.");
        } else {
            System.out.println("Datos inválidos.");
            return;
        }

        AutenticacionServicio autenticador = new AutenticacionServicio();
        boolean autenticado = autenticador.autenticar(usuario, "juan@example.com", "segura123");

        if (autenticado) {
            System.out.println("Bienvenido, " + usuario.getNombre());
        } else {
            System.out.println("Verifica tus credenciales.");
        }
    }
}
