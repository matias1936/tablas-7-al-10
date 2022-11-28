//Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
//Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo.
//Debemos mos­trar al final la nota promedio del grupo en cada trimestre, y la nota promedio del alumno que se encuentra en la posición "pos" (que se lee por teclado).

package tablas1al7;


import java.util.Scanner;

public class Tablas1al7 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ALUM = 5;
        double mediaAlumno;
        
int primer[] = new Int[NUM_ALUM];
int segundo[] = new Int[NUM_ALUM];
int tercer[] = new Int[NUM_ALUM];

System.out.println("Notas del primer trimestre: ");
leerNotas(primer);
System.out.println("Notas del segundo cuatrimestre: ");
leerNotas(segundo);
System.out.println("Notas del tercer cuatrimestre: ");
leerNotas(tercer);

int sumaPrimer = 0,
        int sumaSegundo = 0,
                int sumaTercero = 0;
for (int i=0; i < NUM_ALUM; i++) {
    sumaPrimer += primer [i];
    sumaSegundo += segundo [i];
    sumaTercero += tercer[i];
}

System.out.println(" Media del primer trimestre "+ (double) sumaPrimer / NUM_ALUM);
System.out.println(" Media del segundo trimestre "+ (double) sumaSegundo / NUM_ALUM);
System.out.println(" Media del tercer trimestre "+ (double) sumaTercero / NUM_ALUM);
System.out.println();

System.out.print("Introduzca posición del alumno: ");
int pos = sc.nextInt();

mediaAlumno = (double) (primer[pos] + segundo[pos] + tercer[pos]) / 3;
System.out.println ("La media del alumno es" + mediaAlumno);
    
}

  
