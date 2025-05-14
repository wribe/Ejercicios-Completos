package org.Ejercicio5;
// Exercicio 3 (Curso 23-24): Pezas

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        PezaBasica p = new PezaBasica(Cor.NEGRO, "000", 2, 2, 2);
        PezaBasica p2 = new PezaBasica(Cor.NEGRO, "001", 2, 2, 2);
        System.out.println(p);
        System.out.println(p.getNumeroConectores());
        p.conectar(p2);
        System.out.println(p);
        p.retirarPeza("001");
        System.out.println(p);
    }
}