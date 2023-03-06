package com.mycompany.mini.projeto.individual;

/**
 *
 * @author silvam
 */
public class CalculadoraSaiyajin {
    String calcularKamehameha (Double kiInserido, Integer diaInserido) {
        Double quantidadeKamehameha = (kiInserido * diaInserido) / 3000;
        String frase;
        if (quantidadeKamehameha < 1 ){
            frase = "Ta fraquinho hein...\n"
                    + "Você não consegue fazer nem 1 kamehameha";
        } else if (quantidadeKamehameha <= 4) {
            frase = "Não ta ruim mas não esta bom! Conseguiu fazer " +quantidadeKamehameha
                    + " kamehamehas";
        } else if (quantidadeKamehameha <= 8) {
            frase = "Oloco, até que você é bom! Conseguiu fazer" +
                    quantidadeKamehameha +" kamehamehas";
        } else {
            frase = "Você é um verdadeiro saiyajin! Conseguiu fazer " +
                    quantidadeKamehameha + " kamehamehas!";
        }
        return frase;
    }
    
    String descobrirPersonagem(Integer mesInserido){
        String resultado;
        
        if (mesInserido.equals(1)){
            resultado = "Você é Bills, o deus da destruição!"
                    + "Conhecido por seu imenso poder, sendo capaz de detruir"
                    + " planetas com apenas o movimentar de seus dedos,\n Bills"
                    + " é o Deus da destruição e o ser mais poderoso do"
                    + "universo 7 ";
            
        } else if (mesInserido.equals(2)){
            resultado = "Você é Majin Boo!";
        } else if (mesInserido.equals(3)){
            resultado = "Você é Freeza!";
        } else if (mesInserido.equals(4)){
            resultado = "Você é Goku!"
                    + "Goku é uma pessoa muito calma e humilde, sendo muito\n"
                    + " engraçado e amigável, "
                    + "mas não se engane! Goku é o mortal mais poderoso "
                    + "do universo 7! \nTendo feitos imensuráveis, como lutar "
                    + "de igual para igual com Bills,"
                    + " dominar todas as transformações saiyajins, além de "
                    + "de conseguir utilizar o instinto superior,\n "
                    + "técnica que nem mesmo o Deus da destruição conseguiu "
                    + "dominar por completo!";
        } else if (mesInserido.equals(5)){
           resultado = "Você é Gohan, filho de goku!"
                    + "Gohan é o primeiro filho do Goku. Ele tem mais potencial "
                   + "de luta do que seu pai, mas não gosta de lutar."
                   + "Apesar disso, Gohan é muito poderoso! Ele foi o primeiro"
                   + "saiyajin a se transformar no Super saiyajin 2, além de ter"
                   + "lotado de forma igualitária com Cell!";
                    
        } else if (mesInserido.equals(6)){
            resultado = "Você é Piccolo!";
        } else if (mesInserido.equals(6)){
            resultado = "Você é o mestre Kame!";
        } else if (mesInserido.equals(7)){
            resultado = "Você é Cell!";
        } else if (mesInserido.equals(8)){
            resultado = "Você é Vegeta, o principe dos saiyajins!"
                    + "Herdeiro do trono da raça guerreia, Vegeta é um mestre em"
                    + " combate, contendo diversas técnicas como o final flash, "
                    + " possuindo, também, diversas transformações saiyajins, como"
                    + "ssj 1, ssj 2, ssj god, ssj blue, sem citar a sua forma mais"
                    + " poderosa, o ssj ego superior, transformação que tem a "
                    + " a capacidade de poder equiparável com o poder de Bills!";
        } else if (mesInserido.equals(9)){
            resultado = "Você é Broly!";
        } else if (mesInserido.equals(10)){
            resultado = "Você é o kuririn!"
                    + "Muito esforçado e carismatico, Kuririn é um dos seres mais"
                    + " poderosos da terra, além de ser melhor amigo do grande Goku!"
                    + "Apesar de seu tamanho, Kuririn sempre surpreende os adversários"
                    + "com sua velocidade e táticas de batalha!";
        } else if (mesInserido.equals(11)){
            resultado = "Você é Trunks do futuro!"
                    + "Filho de Vegeta, o principe dos saiyajins, você herdou o"
                    + "poder da raça dos guerreiros, tendo imenso poder destrutivo e "
                    + "uma força comparável ou até maior que a deu seu pai."
                    + "Você tem muitos feitos em batalha, como ter derrotado o"
                    + "grade Freeza e além de destruir Zamasu em sua forma mais"
                    + "poderosa!";
        } else {
            resultado = "Você Jiren!"
                    + "Pouco se sabe sobre este personagem, mas esse pouco já"
                    + "diz muita coisa! Jiren viu sua família ser assassinada"
                    + " por um terrível tirano. Na época por ser uma criança, Jiren"
                    + " pouco pode fazer para ajudar sua família. Marcado por "
                    + "esse acontecimento, Jiren jurou que se tornaria o ser mais"
                    + "poderoso que existe, para que assim pudesse salvar as pessoas"
                    + "que ele ama. Anos mais tarde, Jiren se torna o mortal mais"
                    + "poderoso de toda a existência! Sendo mais poderoso e temido"
                    + "por todos os deuses da destruição!";
        }
        return resultado;
    }
    
    String calcularResultadoQuiz (Integer pontuacao){
        String frase;
        if (pontuacao <= 1) {
            frase = "Caramba em, ta sebendo de nada mesmo!\n"
                    + "acertou " +pontuacao+ " questões!" ;
        } else if (pontuacao <= 2) {
            frase = "Ta indo bem, mas ta mal ainda!\n"
                    + "acertou " +pontuacao+ " questões!" ;
        } else if (pontuacao <= 5) {
            frase = "Parece que você gostou do anime!\n"
                    + "acertou " +pontuacao+ " questões!" ;
        } else if (pontuacao <= 7) {
            frase = "Oloco, você deve ser muito viciado em DB!\n"
                    + "acertou " +pontuacao+ " questões!" ;
        } else {
            frase = "Parabéns, você o maior fã de Dragon ball que existe!\n"
                    + "acertou todas as questões!" ;
        }
        return frase;
    }
    
    void pularLinha(){
        System.out.println("--------------------------------------");
        System.out.println("");
    }
}
