public class punto4 
{
    public void MaxSumCol ( int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenarMatriz(m);
        M.MostrarMatriz(m);
        M.sumMaxCol(m,d);
    }
    
}
