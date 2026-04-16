package herencias.ejercicio02;

public class Operario extends Empleado {
    /**
     * Método toString
     *
     * @return Cadena de texto para todos los objetos empleados
     */
    public String toString() {
        return super.toString() + " -> Operario";
    }

}