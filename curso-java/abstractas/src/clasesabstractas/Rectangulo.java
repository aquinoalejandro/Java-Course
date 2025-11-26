package clasesabstractas;

public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        IO.println("Se dibuja un: "+ getClass().getSimpleName());
    }
}
