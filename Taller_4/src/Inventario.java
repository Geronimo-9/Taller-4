public class Inventario {
    private String nombre;
    private int stock;
    private double precio;


    public Inventario(String nombre, int stock, double precio){
    this.nombre = nombre;
    this.stock = stock;
    this.precio = precio;

    }

public void mostrarInventario(){
    System.out.println(" Nombre :"+nombre+" Stock: "+stock+" Precio: "+precio+" ");
}




}

