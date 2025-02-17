public class punto6 
{
    public void sumaVectFyC(int d)
   {
    metodos M= new metodos();
    int[][] m = new int[d][d];
    m = M.llenarMatriz(m);
    M.MostrarMatriz(m); //Invocacion de los metodos vacios 
    int[] vectorResul = new int[d*d];
    vectorResul = M.VecSumFiyCol(m, d);
    System.out.println("El vector con las sumas de cada fila y columna es: ");
        for (int i = 0; i < vectorResul.length; i++) 
        {
            System.out.print(" - " + vectorResul[i]);
        }
        /*
         * public int[] VecSumFiyCol(int[][] matriz, int d)
    {
        int[] vecSumFyC = new int[d*d];
        int acumS;
        for (int i = 0; i < matriz.length; i++) 
        {
            acumS = 0;
            for (int j = 0; j < matriz.length; j++) 
            {
                acumS+=  matriz[i][j];
            }
            vecSumFyC[i] = acumS;
        }
        int acumC;
        for( int j = 0; j < matriz.length; j ++)//recorrido por columnas
        {
            acumC = 0;
            for( int i = 0; i < matriz.length; i ++)
            {
                acumC += matriz[i][j];
            }
            vecSumFyC[d + j] = acumC;
        }
        return vecSumFyC;
    }
         */
   }
    
}
