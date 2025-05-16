package org.Ejercicio5;
// Exercicio 4 (curso 21-22): Granxa


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2000, 02, 27);
        PersoalServizos ps = new PersoalServizos(001, "nome", fecha, 1100, 'R');
        PersoalServizos ps2 = new PersoalServizos(000, "nome", fecha, 1100, 'R');
        Granxa g = new Granxa("nome", "localizacion", ps);
//        Granxa g1 = new Granxa("nome", "")
        System.out.println(g);
        g.engadirAnimal(TipoAnimal.OVELLAS);
        g.engadirEmpregado(ps2);
        g.getNumeroEmpregados(false);
        System.out.println(g);

    }
}