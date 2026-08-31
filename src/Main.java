import models.Calculadora;
import models.Empleado;
import models.EmpleadoPorHoras;
import models.EmpleadoTiempoCompleto;
import models.Persona;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

/**
 * Actividad de Programacion Web
 * Principios de Programacion Orientada a Objetos en Java
 * Profesor: Ing. Giovanni Mora Jaimes - Programacion Web
 */
public class <Main {

    private static final Random RANDOM = new Random();
    private static final NumberFormat FORMATO_MONEDA = NumberFormat.getNumberInstance(new Locale("es", "CO"));

    public static void main(String[] args) {
        ejercicio1PersonasMayoresDeEdad();
        ejercicio2SistemaEmpleados();
        ejercicio3Calculadora();
    }

    // ==========================================================
    // EJERCICIO 1: Clase Persona - Encapsulamiento
    // ==========================================================
    public static void ejercicio1PersonasMayoresDeEdad() {
        System.out.println("===========================================================");
        System.out.println("EJERCICIO 1: Personas y verificacion de mayoria de edad");
        System.out.println("===========================================================");

        String[] nombres = {
                "Juan Perez", "Maria Gomez", "Carlos Ruiz", "Ana Torres", "Luis Diaz",
                "Sofia Lopez", "Pedro Martinez", "Laura Sanchez", "Diego Ramirez", "Valentina Castro"
        };

        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int edadAleatoria = RANDOM.nextInt(50) + 1; // edades entre 1 y 50 años
            String documento = String.valueOf(1000000000L + RANDOM.nextInt(900000000));
            Persona persona = new Persona(nombres[i], edadAleatoria, documento);
            personas.add(persona);
        }

        System.out.println("\nListado completo de personas:");
        for (Persona persona : personas) {
            persona.mostrarInformacion();
        }

        System.out.println("\nVerificacion de mayoria de edad:");
        for (Persona persona : personas) {
            if (persona.esMayorDeEdad()) {
                System.out.println("Nombre: " + persona.getNombre() + " Es mayor de edad");
            } else {
                System.out.println("Nombre: " + persona.getNombre() + " No es mayor de edad");
            }
        }
        System.out.println();
    }

    // ==========================================================
    // EJERCICIO 2: Sistema de empleados - Herencia
    // ==========================================================
    public static void ejercicio2SistemaEmpleados() {
        System.out.println("===========================================================");
        System.out.println("EJERCICIO 2: Sistema de empleados");
        System.out.println("===========================================================\n");

        String[] nombres = {
                "Pepito Perez", "Camila Rios", "Andres Vargas", "Natalia Ortiz", "Felipe Herrera",
                "Daniela Moreno", "Julian Rojas", "Paula Jimenez", "Sebastian Alvarez", "Isabella Cardona"
        };

        List<Empleado> empleados = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                // Empleado por horas
                int horas = RANDOM.nextInt(41) + 10; // entre 10 y 50 horas
                long valorHora = (RANDOM.nextInt(5) + 4) * 10000L; // entre 40.000 y 80.000
                empleados.add(new EmpleadoPorHoras(nombres[i], 0, horas, valorHora));
            } else {
                // Empleado a tiempo completo
                long salarioBase = (RANDOM.nextInt(10) + 10) * 100000L; // entre 1.000.000 y 1.900.000
                long bonificacion = (RANDOM.nextInt(5) + 1) * 50000L; // entre 50.000 y 250.000
                empleados.add(new EmpleadoTiempoCompleto(nombres[i], salarioBase, bonificacion));
            }
        }

        int contador = 1;
        for (Empleado empleado : empleados) {
            long salarioCalculado = empleado.calcularSalario();
            StringBuilder linea = new StringBuilder();
            linea.append("Empleado ").append(contador).append(": \"").append(empleado.getNombre()).append("\", ");
            linea.append("Salario Actual: \"").append(FORMATO_MONEDA.format(salarioCalculado)).append("\"");

            if (empleado instanceof EmpleadoPorHoras) {
                EmpleadoPorHoras empHoras = (EmpleadoPorHoras) empleado;
                linea.append(", Cantidad horas trabajadas: ").append(empHoras.getHorasTrabajadas());
                linea.append(". Valor de la hora: ").append(FORMATO_MONEDA.format(empHoras.getValorHora()));
            } else if (empleado instanceof EmpleadoTiempoCompleto) {
                EmpleadoTiempoCompleto empCompleto = (EmpleadoTiempoCompleto) empleado;
                linea.append(", Salario base: ").append(FORMATO_MONEDA.format(empCompleto.getSalario()));
                linea.append(". Bonificacion: ").append(FORMATO_MONEDA.format(empCompleto.getBonificacion()));
            }

            System.out.println(linea);
            contador++;
        }
        System.out.println();
    }

    // ==========================================================
    // EJERCICIO 3: Calculadora - Paso de variables por metodos
    // ==========================================================
    public static void ejercicio3Calculadora() {
        System.out.println("===========================================================");
        System.out.println("EJERCICIO 3: Calculadora");
        System.out.println("===========================================================\n");

        Calculadora calculadora = new Calculadora();

        double a = 20;
        double b = 30;

        double resultadoSuma = calculadora.sumar(a, b);
        calculadora.mostrarResultado("Suma", resultadoSuma);

        double resultadoResta = calculadora.restar(a, b);
        calculadora.mostrarResultado("Resta", resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(a, b);
        calculadora.mostrarResultado("Multiplicacion", resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(a, b);
        calculadora.mostrarResultado("Division", resultadoDivision);
    }
}
