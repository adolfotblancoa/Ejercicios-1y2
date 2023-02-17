package src.dominio;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Matematicas {
    
    //ejercicio2.1
    // 1. La suma 0 + 1 + 2 + ... + n
    public static int suma_rec_n(int n){
        
        if (n==0){
            return 0;
        } else{
            return n +suma_rec_n(n-1);
        }
    }

    //ejercicio2.2
    // 2. El factorial de un numero
    public static long factorial_n(int n){
        if (n==0){
            return 1;
        } else {
            return n*factorial_n(n-1);
        }
    }

    //ejercicio2.3
    // 3. La potencia n-ésima de un número natural
    public static long potencia_n(int base, int exp){
        if(exp==0){
            return 1;
        } else {
            return base*potencia_n(base, exp-1);
        }
    }

    //ejercicio2.4
    // 4. La suma de los elementos de una lista de números enteros
    public static int suma_lista(int[] lista){
        if(lista.length==0){
            return 0;
        } else {
            return lista[0]+suma_lista(Arrays.copyOfRange(lista, 1, lista.length));
        }
    }

    //ejercicio2.5
    // 5. La media aritmética de una lista de números
    public static int media_lista(int[] lista){
        if(lista.length==0){
            return 0;
        } else {
            return suma_lista(lista)/lista.length;
        }
    }

    //ejercicio2.6
    // 6. La desviación típica de una lista de números
    public static double desviacion_tipica(int[] lista){
        if(lista.length==0){
            return 0;
        } else {
            return Math.sqrt((Math.pow(lista[0]-media_lista(lista), 2)+desviacion_tipica(Arrays.copyOfRange(lista, 1, lista.length)))/lista.length);
        }
    }

    //ejercicio2.7
    // 7. La suma de los primeros números pares hasta n asumiendo n ≥ 2
    public static int suma_pares(int n){
        if(n<2){
            return 0;
        }else if (n%2==0){
            return n+suma_pares(n-2);
        }else return suma_pares(n-1);
    }

    //ejercicio2.8
    // 8. La suma de los elementos pares de una lista de enteros
    public static int suma_pares_lista(int[] lista){
        if(lista.length==0){
            return 0;
        }else if (lista[0]%2==0){
            return lista[0]+suma_pares_lista(Arrays.copyOfRange(lista, 1, lista.length));
        }else{
        return suma_pares_lista(Arrays.copyOfRange(lista, 1, lista.length));
        }
    }

    //ejercicio2.9
    /*  9. Dada una lista de números naturales mayores o iguales que 2, 
    obtiene otra lista con los números pares de la lista inicial, 
    en el mismo orden y respetando los números repetidos */
    public static ArrayList<Integer>pares_lista(int[] lista, ArrayList<Integer> lista_pares){
        if(lista.length==0){
            return lista_pares;
        }else if(lista[0]%2==0){
            lista_pares.add(lista[0]);
        }
        return pares_lista(Arrays.copyOfRange(lista, 1, lista.length), lista_pares);
    }

    //ejercicio2.10
    // 10. La lista de los primeros números pares hasta n asumiendo n ≥ 2
    public static ArrayList<Integer> primeros_pares(int n, ArrayList<Integer> lista_pares){
        if(n<2){
            return lista_pares;
        }else if (n%2==0){
            lista_pares.add(n);
        }
        return primeros_pares(n-1, lista_pares);
    }

    //ejercicio2.11
    // 11. Producto escalar de dos listas de números no vacías y del mismo tamaño
    public static int producto_escalar(int []lista1, int []lista2){
        if(lista1.length!=lista2.length || (lista1.length==0 && lista2.length==0)){
            return 0;
        }else{
        return (lista1[0]*lista2[0])+producto_escalar(Arrays.copyOfRange(lista1, 1, lista1.length), Arrays.copyOfRange(lista2, 1, lista2.length));
        }
    }

    //ejercicio2.12
    // 12. El elemento n-ésimo de la sucesión de Fibonacci
    public static int n_fibonacci(int n){
        if(n==0){
        return 0;
        }else if(n==1){
            return 1;
        }else{
             return n_fibonacci(n-1)+n_fibonacci(n-2);
        }
        
    }

    //ejercicio2.13
    // 13. Calcule el cociente entre el decimo tercer y el decimo segundo elemento de la sucesión de Fibonacci, y compare el resultado con (1+√5)/2
    public static double cociente_fibonacci(){
        double x = (1+Math.sqrt(5))/2;
        System.out.println("El resultado de 1 + la raiz cuadrada de 5 entre 2 es: "+x);
        return (double)n_fibonacci(13)/n_fibonacci(12);
        }

}