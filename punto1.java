public class punto1 
{
    public int SumarMatriz(int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenarMatriz(m);
        int suma = 0;
        suma = M.SumaMatriz(m);
        return suma;
    }
    
}
