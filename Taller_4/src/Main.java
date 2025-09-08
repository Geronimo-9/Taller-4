public class Main{
    public static void main(String[] args) {

// Ejercicio 1 Clase estudiantes con validacion en edad y notaPromedio
Estudiante e1 = new Estudiante("Geronimo",-909,-9);
        System.out.println(e1);



// Ejercicio 2 Clase Coche con validacion en velocidadMaxima
        Coche c1 = new Coche("Toyota","86s",0);
        System.out.println(c1);

        c1.setVelocidadMaxima(400);
        System.out.println(c1);

        c1.setVelocidadMaxima(-900);
        System.out.println(c1);

        c1.setVelocidadMaxima(900);
        System.out.println(c1);


//c1.modelo(); // ERROR, no tiene permiso para acceder al atributo de la clase porque esta en privado


            // Ejercicio 3, Accediedo atributos privados y malas practicas del uso de get y set.
            //
            //

            //System.out.println(Persona.saldoDisponible());  Acá se intenta acceder al atributo privado


            Inventario microonda = new Inventario("Haceb",-15,-350000.34);

            microonda.mostrarInventario();

            /* En este caso, vemos que hemos instanciado un objeto de la clase inventario.
               Sin embargo, no se usó los metodos get y set para manejar el stock y el precio
               adecuadamente. Esto a largo plazo, puede afectar gravemente cuando se implemente
               un proyecto donde un manejo inadecuado de estos metodos afecta a todas las personas
               y afectar la seguridad del software ante poisbles ataques informáticos.
           */


    }
}