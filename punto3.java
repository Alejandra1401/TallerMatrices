public class punto3 
{
    public void SumFil (int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenarMatriz(m);
        M.MostrarMatriz(m);
        M.sumafilasYColumn(m, d);
    }
    
}
