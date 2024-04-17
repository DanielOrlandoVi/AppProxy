package ServicioAbstracto;

import java.util.List;

public interface Cuentas {
    void anadirCuenta(String numCuenta);
    void eliminarCuenta(String numCuenta);
    List<String> obtenerCuentas();
}
