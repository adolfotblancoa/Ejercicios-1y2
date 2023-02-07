package src.aplicacion;
import java.util.Scanner;
import src.dominio.Matematicas;

public class Principal {
    public static void main(String args[]){
        System.out.println("Introduzca el numero de ejercicio: ");
        Scanner sc = new Scanner(System.in);
        int ejer = sc.nextInt();

        switch(ejer){
            case 1 : 
            System.out.println("Ejercicio 1 : Explique qué es un método recursivo\n\nR: Un método recursivo es una técnica de programación en la que una función se llama a sí misma para resolver un problema en partes más pequeñas. La función se va llamando a sí misma hasta que se alcanza un caso base o condición de parada, que detiene la recursión y devuelve un resultado.");
            break;
            case 2:
        }
    }
    
}
