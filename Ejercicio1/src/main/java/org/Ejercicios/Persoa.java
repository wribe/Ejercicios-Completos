package org.Ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public abstract class Persoa {
    private String nome;
    private LocalDate dataNacemento;

    public Persoa(String nome, LocalDate dataNacemento) {
        this.nome = nome;
        this.dataNacemento = dataNacemento;
    }

    abstract boolean eMaiorIdade();

    protected int calcularIdade(){
        Period periodo = Period.between(dataNacemento, LocalDate.now());
        int edad;
        edad = (int) periodo.getYears();
        return edad;
    }

    @Override
    public String toString() {
        return "Persoa{" +
                "nome='" + nome + '\'' +
                ", dataNacemento=" + dataNacemento +
                '}';
    }
}
