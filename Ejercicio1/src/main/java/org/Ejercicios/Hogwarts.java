package org.Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;

public class Hogwarts {
    private ArrayList<Mago> alumnxs;
    private HashMap<String, Profesor> materias;

    void engadirAlumnx(Mago mago){
        Casa[] casas = new Casa[] {Casa.GRYFINDOR, Casa.HUFFLEPUFF, Casa.RAVENCLAW, Casa.SLYTHERIN};
        mago.setCasa(casas[(int) Math.random()]);
    }
}
