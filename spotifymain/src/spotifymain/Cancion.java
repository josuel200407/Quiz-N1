/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifymain;

/**
 *
 * @author Rodrigo Rodriguez
 */
public class Cancion {

    public int getIdcancion() {
        return idcancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getAnocreacion() {
        return anocreacion;
    }

    private int idcancion;
    private String titulo;
    private String autor;
    private double duracion;
    private int anocreacion;
    
    
    public Cancion( int idcancion,String titulo,String autor,double duracion,int anocreacion){
    
        this. anocreacion= anocreacion;
        this. autor = autor;
        this.duracion = duracion;
        this.idcancion = idcancion;
        this.titulo = titulo;
        
                
                
    }
}
