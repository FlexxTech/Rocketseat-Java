package DesafioSistemaDeLivraria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public List<Livro> listarLivrosDisponiveis(){
        List<Livro> disponiveis = new ArrayList<>();
        for(Livro l : livros){
            if(l.getDisponivel()){
                disponiveis.add(l);
            }
        }
        return disponiveis;
    }

    public String realizarEmprestimo(int idLivro, String nomeUsuario){
        for(Livro l : livros){
            if(l.getId() == idLivro){
                if(l.getDisponivel()){
                    Emprestimo novoEmprestimo = new Emprestimo(l, nomeUsuario, LocalDate.now());
                    emprestimos.add(novoEmprestimo);
                    l.setDisponivel(false);
                    return "Emprestimo realizado com sucesso para " + nomeUsuario;
                }else {
                    return "Livro indisponivel para empréstimo.";
                }
            }
        }
        return "Livro com ID " + idLivro + " não encontrado.";
    }
}
