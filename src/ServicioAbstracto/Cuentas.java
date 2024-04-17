package ServicioAbstracto;

import java.util.List;

// Interfaz Cuentas que define los métodos que deben ser implementados
public interface Cuentas {
    // Método para añadir una cuenta
    void anadirCuenta(String numCuenta);
    
    // Método para eliminar una cuenta
    void eliminarCuenta(String numCuenta);
    
    // Método para obtener la lista de cuentas
    List<String> obtenerCuentas();
}

