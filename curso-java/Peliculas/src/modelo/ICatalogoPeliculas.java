package modelo;

public interface ICatalogoPeliculas {
    void insertarPelicula(Pelicula nombrePelicula);
    void listarPeliculas();
    void buscarPelicula(String nombrePelicula);


}
