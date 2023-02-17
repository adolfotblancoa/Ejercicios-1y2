package src.aplicacion;
import java.util.ArrayList;
import java.util.Scanner;
import src.dominio.Matematicas;

public class Principal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //ejer 1
        System.out.println("Ejercicio 1. Explique qué es un método recursivo\nR: Un método recursivo es una técnica de programación en la que una función se llama a sí misma para resolver un problema en partes más pequeñas. La función se va llamando a sí misma hasta que se alcanza un caso base o condición de parada, que detiene la recursión y devuelve un resultado.\n");
        //ejer 2
        System.out.println("Ejercicio 2. Programe las siguientes funciones mediante métodos recursivos: \n");
        System.out.println("Ejercicio 2.1: La suma 0 + 1 + 2 + 3 + ... + n");
        System.out.println("Ejercicio 2.2: El factorial de un número n");
        System.out.println("Ejercicio 2.3: La potencia n-esima de un número");
        System.out.println("Ejercicio 2.4: La suma de los elementos de una lista de números enteros");
        System.out.println("Ejercicio 2.5: La media aritmética de una lista de números");
        System.out.println("Ejercicio 2.6: La desviación típica de una lista de números");
        System.out.println("Ejercicio 2.7: La suma de los primeros números pares hasta n asumiendo n ≥ 2");
        System.out.println("Ejercicio 2.8: La suma de los elementos pares de una lista de enteros");
        System.out.println("Ejercicio 2.9: Dada una lista de números naturales mayores o iguales que 2, obtiene otra lista con los números pares de la lista inicial, en el mismo orden y respetando los números repetidos.");
        System.out.println("Ejercicio 2.10: La lista de los primeros números pares hasta n asumiendo n ≥ 2");
        System.out.println("Ejercicio 2.11: Producto escalar de dos listas de números no vacías y del mismo tamaño.");
        System.out.println("Ejercicio 2.12: El elemento n-ésimo de la sucesión de Fibonacci.");
        System.out.println("Ejercicio 2.13: Calcule el cociente entre el decimo tercer y el decimo segundo elemento de la sucesión de Fibonacci, y compare el resultado con (1+√5)/2.");
        System.out.println("Ejercicio 2.14: Averigüe la relación entre la sucesión de Fibonacci y la razón áurea");
        System.out.println("\n0: Salir");
        boolean salir = false;
        do{
        System.out.println("Introduzca el numero de apartado que desea ejecutar (1-14): ");
        int apartado = sc.nextInt();
        switch(apartado){
        //ejer 2.1
        case 1:
            System.out.println("Ejercicio 2.1: La suma 0 + 1 + 2 + ... + n\nIntroduzca el valor de n:");
            int n1 = sc.nextInt();
            System.out.println("El resultado es: "+Matematicas.suma_rec_n(n1)+"\n");
            break;
        //ejer2.2
        case 2:
            System.out.println("Ejercicio 2.2: El factorial de un numero\nIntroduzca el valor de n: ");
            int n2 = sc.nextInt();
            System.out.println("El resultado es: "+Matematicas.factorial_n(n2)+"\n");
            break;
        //ejer 2.3
        case 3:
            System.out.println("Ejercicio 2.3: Potencia n-esima de un natural\nIntroduzca el numero natural: ");
            int nat = sc.nextInt();
            System.out.println("Introduzca la potencia: ");
            int pot = sc.nextInt();
            System.out.println("El resultado es : "+Matematicas.potencia_n(nat, pot)+"\n");
            break;
        //ejer 2.4
        case 4:
            System.out.println("Ejercicio 2.4: La suma de los elementos de una lista de números enteros\nIntroduzca la longitud de la lista: ");
            int lon4 = sc.nextInt();
            int[] lista4 = new int[lon4];
            for(int i=0; i<lon4; i++){
                System.out.println("Introduzca el elemento "+(i+1)+": ");
                lista4[i] = sc.nextInt();
            }
            System.out.println("El resultado es: "+Matematicas.suma_lista(lista4)+"\n");
            break;
        //ejer 2.5
        case 5:
            System.out.println("Ejercicio 2.5: La media aritmética de una lista de números\nIntroduzca la longitud de la lista: ");
            int lon5 = sc.nextInt();
            int[] lista5 = new int[lon5];
            for(int i=0; i<lon5; i++){
                System.out.println("Introduzca el elemento "+(i+1)+": ");
                lista5[i] = sc.nextInt();
            }
            System.out.println("El resultado es: "+Matematicas.media_lista(lista5)+"\n");
            break;
        //ejer 2.6
        case 6:
            System.out.println("Ejercicio 2.6: La desviación típica de una lista de números\nIntroduzca la longitud de la lista: ");
            int lon6 = sc.nextInt();
            int[] lista6 = new int[lon6];
            for(int i=0; i<lon6; i++){
                System.out.println("Introduzca el elemento "+(i+1)+": ");
                lista6[i] = sc.nextInt();
            }
            System.out.println("El resultado es: "+Matematicas.desviacion_tipica(lista6)+"\n");
            break;
        //ejer 2.7
        case 7:
            System.out.println("Ejercicio 2.7: La suma de los primeros números pares hasta n asumiendo n ≥ 2. \nIntroduzca el valor de n: ");
            int n7 = sc.nextInt();
            System.out.println("El resultado es: "+Matematicas.suma_pares(n7)+"\n");
            break;
        //ejer 2.8
        case 8:
            System.out.println("Ejercicio 2.8: La suma de los elementos pares de una lista de enteros\nIntroduzca la longitud de la lista: ");
            int lon8 = sc.nextInt();
            int[] lista8 = new int[lon8];
            for(int i=0; i<lon8; i++){
                System.out.println("Introduzca el elemento "+(i+1)+": ");
                lista8[i] = sc.nextInt();
            }
            System.out.println("El resultado es: "+Matematicas.suma_pares_lista(lista8)+"\n");
            break;
        //ejer 2.9
        case 9:
            System.out.println("Ejercicio 2.9: Dada una lista de números naturales mayores o iguales que 2, obtiene otra lista con los números pares de la lista inicial, en el mismo orden y respetando los números repetidos.\nIntroduzca la longitud de la lista: ");
            int lon9 = sc.nextInt();
            int[] lista9 = new int[lon9];
            for(int i=0; i<lon9; i++){
                System.out.println("Introduzca el elemento "+(i+1)+": ");
                lista9[i] = sc.nextInt();
            }
            ArrayList<Integer> lista_pares = new ArrayList<Integer>();
            System.out.println("El resultado es: "+Matematicas.pares_lista(lista9,lista_pares)+"\n");
            break;
        //ejer 2.10
        case 10:
            System.out.println("Ejercicio 2.10: La lista de los primeros números pares hasta n asumiendo n ≥ 2.\nIntroduzca el valor de n: ");
            int n10 = sc.nextInt();
            ArrayList<Integer> lista_pares2 = new ArrayList<Integer>();
            System.out.println("El resultado es: "+Matematicas.primeros_pares(n10,lista_pares2)+"\n");
            break;
        //ejer 2.11
        case 11:
            System.out.println("Ejercicio 2.11: Producto escalar de dos listas de números no vacías y del mismo tamaño.\nIntroduzca la longitud de las listas: ");
            int lon11 = sc.nextInt();
            int[] lista11_1 = new int[lon11];
            int[] lista11_2 = new int[lon11];
            for(int i=0; i<lon11; i++){
                System.out.println("Introduzca el elemento "+(i+1)+" de la primera lista: ");
                lista11_1[i] = sc.nextInt();
            }
            for(int i=0; i<lon11; i++){
                System.out.println("Introduzca el elemento "+(i+1)+" de la segunda lista: ");
                lista11_2[i] = sc.nextInt();
            }
            System.out.println("El resultado es: "+Matematicas.producto_escalar(lista11_1,lista11_2)+"\n");
            break;
        //ejer 2.12
        case 12:
            System.out.println("Ejercicio 2.12: El elemento n-ésimo de la sucesión de Fibonacci. \nIntroduzca el valor de n: ");
            int n12 = sc.nextInt();
            System.out.println("El resultado es: "+Matematicas.n_fibonacci(n12)+"\n");
            break;
        
        //ejer 2.13
        case 13:
            System.out.println("Ejercicio 2.13: Ejercicio 2.13: Calcule el cociente entre el decimo tercer y el decimo segundo elemento de la sucesión de Fibonacci, y compare el resultado con (1+√5)/2.");
            System.out.println("El resultado del cociente es: "+Matematicas.cociente_fibonacci()+"\n");
            break;
        //ejer 2.14
        case 14:
            System.out.println("Ejercicio 2.14: Averigüe la relación entre la sucesión de Fibonacci y la razón áurea");
            System.out.println("R: La razón entre dos números consecutivos de Fibonacci tiende a la razón áurea cuando los números son lo suficientemente grandes. De hecho, esta razón es igual a la razón áurea φ aproximadamente a medida que la sucesión crece, es decir: \nlim (n→∞) Fn₊₁/Fn = φ, \ndonde Fn es el n-ésimo término de la sucesión de Fibonacci y φ es la razón áurea.");
            break;

        case 0:
            System.out.println("Adios.\n");
            salir = true;
            break;

        default:
            System.out.println("Opción incorrecta. Introduzca un numero entre 1 y 14.\n");
            break;

        }

        }while (!salir);

    }

}
