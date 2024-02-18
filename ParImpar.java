import java.util.Scanner;
public class ParImpar{
    public static void Main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un numero entero par:");
        int Numero = sc.nextInt();

        if (Numero>=0){
            if (Numero %2==0){
                System.out.println("El numero es par");
            }else {
                System.out.println("El numero es impar");
            }
        }else {
            System.out.println("El numero es negativo");
        }
    }
}

