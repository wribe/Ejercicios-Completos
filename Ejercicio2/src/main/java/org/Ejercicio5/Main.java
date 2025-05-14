package org.Ejercicio5;
//Exercicio 2 (Curso 23-24): Vehículos

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Avion a = new Avion("modelo", "nºserie", 20);
        Avion a2 = new Avion("modelo", "nºserei", TipoCombustible.AVGAS, 100, 20);

        AvionCarga ac = new AvionCarga("modelo", "nºserie", 20, 900, 0, "comandante");
        AvionCarga ac2 = new AvionCarga("modelo", "nºserie", TipoCombustible.JET_A1, 100, 30, 900, 0, "comandante");

        HashMap<String, String> tripulacion = new HashMap<>();
        AvionComercial aco = new AvionComercial("modelo", "nºserie", 20, 60, tripulacion);
        AvionComercial aco2 = new AvionComercial("modelo", "nºserie", TipoCombustible.AVGAS, 9000, 20, 10, tripulacion);
        AvionComercial aco3 = new AvionComercial("modelo", "nºserie", TipoCombustible.AVGAS, 9000, 20, 10);
        AvionComercial aco4 = new AvionComercial("modelo", "nºserie", 20, 60);

        Camion c = new Camion("modelo", "nºserie", 2000, 10, "conductor");
        Camion c2 = new Camion("modelo", "nºserie", TipoCombustible.DIESEL, 8000, 2000, 10, "conductor");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        CompaniaTransporte ct = new CompaniaTransporte("compañia", vehiculos);

        System.out.println(a);
        a.aterrar();
        a.despegar();
        a.mantemento();
        System.out.println(a.maximaDistanciaPercorrer());
        a.cargarCombustible();

        System.out.println(a2);
        a2.cargarCombustible();
        System.out.println(a2.maximaDistanciaPercorrer());
        a2.mantemento();
        a2.aterrar();
        a2.despegar();

        System.out.println(ac);
        ac.cargar();
        ac.descargar();
        ac.aterrar();
        ac.despegar();
        ac.cargarCombustible();
        ac.mantemento();
        System.out.println(ac.maximaDistanciaPercorrer());

        System.out.println(ac2);
        ac2.cargar();
        ac2.descargar();
        ac2.aterrar();
        ac2.despegar();
        ac2.cargarCombustible();
        ac2.mantemento();
        System.out.println(ac2.maximaDistanciaPercorrer());

        System.out.println(aco);
        aco.asignarTripulacion("azafata", "nombre");
        aco.cargarCombustible();
        aco.despegar();
        aco.aterrar();
        System.out.println(aco.maximaDistanciaPercorrer());

        System.out.println(aco2);
        aco2.asignarTripulacion("azafata", "nombre");
        aco2.cargarCombustible();
        aco2.despegar();
        aco2.aterrar();
        System.out.println(aco2.maximaDistanciaPercorrer());

        System.out.println(aco3);
        aco3.asignarTripulacion("azafata", "nombre");
        aco3.cargarCombustible();
        aco3.despegar();
        aco3.aterrar();
        System.out.println(aco3.maximaDistanciaPercorrer());

        System.out.println(aco4);
        aco4.asignarTripulacion("azafata", "nombre");
        aco4.cargarCombustible();
        aco4.despegar();
        aco4.aterrar();
        System.out.println(aco4.maximaDistanciaPercorrer());

        System.out.println(c);
        c.cargar();
        c.descargar();
        c.cargarCombustible();
        c.mantemento();

        System.out.println(c2);
        c2.cargar();
        c2.descargar();
        c2.cargarCombustible();
        c2.mantemento();

        System.out.println(ct);
        System.out.println(ct.agregarVehiculo(c));
        System.out.println(ct.eliminarVehiculo("nºserie"));
    }
}