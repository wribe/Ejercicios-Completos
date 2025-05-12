package org.Ejercicio5;

public class AvionCarga extends  Avion implements TransportadorMercadorias{
    private int capacidadeCarga;
    private int cargaActual;
    private String comandante;

    public AvionCarga(String modelo, String numeroDeSerie, int consumo, int capacidadeCarga, int cargaActual, String comandante) {
        super(modelo, numeroDeSerie, consumo);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaActual = cargaActual;
        this.comandante = comandante;
    }

    public AvionCarga(String modelo, String numeroDeSerie, TipoCombustible tipoCombustible, int cantidadCombustible, int consumo, int capacidadeCarga, int cargaActual, String comandante) {
        super(modelo, numeroDeSerie, tipoCombustible, cantidadCombustible, consumo);
        this.capacidadeCarga = capacidadeCarga;
        this.cargaActual = cargaActual;
        this.comandante = comandante;
    }

    @Override
    public void cargar(){
        cargaActual = capacidadeCarga;
    }

    @Override
    public void descargar(){
        cargaActual = 0;
    }

    @Override
    public String toString() {
        return "AvionCarga{" +
                "modelo= " + super.getModelo() +
                ", nº serie= " + super.getNumeroDeSerie() +
                ", tipo de combustible= " + super.getTipoCombustible() +
                "capacidadeCarga=" + capacidadeCarga +
                ", cargaActual=" + cargaActual +
                ", comandante='" + comandante + '\'' +
                '}';
    }
}
