public class punto2 
{
    public void NumeroMayor(int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenarMatriz(m);
        M.MostrarMatriz(m);
        int may = M.NumeroMayor(m);
        int[] posMy = M.mostrarposicion(m);
        System.out.println("El numero mayor de la matriz es: " + may + " en la posicion " + posMy[0] + " " + posMy[1]);
    }
    
}
