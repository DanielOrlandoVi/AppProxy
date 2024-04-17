package ServicioConcreto;
import ServicioAbstracto.Cuentas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CuentasReales implements Cuentas{
    private List<String> cuentas;
    
    public CuentasReales(){
        this.cuentas = new ArrayList<>();
    }
    @Override
    public void anadirCuenta(String numCuenta) {
        cuentas.add(numCuenta);
        JOptionPane.showMessageDialog(null, "Cuenta: " + numCuenta + " anadida.");
    }

    @Override
    public void eliminarCuenta(String numCuenta) {
        cuentas.remove(numCuenta);
        JOptionPane.showMessageDialog(null, "Cuenta: " + numCuenta + " eliminada.");        
    }

    @Override
    public List<String> obtenerCuentas() {
        return cuentas;
    }
}