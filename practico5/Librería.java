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

        Libro l1 = new Libro();
        l1.setIsbn(isbn1);
        l1.setTitulo(titulo1);
        l1.setAutor(autor1);
        l1.setNumPag(numPag1);

        System.out.println("**************Libro 1**************");
        System.out.println(l1);

        System.out.println("Ingrese ISBN: ");
        int isbn2 = input.nextInt();
        System.out.println("Ingrese Titulo de Libro: ");
        String titulo2 = input.next();
        System.out.println("Ingrese Autor de libro: ");
        String autor2 = input.next();
        System.out.println("Ingrese cantidad de páginas: ");
        int numPag2 = input.nextInt();

        Libro l2 = new Libro();
        l2.setIsbn(isbn2);
        l2.setTitulo(titulo2);
        l2.setAutor(autor2);
        l2.setNumPag(numPag2);

        System.out.println("**************Libro 2**************");
        System.out.println(l2);
    }
}
