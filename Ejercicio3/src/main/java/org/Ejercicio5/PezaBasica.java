package org.Ejercicio5;

import java.util.Objects;

public class PezaBasica extends Peza{
    private int alto;
    private int ancho;
    private int largo;

    public PezaBasica(Cor cor, String numeroDeSerie, int alto, int ancho, int largo) {
        super(cor, numeroDeSerie);
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public int getNumeroConectores(){
        return ancho*largo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PezaBasica that)) return false;
        return super.getNumeroDeSerie().equals(that.getNumeroDeSerie());
    }

    @Override
    public int hashCode() {
        return Objects.hash(alto, ancho, largo);
    }

    @Override
    public String toString() {
        return "PezaBasica{" +
                "cor= " + super.getCor() +
                ", nº serie= " + super.getNumeroDeSerie() +
                ", piezas= " + super.getPezas() +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }
}
