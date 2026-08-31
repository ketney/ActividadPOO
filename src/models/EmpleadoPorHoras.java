package models;

/**
 * Clase EmpleadoPorHoras (hereda de Empleado)
 */
public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private long valorHora;

    public EmpleadoPorHoras(String nombre, long salario, int horasTrabajadas, long valorHora) {
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Sobreescritura del metodo calcularSalario()
     * Retorna horasTrabajadas x valorHora
     */
    @Override
    public long calcularSalario() {
        return this.horasTrabajadas * this.valorHora;
    }
}
