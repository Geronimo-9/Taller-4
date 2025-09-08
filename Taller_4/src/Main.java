public class Main{
    public static void main(String[] args) {


Estudiante e1 = new Estudiante("Geronimo",-909,-9);
        System.out.println(e1);




        Coche c1 = new Coche("Toyota","86s",0);
        System.out.println(c1);

        c1.setVelocidadMaxima(400);
        System.out.println(c1);

        c1.setVelocidadMaxima(-900);
        System.out.println(c1);

        c1.setVelocidadMaxima(900);
        System.out.println(c1);

        
//c1.modelo();




    }
}