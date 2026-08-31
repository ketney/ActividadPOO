package models;

/**
 * Clase EmpleadoTiempoCompleto (hereda de Empleado)
 */
public class EmpleadoTiempoCompleto extends Empleado {

    private long bonificacion;

    public EmpleadoTiempoCompleto(String nombre, long salario, long bonificacion) {
        super(nombre, salario);
        this.bonificacion = bonificacion;
    }

    public long getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(long bonificacion) {
        this.bonificacion = bonificacion;
    }

    /**
     * Sobreescritura del metodo calcularSalario()
     * Retorna salario + bonificacion
     */
    @Override
    public long calcularSalario() {
        return this.salario + this.bonificacion;
    }
}
