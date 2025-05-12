package org.Ejercicio5;

import java.util.ArrayList;

public class CompaniaTransporte {
    private String nome;
    private ArrayList<Vehiculo> vehiculos;

    public CompaniaTransporte(String nome, ArrayList<Vehiculo> vehiculos) {
        this.nome = nome;
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        return vehiculos;
    }

    public ArrayList<Vehiculo> eliminarVehiculo(String numeroDeSerie){
        for (Vehiculo vehiculo: vehiculos){
            if (vehiculo.getNumeroDeSerie().equals(numeroDeSerie)){
                vehiculos.remove(vehiculo);
            }
        }
        return vehiculos;
    }

    @Override
    public String toString() {
        return "CompaniaTransporte{" +
                "nome='" + nome + '\'' +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
