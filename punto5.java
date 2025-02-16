public class punto5 
{
    public void vector (int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenarMatriz(m);
        M.MostrarMatriz(m);
        int[] vect = new int[d];
        for (int i = 0; i < vect.length; i++) 
        {
            for (int j = 0; j < vect.length; j++) 
            {
                vect[i * d + j] = m[i][j];
            }
        }
        for (int i = 0; i < vect.length; i++) 
        {
            System.out.println(" - " + vect[i] );
        }
    }
    
}
