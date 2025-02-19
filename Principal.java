import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int opc = 0, d=0;
        System.out.println("Ingrese la dimesion de la matriz");
        d = sc.nextInt();
        System.out.println("Ingrese el punto a visualizar del 1 al 11");
        opc = sc.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Es el punto 1");
                punto1 p1 = new punto1();
                int suma = p1.SumarMatriz(d);
                break;
            case 2:
                System.out.println("Es el punto 2");
                punto2 p2 = new punto2();
                p2.NumeroMayor(d);
                break;
            case 3:
                System.out.println("Es el punto 3");
                punto3 p3 = new punto3();
                p3.SumFil(d);
                break;
            case 4:
                System.out.println("Es el punto 4");
                punto4 p4 = new punto4();
                p4.MaxSumCol(d);
                break;
            case 5:
                System.out.println("Es el punto 5");
                punto5 p5 = new punto5();
                p5.vector(d);
                break;
            case 6:
                System.out.println("Es el punto 6");
                punto6 p6 = new punto6();
                p6.sumaVectFyC(d);
                break;
            case 7:
                System.out.println("Es el punto 7");
                punto7 p7 = new punto7();
                p7.numCeroPosNeg(d);
                break;
            case 8:
                System.out.println("Es el punto 8");
                punto8 p8 = new punto8();
                p8.sumFilaYmayEncontIndi(d);
                break;
            case 9:
                System.out.println("Es el punto 9");
                punto9 p9 = new punto9();
                p9.punto9(d);
                break;
            case 11:
                System.out.println("Es el punto 11");
                punto11 p11 = new punto11();
                p11.PromCalific();
                break;
            default:
            System.out.println("Pagina en mantenimiento");
                break;
        }

    }
}