void main() {
    String palabra1string = IO.readln("Escribe la primer palabra a comparar: ");
    String palabra2string = IO.readln("Escribe la segunda palabra a comparar: ");

    char[] palabra1 = palabra1string.toCharArray();
    char[] palabra2 = palabra2string.toCharArray();

    Arrays.sort(palabra1);
    Arrays.sort(palabra2);

    if (Arrays.equals(palabra1, palabra2)) {
        IO.println("Las palabras son anagramas");
    } else {
        IO.println("Las palabras no son anagramas");
    }

}

