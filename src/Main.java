
import controlador.GestorPelicula;
import modelo.Pelicula;



public class Main {
    public static void main(String[]args) {
        Pelicula peli = new Pelicula();
        GestorPelicula gest = new GestorPelicula();


        //comente y descomente segun el metodo a llamar

        //gest.EliminarPelicula();
        //gest.ObtenerPeliculasDisponibles();
        gest.ObtenerPeliculasNoDisponibles();



    }
}
