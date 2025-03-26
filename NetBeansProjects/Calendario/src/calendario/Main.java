
package calendario;

public class Main {
    public static void main(String[] args) {
        Calendario ca = new Calendario();
        ca.mostrarFecha();
        ca.crearEvento("26/10/2025", "Cumple");
        ca.crearEvento("25/10/2025", "PRECumple");
        ca.mostrarMes(10, 2025);
        ca.mostrarDias("25/03/2025", "26/10/2025");
    }
}
