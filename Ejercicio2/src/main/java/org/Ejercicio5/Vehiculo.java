package org.Ejercicio5;

public abstract class Vehiculo {
    private String modelo;
    private String numeroDeSerie;
    private TipoCombustible tipoCombustible;
    private int cantidadCombustible;

    public Vehiculo(String modelo, String numeroDeSerie) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.tipoCombustible = TipoCombustible.DIESEL;
        this.cantidadCombustible = 0;
    }

    public Vehiculo(String modelo, String numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.tipoCombustible = tipoCombustible;
        this.cantidadCombustible = cantidadCombustible;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public int getCantidadCombustible() {
        return cantidadCombustible;
    }

    abstract void mantemento();

    public void cargarCombustible(){
        System.out.println(tipoCombustible);
    }


}
