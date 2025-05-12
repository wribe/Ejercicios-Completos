package org.Ejercicio5;

public class Camion extends Vehiculo implements TransportadorMercadorias{
    private int capacidadCarga;
    private int cargaActual;
    private static final int UNIDADCARGA = 9;
    private String conductor;

    public Camion(String modelo, String numeroDeSerie, int capacidadCarga, int cargaActual, String conductor) {
        super(modelo, numeroDeSerie);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
        this.conductor = conductor;
    }

    public Camion(String modelo, String numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible, int capacidadCarga, int cargaActual, String conductor) {
        super(modelo, numeroDeSerie, tipoCombustible, cantidadCombustible);
        this.capacidadCarga = capacidadCarga;
        this.cargaActual = cargaActual;
        this.conductor = conductor;
    }

    @Override
    public void mantemento(){
        System.out.println("Vamos a levar ao camión ao mantemento");
    }

    @Override
    public void cargar(){
        if (capacidadCarga > cargaActual) {
            cargaActual++;
        }else {
            System.err.println("Capacidad máxima alcanzada");
        }
    }

    @Override
    public void descargar(){
        if (cargaActual > 0){
            cargaActual--;
        } else if (cargaActual == 0) {
            cargaActual = 0;
        }else {
            System.err.println("Ya se ha descargado todo");
        }
    }

    @Override
    public String toString() {
        return "Camion{" +
                "modelo= " + super.getModelo() +
                ", nº serie= " + super.getNumeroDeSerie() +
                ", tipo combustible= " + super.getTipoCombustible() +
                ", combustible= " + super.getCantidadCombustible() +
                ", capacidadCarga=" + capacidadCarga +
                ", cargaActual=" + cargaActual +
                ", conductor='" + conductor + '\'' +
                '}';
    }
}
