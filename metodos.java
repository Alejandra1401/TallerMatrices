public class metodos 
{
    public int[][] llenarMatriz(int[][] m)
    {
        for(int i =0; i< m.length; i++)
        {
            for(int j =0; j< m.length; j++)
            {
                m[i][j] = (int)(Math.random()*100);
            }
        }
        return m;
    }
    public void MostrarMatriz(int[][] m)
    {
        for(int i =0; i< m.length; i++)
        {
            for(int j =0; j< m.length; j++)
            {
               System.out.print(" - " + m[i][j] + " - ");
            }
            System.out.println();
        }
    }
    public int SumaMatriz(int[][] m)
    {
        int sum=0;
        for(int i =0; i< m.length; i++)
        {
            for(int j =0; j< m.length; j++)
            {
                sum += m[i][j];
               
            }
        }
        return sum;
    }

    
}
