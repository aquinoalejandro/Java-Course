package primalidad;

public class Primalidad {
    public static boolean esPrimo(int n) {
        return (n <= 1) ? false :
                (n == 2) ? true :
                        (n % 2 == 0) ? false : true;
    }

}
