import palindromo.Palindromo;
void main() {
    String usuarioTexto = IO.readln("Que palabra quieres saber si es palidroma? ");
    boolean esPalindromo = Palindromo.esPalindromo(usuarioTexto);

    if (esPalindromo) {
        IO.println("La palabra es palindroma");
    } else {
        IO.println("La palabra no es palindroma");
    }

}
