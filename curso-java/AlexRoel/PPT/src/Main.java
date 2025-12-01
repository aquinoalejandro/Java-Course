
/**
 * Juego de piedra, papel o tijera con la máquina.
 * Se pide al usuario que elija una opción y se genera una opción al azar para la máquina.
 * Luego se evalúa quien gana según las reglas del juego y se muestra el resultado.
 */
void main() {
    IO.println("""
        Elegí una opción:
        1. Piedra
        2. Papel
        3. Tijeras
        """);

    var entrada = IO.readln("Tu elección (del 1 al 3): ");
    var seleccion = Integer.parseInt(entrada.trim());
    Random aleatorio = new Random();
    var seleccionMaquina = aleatorio.nextInt(1, 4);

    String[] nombres = {"", "Piedra", "Papel", "Tijeras"};
    IO.println("Tú: " + nombres[seleccion] + " | Máquina: " + nombres[seleccionMaquina]);

    var resultado = switch (seleccion) {
        case 1 -> (seleccionMaquina == 3) ? "Ganaste" : (seleccionMaquina == 1 ? "Empate" : "Perdiste");
        case 2 -> (seleccionMaquina == 1) ? "Ganaste" : (seleccionMaquina == 2 ? "Empate" : "Perdiste");
        case 3 -> (seleccionMaquina == 2) ? "Ganaste" : (seleccionMaquina == 3 ? "Empate" : "Perdiste");
        default -> "Opción inválida";
    };

    IO.println(resultado);
}
