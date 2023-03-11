package com.mycompany.mini.projeto.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author silvam
 */
public class TesteNarutoverse {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ProjetoNarutoverse objetoNaruto = new ProjetoNarutoverse();
        PersonagemCriado persCriado = new PersonagemCriado();
        Hokage hokage = new Hokage();

        Integer escolha;
        objetoNaruto.mostrarMensagemInicial();
        objetoNaruto.pularLinha();

        objetoNaruto.criarHokage();
        objetoNaruto.criarPersonagem();
        objetoNaruto.pularLinha();

        System.out.println("Insira seu nome: ");
        persCriado.setNome(leitor.nextLine());
        System.out.println("Insira sua idade: ");
        persCriado.setChakra(leitor.nextDouble());
        System.out.println("Insira o numero do mês que você nasceu:");
        persCriado.setAtaque(leitor.nextDouble());
        System.out.println("Insira o ano que você nasceu:");
        persCriado.setDefesa(leitor.nextDouble());

        objetoNaruto.pularLinha();

        System.out.println(
                String.format("Nome do seu personagem é: %s\n"
                        + "Seu nivel de chakra é: %.2f\n"
                        + "Seu ataque é: %.2f\n"
                        + "Sua defesa é: %.2f", persCriado.getNome(),
                        persCriado.getChakra(), persCriado.getAtaque(),
                        persCriado.getDefesa()));
        objetoNaruto.pularLinha();

        do {
            objetoNaruto.mostrarMenu();
            escolha = leitor.nextInt();
            objetoNaruto.pularLinha();

            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu opção 1\n"
                            + "Quantos clones você pode fazer?");
                    System.out.println(
                            objetoNaruto.invocarClone(persCriado.getChakra()));
                    objetoNaruto.pularLinha();
                    break;

                case 2:
                    Integer contador = 0;

                    System.out.println("Você escolheu opção 2\n"
                            + "Qual personagem seria sua dupla no torneio?");
                    objetoNaruto.pularLinha();

                    System.out.println("Qual é o seu elemento você escolheria?\n"
                            + " 1 - Doton (Terra)\n"
                            + " 2 - Fuuton (Ar)\n"
                            + " 3 - Raiton (Relampago)");

                    Integer opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1:
                            contador++;
                            break;
                        case 2:
                            contador += 2;
                            break;
                        case 3:
                            contador += 3;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                    System.out.println("Qual animal você escolheria para ser"
                            + " seu companheiro?\n"
                            + " 1 - Um mini pug com usando uma bandana azul\n"
                            + " 2 - Sapo gigante que possui espada\n"
                            + " 3 - Cobra gigante");

                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1:
                            contador++;
                            break;
                        case 2:
                            contador += 2;
                            break;
                        case 3:
                            contador += 3;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }

                    System.out.println("O que você prefere?\n"
                            + " 1 - Ser extramamente companheiro\n"
                            + " 2 - Ser amado por todos\n"
                            + " 3 - Ser temido por todos");

                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1:
                            contador++;
                            break;
                        case 2:
                            contador += 2;
                            break;
                        case 3:
                            contador += 3;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                    System.out.println(contador);
                    System.out.println(
                            String.format("Sua dupla é %s", objetoNaruto.
                                    sortearPersonagem(contador)));
                    break;

                case 3:
                    Integer pontuacao = 0;

                    System.out.println("Você escolheu opção 3\n"
                            + "Quanto você sabe sobre naruto??");
                    objetoNaruto.pularLinha();

                    System.out.println("Primeira pergunta:\n"
                            + "Como é chamado um ninja que acaba de"
                            + " se formar na academia ninja?\n"
                            + " 1 - Gennin\n"
                            + " 2 - Chunnin\n"
                            + " 3 - Jonnin\n"
                            + " 4 - Punnin");

                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1:
                            pontuacao += 2;
                            System.out.println("Correto!");

                            break;
                        default:
                            System.out.println("Ta errado mané!\n"
                                    + "Resposta certa seria a 1 - Gennin");
                    }
                    objetoNaruto.pularLinha();

                    System.out.println("Segunda pergunta\n"
                            + "Quem foi o ninja conhecido como o Deus"
                            + " shinnobi devido a suas habilidades?\n"
                            + " 1 - Terceiro Hokage (Hiruzen Saturobi)\n"
                            + " 2 - Quarto Hokage (Minato Namikaze)\n"
                            + " 3 - Primeiro Hokage (Hashirama Senju)\n"
                            + " 4 - Segundo Hokage (Tobirama Senju)");

                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 3:
                            pontuacao += 3;
                            System.out.println("Correto!");

                            break;
                        default:
                            System.out.println("Errou feio, errou rude!\n"
                                    + "Resposta certa seria a 3 - Primeiro Hokage "
                                    + "(Hashirama Senju)");
                    }
                    objetoNaruto.pularLinha();

                    System.out.println("Terceira pergunta\n"
                            + "Em qual canal de televisão era possível"
                            + " assitir o anime?\n"
                            + " 1 - SBT\n"
                            + " 2 - Globo\n"
                            + " 3 - Record\n"
                            + " 4 - Bandeirantes");

                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1:
                            pontuacao += 2;
                            System.out.println("Correto!");

                            break;
                        default:
                            System.out.println("Infelizmente, você errou!\n"
                                    + "Resposta certa seria a 1 - SBT");
                    }
                    objetoNaruto.pularLinha();

                    System.out.println("Quarta pergunta\n"
                            + "Qual era o nome da besta de cauda que tinha seu "
                            + " poder aprisionado dentro de Naruto?\n"
                            + " 1 - Marquinhos\n"
                            + " 2 - Raposa de nove caudas\n"
                            + " 3 - Kyuubi\n"
                            + " 4 - Kurama");

                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 4:
                            pontuacao += 3;
                            System.out.println("Correto!");

                            break;
                        default:
                            System.out.println("Aí errou!\n"
                                    + "Resposta certa seria a 4 - Kurama");
                    }
                    objetoNaruto.pularLinha();

                    System.out.println("Quinta pergunta\n"
                            + "Quall era o maior sonho do protagonista?\n"
                            + " 1 - Se tornar um Hokage!\n"
                            + " 2 - Se tornar o ninja mais poderoso!\n"
                            + " 3 - Se tornar vendedor de macarrão!\n"
                            + " 4 - Fazer parte dos vingadores!");

                    opcao = leitor.nextInt();

                    switch (opcao) {
                        case 1:
                            pontuacao += 5;
                            System.out.println("Correto!");

                            break;
                        default:
                            System.out.println("Poxa vida, parece que você "
                                    + "errou!\n"
                                    + "Resposta certa seria a 1 - Se tornar hokage!");
                    }
                    objetoNaruto.pularLinha();
                    objetoNaruto.calcularPontuacaoQuiz(pontuacao);
                    break;

                case 4:
                    System.out.println("Seja bem vindo(a) ao desafio de "
                            + "gigantes!\n"
                            + "O hokage está treinando novos talentos para\n"
                            + "entrar na elite da aldeia e você foi escolhido!"
                            + " Lute contra o hokage e descubra se você é capaz "
                            + "de derrota-lo!");
                    objetoNaruto.pularLinha();

                    for (Integer i = 1; i <= 3; i++) {

                        System.out.println(
                                String.format("Round %d", i));
                        objetoNaruto.pularLinha();
                        System.out.println("LUTEM!");
                        objetoNaruto.pularLinha();

                        Integer escolhaMaquina
                                = ThreadLocalRandom.current().nextInt(1, 3);

                        Double movimentoMaquina
                                = objetoNaruto.
                                        gerarMovimentoMaquina(escolhaMaquina);

                        switch (escolhaMaquina) {
                            case 1:
                                System.out.println("O Hokage vai atacar!");
                                break;
                            case 2:
                                System.out.println("O hokage vai se defender!");
                                break;
                        }
                        objetoNaruto.pularLinha();

                        System.out.println("O que você faz?\n"
                                + "1 - Eu ataco!\n"
                                + "2 - Eu me defendo!");

                        Integer escolhaPersonagem = leitor.nextInt();
                        objetoNaruto.pularLinha();

                        switch (escolhaPersonagem) {
                            case 1:
                                System.out.println("Você escolheu atacar!");
                                break;
                            case 2:
                                System.out.println("Você escolheu defender!");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                        Double movimentoPersonagem
                                = objetoNaruto.
                                        gerarMovimentoMaquina(escolhaPersonagem);

                        System.out.println(
                                objetoNaruto.
                                        testeResultado(movimentoMaquina,
                                                movimentoPersonagem));
                    }

                    break;

                case 0:
                    System.out.println("Encerrando o programa!");
                    break;

                default:
                    System.out.println("Opção inválida! Digite novamente!");
            }

        } while (!escolha.equals(0));
        System.out.println("O programa foi encerrado!");
    }
}
