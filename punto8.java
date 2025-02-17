public class punto8 
{
    public void sumFilaYmayEncontIndi(int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenarMatriz(m);
        M.MostrarMatriz(m);
        int[] sumF = M.SumFila(m, d);
        int suMy =0, Imy= 0;
        for (int i = 0; i < sumF.length; i++) 
        {
            if (sumF[i] > suMy) 
            {
                suMy = sumF[i];
                Imy = i;
            }
        }
        System.out.println("La fila con mayor suma es la: " + Imy);
    }
    
}
