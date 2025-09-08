// Test del ejercicio 3.1

public class Persona {
    private String nombre;
    private int edad;
    private static double saldoDisponible;


    public Persona(String nombre, int edad, double saldoDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldoDisponible = saldoDisponible;
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static double getSaldoDisponible() {
        return saldoDisponible;
    }


}

