package src.dominio;
import java.util.Arrays;
import java.util.ArrayList;

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
            return (lista[0]+media_lista(Arrays.copyOfRange(lista, 1, lista.length))/lista.length);
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

}
