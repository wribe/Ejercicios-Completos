package org.Ejercicio5;

import java.util.HashMap;

public class AvionComercial extends Avion{
    private int numeroPasaxeiros;
    private HashMap<String,String> tripulacion;

    public AvionComercial(String modelo, String numeroDeSerie, int consumo, int numeroPasaxeiros, HashMap<String, String> tripulacion) {
        super(modelo, numeroDeSerie, consumo);
        this.numeroPasaxeiros = numeroPasaxeiros;
        this.tripulacion = tripulacion;
    }

    public AvionComercial(String modelo, String numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible, int consumo, int numeroPasaxeiros, HashMap<String, String> tripulacion) {
        super(modelo, numeroDeSerie, tipoCombustible, cantidadCombustible, consumo);
        this.numeroPasaxeiros = numeroPasaxeiros;
        this.tripulacion = tripulacion;
    }

    public AvionComercial(String modelo, String numeroDeSerie, int consumo, int numeroPasaxeiros) {
        super(modelo, numeroDeSerie, consumo);
        this.numeroPasaxeiros = numeroPasaxeiros;
        this.tripulacion = new HashMap<>();
    }

    public AvionComercial(String modelo, String numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible, int consumo, int numeroPasaxeiros) {
        super(modelo, numeroDeSerie, tipoCombustible, cantidadCombustible, consumo);
        this.numeroPasaxeiros = numeroPasaxeiros;
        this.tripulacion = new HashMap<>();
    }

    public void asignarTripulacion(String cargo, String nome){
        tripulacion.put(cargo, nome);
    }

    @Override
    public String toString() {
        return "AvionComercial{" +
                "modelo= " + super.getModelo() +
                ", nº serie= " + super.getNumeroDeSerie() +
                ", tipo de combustible= " + super.getTipoCombustible() +
                ", numeroPasaxeiros=" + numeroPasaxeiros +
                ", tripulacion=" + tripulacion +
                '}';
    }


}
