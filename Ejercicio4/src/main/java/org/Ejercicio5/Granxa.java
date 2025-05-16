package org.Ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;

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
                numAnimais[i] += 1;
            } else if (t.equals(TipoAnimal.VACAS) && i == 1){
                numAnimais[i] += 1;
            }else if (t.equals(TipoAnimal.GALIÑAS) && i == 2){
                numAnimais[i] += 1;
            } else if (t.equals(TipoAnimal.COELLOS) && i == 3){
                numAnimais[i] += 1;
            }else if (t.equals(TipoAnimal.OVELLAS) && i == 4){
                numAnimais[i] += 1;
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
        int numEmp = 0;
        if (coidadores){
            for (int i = 0; i < empregados.size(); i++) {
                if (empregados.get(i) instanceof CoidadorAnimais){
                    numEmp += 1;
                }
            } return numEmp;
        } else {
            for (int i = 0; i < empregados.size(); i++) {
                numEmp += 1;
            } return numEmp;
        }
    }

    @Override
    public String toString() {
        String s = "Granxa-->" +
                "nome='" + nome + "\n" +
                "Localizacion='" + localizacion + "\n" +
                "Encargado/a:" + encargado + "\n" +
                "empregados=" + empregados + "\n" +
                "numAnimais=";

        int p = 0;
        int v = 0;
        int g = 0;
        int c = 0;
        int o = 0;

        for (int i = 0; i < numAnimais.length; i++) {
            if (i == 0){
                p += numAnimais[i];
            } else if (i == 1){
                v += numAnimais[i];
            } else if (i == 2){
                g += numAnimais[i];
            } else  if (i == 3){
                c += numAnimais[i];
            } else if (i == 4) {
                o += numAnimais[i];
            }
        }

        return s + '\n' + "porcos: " + p + "\n" + "vacas: " + v + "\n" + "galiñas: " + g + "\n" + "coellos: " + c + "\n" + "ovellas: " + o;
    }
}
