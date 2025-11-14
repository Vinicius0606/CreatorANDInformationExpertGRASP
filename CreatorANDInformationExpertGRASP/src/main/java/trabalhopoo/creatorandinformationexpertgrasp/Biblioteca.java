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
 * Padrão GRASP aplicado: Creator.
 *
 * A classe Biblioteca é responsável por criar objetos Emprestimo.
 * Segundo o GRASP, uma classe deve ser "Creator" de outra quando:
 * - agrega ou contém objetos desse tipo;
 * - usa intensamente esses objetos;
 * - possui os dados necessários para criá-los.
 *
 * Aqui, Biblioteca:
 * - mantém listas de Livro, Usuario e Emprestimo;
 * - conhece quais usuários e livros existem;
 * - por isso faz sentido ela criar um novo Emprestimo ao invés
 *   de deixar essa responsabilidade em Usuario ou Livro.
 */
// -----------------------------------------------------------------------------

import java.util.ArrayList;

public class Biblioteca {
    
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    
    public void adicionarLivro(Livro livro) { livros.add(livro); }
    
    public void adicionarUsuario(Usuario usuario) { usuarios.add(usuario); }
    
    public Emprestimo realizarEmprestimo(Livro livro, Usuario usuario) {
        
        if (!livro.isDisponivel()) {
            
            System.out.println("Este livro está indisponível no momento!");
            return null;
        }
        
        if(!usuario.podePegar()) {
            
            System.out.println("Este usuário já está em posse do número limite de livros!");
            return null;
        }
        
        Emprestimo e = new Emprestimo(livro, usuario);
        
        livro.indisponibilizar();
        usuario.setQtdLivros(usuario.getQtdLivros() + 1);
        
        emprestimos.add(e);
        
        System.out.println("Emprestimo realizado!");
        
        return e;
    }
    
    public void realizarDevolucao(Emprestimo emprestimo) {
        
        if(!emprestimos.contains(emprestimo)) {
            
            System.out.println("Emprestimo inexistente!");
            return;
        }
        
        Livro livro = emprestimo.getLivro();
        Usuario usuario = emprestimo.getUsuario();

        livro.disponibilizar();             
        usuario.setQtdLivros(usuario.getQtdLivros() - 1);
        
        emprestimos.remove(emprestimo);
        
        System.out.println("Devolução realizada!");
    }
}
