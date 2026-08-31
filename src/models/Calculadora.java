package models;

/**
 * Clase Calculadora
 * Ejercicio 3: Paso de variables por metodos
 */
public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No es posible dividir por cero.");
            return 0;
        }
        return a / b;
    }

    /**
     * Muestra por pantalla el nombre de la operacion y su resultado
     */
    public void mostrarResultado(String operacion, double resultado) {
        System.out.println(operacion + ": " + resultado);
    }
}
