package suma;
import java.util.Scanner;
public class ejerciciopormi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 int cantidad1;
	        int cantidad2;
	        int suma;
		System.out.print("ingrese la primera cantidad como entero");
		
		 cantidad1 = scanner.nextInt();
		
		System.out.print("ingrese la segunda cantidad como entero");
		cantidad2 = scanner.nextInt();
		
		 suma = cantidad1 + cantidad2;
		
		System.out.print("el resultado de la suma es:" + suma) ;
		
		scanner.close();
	}

}
