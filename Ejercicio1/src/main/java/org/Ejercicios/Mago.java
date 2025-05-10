package org.Ejercicios;

import java.time.LocalDate;

public class Mago extends Persoa{
    private  String tipoVasoira;
    private Casa casa;

    public Mago(String nome, LocalDate dataNacemento, String tipoVasoira) {
        super(nome, dataNacemento);
        this.tipoVasoira = tipoVasoira;
        this.casa = null;
    }

    public Mago(String nome, LocalDate dataNacemento, String tipoVasoira, Casa casa) {
        super(nome, dataNacemento);
        this.tipoVasoira = tipoVasoira;
        this.casa = casa;
    }

    @Override
    boolean eMaiorIdade(){
        if (calcularIdade() <= 18){
            return true;
        }
        return false;
    }

    public String getTipoVasoira() {
        return tipoVasoira;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setTipoVasoira(String tipoVasoira) {
        this.tipoVasoira = tipoVasoira;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nome= " + super.getNome() +
                ", dataNacemento= " + super.getDataNacemento() +
                ", tipoVasoira='" + tipoVasoira + '\'' +
                ", casa=" + casa +
                '}';
    }
}
