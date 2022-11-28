//Leer y almacenar n (ingresar por teclado la cantidad) números enteros en una tabla
//a partir de la que se construirán otras dos tablas con los elementos con valores pares e impares de la primera, respectivamente.

package tablas1al7;
import java.util.Arrays;


import java.util.Scanner;

public class Tablas1al7 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int t[];

System.out.println("Escriba un número: ");
int n= sc.nextInt();
t = new int [n];

for (int i = 0; i < t.length; i++){
    System.out.println("Introduzca un número: ");
    t[i] = sc.nextInt();
}

int contPar = 0,
        contImpar = 0;

for (int i = 0; i < t.length; i++) {
    if (t[i] % 2 ==  0) {
        contPar++;
    } else {
        contImpar++;
    }
}

int par[]= new int[contPar];
int impar[] = new int[contImpar];

contPar = 0;
contImpar = 0;

for (int i = 0; i < t.length; i++){
    if (t[i] % 2 == 0) {
        par[contPar] = t[i];
        contPar++
                } else {
        impar[contImpar] = t[i];
        contImpar++;
    }
}
System.out.println(" Tabla par: " + Arrays.toString(par));
System.out.println(" Tabla impar: " + Arrays.toString(impar));

    }
    }
