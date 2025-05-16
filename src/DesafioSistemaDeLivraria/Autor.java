package DesafioSistemaDeLivraria;

import java.time.LocalDate;

public class Autor {
    private static int proximoId = 1;
    private int id;
    private String nome;
    private LocalDate dataNascimento;

    public Autor(String nome, LocalDate dataNascimento) {
        this.id = proximoId++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
