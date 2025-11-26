package interfacess;

public class ImplementarMongo implements BaseDatos {
    @Override
    public void insertar() {
        System.out.println("Insertando datos en MongoDB");
    }

    @Override
    public void listar() {
        System.out.println("Listando datos en MongoDB");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando datos en MongoDB");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando datos en MongoDB");
    }

}
