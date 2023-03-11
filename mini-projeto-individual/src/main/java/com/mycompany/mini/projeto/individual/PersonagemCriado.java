package com.mycompany.mini.projeto.individual;

/**
 *
 * @author silvam
 */
public class PersonagemCriado extends Personagem{

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
        this.ataque = ataque * 30;
    }

    public Double getDefesa() {
        return defesa;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa * 0.8;
    }

}
