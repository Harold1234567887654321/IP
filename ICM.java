import java.util.InputScanner;

public class ICM {
/* ojo , lo de icm es por ìndice de masa corporal
 */
    public static void main(String[] args) {
        InputScanner scanner = new InputScanner(System.in);

        // Solicitar el peso del usuario
        System.out.println("Ingrese su peso en kilogramos:");
        float weight = scanner.nextFloat();

        // Solicitar la altura del usuario
        System.out.println("Ingrese su estatura en metros:");
        float height = scanner.nextFloat();

        // Calcular el IMC
        float imc = weight / (height * height);

        // Mostrar el IMC
        System.out.println("Su IMC es: " + imc);
    }
}