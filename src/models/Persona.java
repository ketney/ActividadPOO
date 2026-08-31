package models;

/**
 * Clase Persona
 * Ejercicio 1: Encapsulamiento, constructores, metodos get/set
 */
public class Persona {

    // Atributos privados (Encapsulamiento)
    private String nombre;
    private int edad;
    private String documento;

    /**
     * Constructor que inicializa los tres atributos
     */
    public Persona(String nombre, int edad, String documento) {
        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
    }

    // ---------- Getters y Setters ----------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Muestra por consola la informacion de la persona
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Documento: " + documento);
    }

    /**
     * Indica si la persona es mayor de edad (edad > 18)
     */
    public boolean esMayorDeEdad() {
        return this.edad > 18;
    }
}
