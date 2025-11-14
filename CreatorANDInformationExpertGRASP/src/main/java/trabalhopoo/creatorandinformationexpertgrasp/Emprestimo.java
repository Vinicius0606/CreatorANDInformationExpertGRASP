/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo.creatorandinformationexpertgrasp;

/**
 *
 * @author ribei
 */

// -----------------------------------------------------------------------------
/**
 * A classe Emprestimo representa a associação entre Usuario e Livro.
 *
 * Ela não é o foco dos padrões Creator/Information Expert, mas:
 * - é criada pela classe Biblioteca (Creator).
 * - encapsula as informações do empréstimo (livro, usuário, data).
 */
// -----------------------------------------------------------------------------

import java.time.LocalDate;

public class Emprestimo {
    
    private Livro livro;
    private Usuario usuario;
    private LocalDate data;
    
    public Emprestimo(Livro livro, Usuario usuario){
        
        this.livro = livro;
        this.usuario = usuario;
        this.data = LocalDate.now();
    }
    
    public String registro(){
        
        return "Livro: " + livro.getTitulo() + "\nUsuario: " + usuario.getNome() +
                "\nData: " + data;
    }
    
    public Livro getLivro() { return livro; }
    
    public Usuario getUsuario() { return usuario; }
}
