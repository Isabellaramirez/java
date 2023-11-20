package opcionesejercicio;
import java.util.Scanner;
public class opciones1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        System.out.print("ingrse una opcion del 1 al 3");
        int opcion = scanner.nextInt();
        switch (opcion) {
        case 1: System.out.print("el siguiente proceso sera de resta");
        int cantidad1;
        int cantidad2;
        int resultadoresta;
        System.out.print("ingrese la primera cantidad");
        cantidad1 = scanner.nextInt();
        System.out.print("ingrese la segunda cantidad");
        cantidad2 = scanner.nextInt();
        resultadoresta = cantidad1 - cantidad2;
        System.out.print("el resultado de la resta es:" + cantidad1 + "-" + cantidad2 +  "=" + resultadoresta);
        
        case 2: System.out.print("que tabla de multiplicar desea ver");
        int tabla;
        tabla = scanner.nextInt();
        System.out.println ("la tabla de multiplicar es la siguiente:");
        for (int i=1; i <= 10; i++) { int resultadotabla= tabla * i; 
        System.out.println(tabla + "*" + i + "=" + resultadotabla);      
}
    
        
        case 3:  System.out.print("numeros pares");
        System.out.print("Digita un numero del 1 hasta el 100");
        int numero_ingresado;
        int contadorpares=2;
        numero_ingresado = scanner.nextInt();
        while (contadorpares<=numero_ingresado) { 
        	System.out.println(contadorpares); 
        	contadorpares+=2;
        }
        
        
}
	}

}
