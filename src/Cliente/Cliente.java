package Cliente;

import javax.swing.JOptionPane;
import Proxy.ProxyCuentas;
public class Cliente {
    public static void main(String[] args) {
    
        String opciones[] = {"Guardia", "Administrativo", "Salir"};
        ProxyCuentas guardia = new ProxyCuentas("Guardia");
        ProxyCuentas admin = new ProxyCuentas("Administrativo");

        while (true) {

            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione un rol:", "Seleccion de roles",
                    JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (opcion == null || opcion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                break;
            }
                               
            switch (opcion) {
                case "Guardia":
                    guardia.anadirCuenta("0");
                    break;
                case "Administrativo":
                    String opcionesAdmin[] = {"Añadir cuenta", "Eliminar cuenta"};
                    String opcionAdmin = (String) JOptionPane.showInputDialog(null, "Seleccione una operación:", "Operaciones de administrador",
                            JOptionPane.QUESTION_MESSAGE, null, opcionesAdmin, opcionesAdmin[0]);
                    if (opcionAdmin.equals("Añadir cuenta")) {
                        String numCuenta = JOptionPane.showInputDialog("Introduzca el numero de cuenta: ");
                        admin.anadirCuenta(numCuenta);
                    } else if (opcionAdmin.equals("Eliminar cuenta")) {
                        String numCuenta = JOptionPane.showInputDialog("Introduzca el numero de cuenta a eliminar: ");
                        admin.eliminarCuenta(numCuenta);
                    }
                    JOptionPane.showMessageDialog(null, "Cuentas actuales: \n" + admin.obtenerCuentas());
                    break;
                case "Salir":
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Tipo de opcion no valida.");
                    return;
            }
        }
    }
    
}
