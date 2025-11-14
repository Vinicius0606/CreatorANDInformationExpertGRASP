/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhopoo.creatorandinformationexpertgrasp;

/**
 *
 * @author ruben
 */
public class Usuario {
    
    private String nome;
    private String cpf;
    private int qtdLivros;
    private int limiteLivros;
    private boolean pendenteAtraso;
    
    public Usuario(String nome, String cpf, int qtdLivros, int limiteLivros, boolean pendenteAtraso){
        
        this.nome = nome;
        this.cpf = cpf;
        this.qtdLivros = qtdLivros;
        this.limiteLivros = limiteLivros;
        this.pendenteAtraso = pendenteAtraso;
    }
    
    public void verInformacoes(){
        
        System.out.println("\nNome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Quantidade de livros emprestados: " + qtdLivros);
        System.out.println("Limite de livros: " + limiteLivros);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    public int getLimiteLivros() {
        return limiteLivros;
    }

    public void setLimiteLivros(int limiteLivros) {
        this.limiteLivros = limiteLivros;
    }

    public boolean isPendenteAtraso() {
        return pendenteAtraso;
    }

    public void setPendenteAtraso(boolean pendenteAtraso) {
        this.pendenteAtraso = pendenteAtraso;
    }
    
    
}
