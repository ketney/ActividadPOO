package models;

/**
 * Clase Empleado (clase padre)
 * Ejercicio 2: Herencia y Polimorfismo
 */
public class Empleado {

    protected String nombre;
    protected long salario;

    public Empleado(String nombre, long salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    /**
     * Metodo que sera sobreescrito (Polimorfismo) por las clases hijas.
     * En la clase base retorna el salario base como valor por defecto.
     */
    public long calcularSalario() {
        return this.salario;
    }
}
