package com.mycompany.mini.projeto.individual;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author silvam
 */
public class ProjetoNarutoverse {

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
        hokage.setAtaque(1000.0);
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

    public String invocarClone(Double quantidadeChakra) {
        Double clonesFeitos = quantidadeChakra / 100;
        String frase;

        if (clonesFeitos <= 2) {
            frase = String.format("Aí ta fraquinho demais! "
                    + "Você só fez %.2f clones", clonesFeitos);
        } else if (clonesFeitos <= 6) {
            frase = String.format("Nada mal, nada mal! "
                    + "Você fez %.2f clones", clonesFeitos);
        } else if (clonesFeitos <= 8) {
            frase = String.format("Você é um ninja de muito talento! "
                    + "Você fez %.2f clones", clonesFeitos);
        } else {
            frase = String.format("Você um ninja de nível hokage! "
                    + "Você fez %.2f clones", clonesFeitos);
        }
        return frase;
    }

    public String sortearPersonagem(Integer contador) {
        String dupla;
        if (contador <= 4) {
            dupla = "Kakashi Sensei";
        } else if (contador <= 7) {
            dupla = "Naruto Uzumaki";
        } else {
            dupla = "Sasuke Uchiha";
        }

        return dupla;
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

    public void escolhaMaquina(String escolhaMaquina) {

        if (escolhaMaquina.equals(1)) {
            System.out.println("O hokage está atacando!");
        } else {
            System.out.println("O hokage se preparou para defender!");
        }
    }

    public void resultadoRound() {

    }

    public Double gerarMovimentoMaquina(Integer escolhaMaquina) {

        if (escolhaMaquina.equals(1)) {
            Double ataqueH = hokage.getAtaque();

            Integer multiplicadorAtaque
                    = ThreadLocalRandom.current().nextInt(1, 21);

            System.out.println("multi ataque" + multiplicadorAtaque);
            return ataqueH * multiplicadorAtaque;
        } else {
            Double defesaH = hokage.getDefesa();
            Integer multiplicadorDefesa
                    = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.println("multi defesa" + multiplicadorDefesa);
            return defesaH * multiplicadorDefesa;
        }
    }

    public Double gerarMovimentoPersonagem(Integer escolhaPersonagem) {

        if (escolhaPersonagem.equals(1)) {
            Double ataqueP = persN.getAtaque();
            Integer multiplicadorAtaque
                    = ThreadLocalRandom.current().nextInt(1, 20);
            System.out.println("multi ataque" + multiplicadorAtaque);
            return ataqueP * multiplicadorAtaque;
        } else {
            Double defesaP = persN.getDefesa();
            Integer multiplicadorDefesa
                    = ThreadLocalRandom.current().nextInt(1, 10);
            System.out.println("multi defesa" + multiplicadorDefesa);
            return defesaP * multiplicadorDefesa;
        }
    }

    public String testeResultado(Double movimentoMaquina,
            Double movimentoPersonagem) {

        Double parcial = movimentoMaquina - movimentoPersonagem;
        String frase;

        if (parcial > 0) {
            System.out.println("hokage " + movimentoMaquina);
            System.out.println("Personagem " + movimentoPersonagem);
            frase = "O hogake venceu a rodada!";
        } else if (parcial < 0) {
            frase = "Você venceu a  rodada";
        } else {
            frase = "A rodada empatou";

        }
        return frase;
    }
}
