package org.Ejercicios;

import java.time.LocalDate;

public class Muggle extends Persoa{
    private boolean creNaMAxia;

    public Muggle(String nome, LocalDate dataNacemento) {
        super(nome, dataNacemento);
        this.creNaMAxia = false;
    }

    public Muggle(String nome, LocalDate dataNacemento, boolean creNaMAxia) {
        super(nome, dataNacemento);
        this.creNaMAxia = creNaMAxia;
    }

    @Override
    boolean eMaiorIdade(){
        if (calcularIdade() <= 18){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Muggle{" +
                "nome= " + super.getNome() +
                ", dataNacemento= " + super.getDataNacemento() +
                ", creNaMAxia=" + creNaMAxia +
                '}';
    }
}
