import java.util.Scanner;

public class metodos 
{
    Scanner sc = new Scanner(System.in);
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
    public int[][] llenadoMatManual(int d)
    {
        int[][] mat = new int[d][d];
        for (int i = 0; i < mat.length; i++) 
        {
            for (int j = 0; j < mat.length; j++) 
            {
                System.out.print("Ingrese valores enteros para llenar la matriz");
                mat[i][j] = sc.nextInt();
            }
            
        }
        return mat;
    }
    public double[][] llenadoMatrParaleloIrreg()
    {
        int n, m;
        System.out.println("Ingrese la cantidad de personas");
        n = sc.nextInt();
        System.out.println("Ingrese la cantidad de examenes");
        m = sc.nextInt();
        double[][] mat = new double[n][m];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print("Ingrese la nota para la persona " + (i + 1) + " en el examen " + ( j + 1 ));
                mat[i][j] = sc.nextFloat();
            }
        }
        return mat;
    }
    public double[] sumFi (double[][] m)
    {
        double[] vecSFil = new double[m.length];
        double acufil;
        for (int i = 0; i < m.length; i++) 
        {
            acufil = 0;
            for (int j = 0; j < m.length; j++) 
            {
                acufil+= m[i][j];
            }
            vecSFil[i] = acufil;
        }
        return vecSFil;
    }
    public void mostrarMatManualParIrreg(double[][] mat)
    {
        for(int i =0; i< mat.length; i++)
        {
            for(int j =0; j< mat[0].length; j++)
            {
               System.out.print(" - " + mat[i][j] + " - ");
            }
            System.out.println();
        }
    }
    public double[] promFila(double[][] ma)
    {
        double[] promFil = new double[ma.length];
        for (int i = 0; i < ma.length; i++) 
        {
            double acumSu = 0;
            for (int j = 0; j < ma[0].length; j++) 
            {
                acumSu += ma[i][j];
            }
            promFil[i] = acumSu/ma[i].length;//la division con [i] para que funcione ya sea matriz cuadrada o irregular
            
        }
        return promFil;
    }
    public void mostrarMatManual(int[][] mat)
    {
        for(int i =0; i< mat.length; i++)
        {
            for(int j =0; j< mat.length; j++)
            {
               System.out.print(" - " + mat[i][j] + " - ");
            }
            System.out.println();
        }
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
    public int NumeroMayor (int[][] m)
    {
        int nmy = 0;
        for( int i = 0; i < m.length; i ++)
        {
            for( int j = 0; j < m.length; j ++)
            {
                if (m[i][j] > nmy) 
                {
                    nmy = m[i][j];
                }
            }
        }
        return nmy;
    }
    public int[] mostrarposicionmayor ( int matriz[][])
    {
        int[] pos = new int[2];
        int nmy = matriz[0][0];
        for( int i = 0; i < matriz.length; i ++)
        {
            for( int j = 0; j < matriz.length; j ++)
            {
                if (matriz[i][j] > nmy) 
                {
                    nmy = matriz[i][j];
                    pos[0] = i;
                    pos[1] = j;
                
                }
            }
        }
        return pos;
    }
    public int[] mostrarposicionMenor ( int matriz[][])
    {
        int[] pos = new int[2];
        int nmn = matriz[0][0];
        for( int i = 0; i < matriz.length; i ++)
        {
            for( int j = 0; j < matriz.length; j ++)
            {
                if (matriz[i][j] < nmn) 
                {
                    nmn = matriz[i][j];
                    pos[0] = i;
                    pos[1] = j;
                
                }
            }
        }
        return pos;
    }
    public void sumafilasYColumn ( int [][] matriz, int d)
    {
        int acumCol, acumFilas;
        int [] vectFilas = new int[d];
        int [] vectCol = new int[d];
        for( int i = 0; i < matriz.length; i ++)//recorrido por filas
        {
            acumFilas =0;
            for( int j = 0; j < matriz.length; j ++)
            {
                acumFilas += matriz[i][j];
            }
            vectFilas[i] = acumFilas;
            System.out.println("La suma de la fila " + i + " es " + vectFilas[i]);
        }
        for( int j = 0; j < matriz.length; j ++)//recorrido por columnas
        {
            acumCol = 0;
            for( int i = 0; i < matriz.length; i ++)
            {
                acumCol += matriz[i][j];
            }
            vectCol[j] = acumCol;
            System.out.println("La suma de la columna " + j + " es " + vectCol[j]);
        }  
        
    }
    public int[] SumFila (int[][]m, int d)
    {
        int [] vectFil = new int[d];
        int acumFil;
        for( int i = 0; i < m.length; i ++)//recorrido por filas
        {
            acumFil =0;
            for( int j = 0; j < m.length; j ++)
            {
                acumFil += m[i][j];
            }
            vectFil[i] = acumFil; 
        }
        return vectFil;
    }
    public void sumMaxCol ( int[][] matriz, int d)
    {
        int acumCo;
        int [] vectCo = new int[d];
       
        int mySum =0, indMy = 0;
        for( int j = 0; j < matriz.length; j ++)//recorrido por columnas
        {
            acumCo = 0;
            for( int i = 0; i < matriz.length; i ++)
            {
                acumCo += matriz[i][j];
            }
            vectCo[j] = acumCo;
            if (acumCo > mySum) 
            {
                mySum = acumCo;
                indMy = j; 
            }
        }  
        System.out.println("La columna con mayor suma es " + indMy + " y el valor es " + mySum);
    }
    public int[] VecSumFiyCol(int[][] matriz, int d)
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
    public int MenenMat(int[][] m, int d)
    {
        int mn = m[0][0];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                if( m[i][j] < mn)
                {
                    mn = m[i][j];
                }
            }
        }
        return mn;
    }
    public int MayenMat ( int[][] m, int d )
    {
        int my = m[0][0];
        for (int i = 0; i < m.length; i++) 
        {
            for (int j = 0; j < m.length; j++) 
            {
                if(m[i][j] > my)
                {
                    my = m[i][j];
                }
            }
        }
        return my;
    }
    
}
