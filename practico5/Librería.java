package Practico5;

import java.util.Scanner;

public class Librería {

    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese ISBN: ");
        int isbn1 = input.nextInt();
        System.out.println("Ingrese Titulo de Libro: ");
        String titulo1 = input.next();
        System.out.println("Ingrese Autor de libro: ");
        String autor1 = input.nextLine();
        System.out.println("Ingrese cantidad de páginas: ");
        int numPag1 = input.nextInt();

        Libro l1 = new Libro(isbn1, titulo1, autor1, numPag1);



        System.out.println("Ingrese ISBN: ");
        int isbn2 = input.nextInt();
        System.out.println("Ingrese Titulo de Libro: ");
        String titulo2 = input.next();
        System.out.println("Ingrese Autor de libro: ");
        String autor2 = input.next();
        System.out.println("Ingrese cantidad de páginas: ");
        int numPag2 = input.nextInt();

        Libro l2 = new Libro(isbn2,titulo2, autor2,numPag2);
        System.out.println("**************Libro 1**************");
        System.out.println(l1);
        System.out.println("**************Libro 2**************");
        System.out.println(l2);
    }
}
