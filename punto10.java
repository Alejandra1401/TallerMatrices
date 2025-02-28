import java.util.Scanner;

public class punto10
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer dimensiones de la matriz
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        
        // Declarar matrices
        String[][] matriz = new String[m][n];
        int[][] matrizDigitos = new int[m][n];
        
        // Llenar la matriz con cadenas ingresadas por el usuario
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese una cadena para la posición (" + i + ", " + j + "): ");
                matriz[i][j] = scanner.nextLine();
                
                // Calcular la cantidad de dígitos en la cadena y almacenarlo en la segunda matriz
                matrizDigitos[i][j] = contarDigitos(matriz[i][j]);
            }
        }
        
        // Mostrar la matriz original
        System.out.println("Matriz de Cadenas:");
        mostrarMatriz(matriz);
        
        // Mostrar la matriz de cantidad de dígitos
        System.out.println("Matriz de Cantidad de Dígitos:");
        mostrarMatriz(matrizDigitos);
        
        scanner.close();
    }
    
    // Método para contar los dígitos en una cadena sin usar toCharArray, Character ni contains
    public static int contarDigitos(String cadena) {
        int contador = 0;
        int longitud = cadena.length();
        int i = 0;
        while (i < longitud) {
            String caracter = cadena.substring(i, i + 1);
            if (caracter.equals("0") || caracter.equals("1") || caracter.equals("2") || caracter.equals("3") ||
                caracter.equals("4") || caracter.equals("5") || caracter.equals("6") || caracter.equals("7") ||
                caracter.equals("8") || caracter.equals("9")) {
                contador++;
            }
            i++;
        }
        return contador;
    }
    
    // Método para mostrar una matriz de cadenas
    public static void mostrarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Método para mostrar una matriz de enteros
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
