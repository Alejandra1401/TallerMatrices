public class punto7 
{
    public void numCeroPosNeg(int d)
    {
        int[][] m = new int[d][d];
        metodos M = new metodos();
        m = M.llenadoMatManual(d);
        M.mostrarMatManual(m);
        int contCero=0, contpos=0, contneg=0;
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                if(m[i][j] < 0)
                {
                    contneg++;
                }
                else if(m[i][j] > 0 )
                {
                    contpos++;
                }
                else 
                contCero++;
            }
        }
        System.out.println("Cantidad de números positivos: " + contpos);
        System.out.println("Cantidad de números negativos: " + contneg);
        System.out.println("Cantidad de ceros en la matriz: " + contCero);
    }
    
}
