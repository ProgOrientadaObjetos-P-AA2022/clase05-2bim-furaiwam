package paquete06;

public class TarjrtaCredito {
    private String nombre, codigo;
    private double cupoMarximo;

    public TarjrtaCredito(String nomb, String c,double cM){
        nombre =nomb;
        codigo =c;
        cupoMarximo= cM;
    }
    public void establecerNombre(String nombre ){
        nombre = nombre;
    }

    public void establecerCodigo(String n ){
        codigo = codigo;
    }

    public void establecerCupoMaximo(TarjrtaCredito n){
        cupoMarximo = cupoMarximo;
    }

    public String obtenerCodigo(){
        return codigo;
    }
    public double obtenerCupoMaximo(){
        return cupoMarximo;
    }


}
