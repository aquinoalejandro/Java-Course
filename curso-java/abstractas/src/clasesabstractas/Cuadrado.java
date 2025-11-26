package clasesabstractas;

public class Cuadrado extends FiguraGeometrica{
    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        IO.println("Se dibuja un: "+ this.getClass().getSimpleName());
    }
}
