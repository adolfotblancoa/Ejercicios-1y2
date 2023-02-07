package src.dominio;

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
    }
