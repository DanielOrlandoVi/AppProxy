package Proxy;
import ServicioAbstracto.Cuentas;
import ServicioConcreto.CuentasReales;
import java.util.List;
import javax.swing.JOptionPane;
public class ProxyCuentas implements Cuentas{

    private CuentasReales cuentaReal;
    private String usuario;
    
    public ProxyCuentas(String usuario){
        this.usuario = usuario;
        this.cuentaReal = new CuentasReales();
    }
    @Override
    public void anadirCuenta(String numCuenta) {
        if(usuario.equals("Administrativo")){
           cuentaReal.anadirCuenta(numCuenta);
        }
        else{
            JOptionPane.showMessageDialog(null, "Acceso denegado. Necesita ser un administrativo para anadir o eliminar cuentas.");
        }
    }   

    @Override
    public void eliminarCuenta(String numCuenta) {
        if(usuario.equals("Administrativo")){
           cuentaReal.eliminarCuenta(numCuenta);
        }
        else{
            JOptionPane.showMessageDialog(null, "Acceso denegado. Necesita ser un administrativo para anadir o eliminar cuentas.");
        }
    }

    @Override
    public List<String> obtenerCuentas() {
        return cuentaReal.obtenerCuentas();
    }
}