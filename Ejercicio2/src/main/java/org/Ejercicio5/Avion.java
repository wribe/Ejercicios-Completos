package org.Ejercicio5;

public class Avion extends Vehiculo implements Voador{
    private int consumo;

    public Avion(String modelo, int numeroDeSerie, int consumo) {
        super(modelo, numeroDeSerie);
        this.consumo = consumo;
    }

    public Avion(String modelo, int numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible, int consumo) {
        super(modelo, numeroDeSerie, tipoCombustible, cantidadCombustible);
        this.consumo = consumo;
    }

    public double maximaDistanciaPercorrer(){

    }

    @Override
    public void aterrar(){
        System.out.println("o avión chegou ao seu destino");
    }

    @Override
    public void despegar(){
        System.out.println("o avión despegou");
    }

    @Override
    public void mantemento(){
        System.out.println("chamouse ao mecánico para o mantemento do avión");
    }
}
