package DesafioSistemaDeLivraria;

import java.time.LocalDate;

public class Emprestimo {
    Livro livro;
    String nomeUsuario;
    LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, String nomeUsuario, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.nomeUsuario = nomeUsuario;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
}
