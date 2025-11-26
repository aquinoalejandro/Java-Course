public class Main {
     public static void main(String[] args) {
         var nString = IO.readln("Ingrese un número");
         int n = Integer.parseInt(nString);
         // cambia este valor para probar otros números
         boolean esPrimo = primalidad.Primalidad.esPrimo(n);
         String resultado = esPrimo ? "SI" : "NO";
         System.out.println(n + " es primo? " + resultado);
     }
 }