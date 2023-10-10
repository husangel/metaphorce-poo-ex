package modelo;
import modelo.Pelicula;

public class Pelicula {
    //Atributos

    private int  id;
    private String nombre;
    private String disponible;


    public Pelicula() {
        this.nombre = nombre;
    }

    public Pelicula(String nombre, String disponible){
        this.nombre = nombre;
        this.disponible = disponible;

    }

    //Encapsulamiento con get y set
    public String getNombre(){
        return this.nombre;
    }
    public String getDisponible(){
        return this.disponible;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDisponible(String disponible){
        this.disponible = disponible;
    }

}
