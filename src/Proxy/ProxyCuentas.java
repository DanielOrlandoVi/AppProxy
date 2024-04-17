package Proxy;
import ServicioAbstracto.Cuentas;
import ServicioConcreto.CuentasReales;
import java.util.List;
import javax.swing.JOptionPane;

// La clase ProxyCuentas implementa la interfaz Cuentas
public class ProxyCuentas implements Cuentas{

    // Referencia a un objeto de la clase CuentasReales
    private CuentasReales cuentaReal;
    
    // Variable para almacenar el tipo de usuario
    private String usuario;
    
    // Constructor de la clase que inicializa el usuario y la cuenta real
    public ProxyCuentas(String usuario){
        this.usuario = usuario;
        this.cuentaReal = new CuentasReales();
    }
    
    // Método para añadir una cuenta, solo si el usuario es "Administrativo"
    @Override
    public void anadirCuenta(String numCuenta) {
        if(usuario.equals("Administrativo")){
           cuentaReal.anadirCuenta(numCuenta);
        }
        else{
            // Si el usuario no es "Administrativo", se muestra un mensaje de acceso denegado
            JOptionPane.showMessageDialog(null, "Acceso denegado. Necesita ser un administrativo para anadir o eliminar cuentas.");
        }
    }   

    // Método para eliminar una cuenta, solo si el usuario es "Administrativo"
    @Override
    public void eliminarCuenta(String numCuenta) {
        if(usuario.equals("Administrativo")){
           cuentaReal.eliminarCuenta(numCuenta);
        }
        else{
            // Si el usuario no es "Administrativo", se muestra un mensaje de acceso denegado
            JOptionPane.showMessageDialog(null, "Acceso denegado. Necesita ser un administrativo para anadir o eliminar cuentas.");
        }
    }

    // Método para obtener la lista de cuentas
    @Override
    public List<String> obtenerCuentas() {
        return cuentaReal.obtenerCuentas();
    }
}
