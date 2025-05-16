package org.Ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Peza implements Conectable{
    private Cor cor;
    private int numeroDeSerie;
    private ArrayList<Peza> pezas;

    public Peza(Cor cor, int numeroDeSerie) {
        this.cor = cor;
        this.numeroDeSerie = numeroDeSerie;
        this.pezas = new ArrayList<>();
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public Cor getCor() {
        return cor;
    }

    public ArrayList<Peza> getPezas() {
        return pezas;
    }

    public abstract int getNumeroConectores();

    @Override
    public boolean conectar(Peza p){
        if (getNumeroConectores() > pezas.size()){
            pezas.add(p);
            return true;
        }return false;
    }

    @Override
    public boolean retirarPeza(String numeroSerie){
        Iterator<Peza> iterator = pezas.iterator();
        while (iterator.hasNext()){
            Peza peza = iterator.next();
            if (Integer.toString(peza.getNumeroDeSerie()).equals(numeroSerie)){
                iterator.remove();
                return true;
            }
        }return false;
    }

    //    public void eliminarViaxe(int codigo) {
//        Iterator<Viaxe> iterator = viaxes.iterator();
//        while (iterator.hasNext()) {
//            Viaxe viaxe = iterator.next();
//            if (viaxe.getCodigo() == codigo) {
//                iterator.remove();
//                return;
//            }
//        }
//    }
}
