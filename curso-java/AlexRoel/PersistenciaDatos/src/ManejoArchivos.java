import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class ManejoArchivos {
    public static void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println("Hola Mundo");
            salida.println("Adios Mundo");
            salida.close();
        } catch (Exception e) {
            IO.println("Error al crear el archivo" );
            e.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.println(contenido);
            salida.close();
        } catch (Exception e) {
            IO.println("Error al escribir el archivo" );
            e.printStackTrace(System.out);
       }
    }

    public static void LeerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (Exception e) {
            IO.println("Error al leer el archivo");
            e.printStackTrace(System.out);
        }
    }

    public static void eliminarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        archivo.delete();
    }
}
