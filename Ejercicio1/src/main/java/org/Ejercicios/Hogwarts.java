package org.Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Hogwarts {
    private ArrayList<Mago> alumnxs;
    private HashMap<String, Profesor> materias;

    public Hogwarts(ArrayList<Mago> alumnxs, HashMap<String, Profesor> materias) {
        this.alumnxs = alumnxs;
        this.materias = materias;
    }

    void engadirAlumnx(Mago mago){
        int min = 0;
        int max = 3;
        Casa[] casas = new Casa[] {Casa.GRYFINDOR, Casa.HUFFLEPUFF, Casa.RAVENCLAW, Casa.SLYTHERIN};
        mago.setCasa(casas[(int) (Math.random() * (max - (2)) + min)]);
        alumnxs.add(mago);
    }

    void graduar(Mago mago){
        Iterator<Mago> iterator = alumnxs.iterator();
        while (iterator.hasNext()){
            Mago m = iterator.next();
            if (m.equals(mago)){
                iterator.remove();
            }
        }
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

    void asignarProfesor(String materia, Profesor profesor){
        materias.put(materia, profesor);
    }

    void listarProfesores(){
        for (String materia: materias.keySet()){
            System.out.println("La materia " + materia + " la imparte el profesor " + materias.get(materia));
        }
    }

    ArrayList<Mago> alumnadoCasa(Casa casa){
        ArrayList<Mago> magos = new ArrayList<>();
        for (Mago mago: alumnxs) {
            if (casa.equals(mago.getCasa())) {
                magos.add(mago);
            }
        }
        return magos;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "alumnxs=" + alumnxs +
                ", materias=" + materias +
                '}';
    }
}
