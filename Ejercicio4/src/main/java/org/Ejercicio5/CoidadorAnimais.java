package org.Ejercicio5;

import java.time.LocalDate;
import java.time.Period;

public class CoidadorAnimais extends Empregado implements Gandeiro{
    private TipoAnimal tipoAnimalExperto;

    public CoidadorAnimais(int numEmpregado, String nome, LocalDate dataInicio, double salarioBase, TipoAnimal tipoAnimalExperto) {
        super(numEmpregado, nome, dataInicio, salarioBase);
        this.tipoAnimalExperto = tipoAnimalExperto;
    }

    @Override
    public double determinarSalarioReal(){
        Period period = Period.between(super.getDataInicio(), LocalDate.now());
        double total = 0;
        if (period.getYears() >= 1){
            total = super.getSalarioBase() + (period.getYears() * 30);
        }else {
            total =  super.getSalarioBase();
        }
        if (tipoAnimalExperto.equals(TipoAnimal.PORCOS)){
            total = total + 10;
        } else if(tipoAnimalExperto.equals(TipoAnimal.VACAS)){
            total = total + 5;
        } return total;
    }

    @Override
    public void alimentarAnimais(){
        System.out.println("Estase a alimentar o animal " + tipoAnimalExperto);
    }

    @Override
    public void limparCortes(){
        System.out.println("Limpando as cortes ao animal " + tipoAnimalExperto);
    }
}
