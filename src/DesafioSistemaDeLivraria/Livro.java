package DesafioSistemaDeLivraria;

import java.time.LocalDate;

public class Livro {
    private static int proximoId = 1;
    private int id;
    private String titulo;
    private String autor;
    private boolean isDisponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(String titulo, String autor) {
        this.id = proximoId++;
        this.titulo = titulo;
        this.autor = autor;
        this.isDisponivel = true;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao =  LocalDate.now();
    }

    public int getId() {
        return id;
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

    public boolean getDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isDisponivel=" + isDisponivel +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualizacao=" + dataAtualizacao +
                '}';
    }
}
