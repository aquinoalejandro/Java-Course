import interfacess.BaseDatos;
import interfacess.ImplementarMongo;

void main() {
    BaseDatos db = new ImplementarMongo();
    db.insertar();
    db.listar();
    db.actualizar();
    db.eliminar();

}
