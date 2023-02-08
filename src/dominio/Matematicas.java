package src.dominio;
import java.util.Arrays;

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
}
