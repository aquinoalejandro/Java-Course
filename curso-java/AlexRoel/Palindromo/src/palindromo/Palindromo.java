package palindromo;

public class Palindromo {
    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }
        String procesado = texto.toLowerCase();
        String invertido = new StringBuilder(procesado).reverse().toString();
        return procesado.equals(invertido);
    }
}
