/*
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt para cambiar esta licencia
 * Haz clic en nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java para editar esta plantilla
 */
package poop2;

/**
 * Esta es la clase principal para el programa POOP2.
 * Demuestra varios flujos de control en Java.
 *
 * @author de la CCruz López, Oscar Abraham
 */
public class POOP2 {

    /**
     * El método principal del programa.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // TODO lógica de la aplicación aquí

        // Comparación usando declaraciones if-else
        int a = 15;
        int b;
        b = 10;
        if (a < b) {
            System.out.println("a es menor que b");
        } else if (a == b) {
            System.out.println("a es igual que b");
        } else {
            System.out.println("a es mayor que b");
        }

        // Invocación de método para comparar dos enteros
        if (menor(a, b)) {
            System.out.println("Evaluación: menor");
        } else {
            System.out.println("Evaluación: mayor o igual");
        }

        System.out.println("\t\tswitch");

        // Sentencia switch para determinar el día de la semana
        int dia = 3;
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("No es un día de la semana");
        }

        System.out.println("\t\tswitch vocales");

        // Sentencia switch para determinar la vocal ingresada
        char vocal = 'a';
        switch (vocal) {
            case 'a' -> System.out.println("Vocal a");
            case 'e' -> System.out.println("Vocal e");
            case 'i' -> System.out.println("Vocal i");
            case 'o' -> System.out.println("Vocal o");
            case 'u' -> System.out.println("Vocal u");
            default -> System.out.println("Ingresa una vocal");
        }

        System.out.println("\t\tWhile");

        // Bucle while para contar hacia arriba y hacia abajo
        int n = 0;
        while (n < 10) {
            System.out.println("Contando hacia arriba n = " + n);
            n++;
        }

        System.out.println("Valor actual de n: " + n);

        while (n > 0) {
            System.out.println("Contando hacia abajo n = " + n);
            n--;
        }

        System.out.println("\t\tDo while");

        // Bucle do-while para contar hacia abajo
        do {
            System.out.println("Contando hacia abajo " + n);
            n--;
        } while (n > 0);

        System.out.println("Valor de n: " + n);

        System.out.println("\t\tFor 1");

        // Bucle for para contar hacia arriba y hacia abajo
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba i = " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Contando hacia abajo i = " + i);
        }

        System.out.println("\t\tFor 2");

        // Arreglo y bucle for para iterar sobre los elementos del arreglo
        int[] miArreglo = {1, 2, 3, 4, 5};
        int nElementos = miArreglo.length;
        System.out.println("¿Cuántas variables tiene el arreglo? " + nElementos);

        int[] miArreglo2 = new int[10];
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i + 1;
        }

        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2[" + i + "] = " + miArreglo2[i]);
        }

        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Cargando archivo " + j * 10 + "%");
        }

        System.out.println("\t\tForeach");

        // Bucle for-each para iterar sobre los elementos del arreglo
        for (int i : miArreglo2) {
            System.out.println("Procesando información: " + i * 10 + "%");
        }
    }

    /**
     * Compara dos enteros y devuelve true si x es menor que y.
     *
     * @param x el primer entero
     * @param y el segundo entero
     * @return true si x es menor que y, false en caso contrario
     */
    private static boolean menor(int x, int y) {
        System.out.println(x < y);
        return x < y;
    }
}
