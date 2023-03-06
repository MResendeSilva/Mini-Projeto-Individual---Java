package com.mycompany.mini.projeto.individual;

import java.util.Scanner;

/**
 *
 * @author silvam
 */
public class TesteSaiyajin {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        CalculadoraSaiyajin calcS = new CalculadoraSaiyajin();
        Integer opcao;
        System.out.println("Seja bem vindo(a) ao Guerreiros Z Calculator\n"
                + "Aqui você terá uma verdadeira"
                + " imersão dentro do universo de Dragon Ball!");
        calcS.pularLinha();

        do {
            System.out.println("Escolha uma opção:\n"
                    + "1 - Quantos kamehameha você pode fazer?\n"
                    + "2 - Qual personagem você seria?\n"
                    + "3 - Qual é o seu nível de poder?\n"
                    + "4 - Quanto você sabe sobre Dragon ball?\n"
                    + "0 - encerrar jogo");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o seu nível de ki:");
                    Double kiInserido = leitor.nextDouble();
                    System.out.println("Insira o dia que você nasceu:");
                    Integer diaInserido = leitor.nextInt();
                    System.out.println(calcS.calcularKamehameha(kiInserido,
                            diaInserido));
                    calcS.pularLinha();
                    break;
                case 2:
                    System.out.println("Insira o algarismo do mês que"
                            + " você nasceu: ");
                    Integer mesInserido = leitor.nextInt();
                    System.out.println(calcS.descobrirPersonagem(mesInserido));
                    break;
                case 3:

                    break;
                case 4:
                    Integer pontuacao = 0;
                    System.out.println("Responda as perguntas e descubra se você\n"
                            + "realmente conhece Dragon Ball!");
                    calcS.pularLinha();
                    System.out.println("Primeira pergunta:\n"
                            + "Qual frase famosa Vegeta diz ao ver o"
                            + " nivel de luta de Goku?");
                    System.out.println("1 - é mais de 8 mil\n"
                            + "2 - é mais de 9 mil\n"
                            + "3 - é mais de 5 mil\n"
                            + "4 - é mais de 10mil\n");
                    Integer escolha = leitor.nextInt();

                    switch (escolha) {
                        case 1:
                            pontuacao++;
                            System.out.println("Resposta correta!");
                            break;
                        default:
                            System.out.println("Resposta errada!\n"
                                    + " A opção correta é 1 - é mais de 8 mil");
                    }
                    calcS.pularLinha();

                    System.out.println("Segunda pergunta:\n");
                    System.out.println("Qual era o nome do pai do Freeza?");
                    System.out.println("1 -  Rei Broly\n"
                            + "2 - Rei Cold\n"
                            + "3 - Rei Whis\n"
                            + "4 - Imperador Sama");

                    escolha = leitor.nextInt();

                    switch (escolha) {
                        case 2:
                            pontuacao += 3;
                            System.out.println("Resposta correta!");
                            break;
                        default:
                            System.out.println("Resposta errada!\n"
                                    + " A opção correta é 2 - Rei Cold");
                    }
                    calcS.pularLinha();
                    
                    System.out.println("Terceira pergunta:\n");
                    System.out.println("Qual é o nome da forma animal de Goku?");
                    System.out.println("1 -  Son Goku\n"
                            + "2 - Matatabi\n"
                            + "3 - Saiken\n"
                            + "4 - Oozaru");

                    escolha = leitor.nextInt();

                    switch (escolha) {
                        case 2:
                            pontuacao++;
                            System.out.println("Resposta correta!");
                            break;
                        default:
                            System.out.println("Resposta errada!\n"
                                    + " A opção correta é 4 - Oozaru");
                    }
                    calcS.pularLinha();
                    
                    System.out.println("Quarta pergunta:\n");
                    System.out.println("Qual é o nome do avô adotivo de Goku?");
                    System.out.println("1 -  Kame\n"
                            + "2 - Gorou\n"
                            + "3 - Goten\n"
                            + "4 - Gohan");

                    escolha = leitor.nextInt();

                    switch (escolha) {
                        case 4:
                            pontuacao += 2;
                            System.out.println("Resposta correta!");
                            break;
                        default:
                            System.out.println("Resposta errada!\n"
                                    + " A opção correta é 4 - Gohan");
                    }
                    calcS.pularLinha();
                    
                     System.out.println("Última pergunta:\n");
                    System.out.println("Qual é o nome da forma mais poderosa de"
                            + "Vegeta?");
                    System.out.println("1 -  Ego Superior\n"
                            + "2 - Super Saiyajin Deus\n"
                            + "3 - Super Saiyajin Deus Sayiajin\n"
                            + "4 - Instinto Superior");

                    escolha = leitor.nextInt();

                    switch (escolha) {
                        case 1:
                            pontuacao+=3;
                            System.out.println("Resposta correta!");
                            break;
                        default:
                            System.out.println("Resposta errada!\n"
                                    + " A opção correta é 1 - Ego superior");
                    }
                    calcS.pularLinha();
                    System.out.println(calcS.calcularResultadoQuiz(pontuacao));
                    break;
                    
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente!");

            }
        } while (!opcao.equals(0));
        System.out.println("Programa encerrado!");
    }
}
