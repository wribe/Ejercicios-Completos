package org.Ejercicio5;

import java.util.ArrayList;

public class Granxa {
    private String nome;
    private String localizacion;
    private Empregado encargado;
    private ArrayList<Empregado> empregados;
    private int[] numAnimais;

    public Granxa(String nome, String localizacion, Empregado encargado, ArrayList<Empregado> empregados, int[] numAnimais) {
        this.nome = nome;
        this.localizacion = localizacion;
        this.encargado = encargado;
        this.empregados = empregados;
        this.numAnimais = numAnimais;
    }

    public Granxa(String nome, String localizacion, Empregado encargado) {
        this.nome = nome;
        this.localizacion = localizacion;
        this.encargado = encargado;
        this.empregados = new ArrayList<>();
        this.numAnimais = new int[] {0, 0, 0, 0, 0};
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public Empregado getEncargado() {
        return encargado;
    }

    public ArrayList<Empregado> getEmpregados() {
        return empregados;
    }

    public int[] getNumAnimais() {
        return numAnimais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setEncargado(Empregado encargado) {
        this.encargado = encargado;
    }

    public void engadirAnimal(TipoAnimal t){
        for (int i = 0; i < numAnimais.length; i++) {

        }
    }
}
