import java.util.Scanner;

public class punto11 
{
    public void PromCalific ()
    {
        Scanner sc = new Scanner(System.in);
        metodos M = new metodos();
        double[][] ma = M.llenadoMatrParaleloIrreg();
        M.mostrarMatManualParIrreg(ma);
        double[] prom = M.promFila(ma);//PUNTO A
        for (int i = 0; i < prom.length; i++) 
        {
            System.out.println("El promedio del estudiante " + (i + 1) + " es: " + prom[i]);
            
        }
        int exam;
        System.out.println("Ingrese el número del examen que solicita ver de 1 a " + (ma.length));
        exam = sc.nextInt();
        if (exam < 1 || exam > exam) 
        {
          System.out.println("Número de examen no existe");
          return;  
        }
        int indExamen = exam -1;//Aqui organizo el indiceexamen para poder recorrer ya que va de 0 y no de 1 como lo ingresa el usuario
        double mejNot = 0;
        for (int i = 0; i < prom.length; i++) 
        {
            if(ma[i][indExamen] > mejNot)
            {
                mejNot = ma[i][indExamen];//encuentro la mayor
            }
        }
        System.out.println("La mejor nota es: " + mejNot + " en el examen " + exam);
        for (int i = 0; i < prom.length; i++) 
        {
            if(ma[i][indExamen] == mejNot)//Busco el estud con my nota, porque ya se cual fue la mayor nota
            {
                System.out.println("El estudiante fue " + (i+1));
            }
        }
        double[] vectfil = M.promFila(ma);//PUNTO D
        double filaMy=0;
        for (int i = 0; i < ma.length; i++) 
        {
            if(vectfil[i] > filaMy)
            {
                filaMy = vectfil[i];
            }
        }
        System.out.println("La persona con promedio mas alto en las notas es: " + filaMy);
    }
    
    
}
