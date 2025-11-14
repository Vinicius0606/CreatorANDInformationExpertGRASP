/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trabalhopoo.creatorandinformationexpertgrasp;

/**
 *
 * @author ruben
 */


// -----------------------------------------------------------------------------
/*
 * Este projeto demonstra o uso dos padrões GRASP:
 * - Creator: Biblioteca é responsável por criar objetos Emprestimo.
 * - Information Expert: Livro e Usuario concentram as informações que usam
 *   nas decisões (disponibilidade, limite de livros, etc.).
 */
// -----------------------------------------------------------------------------

import java.time.LocalDate;

public class CreatorANDInformationExpertGRASP {

    public static void main(String[] args) {
        
        Biblioteca leitura = new Biblioteca();
        
        Livro l1 = new Livro("Um estudo em vermelho", "Arthur Conan Doyle", LocalDate.parse("1887-07-15"), true);
        Usuario u1 = new Usuario("Vinicius", "000.000.000-00", 0, 1);
        
        leitura.adicionarLivro(l1);
        leitura.adicionarUsuario(u1);
        
        Emprestimo e = leitura.realizarEmprestimo(l1, u1);
        
        if (e != null) {
            System.out.println(e.registro());
        }
        
        leitura.realizarDevolucao(e);
    }
}
