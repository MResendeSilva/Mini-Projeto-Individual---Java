package com.mycompany.mini.projeto.individual;

/**
 *
 * @author silvam
 */
public class PersonagemCriado extends Personagem {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getChakra() {
        return chakra;
    }

    public void setChakra(Double chakra) {
        this.chakra = 180 * chakra;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        if (ataque <= 4) {
            this.ataque = ataque * 200;
        } else if (ataque <= 9) {
            this.ataque = ataque * 100;
        } else {
            this.ataque = ataque * 70;
        }
    }

    public Double getDefesa() {
        return defesa;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa * 0.8;
    }

    public Integer getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao += pontuacao;
    }
}
