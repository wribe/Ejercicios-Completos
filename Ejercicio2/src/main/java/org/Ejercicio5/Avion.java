package org.Ejercicio5;

public class Avion extends Vehiculo implements Voador{
    private int consumo; // por cada  100 km x consumo

    public Avion(String modelo, String numeroDeSerie, int consumo) {
        super(modelo, numeroDeSerie);
        this.consumo = consumo;
    }

    public Avion(String modelo, String numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible, int consumo) {
        super(modelo, numeroDeSerie, tipoCombustible, cantidadCombustible);
        this.consumo = consumo;
    }

    public int getConsumo() {
        return consumo;
    }

    public double maximaDistanciaPercorrer(){
        double dist = (double)(super.getCantidadCombustible() * 100)/consumo;
        return dist;
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

    @Override
    public String toString() {
        return "Avion{" +
                "modelo= " + super.getModelo() +
                ", numero serie= " + super.getNumeroDeSerie() +
                ", tipo de combustible= " + super.getTipoCombustible() +
                ", combustible= " + super.getCantidadCombustible() +
                ", consumo=" + consumo +
                '}';
    }
}
