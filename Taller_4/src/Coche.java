public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;


    public Coche(String marca, String modelo, double velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }




public String getModelo(){
        return modelo;
}

public String getMarca() {
    return marca;
}

public double getVelocidadMaxima(){
        return velocidadMaxima;
}



public void setVelocidadMaxima(double x){
        if (x >= 0){
            velocidadMaxima += x;
        }
}

    public String toString(){
        return "Marca :"+marca+" Modelo: "+modelo+" VelocidadMax: "+velocidadMaxima+" ";
    }

    public void oferta(){
        System.out.println("Marca :"+marca+" Modelo: "+modelo+" VelocidadMax: "+velocidadMaxima+"");
    }



}
