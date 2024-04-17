package ServicioConcreto;
import ServicioAbstracto.Cuentas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

// La clase CuentasReales implementa la interfaz Cuentas
public class CuentasReales implements Cuentas{
    // Lista privada para almacenar los números de cuenta
    private List<String> cuentas;
    
    // Constructor de la clase que inicializa la lista de cuentas
    public CuentasReales(){
        this.cuentas = new ArrayList<>();
    }
    
    // Método para añadir un número de cuenta a la lista
    @Override
    public void anadirCuenta(String numCuenta) {
        cuentas.add(numCuenta);
        // Muestra un mensaje de confirmación después de añadir la cuenta
        JOptionPane.showMessageDialog(null, "Cuenta: " + numCuenta + " anadida.");
    }

    // Método para eliminar un número de cuenta de la lista
    @Override
    public void eliminarCuenta(String numCuenta) {
        cuentas.remove(numCuenta);
        // Muestra un mensaje de confirmación después de eliminar la cuenta
        JOptionPane.showMessageDialog(null, "Cuenta: " + numCuenta + " eliminada.");        
    }

    // Método para obtener la lista de cuentas
    @Override
    public List<String> obtenerCuentas() {
        return cuentas;
    }
}
