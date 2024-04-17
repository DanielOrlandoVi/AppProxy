package Cliente;

import javax.swing.JOptionPane;
import Proxy.ProxyCuentas;

public class Cliente {
    public static void main(String[] args) {
    
        // Opciones de roles disponibles
        String opciones[] = {"Guardia", "Administrativo", "Salir"};
        
        // Creación de los objetos Proxy para cada rol
        ProxyCuentas guardia = new ProxyCuentas("Guardia");
        ProxyCuentas admin = new ProxyCuentas("Administrativo");

        // Bucle infinito hasta que se seleccione la opción "Salir"
        while (true) {

            // Solicita al usuario que seleccione un rol
            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione un rol:", "Seleccion de roles",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            // Si el usuario cierra el cuadro de diálogo o selecciona "Salir", se termina el programa
            if (opcion == null || opcion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }
                               
            // Dependiendo del rol seleccionado, se realizan diferentes acciones
            switch (opcion) {
                case "Guardia":
                    // Se anade numCuenta por defecto para que arroje mensaje de no autorizado al seleccionar la opcion
                    guardia.anadirCuenta("0");
                    break;
                case "Administrativo":
                    // El administrativo puede añadir o eliminar cuentas
                    String opcionesAdmin[] = {"Añadir cuenta", "Eliminar cuenta"};
                    String opcionAdmin = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:", "Operaciones de administrador",
                            JOptionPane.QUESTION_MESSAGE, null, opcionesAdmin, opcionesAdmin[0]);
                    if (opcionAdmin.equals("Añadir cuenta")) {
                        // Solicita al usuario que introduzca el número de cuenta a añadir
                        String numCuenta = JOptionPane.showInputDialog("Introduzca el numero de cuenta: ");
                        admin.anadirCuenta(numCuenta);
                    } else if (opcionAdmin.equals("Eliminar cuenta")) {
                        // Solicita al usuario que introduzca el número de cuenta a eliminar
                        String numCuenta = JOptionPane.showInputDialog("Introduzca el numero de cuenta a eliminar: ");
                        admin.eliminarCuenta(numCuenta);
                    }
                    // Muestra las cuentas actuales
                    JOptionPane.showMessageDialog(null, "Cuentas actuales: \n" + admin.obtenerCuentas());
                    break;
                case "Salir":
                    // Termina el programa
                    System.exit(0);
                    break;

                default:
                    // Si se selecciona una opción no válida, se muestra un mensaje de error
                    JOptionPane.showMessageDialog(null, "Tipo de opcion no valida.");
                    return;
            }
        }
    }
    
}
