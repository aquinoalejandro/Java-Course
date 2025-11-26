package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {
    private String nombre;

    public Pelicula(){
    }

    public Pelicula(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pelicula pelicula = (Pelicula) obj;
        return nombre.equals(pelicula.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
}
