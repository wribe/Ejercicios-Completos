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
        this.numAnimais = new int[] {0, 0, 0, 0, 0}; // porcos, vacas, galiñas, coellos, ovellas
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
            if (t.equals(TipoAnimal.PORCOS)&& i == 0){
                numAnimais[i] = numAnimais[i] - 1;
            } else if (t.equals(TipoAnimal.VACAS) && i == 1){
                numAnimais[i] = numAnimais[i] -1;
            }else if (t.equals(TipoAnimal.GALIÑAS) && i == 2){
                numAnimais[i] = numAnimais[i] -1;
            } else if (t.equals(TipoAnimal.COELLOS) && i == 3){
                numAnimais[i] = numAnimais[i] -1;
            }else if (t.equals(TipoAnimal.OVELLAS) && i == 4){
                numAnimais[i] = numAnimais[i] -1;
            }
        }
    }

    public void engadirEmpregado(Empregado e){
        empregados.add(e);
    }

    public int getNumeroAnimais(){
        int t = 0;
        for (int i = 0; i < numAnimais.length; i++) {
            t = t + numAnimais[i];
        }return t;
    }

    public int getNumeroEmpregados(boolean coidadores){
        if (coidadores){
            for (int i = 0; i < empregados.size(); i++) {

            }
        }
    }
}
