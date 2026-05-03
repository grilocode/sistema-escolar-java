package com.grilocode.sistemaescolar.main;

import com.grilocode.sistemaescolar.modelo.Estudante;
import com.grilocode.sistemaescolar.modelo.ListaEstudantes;
import com.grilocode.sistemaescolar.servico.CalculadorMedia;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Objetos
        CalculadorMedia calculadorMedia = new CalculadorMedia();
        ListaEstudantes listaEstudantes = new ListaEstudantes();

        // Variáveis
        int totalEstudantes = 0;
        int opcao;

        do {
            // Menu de opções
            System.out.println("========= Sistema Escolar =========");
            System.out.println("1 - Adicionar estudante");
            System.out.println("2 - Calcular média do estudante");
            System.out.println("3 - Visualizar lista de estudantes");
            System.out.println("0 - Sair");
            System.out.println("===================================");
            System.out.print("Escolha: ");

            // Limpa o buffer do scanner (consome o ENTER pendente)
            opcao = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            // Opções do menu
            switch (opcao) {
                case 1:
                    // Cria um novo estudante
                    Estudante novoEstudante = new Estudante();

                    System.out.print("Digite o nome completo do estudante: ");
                    novoEstudante.nome = scanner.nextLine();

                    System.out.print("Digite sua nota do primeiro bimestre: ");
                    novoEstudante.notas[0] = scanner.nextDouble();
                    System.out.print("Digite sua nota do segundo bimestre: ");
                    novoEstudante.notas[1] = scanner.nextDouble();
                    System.out.print("Digite sua nota do terceiro bimestre: ");
                    novoEstudante.notas[2] = scanner.nextDouble();
                    System.out.print("Digite sua nota do quarto bimestre: ");
                    novoEstudante.notas[3] = scanner.nextDouble();

                    // Adiciona o estudante na próxima posição da lista
                    listaEstudantes.estudantes[totalEstudantes] = novoEstudante;
                    totalEstudantes++;

                    System.out.println("Estudante salvo!");

                    break;
                case 2:
                    // Calcula a média do aluno desejado
                    System.out.print("Digite o número do estudante para calcular a média: ");
                    int numeroEstudante = scanner.nextInt();
                    int indice = numeroEstudante - 1;

                    // Converte o número digitado para índice do array (0)
                    if (indice >= 0 && indice < totalEstudantes && listaEstudantes.estudantes[indice] != null) {
                        Estudante estudanteSelecionado = listaEstudantes.estudantes[indice];
                        double resultado = calculadorMedia.calcularMedia(estudanteSelecionado.notas);

                        // Exibe a média do estudante selecionado
                        System.out.println("A média do estudante " + estudanteSelecionado.nome + " é: " + resultado);
                    } else {
                        // Caso o estudante não seja encontrado
                        System.out.println("Estudante não encontrado!");
                    }
                    break;
                case 3:
                    // Exibe todos os estudantes e suas médias
                    System.out.println("======= Lista de Estudantes =======");
                    for (int i = 0; i < totalEstudantes; i++) {
                        Estudante estudante = listaEstudantes.estudantes[i];
                        double media = calculadorMedia.calcularMedia(estudante.notas);

                        System.out.println((i + 1) + " - " + estudante.nome + " | Média: " + media);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
