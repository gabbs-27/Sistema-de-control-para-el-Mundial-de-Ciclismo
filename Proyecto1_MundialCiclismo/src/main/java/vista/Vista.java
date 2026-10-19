

package vista;



import javax.swing.JOptionPane;
import controlador.ControladorMundial;


public class Vista {

    private ControladorMundial controlador;

    public Vista(ControladorMundial controlador) {
        this.controlador = controlador;
    }

    public String leerTexto(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        return dato;
    }

    public int leerEntero(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        int numero = Integer.parseInt(dato);
        return numero;
    }

    public double leerDouble(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        double numero = Double.parseDouble(dato);
        return numero;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }


    public int mostrarMenu() {
        String menu = "MUNDIAL DE CICLISMO DE PISTA - CALI\n\n"
                + "1. Registrar corredor 1\n"
                + "2. Registrar corredor 2\n"
                + "3. Actualizar ranking del corredor 1\n"
                + "4. Actualizar ranking del corredor 2\n"
                + "5. Ver ranking\n"
                + "0. Salir\n\n"
                + "Seleccione una opción:";
        int opcion = leerEntero(menu);
        return opcion;
    }


    public void registrar(int numero) {
        String nombre = leerTexto("Corredor " + numero + " - Nombre:");
        int edad = leerEntero("Corredor " + numero + " - Edad:");
        String pais = leerTexto("Corredor " + numero + " - País:");
        int ranking = leerEntero("Corredor " + numero + " - Ranking mundial:");
        double estatura = leerDouble("Corredor " + numero + " - Estatura en metros (ej: 1.80):");
        double peso = leerDouble("Corredor " + numero + " - Peso en kg (ej: 75.5):");
        String resultado = controlador.registrarCorredor(numero, nombre, edad, pais, ranking, estatura, peso);
        mostrarMensaje(resultado);
    }


    public void actualizar(int numero) {
        int puntos = leerEntero("Corredor " + numero + " - Puntos obtenidos:");
        int respuesta = leerEntero("¿Ganó medalla?\nEscriba 1 si ganó o 0 si no ganó:");
        boolean medalla;
        if (respuesta == 1) {
            medalla = true;
        } else {
            medalla = false;
        }
        String resultado = controlador.actualizarRanking(numero, puntos, medalla);
        mostrarMensaje(resultado);
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = mostrarMenu();
            if (opcion == 1) {
                registrar(1);
            }
            if (opcion == 2) {
                registrar(2);
            }
            if (opcion == 3) {
                actualizar(1);
            }
            if (opcion == 4) {
                actualizar(2);
            }
            if (opcion == 5) {
                mostrarMensaje(controlador.verRanking());
            }
            if (opcion == 0) {
                mostrarMensaje("Fin del programa.");
            }
        } while (opcion > 0);
        
    }
}