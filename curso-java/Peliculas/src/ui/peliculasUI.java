package ui;

import modelo.*;
import javax.swing.JOptionPane;

public class peliculasUI {
    public static void interfazUsuario() {
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;

        CERRAR:
        while (true){
            String opcion = JOptionPane.showInputDialog(
                    null,
                    "Menu\n" +
                            "Seleccione una opcion: "+
                            "1. Insertar Pelicula\n" +
                            "2. Listar Peliculas\n" +
                            "3. Buscar Pelicula\n" +
                            "4. Salir\n"
,
                    "Catalogo de Peliculas",
                    JOptionPane.QUESTION_MESSAGE
            );
            int opcionInt = 0;
            try{
            opcionInt=Integer.parseInt(opcion);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(
                        null,
                        "Por favor introduce un numero del 1 al 4, solo numeros.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                e.printStackTrace(System.out);
            }
            catch (Exception e) {
                e.printStackTrace(System.out);
            }
            switch (opcionInt){
                case 1:
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la Pelicula",
                            "Insertar Pelicula",
                            JOptionPane.QUESTION_MESSAGE
                    );
                    peliculas.insertarPelicula(new Pelicula(nombrePelicula));
                    break;
                case 2:
                    peliculas.listarPeliculas();
                    break;
                case 3:
                     nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la Pelicula",
                            "Buscar Pelicula",
                            JOptionPane.QUESTION_MESSAGE
                    );
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                case 4:
                    break CERRAR;
                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opcion no valida",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
            }
        }
    }
}
