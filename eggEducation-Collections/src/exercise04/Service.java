package exercise04;

import javax.swing.*;
import java.util.ArrayList;

/**
 Después de ese bucle realizaremos las siguientes acciones:
 * • Mostrar en pantalla todas las películas.
 * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
 * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
 * pantalla.
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla.
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
 * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class Service {
    public ArrayList<Film> listOfMovies (){
        ArrayList<Film> list = new ArrayList<>();
        Film movie;
        int op = 0;
        do {
            movie = new Film();
            movie.setTitle(JOptionPane.showInputDialog(null, "Enter the title of the movie."));
            movie.setDirector(JOptionPane.showInputDialog(null, "Enter the name of the director."));
            movie.setDuration(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the duration of the movie in hours. (Example: 1.30)")));
            list.add(movie);
            op = JOptionPane.showConfirmDialog(null,"Do you enter another film?");
        } while(op == 0);
        return list;
    }
    public void print(ArrayList<Film> list){
        JOptionPane.showMessageDialog(null,"List of movies:"+"\n"+list);
    }
    public void printMayorThanAnHour(ArrayList<Film> list){

    }
}
