/*Escribir un programa que lea c�digos de personas de 8 caracteres de modo que los cuatro primeros sean num�ricos 
 * y contenidos entre 1990-1995 (un a�o), el quinto car�cter sea solo (H � M) sexo,
 *  el sexto un numero que representa el curso 1 � 2 y los caracteres s�ptimo y
 *   octavo pueden tener cualquier valor. Deben rechazarse los c�digos que no cumplan estas
condiciones, la finalizaci�n de entrada de c�digos se produce cuando se introduce el c�digo �00000000�.
 Al final el programa debe sacar un informe indicando cu�ntos hombres y mujeres hay matriculados en primero y segundo y 
 cu�ntos c�digos correctos han sido le�dos.*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String salida="00000000", entrada,fecha="",sexo,hombre="H",mujer="M",curso,primero="1",segundo="2";
		int numero,correctas=0,hPrimero=0,hSegundo=0,mPrimero=0,mSegundo=0;
		do{
			System.out.println("Introduce tus datos siguiendo el formato: 1990H1RJ");
			entrada = teclado.nextLine();
			if(entrada.length()==8){			
					fecha=entrada.substring(0,4);
				 numero = Integer.parseInt(fecha);
					if(numero>=1990 || numero<=1995){
						sexo=entrada.substring(4,5);
						sexo=sexo.toUpperCase();
						if(sexo.equals(hombre) || sexo.equals(mujer)){
							curso=entrada.substring(5,6);
							if(curso.equals(primero)||curso.equals(segundo)){
								correctas++;
								if(sexo.equals(hombre)&&curso.equals(primero)){
									hPrimero++;
								}else if(sexo.equals(mujer)&&curso.equals(primero)){
									mPrimero++;
								}else if(sexo.equals(hombre)&&curso.equals(segundo)){
									hSegundo++;
								}else if(sexo.equals(mujer)&&curso.equals(segundo)){
									mSegundo++;
								}								
							}							
						}											
					}								}
		}while(!entrada.equals(salida));
		System.out.println("Numero de Hombres en primero "+hPrimero);
		System.out.println("Numero de Mujeres en primero "+mPrimero);
		System.out.println("Numero de Hombres en segundo "+hSegundo);
		System.out.println("Numero de Mujeres en segundo "+mSegundo);
	}

}
