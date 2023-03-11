package com.mycompany.mini.projeto.individual;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author silvam
 */
public class Narutoverse {

    Scanner leitor = new Scanner(System.in);

    PersonagemCriado persN = new PersonagemCriado();
    Hokage hokage = new Hokage();

    public void mostrarMensagemInicial() {

        System.out.println("Olá! Seja bem vindo(a) ao Narutoverse!\n"
                + "Aqui, você poderá jogar mini-games do universo de naruto,"
                + "além de testar\nseus conhecimentos sobre essa incrível obra!");
    }

    public void criarPersonagem() {
        System.out.println("Mas antes de começarmos\n"
                + "Crie o seu personagem!");
    }

    public void criarHokage() {
        hokage.setNome("Naruto Uzumaki");
        hokage.setAtaque(1200.0);
        hokage.setChakra(10000.0);
        hokage.setDefesa(1000.0);
    }

    public void mostrarMenu() {

        System.out.println("""
                           
                          --------------------------------------------------- 
                          |             Escolha uma das opções!             |
                          --------------------------------------------------- 
                          | 1 - Quantos clones você pode fazer?             |
                          --------------------------------------------------- 
                          | 2 - Qual personagem seria seu sensei?           |
                          --------------------------------------------------- 
                          | 3 - Quanto você sabe sobre naruto?              |
                          --------------------------------------------------- 
                          | 4 - Desafio de gigantes!                        |
                          --------------------------------------------------- 
                          | 0 - Encerrar o programa                         |
                          --------------------------------------------------- 
                           """);

    }

    public void pularLinha() {
        System.out.println("");
    }

    public void verificarMes(Double numeroMesInserido) {

        if (numeroMesInserido < 0 || numeroMesInserido > 12) {
            do {
                System.out.println("Número inserido é inválido! Tente novamente!");
                numeroMesInserido = leitor.nextDouble();
            } while (numeroMesInserido < 0 || numeroMesInserido > 12);
            persN.setAtaque(numeroMesInserido);
        } else {
            persN.setAtaque(numeroMesInserido);
        }
    }

    public void verificarIdade(Double numeroIdadeInserido) {

        if (numeroIdadeInserido < 0) {
            do {
                System.out.println("Número inserido é inválido! Tente novamente!");
                numeroIdadeInserido = leitor.nextDouble();
            } while (numeroIdadeInserido < 0);
            persN.setChakra(numeroIdadeInserido);
        } else {
            persN.setChakra(numeroIdadeInserido);
        }
    }

    public void verificarAno(Double numeroAnoInserido) {

        if (numeroAnoInserido < 0) {
            do {
                System.out.println("Número inserido é inválido! Tente novamente!");
                numeroAnoInserido = leitor.nextDouble();
            } while (numeroAnoInserido < 0);
            persN.setDefesa(numeroAnoInserido);
        } else {
            persN.setDefesa(numeroAnoInserido);
        }
    }

    public String invocarClone(Double quantidadeChakra) {
        Double clonesFeitos = quantidadeChakra / 550;
        String frase;

        if (clonesFeitos <= 2) {
            frase = String.format("Aí ta fraquinho demais! "
                    + "Você só fez %.0f clones", clonesFeitos);
        } else if (clonesFeitos <= 6) {
            frase = String.format("Nada mal, nada mal! "
                    + "Você fez %.0f clones", clonesFeitos);
        } else if (clonesFeitos <= 8) {
            frase = String.format("Você é um ninja de muito talento! "
                    + "Você fez %.0f clones", clonesFeitos);
        } else {
            frase = String.format("Você um ninja de nível hokage! "
                    + "Você fez %.0f clones", clonesFeitos);
        }
        return frase;
    }

    public String sortearPersonagem(Integer contador) {
        String sensei;
        if (contador <= 4) {
            sensei = "Kakashi Hatake";
        } else if (contador <= 7) {
            sensei = "Naruto Uzumaki";
        } else {
            sensei = "Sasuke Uchiha";
        }

        return sensei;
    }

    public void calcularPontuacaoQuiz(Integer pontuacao) {

        if (pontuacao <= 3) {
            System.out.println(String.format("Volta pra academia ninja!\n"
                    + "Você ficou com %d pontos", pontuacao));
        } else if (pontuacao <= 7) {
            System.out.println(String.format("Você é um gennin!\n"
                    + "Você ficou com %d pontos", pontuacao));
        } else if (pontuacao <= 11) {
            System.out.println(String.format("Você é um chunnin!\n"
                    + "Você ficou com %d pontos", pontuacao));
        } else if (pontuacao <= 13) {
            System.out.println(String.format("Você é um jonnin!\n"
                    + "Você ficou com %d pontos", pontuacao));
        } else {
            System.out.println(String.format("Você é um Hokage!!!\n"
                    + "Você acertou todas as questões! Provou-se ser um \n"
                    + "verdadeiro fã de Naruto!"));
        }

    }

    public void plotarRegraJogo() {
        System.out.println("""
                          --------------------------------------------
                          |      Manual - Desafio de gigantes        |
                          --------------------------------------------
                          | O jogo possui o mesmo escopo de um rpg!  |                             
                          | Você inseriu seus dados no ínicio do pro-|
                          | grama e o computador gerou um personagem |
                          | que possui atributos de acordo com o que |
                          | foi informado!                           |
                          | O jogo terá 4 rodadas, nas quais o hoka- |
                          | ge decidirá se vai te atacar ou se defen-|
                          | der. Em seguida, você deverá fazer a mes-|
                          | ma escolha!                              |
                          | Após cada escolha, será mostrado o valor |
                          | de seu ataque bruto e valor que foi sor- |
                          | teado no dado multiplicador de poder.    |
                          | Os valores de ataque final e/ou defesa   |
                          | final de cada jogador serão comparados   | 
                          | e o vencedor da rodada será declarado,   | 
                          | além de ganhar 3 pontos.                 | 
                          | Em caso de empate, ambos ganham um ponto |
                          | cada.                                    | 
                          | Depois da última rodada, será anunciado  |  
                          | se o jogador conseguiu ou não a vaga na  | 
                          | elite da aldeia.                         |
                          | Para passar no teste, você precisa pelo  |
                          | menos empatar com o hokage.              |
                          --------------------------------------------
                          |               BOA SORTE!!!               |
                          --------------------------------------------
                           """);
    }

    public void escolhaMaquina(Integer escolhaMaquina) {

        if (escolhaMaquina.equals(1)) {
            System.out.println("O hokage está atacando!");
        } else {
            System.out.println("O hokage se preparou para defender!");
        }
    }

    public Double gerarMovimentoMaquina(Integer escolhaMaquina) {

        if (escolhaMaquina.equals(1)) {
            Double ataqueH = hokage.getAtaque();

            Integer multiplicadorAtaque
                    = ThreadLocalRandom.current().nextInt(1, 16);

            System.out.println(String.format("O ataque do hokage é de %.2f e será "
                    + "multiplicado por %d", ataqueH,
                    multiplicadorAtaque));
            return ataqueH * multiplicadorAtaque;
        } else {
            Double defesaH = hokage.getDefesa();
            Integer multiplicadorDefesa
                    = ThreadLocalRandom.current().nextInt(1, 5);

            System.out.println(String.format("A defesa do hokage é de %.2f e será "
                    + "multiplicado por %d", defesaH,
                    multiplicadorDefesa));

            return defesaH * multiplicadorDefesa;
        }
    }

    public Double gerarMovimentoPersonagem(Integer escolhaPersonagem,
            Double ataque, Double defesa) {

        if (escolhaPersonagem.equals(1)) {

            Double ataqueP = ataque;
            Integer multiplicadorAtaque
                    = ThreadLocalRandom.current().nextInt(1, 16);

            System.out.println(String.format("Seu ataque é de %.2f e será "
                    + "multiplicado por %d", ataqueP,
                    multiplicadorAtaque));
            return ataqueP * multiplicadorAtaque;
        } else {
            Double defesaP = defesa;
            Integer multiplicadorDefesa
                    = ThreadLocalRandom.current().nextInt(1, 16);

            System.out.println(String.format("Sua defesa é de %.2f e será "
                    + "multiplicado por %d", defesaP,
                    multiplicadorDefesa));

            return defesaP * multiplicadorDefesa;
        }
    }

    public String testeResultado(Double movimentoMaquina, Integer escolhaMaquina,
            Double movimentoPersonagem, Integer escolhaPersonagem) {
        Double parcial;
        String frase;

        if (escolhaMaquina.equals(1) && escolhaPersonagem.equals(2)) {
            parcial = movimentoMaquina - movimentoPersonagem;

            if (parcial > 0) {
                hokage.setPontuacao(3);
                persN.setPontuacao(0);
                frase = "O hokage venceu a rodada!";
            } else if (parcial < 0) {
                hokage.setPontuacao(0);
                persN.setPontuacao(3);
                frase = "Você venceu a rodada!";
            } else {
                hokage.setPontuacao(1);
                persN.setPontuacao(1);
                frase = "A rodada empatou!";
            }
        } else if (escolhaMaquina.equals(2) && escolhaPersonagem.equals(1)) {
            parcial = movimentoPersonagem - movimentoMaquina;

            if (parcial < 0) {
                hokage.setPontuacao(3);
                persN.setPontuacao(0);
                frase = "O hokage venceu a rodada!";
            } else if (parcial > 0) {
                hokage.setPontuacao(0);
                persN.setPontuacao(3);
                frase = "Você venceu a rodada!";
            } else {
                hokage.setPontuacao(1);
                persN.setPontuacao(1);
                frase = "A rodada empatou!";
            }
        } else if (escolhaMaquina.equals(1) && escolhaPersonagem.equals(1)) {
            parcial = movimentoPersonagem - movimentoMaquina;

            if (parcial < 0) {
                hokage.setPontuacao(3);
                persN.setPontuacao(0);
                frase = "O hokage venceu a rodada!";
            } else if (parcial > 0) {
                hokage.setPontuacao(0);
                persN.setPontuacao(3);
                frase = "Você venceu a rodada!";
            } else {
                hokage.setPontuacao(1);
                persN.setPontuacao(1);
                frase = "A rodada empatou!";
            }
        } else {
            frase = "Ninguém ganhou ponto! Os dois defenderam!";
        }

        pularLinha();
        return frase;
    }

    public void pontuacaoParcial() {

        System.out.println(String.format("""
                           
                          ---------------------------------------
                          |      Placar parcial do desafio      |
                          ---------------------------------------
                          | Hokage :            %d               |
                          ---------------------------------------
                          | Você :              %d               |
                          ---------------------------------------
                           
                           """, hokage.getPontuacao(), persN.getPontuacao()));

    }

    public void resultadoFinal() {
        System.out.println("Calculando resultado!");
        pularLinha();

        System.out.println((String.format("""
                           
                          ---------------------------------------
                          |             Placar Final            |
                          ---------------------------------------
                          | Hokage :            %d               |
                          ---------------------------------------
                          | Você :              %d               |
                          ---------------------------------------
                           
                           """, hokage.getPontuacao(), persN.getPontuacao())));

        if (hokage.getPontuacao() > persN.getPontuacao()) {

            System.out.println("Infelizmente você ainda não tem nível\n"
                    + "para fazer parte da elite, mas não desista!\nVocê poderá"
                    + " fazer os testes quantas vezes quiser!");
        } else {
            System.out.println("Parabéns!!! Você se mostrou um exímio lutador!\n"
                    + "O hokage te parabeniza e te dá as boas vindas à elite ninja!");
        }
    }
}
