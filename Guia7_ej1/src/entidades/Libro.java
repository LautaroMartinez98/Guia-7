/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class Libro {
    public String titulo, autor, ISBN, nPaginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, String nPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.nPaginas = nPaginas;
    }
    
}


