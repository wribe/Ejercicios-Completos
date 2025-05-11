package org.Ejercicios;


import java.time.LocalDate;

public class Profesor extends Mago implements  Docente{
    private static final String[] FRASES = new String[] {"Non é bo deixarse arrastrar polos soños e esquecer vivir", "A valentía sempre é a mellor opción", "La felicidad puede hallarse hasta en los más oscuros momentos, si somos capaces de usar bien la luz.", "No son nuestras habilidades las que muestran lo que somos, sino nuestras decisiones.", "Las palabras son, en mi no tan humilde opinión, nuestra más inagotable fuente de magia.", "¿Qué obtienes si mezclas raíz de asfódelo con infusión de ajenjo?", "No necesito gritar para que se me escuche.", "El castigo te ayudará a no repetir tus errores."};

    public Profesor(String nome, LocalDate dataNacemento, String tipoVasoira) {
        super(nome, dataNacemento, tipoVasoira);
    }

    public Profesor(String nome, LocalDate dataNacemento, String tipoVasoira, Casa casa) {
        super(nome, dataNacemento, tipoVasoira, casa);
    }

    @Override
    public void imponerDisciplina(){
        System.out.println("Silencio Totalis");
    }

    @Override
    public void explicar(){
        int min = 0;
        int max = 7;
        String frase = FRASES[(int) (Math.random()* (max - (min + 2)) + min)];
        System.out.println(frase);
    }


}
