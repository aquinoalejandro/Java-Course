package modelo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas {
    private final ArrayList<String> listPeliculas;

    public ImplementacionCatalogoPelicula() {
        this.listPeliculas = new ArrayList<>();
    }

    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.listPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPeliculas() {
        JOptionPane.showMessageDialog(null, this.listPeliculas.toString(), "Listado de Peliculas", JOptionPane.INFORMATION_MESSAGE);


    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado = null;

        for(var pelicula: this.listPeliculas){
            if(pelicula.equals(nombrePelicula)){
                resultado = pelicula;
                break;
            }else {
                resultado = pelicula;
            }
        }

        if (nombrePelicula.equals(resultado)){
            JOptionPane.showMessageDialog(
                    null,
                    "Resultaddo ->" + resultado,
                    "Busqueda de Pelicula",
                    JOptionPane.QUESTION_MESSAGE
            );
        }else {
            JOptionPane.showMessageDialog(
                    null,
                    "No se encontro la Pelicula ->" + nombrePelicula,
                    "Busqueda de Pelicula",
                    JOptionPane.ERROR_MESSAGE
            );

        }
    }
}
