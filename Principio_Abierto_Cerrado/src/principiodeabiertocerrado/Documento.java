
package principiodeabiertocerrado;
interface ExportadorDocumento {
    void exportar(String contenido);
}
class ExportadorPDF implements ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a PDF...\nContenido:\n" + contenido);
    }
}

class ExportadorWord implements ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Word...\nContenido:\n" + contenido);
    }
}

class ExportadorExcel implements ExportadorDocumento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Excel...\nContenido:\n" + contenido);
    }
}

class Documento {
    private String titulo;
    private String contenido;
    private ExportadorDocumento exportador;

    public Documento(String titulo, String contenido, ExportadorDocumento exportador) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.exportador = exportador;
    }

    public void exportar() {
        exportador.exportar("Título: " + titulo + "\n" + contenido);
    }
}
 class Main {
    public static void main(String[] args) {
        Documento docPDF = new Documento("Reporte Financiero", "Este es el contenido del reporte...", new ExportadorPDF());
        Documento docWord = new Documento("Propuesta Comercial", "Contenido de la propuesta...", new ExportadorWord());
        Documento docExcel = new Documento("Balance Mensual", "Datos de ingresos y gastos...", new ExportadorExcel());

        docPDF.exportar();
        System.out.println();
        docWord.exportar();
        System.out.println();
        docExcel.exportar();
    }
}
