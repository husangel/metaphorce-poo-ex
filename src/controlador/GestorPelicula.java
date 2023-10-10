package controlador;
import javafx.concurrent.Task;
import modelo.Pelicula;

import java.util.ArrayList;
import java.util.List;


public class GestorPelicula {

    public void AgregarPelicula() {
        List<String> nom = new ArrayList<>();

        //Agregar elementos a una lista
        nom.add("Destino final1");
        nom.add("Fury");
        nom.add("Vengadores");
        nom.add("Iro-man");
        nom.add("Ant-man");
        nom.add("Spider-man");

    }

    public void EliminarPelicula() {
        List<String> nom = new ArrayList<>();

        //Agregar elementos a una lista
        nom.add("Destino final1");
        nom.add("Fury");
        nom.add("Vengadores");
        nom.add("Iro-man");
        nom.add("Ant-man");
        nom.add("Spider-man");

        nom.remove(4);

        for(String element : nom){
            System.out.println(element);
        }

    }

    public void ObtenerPeliculas() {
        List<String> nom = new ArrayList<>();

        //Agregar elementos a una lista
        nom.add("Destino final1");
        nom.add("Fury");
        nom.add("Vengadores");
        nom.add("Iro-man");
        nom.add("Ant-man");
        nom.add("Spider-man");

        System.out.println(nom.listIterator(2));



    }

    public void ObtenerPeliculasDisponibles() {
        List<String> nom = new ArrayList<>();

        //Agregar elementos a una lista
        nom.add("Destino final1");
        nom.add("Fury");
        nom.add("Vengadores");
        nom.add("Iro-man");
        nom.add("Ant-man");
        nom.add("Spider-man");


        for(String element : nom){
            System.out.println(element);
        }

    }

    public void ObtenerPeliculasNoDisponibles() {
        List<String> nom = new ArrayList<>();

        //Agregar elementos a una lista
        nom.add("Destino final1");
        nom.add("Fury");
        nom.add("Vengadores");
        nom.add("Iro-man");
        nom.add("Ant-man");
        nom.add("Spider-man");

        String hello = nom.get(0) + " "
                     + nom.get(4);
        System.out.println(hello);

    }

    public void MarcarPeliculaComoDisponible() {
        List<String> nom = new ArrayList<>();

        //Agregar elementos a una lista
        nom.add("Destino final1");
        nom.add("Fury");
        nom.add("Vengadores");
        nom.add("Iro-man");
        nom.add("Ant-man");
        nom.add("Spider-man");

        System.out.println(nom.get(0)+"pelicula disponible");
        System.out.println(nom.get(1)+"pelicula disponible");


    }

}

