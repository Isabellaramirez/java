package imc;
import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese su masa en kilogramos: ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese su talla en metros: ");
        double talla = scanner.nextDouble();

       
        double imc = masa / (talla * talla);

      
        System.out.println("Tu índice de masa corporal (IMC) es: " + imc);

      
        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Clasificación: Normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Clasificación: Obesidad Clase I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Clasificación: Obesidad Clase II");
        } else {
            System.out.println("Clasificación: Obesidad Clase III");
        }


	}

}
