package DesafioSistemaDeLivraria;

import java.util.List;
import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dev's", "FlexxTech");
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);

        Scanner scan = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Listar livros disponíveis");
            System.out.println("2. Realizar empréstimo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scan.nextInt();
                scan.nextLine(); // Limpar buffer

                switch (opcao) {
                    case 1:
                        System.out.println("\nLivros disponíveis:");
                        List<Livro> disponiveis = biblioteca.listarLivrosDisponiveis();
                        if (disponiveis.isEmpty()) {
                            System.out.println("Nenhum livro disponível no momento.");
                        } else {
                            for (Livro livro : disponiveis) {
                                System.out.println(livro);
                            }
                        }
                        break;
                    case 2:
                        System.out.println("\nLivros disponíveis para empréstimo:");
                        disponiveis = biblioteca.listarLivrosDisponiveis();
                        if (disponiveis.isEmpty()) {
                            System.out.println("Nenhum livro disponível para empréstimo.");
                            break;
                        }

                        for (Livro livro : disponiveis) {
                            System.out.println(livro);
                        }

                        System.out.print("Escolha o ID do livro: ");
                        int idLivro = scan.nextInt();
                        scan.nextLine(); // Limpar buffer

                        System.out.print("Digite seu nome: ");
                        String nome = scan.nextLine();

                        String resultado = biblioteca.realizarEmprestimo(idLivro, nome);
                        System.out.println(resultado);
                        break;
                    case 3:
                        System.out.println("Sistema sendo finalizado...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scan.nextLine(); // Limpar buffer
                opcao = 0;
            }
        } while (opcao != 3);
        scan.close();
    }
}