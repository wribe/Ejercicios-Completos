package org.Ejercicio5;

import java.time.LocalDate;

public class PersoalServizos extends Empregado{
    private char posto;

    public PersoalServizos(int numEmpregado, String nome, LocalDate dataInicio, double salarioBase, char posto) {
        super(numEmpregado, nome, dataInicio, salarioBase);
        if (postoCorrecto(posto)) {
            this.posto = posto;
        }
    }

    public boolean postoCorrecto(char posto){
        if (posto == 'C' || posto == 'R'){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "PersoalServizos{" +
                "numEmpregado= " + super.getNumEmpregado() +
                ", nome= " + super.getNome() +
                ", data inicio= " + super.getDataInicio() +
                ", salario base= " + super.getSalarioBase() +
                ", posto=" + posto +
                '}';
    }
}
