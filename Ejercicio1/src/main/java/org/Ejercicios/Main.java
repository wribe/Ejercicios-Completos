package org.Ejercicios;
// Exercicio 1 (Curso 22-23): Mundo Máxico de Harry Potter

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2006, 04, 07);
        Mago m = new Mago("Carmen", fecha, "no se");
        Mago m2 = new Mago("Carmen", fecha, "no se");
        Mago m3 = new Mago("Carmen", fecha, "no se");
        Mago m4 = new Mago("Carmen", fecha, "no se");
        System.out.println(m);
        System.out.println(m.eMaiorIdade());
        Muggle muggle = new Muggle("Carmen", fecha, true);
        System.out.println(muggle);
        System.out.println(muggle.calcularIdade());
        Profesor p = new Profesor("carmen", fecha, "nose");
        System.out.println(p);
        p.imponerDisciplina();
        p.explicar();
        ArrayList<Mago> magos = new ArrayList<>();
        HashMap<String, Profesor> profes = new HashMap<>();
        Hogwarts h = new Hogwarts(magos, profes);
        h.engadirAlumnx(m);
        System.out.println(h);
        h.asignarProfesor("nose", p);
        System.out.println(h);
        System.out.println(h.alumnadoCasa(Casa.GRYFINDOR));
        h.engadirAlumnx(m2);
        System.out.println(h);
        h.engadirAlumnx(m3);
        System.out.println(h);
        h.engadirAlumnx(m4);
        System.out.println(h);
        h.graduar(m);
        h.listarProfesores();
    }
}