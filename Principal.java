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
        switch (sc) {
            case 1:
                System.out.println("Es el punto 1");
                break;
        
            default:
            System.out.println("Pagina en mantenimiento");
                break;
        }
        
    }
}