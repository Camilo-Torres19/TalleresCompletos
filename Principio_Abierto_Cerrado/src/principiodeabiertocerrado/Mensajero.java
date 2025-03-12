
package principiodeabiertocerrado;
interface CanalMensajeria {
    void enviarMensaje(String destinatario, String mensaje);
}
class EmailMensajero implements CanalMensajeria {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando al Email a " + destinatario + ":\n" + mensaje);
    }
}

class SMSMensajero implements CanalMensajeria {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando a SMS a " + destinatario + ":\n" + mensaje);
    }
}
class PushMensajero implements CanalMensajeria {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando la Notificación Push a " + destinatario + ":\n" + mensaje);
    }
}
class Mensajero {
    private CanalMensajeria canal;

    public Mensajero(CanalMensajeria canal) {
        this.canal = canal;
    }

    public void enviar(String destinatario, String mensaje) {
        canal.enviarMensaje(destinatario, mensaje);
    }
}
 class Main {
    public static void main(String[] args) {
        Mensajero emailMensajero = new Mensajero(new EmailMensajero());
        Mensajero smsMensajero = new Mensajero(new SMSMensajero());
        Mensajero pushMensajero = new Mensajero(new PushMensajero());

        emailMensajero.enviar("usuario@example.com", "Bienvenido a nuestro sistema.");
        System.out.println();
        smsMensajero.enviar("+123456789", "Tu código de verificación es 1234.");
        System.out.println();
        pushMensajero.enviar("ID12345", "Tienes una nueva actualización en la app.");
    }
}
