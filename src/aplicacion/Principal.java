package src.aplicacion;
import java.util.Scanner;
import src.dominio.Matematicas;

public class Principal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1 : Explique qué es un método recursivo\nR: Un método recursivo es una técnica de programación en la que una función se llama a sí misma para resolver un problema en partes más pequeñas. La función se va llamando a sí misma hasta que se alcanza un caso base o condición de parada, que detiene la recursión y devuelve un resultado.\n");
        //Programe las siguientes funciones mediante métodos recursivos:
        //ejer 2.1
        System.out.println("Ejercicio 2.1: La suma 0 + 1 + 2 + ... + n\nIntroduzca el valor de n:");
        int n1 = sc.nextInt();
        System.out.println("El resultado es: "+Matematicas.suma_rec_n(n1)+"\n");
        //ejer2.2
        System.out.println("Ejercicio 2.2: El factorial de un numero\nIntroduzca el valor de n: ");
        int n2 = sc.nextInt();
        System.out.println("El resultado es: "+Matematicas.factorial_n(n2)+"\n");

    }
    
}
