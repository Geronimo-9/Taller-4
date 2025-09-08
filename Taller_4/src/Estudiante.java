public class Estudiante {
 private String nombre;
 private int edad;
 private double notaPromedio;


 public Estudiante(String nombre, int edad, double notaPromedio){
     this.nombre = nombre;
     setEdad(edad);
     setNotaPromedio(notaPromedio);

 }








    public String getNombre() {
        return nombre;
    }

    public int getEdad(){
     return edad;
    }

    public double getNotaPromedio(){
     return notaPromedio;
    }

public void setNombre(String nombre){
this.nombre = nombre;

}

public void setEdad(int edad){
     if(edad >= 0){
         this.edad = edad;
     }
}

public void setNotaPromedio(double notaPromedio){
if(notaPromedio >= 0){
    this.notaPromedio = notaPromedio;
}
 }

 public String toString(){
    return "Nombre :"+nombre+" Edad: "+edad+" Promedio: "+notaPromedio+" ";
 }





}















