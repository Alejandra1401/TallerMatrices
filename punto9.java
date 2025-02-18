public class punto9 
{
    public void punto9 (int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenarMatriz(m);
        M.MostrarMatriz(m);
        int men = M.MenenMat(m,d);
        int may = M.MayenMat(m, d);
        int[] PosMY = M.mostrarposicionmayor(m);
        int[] PosMN = M.mostrarposicionMenor(m);
        System.out.println("El mayor número de la matriz es " + may + " en la posición [" + PosMY[0] + "]" + "[" + PosMY[1] + "]");
        System.out.println("El menor número de la matriz es " + men + " en la posición [" + PosMN[0] + "]" + "[" + PosMN[1] + "]");
        System.out.println("La fila con el mayor número es" );
        for (int i = 0; i < PosMN.length; i++) 
        {
            System.out.print(m[PosMY[0]][i] + " - "); 
        }
        System.out.println("\nLa columna con el mayor número es");
        for (int i = 0; i < PosMN.length; i++) 
        {
            System.out.print(m[i][PosMY[1]] + " - ");     
        }
        
    }
    
}
