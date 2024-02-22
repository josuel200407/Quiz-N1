/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spotifymain;

import java.util.Scanner;

/**
 *
 * @author Rodrigo Rodriguez
 */
public class Spotifymain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el id de la canción:");
        int idcancion = scanner.nextInt();

        System.out.println("Ingrese el título de la canción:");
        String titulo = scanner.next();

        System.out.println("Ingrese el autor de la canción:");
        String autor = scanner.next();

        System.out.println("Ingrese la duración de la canción en minutos:");
        double duracion = scanner.nextDouble();

        System.out.println("Ingrese el año de creación de la canción:");
        int anocreacion = scanner.nextInt();

        Cancion cancion1 = new Cancion(idcancion, titulo, autor, duracion, anocreacion);

        System.out.println("\nDatos de la canción:");
        System.out.println("ID: " + cancion1.getIdcancion());
        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Autor: " + cancion1.getAutor());
        System.out.println("Duración: " + cancion1.getDuracion() + " minutos");
        System.out.println("Año de creación: " + cancion1.getAnocreacion());

        scanner.close();
    }
}      

    
    

