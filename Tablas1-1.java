//Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar.
//Leer otra serie de 6 enteros, que también se guardarán en una tabla y se mostrarán ordenados.
//A continuación, fusionar las dos tablas en una tercera, de forma que los 12 números sigan ordenados.
//Fusionar dos tablas ordenadas significa copiar en el orden correcto para que los datos resultantes continúen ordenados, sin necesidad de volver a realizar una ordenación.
package tablas1al7;

import java.util.Arrays;
import java.util.Scanner;

public class Tablas1al7 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int  TAM = 6;
        int a[] = new int [TAM];
        
        System.out.println("Escriba la primera serie de numeros: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introduzca numero");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
            
        int b[] = new int [TAM] ;
        System.out.println("Escriba la segunda serie de numeros: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println("Introduzca un número: ");
            b[i] = sc.nextInt();
            
        }
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        
        int c[] = new int[2 * TAM];
        
        int indA = 0,
                indB = 0,
                indC = 0;
        while (indA < TAM && indB < TAM ){
            if (a[indA] < b[indB]){
                c [indC] = a[indA];
                indA++;
            } else {
                c[indC] = b[indB];
                indB++;
                indC++;
            }
            if (indA == TAM){
                while (indB < TAM){
                    c [indC] = b[indB];
                    indB++;
                    indC++;
                }
            }
        }
    }
}
                
            
  
