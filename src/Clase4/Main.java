package Clase4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		// Ejercicio Clase 4 1.a)
		System.out.println ("Clase 4 1.a)");
		
		Integer[] numeros = {2, 3, 1};
		
		char orden;
		
		orden = 'D'; 
		
		if (orden == 'A') {
		
		Arrays.sort(numeros);
		System.out.println(Arrays.toString(numeros));
		} else {
			if (orden == 'D') {
		

				Arrays.sort(numeros, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numeros));
				
		}
		}

	
	    // Ejercicio Clase 4 1.b)
		System.out.println ("Clase 4 1.b)");
	
		int[] lista = new int [3];
		
		Scanner lectura = new Scanner (System.in);
					
		System.out.println ("Por favor introduzca el primer número de la lista:"); 
		
		lista [0] = lectura.nextInt();
		
		System.out.println ("Por favor introduzca el segundo número de la lista:"); 
		
		lista [1] = lectura.nextInt();
		
		System.out.println ("Por favor introduzca el tercer número de la lista:"); 
		
		lista [2] = lectura.nextInt();
		
		System.out.println ("Su lista es:"); 
		
		System.out.println (Arrays.toString(lista));
	 
		char orden1;
		
		System.out.println ("Cómo quieres ordenar la lista? A: ascendente o D: descendente");
		
		orden1 = lectura.next().charAt(0);
		
		if (orden1 == 'A') {
			
			Arrays.sort(lista);
			System.out.println(Arrays.toString(lista));
			} else {
				if (orden == 'D') {
					
			List<Integer> list = Arrays.stream(lista).boxed().collect(Collectors.toList());
			
			Collections.sort(list);
	        Collections.reverse(list);
	        System.out.println(list);
					
			}
			}
		
		// Ejercicio Clase 4 1.c)
		
		
	}
		
		
		
		
		 
		
		
	
		

}
