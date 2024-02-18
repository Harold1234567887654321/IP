import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg:");
        Float Peso = sc.nextFloat();
        System.out.println("Ingrese su altura en m");
        Float Altura = sc.nextFloat();

        float Imc = Peso / (Altura * Altura);
        System.out.println("Su Imc es " + Imc);

            if (Imc < 18.5) {
                System.out.println("Bajo peso");
            }

            if (Imc >= 18.5 && Imc <= 24.9) {
                System.out.println("Peso normal");

            } if (Imc >= 25 && Imc <= 29.9) {
                System.out.println("Sobrepeso");

            } if (Imc >= 30 && Imc <= 34.9) {
                System.out.println("Obesidad I");

            } if (Imc >= 35 && Imc <= 39.9) {
                System.out.println("Obesidad II");
            }
            if (Imc>=40){
                System.out.println("Obesidad Mórbida");

        }
        }


    }
 /*Ingrese comas en vez de puntos*/