/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/
package Exercise01;

import java.util.Scanner;

public class Execute {
    public static void main(String[] arg){
        Book b1 = book();
        print(b1);
    }
    public static Book book(){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter ISBN, title, author and number of pages of the searched book.");
        Book b1 = new Book(read.next(), read.next(), read.next(), read.next());
        read.close();
        return b1;
    }
    public static void print (Book b1){
        System.out.println("Title of the book: "+b1.title);
        System.out.println("Author of the book: "+b1.author);
        System.out.println("Number of book's pages: "+b1.pages);
        System.out.println("ISBN of the book: "+b1.isbn);
    }
}
