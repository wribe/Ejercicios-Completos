package org.Ejercicio5;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empregado {
    private int numEmpregado;
    private String nome;
    private LocalDate dataInicio;
    private double salarioBase;

    public Empregado(int numEmpregado, String nome, LocalDate dataInicio, double salarioBase) {
        this.numEmpregado = numEmpregado;
        this.nome = nome;
        if (dataCorrecta(dataInicio)) {
            this.dataInicio = dataInicio;
        }else {
            this.dataInicio = LocalDate.now();
        }
        if (salarioCorrecto(salarioBase)) {
            this.salarioBase = salarioBase;
        }
    }

    public int getNumEmpregado() {
        return numEmpregado;
    }

    public void setNumEmpregado(int numEmpregado) {
        this.numEmpregado = numEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public boolean salarioCorrecto(double salarioBase){
        if (salarioBase > 1000){
            return true;
        }return false;
    }

    public boolean dataCorrecta(LocalDate dataInicio){
        Period period = Period.between(dataInicio, LocalDate.now());
        if (period.isNegative()){
            return false;
        } return true;
    }

    double determinarSalarioReal(){
        Period period = Period.between(dataInicio, LocalDate.now());
        if (period.getYears() >= 1){
            return salarioBase + (period.getYears() * 30);
        }else {
            return salarioBase;
        }
    }
}
