/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo.creatorandinformationexpertgrasp;

/**
 *
 * @author ruben
 */

import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String autor;
    private LocalDate dataPublicacao;
    private boolean disponivel;
    
    public Livro (String titulo, String autor, LocalDate dataPublicacao, boolean disponivel){
        
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
        this.disponivel = disponivel;
    }
    
    public void verInformacoes(){
        
        System.out.println("\nTitulo do livro: " + titulo);
        System.out.println("Autor: " + autor );
        System.out.println("Data de Publicacao: " + dataPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
}
