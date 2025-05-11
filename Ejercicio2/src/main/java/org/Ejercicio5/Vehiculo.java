package org.Ejercicio5;

public abstract class Vehiculo {
    private String modelo;
    private int numeroDeSerie;
    private TipoCombustible tipoCombustible;
    private int cantidadCombustible;

    public Vehiculo(String modelo, int numeroDeSerie) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.tipoCombustible = TipoCombustible.DIESEL;
        this.cantidadCombustible = 0;
    }

    public Vehiculo(String modelo, int numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.tipoCombustible = tipoCombustible;
        this.cantidadCombustible = cantidadCombustible;
    }

    abstract void mantemento();

    public void cargarCombustible(){
        System.out.println(tipoCombustible);
    }
}
